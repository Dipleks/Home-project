package ghostInter.interfaceRoot;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

public interface Root
{
    Screen SCREEN = Screen.getPrimary();
    double widthSize = SCREEN.getBounds().getWidth();
    double heightSize = SCREEN.getBounds().getHeight();

    Group ROOT = new Group();
    Scene SCENE_ROOT = new Scene(ROOT, widthSize*0.95, heightSize*0.95, EffectColor.colorScene);

    VBox leftColumm = new VBox();
    VBox rightColumm = new VBox();
    VBox numberColumm = new VBox();
    VBox iprColumm = new VBox();

    HBox groupRadBut = new HBox();
    HBox groupExam = new HBox();

    TextField improve = new TextField();
    Label improveClick1 = new Label("Введите текст и нажмите на предложение из списка! " +
            "Красный - не верно! Зеленый - верно!\n " +
            "     Если вы уверены в своем переводе нажмите на номер предложения!");
    ScrollPane examPane = new ScrollPane();

    default void clearMethod(){
        leftColumm.getChildren().clear();
        rightColumm.getChildren().clear();
        groupRadBut.getChildren().clear();
        groupExam.getChildren().clear();
        iprColumm.getChildren().clear();
        numberColumm.getChildren().clear();
        ROOT.getChildren().clear();
    }

}
