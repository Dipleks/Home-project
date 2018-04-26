package ghostInter.interfaceRoot;

import ghostInter.interfaceRoot.buttonPS.AddButAndLabel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public interface Root
{
    Screen SCREEN = Screen.getPrimary();
    double widthSize = SCREEN.getBounds().getWidth();
    double heightSize = SCREEN.getBounds().getHeight();

    Group ROOT = new Group();
    Scene SCENE_ROOT = new Scene(ROOT, widthSize*0.95, heightSize*0.95);

    VBox leftColumm = new VBox();
    VBox rightColumm = new VBox();

//    AddButAndLabel addButAndLabel = new AddButAndLabel();

//    HBox lengthButtonApp = new HBox();
//    HBox lengthButtonNeg = new HBox();
//    HBox lengthButtonQues = new HBox();

//    Pagination englishListAppPs = new Pagination(8,0);



}
