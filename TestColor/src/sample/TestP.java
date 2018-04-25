package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class TestP extends Application {

    private static final int shadowSize = 50;

    Button button = new Button("one");
    Button button1 = new Button("exit");
    GridPane gridPane = new GridPane();

    @Override public void start(Stage stage) throws IOException {
        stage.initStyle(StageStyle.TRANSPARENT);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });
        button1.setTranslateX(500);
        button1.setTranslateY(-420);

        gridPane.setHgap(10);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(30));
        gridPane.setTranslateX(20);
        gridPane.setGridLinesVisible(true);
        ColumnConstraints c1 = new ColumnConstraints();
        ColumnConstraints c2 = new ColumnConstraints();
        c1.setPercentWidth(50);
        c2.setHalignment(HPos.CENTER);
        c2.setPercentWidth(60);

        gridPane.getColumnConstraints().addAll(c1, c2);
        gridPane.add(button, 1, 0);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(createShadowPane(), gridPane, button1);
        stackPane.setStyle(
                "-fx-background-color: rgba(255, 255, 255, 0.5);" +
                        "-fx-background-insets: " + shadowSize + ";"
        );

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });

        Scene scene = new Scene(stackPane, 1400, 900);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }

    // Create a shadow effect as a halo around the pane and not within
    // the pane content area.

    private Pane createShadowPane() throws IOException {
        Pane shadowPane = new Pane();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        shadowPane.getChildren().addAll(root);
//        button.setLayoutX(0);
//        button.setLayoutY(0);
//        shadowPane.getChildren().addAll(button);

        // a "real" app would do this in a CSS stylesheet.
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


    public static void main(String[] args) {
        launch(args);
    }
}
