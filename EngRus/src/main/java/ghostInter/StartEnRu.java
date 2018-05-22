package ghostInter;

import db.CreateDB;
import ghostInter.interfaceRoot.*;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StartEnRu extends Application implements Root
{
    private MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
    private Stage stg = new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception {

        if (true/* TODO найти решение выполнение данного метода*/){
            CreateDB.newDB();
            runMethod();
            System.out.println("z=0");
        } else {
            showWindow();
            System.out.println("z=1");
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
    private void showWindow(){

        Label label = new Label();
        label.setLayoutX(10);
        label.setLayoutY(50);
        label.setText("Первый вход в программу! \n Создание БД... Ожидайте...");
        label.setFont(Font.font("Time New Romane", 15));
        Button button = new Button("Продолжить");
        button.setOnAction(e -> {
            try {
                CreateDB.newDB();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            runMethod();
            stg.close();
        });
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, button);
        vBox.setAlignment(Pos.CENTER);

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 40, 20, 40));
        root.setCenter(vBox);

        Scene scn = new Scene(root, 450, 200);
        stg.setScene(scn);
        stg.setTitle("Вход...");
//        stg.initOwner(mod);
//        stg.showAndWait();
        stg.show();
    }
    private void runMethod(){
        menuBarEngRus.getMenu();

        ROOT.getChildren().addAll();

        WINDOW.setTitle("EngRus");
        WINDOW.setMaximized(true); //устанавливаем размер окна на весь экран
        WINDOW.setScene(SCENE_ROOT);
        WINDOW.show();
    }
}
