package testDB.addTextInTable;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class TextAdd extends Application
{
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5433/TestEngRus"; //URL БД и название БД
    static final String USER = "postgres"; //Вводим логин к БД
    static final String PASS = "353808"; //Вводим пароль к БД
    static Label[] labels1 = new Label[100];
    static Label[] labels2 = new Label[100];
    static VBox v1 = new VBox();
    static VBox v2 = new VBox();
    static VBox v3 = new VBox();
    static HBox h = new HBox();
    static ScrollPane s = new ScrollPane();
    Scene scene = new Scene(s, 600, 600);
    static TextField t1 = new TextField();
    static TextField t2 = new TextField();
    static Button b = new Button("Add");

    @Override
    public void start(Stage primaryStage) throws Exception {

        v1.getChildren().add(t1);
        v2.getChildren().add(t2);
        v3.getChildren().add(b);
        h.setSpacing(20);
        h.getChildren().addAll(v1, v2, v3);

        s.setContent(h);

        Class.forName("org.postgresql.Driver");
        Connection connection  = DriverManager.getConnection(DB_URL, USER, PASS);
        ///////
        try {

            Statement statement1 = connection.createStatement();
            b.setOnAction(e -> {
                try {
                    statement1.executeUpdate("INSERT INTO test2 (text_ru, text_en) VALUES ('привет12', 'hello12')");
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            });

            Statement stmt = connection.createStatement();
            Statement stmt2 = connection.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT text_ru FROM test2;"); //sql запрос
//            ResultSet rs2 = stmt2.executeQuery("SELECT text_en FROM test2;"); //sql запрос
            ResultSet rs = stmt.executeQuery("SELECT text_ru FROM test2 WHERE id >= 1 AND id <= 7"); //sql запрос
            ResultSet rs2 = stmt2.executeQuery("SELECT text_en FROM test2 WHERE id >= 1 AND id <= 7"); //sql запрос

            String str = null;
            String str2 = null;
            for (int i = 0; i < 100; i++) {
                rs.next();
                rs2.next();
                str = rs.getString("text_ru");
                str2 = rs2.getString("text_en");
                System.out.println("Получим данные из таблицы: " + str);
                labels1[i] = new Label();
                labels1[i].setText(str);
                v1.getChildren().addAll(labels1[i]);
                labels2[i] = new Label();
                labels2[i].setText(str2);
                v2.getChildren().addAll(labels2[i]);
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

        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main (String[] args){
        launch(args);
    }

}
