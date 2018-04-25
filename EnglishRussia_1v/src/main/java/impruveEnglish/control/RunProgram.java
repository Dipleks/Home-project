package impruveEnglish.control;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
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
    public void start(final Stage primaryStage) throws Exception {

//        System.out.println(widthSize + "   "+ heightSize);
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });
        stackPanelEffect();
        final Scene scene = new Scene(STACK_PANE, widthSize*0.94, heightSize-100);
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

        Slider slider = new Slider();
        slider.setTranslateX(widthSize/3);
        slider.setTranslateY(heightSize/2.5);
        slider.setMaxWidth(100);
        slider.setMin(0.3);
        slider.setMax(1.0);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setValue(0.5);
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue)
            {
                STACK_PANE.setBackground(new Background(new BackgroundFill(Color.rgb(0, 100, 100, (Double) newValue),
                        CornerRadii.EMPTY, new Insets(50,50,50,50))));
            }
        });

        MenuBarProgram menuBarProgram = new MenuBarProgram();
        STACK_PANE.setBackground(new Background(new BackgroundFill(Color.rgb(0, 100, 100, 0.5), CornerRadii.EMPTY,
                new Insets(50,50,50,50))));
        STACK_PANE.getChildren().addAll(createShadowPane(), exitButton(), menuBarProgram.getMenuBar(), slider);
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
