package sample;

import javafx.scene.layout.StackPane;

public interface Iroot {
    StackPane root = new StackPane();

    default StackPane getColorit() {
        root.setStyle(
                "-fx-background-color: rgba(255, 255, 255, 0.5);" +
                        "-fx-background-insets: " + 50 + ";"
        );

        return root;
    }
}
