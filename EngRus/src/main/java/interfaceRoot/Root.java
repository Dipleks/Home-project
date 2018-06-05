package interfaceRoot;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Root
{
    // Главное окно:
    Stage WINDOW = new Stage();
    Screen SCREEN = Screen.getPrimary();
    double widthSize = SCREEN.getBounds().getWidth();
    double heightSize = SCREEN.getBounds().getHeight();
    Group ROOT = new Group();
    Scene SCENE_ROOT = new Scene(ROOT, widthSize*0.95, heightSize*0.95, EffectColor.colorScene);

    // Окно первого запуска программы:
    Label showTextOne = new Label();
    Label showTextTwo = new Label();
    VBox showDB = new VBox();
    HBox showNoDB = new HBox();
    BorderPane rootShowDB = new BorderPane();
    Stage showStageDB = new Stage();
    Scene showSceneDB = new Scene(rootShowDB, 450, 200);
    Button yesDB = new Button("Да, создать!");
    Button noDB = new Button("Использовать без БД!");

    // Панели заданий и меню переключения рус/eng/в_меню:
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
    Label[] my_word_en = new Label[500];
    Label[] my_word_ru = new Label[500];
    Button searchWords = new Button("Поиск");
    Button addWords = new Button("Добавить");

    // Control:
    Button exitInMenu = new Button("В меню");

    // Exam
    ScrollPane examPane = new ScrollPane();
    ScrollPane textPane = new ScrollPane();
    ScrollPane leftTextPane = new ScrollPane();
    ScrollPane leftTextPane1 = new ScrollPane();
    ScrollPane leftTextPane2 = new ScrollPane();
    VBox improveV = new VBox();
    String str = "Введите текст и нажмите на предложение из списка! " +
            "Красный - не верно! Зеленый - верно!\n " +
            "Если вы уверены в своем переводе нажмите на номер предложения!";
    TextField improve = new TextField();
    Label improveClick1 = new Label(str);
    VBox counterVB = new VBox();
    Label counterYES = new Label();
    Label counterNO = new Label();
    Label YES = new Label("Верно:");
    Label NO = new Label("Не верно:");

    // Часы:
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm:ss");
    Label uiTimer = new Label();
    String s1 = "Дата: ";
    String s2 = "\nВремя: ";
    KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), event -> uiTimer.setText(s1 + LocalDateTime.now().format(format) +
            s2 + LocalDateTime.now().format(format2)));
    Timeline timeline = new Timeline(keyFrame);
}
