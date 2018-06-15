package exercise;

import interfaceRoot.Root;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public interface ArgumentsExercise extends Root
{
    // Панели заданий и меню переключения рус/eng/в_меню:
    VBox leftColumn = new VBox();
    VBox rightColumn = new VBox();
    HBox groupRadBut = new HBox();
}
