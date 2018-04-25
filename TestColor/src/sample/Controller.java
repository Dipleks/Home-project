package sample;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Controller {
    public StackPane colorit;
    private int shadowSize = 50;


    public StackPane getColorit() {
        colorit.setStyle(
                "-fx-background-color: rgba(255, 255, 255, 0.5);" +
                        "-fx-background-insets: " + shadowSize + ";"
        );

        return colorit;
    }
}
