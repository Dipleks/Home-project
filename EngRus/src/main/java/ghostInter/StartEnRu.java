package ghostInter;

import ghostInter.interfaceRoot.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class StartEnRu extends Application implements Root
{
    private MenuBarEngRus menuBarEngRus = new MenuBarEngRus();

    public void start(final Stage primaryStage) throws Exception {

        menuBarEngRus.getMenu();

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
