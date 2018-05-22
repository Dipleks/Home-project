package testDB.addTextInTable;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class TextAdd2 extends Application
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
    static TextField t3 = new TextField();
    static Button b = new Button("Add");
    static Button b2 = new Button("Search");
    static Button b3 = new Button("Next");
    static Label label = new Label();

    @Override
    public void start(Stage primaryStage) throws Exception {

        methodPane();
        method();
        methodButt();
        methodButt2();
        methodButt3();

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void methodPane(){
        v1.getChildren().addAll(t1, t3);
        v2.getChildren().addAll(t2, b3);
        v3.getChildren().addAll(b, b2);
        h.setSpacing(20);
        h.getChildren().addAll(v1, v2, v3);

        s.setContent(h);
    }

    private static void method() throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        Connection connection =  DriverManager.getConnection(DB_URL, USER, PASS);
        try {
            Statement stmt = connection.createStatement();
            Statement stmt2 = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT text_ru FROM test2 ORDER BY id;"); //sql запрос
            ResultSet rs2 = stmt2.executeQuery("SELECT text_en FROM test2 ORDER BY id;"); //sql запрос

            String str = null;
            String str2 = null;
            for (int i = 0; rs.next(); i++) {
                rs2.next();
                str = rs.getString("text_ru");
                str2 = rs2.getString("text_en");
//                System.out.println("Получим данные из таблицы: " + str);
                labels1[i] = new Label();
                labels2[i] = new Label();
                labels1[i].setText(str);
                labels2[i].setText(str2);
                v1.getChildren().addAll(labels1[i]);
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
    }
    private void methodButt(){
        b.setOnAction(e -> {
            try {
                Connection connection1 =  DriverManager.getConnection(DB_URL, USER, PASS);
                Statement statement1 = connection1.createStatement();
                statement1.executeUpdate("INSERT INTO test2 (text_ru, text_en) VALUES ('" + t1.getText()
                        +"', '"+ t2.getText() +"')");
                ResultSet r = statement1.executeQuery("SELECT text_ru FROM test2");
                for (int i = 0; r.next(); i++) {
                    v1.getChildren().remove(labels1[i]);
                    v2.getChildren().remove(labels2[i]);
                }
                method();
            } catch (SQLException | ClassNotFoundException e1) {
                e1.printStackTrace();
            }

        });
    }
    private void methodButt2(){
        b2.setOnAction(e -> {
            String s = null;
            try {
                Connection connection2 =  DriverManager.getConnection(DB_URL, USER, PASS);
                Statement statement2 = connection2.createStatement();
                Statement statement3 = connection2.createStatement();
                ResultSet r2 = statement2.executeQuery("SELECT text_ru FROM test2");
                for (int i = 0; r2.next(); i++) {
                    v1.getChildren().remove(labels1[i]);
                    v2.getChildren().remove(labels2[i]);
                }
                ResultSet r3 = statement3.executeQuery("SELECT * FROM test2 WHERE text_ru LIKE '%"+t3.getText()+"%'");
                r3.next();
                s = r3.getString("text_ru");
                label.setText(s);
                v1.getChildren().addAll(label);

            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        });
    }
    private void methodButt3() {
        b3.setOnAction(e -> {
            try {
                v1.getChildren().remove(label);
                method();
            } catch (SQLException | ClassNotFoundException e1) {
                e1.printStackTrace();
            }
        });
    }
}
