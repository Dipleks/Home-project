package db;

import exam.FillingColumnsExam;
import interfaceRoot.EffectColor;
import interfaceRoot.EffectFont;
import interfaceRoot.Root;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public interface CounterExam extends Root
{
    // Счетчик:
    default void counter() throws SQLException, ClassNotFoundException {
        if (CreateDB.newCounterRun()) {
            ROOT.getChildren().remove(counterVB);
            YES.setFont(EffectFont.fontTextExam);
            YES.setTextFill(EffectColor.colorTextClickPERU);
            NO.setFont(EffectFont.fontTextExam);
            NO.setTextFill(EffectColor.colorTextClickPERU);
            counterYES.setFont(EffectFont.fontTextExam);
            counterNO.setFont(EffectFont.fontTextExam);
            counterYES.setText("0");
            counterNO.setText("0");
            // Кнопка "Счетчик":
            Button resultExam = new Button("Статистика");
            resultExam.setStyle("-fx-background-color: #c1b8b8;");
            resultExam.setOnAction(event -> {
                statisticsWindow();
            });

            counterVB.setSpacing(10);
            counterVB.setAlignment(Pos.CENTER);
            counterVB.setLayoutX(widthSize / 10);
            counterVB.setLayoutY(heightSize / 5);
//            counterVB.setStyle("-fx-border-color: RED");
            counterVB.getChildren().addAll(YES, counterYES, NO, counterNO, resultExam);
            ROOT.getChildren().add(counterVB);
        } else {
            CreateDB.newCounterFirstRun();
            counter();
        }
    }
    // Добавление статистики контрольных в БД:
    default void counterAddDB() {
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
            String localDateTime = LocalDateTime.now().format(format);
            Connection connection = DriverManager.getConnection(TableDB.DB_URL + TableDB.db, TableDB.USER, TableDB.PASS);
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO counter (date_time, correct_answer, wrong_answer) " +
                    "VALUES ('" + localDateTime
                    + "', " + counterYES.getText() + ","+ counterNO.getText() +")");
            System.out.println(localDateTime);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    // Полное удаление статистики из БД:
    default void counterDeleteStatistic(){
        try {
            Connection connection = DriverManager.getConnection(TableDB.DB_URL + TableDB.db, TableDB.USER, TableDB.PASS);
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM counter; ALTER SEQUENCE counter_id_seq RESTART WITH 1;");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    // Получение статистики контрольных из БД:
    default void statisticsWindow() {
        Stage statistics = new Stage();
        Group rootStatistics = new Group();
        Scene sceneStatistics = new Scene(rootStatistics, widthSize/3.5, heightSize/2);
        TableView<AddStatisticTable> tableStatisticExam = new TableView<AddStatisticTable>();

        Button addCounter = new Button("Добавить");
        Button deleteCounter = new Button("Удалить все");
        Button getMistakes = new Button("Последние ошибки");
//        getMistakes.setStyle("-fx-background-color: #f2e7e7;");
        getMistakes.setOnAction(e -> {
            tableMistakes();
        });
        deleteCounter.setOnAction(event -> {
            counterDeleteStatistic();
            statistics.close();
            statisticsWindow();
        });
        addCounter.setOnAction(event -> {
            counterAddDB();
            statistics.close();
            statisticsWindow();
        });
        HBox buttPane = new HBox();
        buttPane.setSpacing(sceneStatistics.getWidth()/10);
        buttPane.setLayoutX(10);
        buttPane.setLayoutY(sceneStatistics.getHeight()/1.08);
        buttPane.getChildren().addAll(getMistakes, deleteCounter, addCounter);

        TableColumn<AddStatisticTable, String> dateTime = new TableColumn<>("Дата");
        TableColumn<AddStatisticTable, String> returnYES = new TableColumn<>("Верно");
        TableColumn<AddStatisticTable, String> returnNO = new TableColumn<>("Не верно");
        TableColumn<AddStatisticTable, String> returnPart = new TableColumn<>("Часть");
        dateTime.setCellValueFactory(new PropertyValueFactory<>("dateTime"));
        dateTime.setPrefWidth(sceneStatistics.getWidth()/2.5);
        dateTime.setStyle( "-fx-alignment: CENTER;");
        returnYES.setCellValueFactory(new PropertyValueFactory<>("returnY"));
        returnYES.setPrefWidth(sceneStatistics.getWidth()/6);
        returnYES.setStyle( "-fx-alignment: CENTER;");
        returnNO.setCellValueFactory(new PropertyValueFactory<>("returnN"));
        returnNO.setPrefWidth(sceneStatistics.getWidth()/6);
        returnNO.setStyle( "-fx-alignment: CENTER;");
        returnPart.setCellValueFactory(new PropertyValueFactory<>("numberPart"));
        returnPart.setPrefWidth(sceneStatistics.getWidth()/4);
        returnPart.setStyle( "-fx-alignment: CENTER;");
        tableStatisticExam.setStyle("-fx-background-color: gray;");

        ObservableList<AddStatisticTable> list = FXCollections.observableArrayList();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(TableDB.DB_URL + TableDB.db, TableDB.USER, TableDB.PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            assert connection != null;
            Statement stmt1 = connection.createStatement();
            Statement stmt2 = connection.createStatement();
            ResultSet rs = stmt1.executeQuery("SELECT id FROM counter;");
            for (int i = 1; rs.next(); i++) {
                ResultSet rs1 = stmt2.executeQuery("SELECT * FROM counter WHERE id="+i+";"); //sql запрос
                rs1.next();
                Timestamp timestamp = rs1.getTimestamp("date_time");
                Date date = new Date(timestamp.getTime());
                SimpleDateFormat newDateFormat = new SimpleDateFormat("dd MMMM yyyy" + "г. в "+ "HH:mm:ss", Locale.getDefault());
                String result = newDateFormat.format(date);

                list.add(new AddStatisticTable(result,
                        rs1.getString("correct_answer"), rs1.getString("wrong_answer"), nameExam.getText()));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        tableStatisticExam.setItems(list);
        tableStatisticExam.getColumns().addAll(dateTime, returnYES, returnNO, returnPart);

        rootStatistics.getChildren().addAll(tableStatisticExam, buttPane);
        statistics.setTitle("Статистика");
        statistics.initModality(Modality.APPLICATION_MODAL);
        statistics.setScene(sceneStatistics);
        statistics.show();
    }
    default void tableMistakes(){

        Stage mistakes = new Stage();
        Group group = new Group();
        Scene scene = new Scene(group, widthSize/2, heightSize/2);

        TableView<AddMistakesTable> tableMistakes = new TableView<AddMistakesTable>();

        TableColumn<AddMistakesTable, String> returnNumber = new TableColumn<>("№");
        returnNumber.setCellValueFactory(new PropertyValueFactory<>("numberText"));
        returnNumber.setPrefWidth(scene.getWidth()/15);
        returnNumber.setStyle( "-fx-alignment: CENTER;");
        TableColumn<AddMistakesTable, String> returnOriginal = new TableColumn<>("Правильный текст");
        returnOriginal.setCellValueFactory(new PropertyValueFactory<>("originalText"));
        returnOriginal.setPrefWidth(scene.getWidth()/2.15);
        TableColumn<AddMistakesTable, String> returnMistakes = new TableColumn<>("Ошибка");
        returnMistakes.setCellValueFactory(new PropertyValueFactory<>("mistakesText"));
        returnMistakes.setPrefWidth(scene.getWidth()/2.15);


        ObservableList<AddMistakesTable> list = FXCollections.observableArrayList();
        ////////////
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(TableDB.DB_URL + TableDB.db, TableDB.USER, TableDB.PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            //TODO при вызове метода извлекаются данные из таблицы counterMistakes
            //TODO данные отсортированны и убраны все дублекаты
            assert connection != null;
            Statement stmt1 = connection.createStatement();
            Statement stmt2 = connection.createStatement();
            ResultSet rs = stmt1.executeQuery("SELECT DISTINCT ON (original) original FROM counterMistakes;");
            for (int i = 1; rs.next(); i++) {
                ResultSet rs1 = stmt2.executeQuery("SELECT DISTINCT ON (original) numb, original, " +
                        "mistakes FROM counterMistakes WHERE id="+i+";"); //sql запрос
                rs1.next();
                list.add(new AddMistakesTable(rs1.getString("numb"), rs1.getString("original"),
                        rs1.getString("mistakes")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
/////////////////

        tableMistakes.setItems(list);
        tableMistakes.setStyle("-fx-background-color: gray;");
        tableMistakes.getColumns().addAll(returnNumber, returnOriginal, returnMistakes);

        group.getChildren().addAll(tableMistakes);
        mistakes.setTitle("Ошибки");
        mistakes.setScene(scene);
        mistakes.initModality(Modality.APPLICATION_MODAL);
        mistakes.show();
    };
}
