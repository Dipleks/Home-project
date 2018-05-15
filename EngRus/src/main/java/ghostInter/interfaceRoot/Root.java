package ghostInter.interfaceRoot;

import ghostInter.control.AddExercise;
import javafx.concurrent.Task;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Screen;

import java.io.File;

public interface Root
{
    Screen SCREEN = Screen.getPrimary();
    double widthSize = SCREEN.getBounds().getWidth();
    double heightSize = SCREEN.getBounds().getHeight();

    Group ROOT = new Group();
    Scene SCENE_ROOT = new Scene(ROOT, widthSize*0.95, heightSize*0.95, EffectColor.colorScene);

    VBox leftColumn = new VBox();
    VBox rightColumn = new VBox();
    VBox numberColumn = new VBox();
    VBox iprColumn = new VBox();

    HBox groupRadBut = new HBox();
    HBox groupExam = new HBox();
    VBox groupText = new VBox();

    // About - MenuBarEngRus
    TextField improve = new TextField();
    Label improveClick1 = new Label("Введите текст и нажмите на предложение из списка! " +
            "Красный - не верно! Зеленый - верно!\n " +
            "     Если вы уверены в своем переводе нажмите на номер предложения!");

    // Exam
    ScrollPane examPane = new ScrollPane();
    ScrollPane textPane = new ScrollPane();
    ScrollPane leftTextPane = new ScrollPane();
    ScrollPane leftTextPane1 = new ScrollPane();
    ScrollPane leftTextPane2 = new ScrollPane();

    default void clearColumn(){
        leftColumn.getChildren().clear();
        rightColumn.getChildren().clear();
        ROOT.getChildren().clear();
        MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
        menuBarEngRus.getMenu();
        ROOT.getChildren().addAll(groupRadBut);
    }
    default void clearMethod(){
        leftColumn.getChildren().clear();
        rightColumn.getChildren().clear();
        groupRadBut.getChildren().clear();
        groupExam.getChildren().clear();
        iprColumn.getChildren().clear();
        numberColumn.getChildren().clear();
        ROOT.getChildren().clear();
    }
    default void methodClearExercise(String m) {
        if (m.equals("AddMenuButtonPS")){
            clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            AddExercise addExercise = new AddExercise();
            addExercise.AddMenuButtonPS();
        } else if (m.equals("AddMenuButtonToBe")){
            clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            AddExercise addExercise = new AddExercise();
            addExercise.AddMenuButtonToBe();
        }
    }
    default void methodClearExam(String m) {
        if (m.equals("AddMenuButtonExamPS")){
            clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            AddExercise addExercise = new AddExercise();
            addExercise.AddMenuButtonExamPS();
        } else if (m.equals("AddMenuButtonExamToBe")){
            clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            AddExercise addExercise = new AddExercise();
            addExercise.AddMenuButtonExamToBe();
        }
    }
    default void soundClick(){
//        Runnable runnable = () -> {
//            String file = "click.mp3";
//            Media sound = new Media(new File(file).toURI().toString());
//            MediaPlayer mediaPlayer = new MediaPlayer(sound);
//            mediaPlayer.play();
//
//        };
//        runnable.run();
    }
}
