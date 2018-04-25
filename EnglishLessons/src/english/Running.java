package english;

import english.effets.EffectColor;
import english.panelsAndNumber.IRoot;
import english.ps.approvals.MethodEng;
import english.ps.negative.MethodEngNeg;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class Running implements IRoot{

    public Pane choiceColor; //id для экрана для смены цвета фона
    public MenuItem whiteColor; //выбор белого фона
    public MenuItem blackColor; //выбор черного фона
    public MenuItem purpleColor; //выбор цвета по умолчанию
    public MenuBar barColor;
    private int appPS = 1;
    private int negPS = 1;
    private EffectColor effectColor = new EffectColor();

    //Задаем выбор фона приложения:
    @FXML
    public void setColorWhite() {
        choiceColor.setStyle("-fx-background-color: #FFFFFF");
        barColor.setStyle("-fx-background-color: #FFFFFF; -fx-font-weight: bold; -fx-font-style: italic;" +
                "-fx-text-fill: blue");

    }

    @FXML
    public void setColorBlack(){
        choiceColor.setStyle("-fx-background-color: #000000");
        barColor.setStyle("-fx-background-color: #000000; -fx-font-weight: bold; -fx-font-style: italic;" +
                "-fx-text-fill: blue");
//        effectColor.setColorText(Color.web("#FFFFFF"));
    }

    @FXML
    public void setColorPurpie() {
        choiceColor.setStyle("-fx-background-color: #9966CC");
        barColor.setStyle("-fx-background-color: #9966CC; -fx-font-weight: bold; -fx-font-style: italic;" +
                "-fx-text-fill: blue");
    }

    //Меню PS утверждения:
    @FXML
    public void approvalsPS() {

        if (appPS == 1) {
            appPS++;
            root.getChildren().removeAll(englishListNegPs);

            englishListAppPs.setMaxPageIndicatorCount(15);
            MethodEng methodEng = new MethodEng();
            methodEng.getEnglishListAppPS();

            root.getChildren().addAll(englishListAppPs);
        } else {
            System.out.println("Окно уже открыто!");
        }
    }

    //Меню PS отрицания:
    @FXML
    public void negativePS() {

        if (negPS == 1) {
            negPS++;
            root.getChildren().removeAll(englishListAppPs);

            englishListNegPs.setMaxPageIndicatorCount(15);
            MethodEngNeg methodEngNeg = new MethodEngNeg();
            methodEngNeg.getEnglishListNegPS();

            root.getChildren().addAll(englishListNegPs);
        } else {
            System.out.println("Окно уже открыто!");
        }

        root.getChildren().addAll();

    }
}
