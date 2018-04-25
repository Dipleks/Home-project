package impruveEnglish.control;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RunProgram extends Application implements Root
{
    private final int shadowSize = 50;
    private final Button exit = new Button();

    @Override
    public void start(Stage primaryStage) throws Exception {


        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });
        stackPanelEffect();
        final Scene scene = new Scene(STACK_PANE, widthSize-100, heightSize-100);
        primaryStage.setTitle("Lesson");
        scene.setFill(Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void stackPanelEffect() throws IOException {

        MenuBarProgram menuBarProgram = new MenuBarProgram();

        STACK_PANE.getChildren().addAll(createShadowPane(), exitButton(), menuBarProgram.getMenuBar());
        STACK_PANE.setStyle(
                "-fx-background-color: rgba(0, 100, 100, 0.5);" + //прозрачность + цвет
                        "-fx-background-insets: " + shadowSize + ";" //отступ от краев
        );
    }

    private Button exitButton(){
        Image image = new Image("close.png");
        ImageView imageView = new ImageView(image);
        exit.setTranslateX(widthSize/2-150);
        exit.setTranslateY(heightSize/2-heightSize+70);
        exit.setGraphic(imageView);
        exit.setStyle("-fx-background-color: transparent;");
        return exit;
    }

    private Pane createShadowPane() throws IOException {
        Pane shadowPane = new Pane();
        shadowPane.setStyle(
                "-fx-background-color: white;" +
                        "-fx-effect: dropshadow(gaussian, red, " + shadowSize + ", 0, 0, 0);" +
                        "-fx-background-insets: " + shadowSize + ";"
        );

        Rectangle innerRect = new Rectangle();
        Rectangle outerRect = new Rectangle();
        shadowPane.layoutBoundsProperty().addListener(
                (observable, oldBounds, newBounds) -> {
                    innerRect.relocate(
                            newBounds.getMinX() + shadowSize,
                            newBounds.getMinY() + shadowSize
                    );
                    innerRect.setWidth(newBounds.getWidth() - shadowSize * 2);
                    innerRect.setHeight(newBounds.getHeight() - shadowSize * 2);

                    outerRect.setWidth(newBounds.getWidth());
                    outerRect.setHeight(newBounds.getHeight());

                    Shape clip = Shape.subtract(outerRect, innerRect);
                    shadowPane.setClip(clip);
                }
        );
        return shadowPane;
    }
}
