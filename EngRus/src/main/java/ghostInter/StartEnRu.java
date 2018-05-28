package ghostInter;

import db.CreateDB;
import ghostInter.interfaceRoot.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.sql.SQLException;

public class StartEnRu extends Application implements Root
{
    private MenuBarEngRus menuBarEngRus = new MenuBarEngRus();

    @Override
    public void start(Stage primaryStage) throws Exception {

        if (CreateDB.connectDB()){
            runMethod();
        } else {
            showWindow();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    private void showWindow(){

        showTextOne.setText("Первый вход в программу!");
        showTextTwo.setText("Создать базу данных?");
        showTextOne.setFont(Font.font("Time New Romane", 15));
        showTextTwo.setFont(Font.font("Time New Romane", 15));

        yesDB.setOnAction(e -> {
            try {
                CreateDB.newDB();
            } catch (SQLException | ClassNotFoundException e1) {
                e1.printStackTrace();
            }
            try {
                runMethod();
            } catch (SQLException | ClassNotFoundException e1) {
                e1.printStackTrace();
            }
            showStageDB.close();
        });
        noDB.setOnAction(e -> {
            try {
                runMethod();
            } catch (SQLException | ClassNotFoundException e1) {
                e1.printStackTrace();
            }
            showStageDB.close();
        });
        showNoDB.setSpacing(10);
        showNoDB.getChildren().addAll(yesDB, noDB);
        showNoDB.setAlignment(Pos.CENTER);
        showDB.setSpacing(3);
        showDB.getChildren().addAll(showTextOne, showTextTwo, showNoDB);
        showDB.setAlignment(Pos.CENTER);

        rootShowDB.setPadding(new Insets(20, 40, 20, 40));
        rootShowDB.setCenter(showDB);

        showStageDB.setScene(showSceneDB);
        showStageDB.setTitle("Вход...");
        showStageDB.show();
    }
    private void runMethod() throws SQLException, ClassNotFoundException {
        menuBarEngRus.getMenu();

        ROOT.getChildren().addAll();

        WINDOW.setTitle("EngRus");
        WINDOW.setMaximized(true); //устанавливаем размер окна на весь экран
        WINDOW.setScene(SCENE_ROOT);
        WINDOW.show();
    }
}
