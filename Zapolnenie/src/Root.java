import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Root extends Application implements ITest2
{
    private ClassTest3 classTest3 = new ClassTest3(new Label[40], new String[40], new String[40], "src/en1.data",
        "src/rus1.data", 0, 40, 20, 20, 300, 20, 20);
    private ClassTest3 classTest4 = new ClassTest3(new Label[34], new String[34], new String[34], "src/testEn.data",
        "src/testRu.data", 0, 34, 17, 20, 300, 500, 20);

    @Override
    public void start(Stage primaryStage) throws Exception {

        classTest3.getLabels();
        classTest4.getLabels();

        root.getChildren().addAll();

        Scene scene = new Scene(root, 800, 900);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
