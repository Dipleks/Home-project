package english;

import english.panelsAndNumber.IRoot;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EnglishLessons extends Application implements IRoot {

    private Scene scene = new Scene(root, 1400, 900/*, Color.SLATEGRAY*/);
    private Stage primaryStage = new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception{

        root.getChildren().addAll(getParent());
        getSatage();

    }

    private Parent getParent() throws IOException {
        return FXMLLoader.load(getClass().getResource("englishLessons.fxml"));
    }

    private Stage getSatage(){
        primaryStage.setTitle("English lessons");
        primaryStage.setScene(scene);
        primaryStage.show();
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
