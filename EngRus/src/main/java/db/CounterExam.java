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
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.sql.*;
import java.text.SimpleDateFormat;
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
        Scene sceneStatistics = new Scene(rootStatistics, widthSize/1.4, heightSize/2);
        TableView<AddMistakesTable> tableStatisticExam = new TableView<AddMistakesTable>();

        Button deleteCounter = new Button("Очистить статистику");
        deleteCounter.setOnAction(event -> {
            counterDeleteStatistic();
            statistics.close();
        });
        HBox buttPane = new HBox();
        buttPane.setSpacing(sceneStatistics.getWidth()/10);
        buttPane.setLayoutX(10);
        buttPane.setLayoutY(sceneStatistics.getHeight()/1.08);
        buttPane.getChildren().addAll(deleteCounter);

        TableColumn<AddMistakesTable, String> dateTime = new TableColumn<>("Дата");
        TableColumn<AddMistakesTable, String> returnNumber = new TableColumn<>("№");
        TableColumn<AddMistakesTable, String> returnOriginal = new TableColumn<>("Правильный текст");
        TableColumn<AddMistakesTable, String> returnMistakes = new TableColumn<>("Ошибка");
        TableColumn<AddMistakesTable, String> returnPart = new TableColumn<>("Часть");
        dateTime.setCellValueFactory(new PropertyValueFactory<>("dateTime"));
        dateTime.setPrefWidth(sceneStatistics.getWidth()/6.7);
        dateTime.setStyle( "-fx-alignment: CENTER;");
        returnNumber.setCellValueFactory(new PropertyValueFactory<>("numberText"));
        returnNumber.setPrefWidth(sceneStatistics.getWidth()/19);
        returnNumber.setStyle( "-fx-alignment: CENTER;");
        returnOriginal.setCellValueFactory(new PropertyValueFactory<>("originalText"));
        returnOriginal.setPrefWidth(sceneStatistics.getWidth()/2.9);
        returnMistakes.setCellValueFactory(new PropertyValueFactory<>("mistakesText"));
        returnMistakes.setPrefWidth(sceneStatistics.getWidth()/2.9);
        returnPart.setCellValueFactory(new PropertyValueFactory<>("numberPart"));
        returnPart.setPrefWidth(sceneStatistics.getWidth()/11);
        returnPart.setStyle( "-fx-alignment: CENTER;");
        tableStatisticExam.setStyle("-fx-background-color: gray;");
        tableStatisticExam.setPrefWidth(sceneStatistics.getWidth());

        ObservableList<AddMistakesTable> list = FXCollections.observableArrayList();
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
            Statement stmt2 = connection.createStatement();
            ResultSet rs1 = stmt2.executeQuery("SELECT date_time, numb, original, mistakes, part " +
                    "FROM (SELECT DISTINCT ON (original) date_time, numb, " +
                    "original, mistakes, part FROM counter) AS td " +
                    "ORDER BY date_time;"); //sql запрос
            while (rs1.next()) {
                Timestamp timestamp = rs1.getTimestamp("date_time");
                Date date = new Date(timestamp.getTime());
                SimpleDateFormat newDateFormat = new SimpleDateFormat("dd MMMM yyyy" + "г. в "+ "HH:mm:ss",
                        Locale.getDefault());
                String result = newDateFormat.format(date);

                list.add(new AddMistakesTable(result, rs1.getString("numb"),
                        rs1.getString("original"), rs1.getString("mistakes"), rs1.getString("part")));
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
        tableStatisticExam.getColumns().addAll(dateTime, returnNumber, returnOriginal, returnMistakes, returnPart);

        rootStatistics.getChildren().addAll(tableStatisticExam, buttPane);
        statistics.setTitle("Статистика");
        statistics.initModality(Modality.APPLICATION_MODAL);
        statistics.setScene(sceneStatistics);
        statistics.show();
    }
}