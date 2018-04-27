package ghostInter.interfaceRoot;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

public interface Root
{
    Screen SCREEN = Screen.getPrimary();
    double widthSize = SCREEN.getBounds().getWidth();
    double heightSize = SCREEN.getBounds().getHeight();

    Group ROOT = new Group();
    Scene SCENE_ROOT = new Scene(ROOT, widthSize*0.95, heightSize*0.95);

    VBox leftColumm = new VBox();
    VBox rightColumm = new VBox();

    HBox groupRadBut = new HBox();

}
