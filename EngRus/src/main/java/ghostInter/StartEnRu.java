package ghostInter;

import ghostInter.dataBase.StringFiles;
import ghostInter.interfaceRoot.*;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class StartEnRu extends Application implements Root, StringFiles
{
    private IMenuBar iMenuBar = new MenuBarEngRus();

    public void start(final Stage primaryStage) throws Exception {

        iMenuBar.getMenu();

        ROOT.getChildren().addAll();

        primaryStage.setTitle("EngRus");
        primaryStage.setMaximized(true); //устанавливаем размер окна на весь экран
        primaryStage.setScene(SCENE_ROOT);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
