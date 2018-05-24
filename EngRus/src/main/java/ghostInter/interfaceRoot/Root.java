package ghostInter.interfaceRoot;

import ghostInter.StartEnRu;
import ghostInter.control.AddExercise;
import javafx.concurrent.Task;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static javax.sound.sampled.AudioSystem.getAudioInputStream;

public interface Root
{
    Stage WINDOW = new Stage();
    Screen SCREEN = Screen.getPrimary();
    double widthSize = SCREEN.getBounds().getWidth();
    double heightSize = SCREEN.getBounds().getHeight();

    Label showTextOne = new Label();
    Label showTextTwo = new Label();
    VBox showDB = new VBox();
    HBox showNoDB = new HBox();
    BorderPane rootShowDB = new BorderPane();
    Stage showStageDB = new Stage();
    Scene showSceneDB = new Scene(rootShowDB, 450, 200);
    Button yesDB = new Button("Да, создать!");
    Button noDB = new Button("Использовать без БД!");

    Group ROOT = new Group();
    Scene SCENE_ROOT = new Scene(ROOT, widthSize*0.95, heightSize*0.95, EffectColor.colorScene);

    VBox leftColumn = new VBox();
    VBox rightColumn = new VBox();
    VBox numberColumn = new VBox();
    VBox iprColumn = new VBox();

    HBox groupRadBut = new HBox();
    HBox groupExam = new HBox();
    VBox groupText = new VBox();

    // Menu_my_words
    VBox leftC = new VBox();
    VBox rightC = new VBox();
    HBox groupMy = new HBox();
    VBox addElement = new VBox();
    HBox addTextAndButton = new HBox();
    ScrollPane textMy = new ScrollPane();
    TextField textEn = new TextField();
    TextField textRu = new TextField();
    TextField textSearch = new TextField();
    Button addWords = new Button("Добавить");
    Button searchWords = new Button("Поиск");

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
        leftC.getChildren().clear();
        rightC.getChildren().clear();
        groupMy.getChildren().clear();
        addElement.getChildren().clear();
        addTextAndButton.getChildren().clear();
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
    default void soundClick() {

        // TODO делаем код для клика;
//        Runnable runnable = () -> {
//            String file = "resources/click.mp3";
//            Media sound = new Media(new File(file).toURI().toString());
//            MediaPlayer mediaPlayer = new MediaPlayer(sound);
//            mediaPlayer.play();
//        };
//        runnable.run();
    }
}
