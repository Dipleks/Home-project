package db;

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
        Scene sceneStatistics = new Scene(rootStatistics, widthSize/3, heightSize/2);
        TableView<AddStatisticTable> tableStatisticExam = new TableView<AddStatisticTable>();

        Button addCounter = new Button("Добавить статистику");
        Button deleteCounter = new Button("Удалить статистику");
        deleteCounter.setOnAction(event -> {
            counterDeleteStatistic();
            statistics.close();
            statisticsWindow();
        });
        deleteCounter.setLayoutX(sceneStatistics.getWidth()/2.7);
        deleteCounter.setLayoutY(sceneStatistics.getHeight()/1.08);
        addCounter.setOnAction(event -> {
            counterAddDB();
            statistics.close();
            statisticsWindow();
        });
        addCounter.setLayoutX(sceneStatistics.getWidth()/1.5);
        addCounter.setLayoutY(sceneStatistics.getHeight()/1.08);

        TableColumn<AddStatisticTable, String> dateTime = new TableColumn<>("Дата");
        TableColumn<AddStatisticTable, String> returnYES = new TableColumn<>("Правельные ответы");
        TableColumn<AddStatisticTable, String> returnNO = new TableColumn<>("Не правельные ответы");
        dateTime.setCellValueFactory(new PropertyValueFactory<>("dateTime"));
        dateTime.setPrefWidth(sceneStatistics.getWidth()/3);
        returnYES.setCellValueFactory(new PropertyValueFactory<>("returnY"));
        returnYES.setPrefWidth(sceneStatistics.getWidth()/3.05);
        returnNO.setCellValueFactory(new PropertyValueFactory<>("returnN"));
        returnNO.setPrefWidth(sceneStatistics.getWidth()/3.05);
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
                        rs1.getString("correct_answer"), rs1.getString("wrong_answer")));
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
        tableStatisticExam.getColumns().addAll(dateTime, returnYES, returnNO);

        rootStatistics.getChildren().addAll(tableStatisticExam, addCounter, deleteCounter);
        statistics.setTitle("Статистика");
        statistics.initModality(Modality.APPLICATION_MODAL);
        statistics.setScene(sceneStatistics);
        statistics.show();
    }
}
