package testDB.testDB;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class TestA extends Application
{
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5433/TestEngRus"; //URL БД и название БД
    static final String USER = "postgres"; //Вводим логин к БД
    static final String PASS = "353808"; //Вводим пароль к БД
    static Label[] labels = new Label[7];
    static VBox vBox = new VBox();

    @Override
    public void start(Stage primaryStage) throws Exception {

        method();

        Scene scene = new Scene(vBox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private static void method() throws SQLException {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Драйвер PostgreSQL JDBC не найден. Включите его в путь к библиотеке!");
            e.printStackTrace();
            return;
        }

        Connection connection = null;
        try {
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Не удачное подключение драйвера!");
            e.printStackTrace();
            return;
        }
        ///////
        try {
            Statement stmt = connection.createStatement();
            Statement stmt2 = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT text_ru FROM test2 WHERE id >= 1 AND id <= 7"); //sql запрос
            ResultSet rs2 = stmt2.executeQuery("SELECT text_en FROM test2 WHERE id >= 1 AND id <= 7"); //sql запрос

            String str = null;
            String str2 = null;
            for (int i = 0; i < 7; i++) {
                rs.next();
                rs2.next();
                str = rs.getString("text_ru");
                str2 = rs2.getString("text_en");
                System.out.println("Получим данные из таблицы: " + str);
                labels[i] = new Label();
                labels[i].setText(str);
                int finalI = i;
                String finalStr2 = str2;
                String finalStr = str;
                labels[i].setOnMouseClicked(event -> {
                    if (labels[finalI].getText().equals(finalStr)) {
                        labels[finalI].setText(finalStr2);
                    } else {
                        labels[finalI].setText(finalStr);
                    }
                });
                vBox.getChildren().addAll(labels[i]);
            }
            rs.close();
            rs2.close();
            stmt.close();
            stmt2.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }
}
