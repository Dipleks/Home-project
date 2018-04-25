package impruveEnglish.control;

import impruveEnglish.effects.EffectColorOpacity;
import impruveEnglish.ps.approvals.LabEnAppPS;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

class MenuBarProgram extends MenuButtonPS implements Root
{
    private final MenuBar menuBar = new MenuBar();

    private final Menu menuExercise = new Menu("Задания");
    private final Menu menuExam = new Menu("Контрольные");
    private final Menu menuHelp = new Menu("Подсказки");
    private final Menu menuSetting = new Menu("Настройки");

    private final MenuItem menuPS = new MenuItem("Present Simple");
    private final MenuItem menuToBe = new MenuItem("Форма \"to be\"");
    private final MenuItem menuWHITE = new MenuItem("Белый");
    private final MenuItem menuBLACK = new MenuItem("Черный");

    private int appPS = 1;

    private void menuBarStarter(){

        menuBar.setTranslateX(10);
        menuBar.setTranslateY(heightSize/2-heightSize+70);
        menuBar.setMaxWidth(500);
        menuBar.setStyle("-fx-background-color: rgba(0, 100, 100); -fx-font-weight: bold; " +
                "-fx-font-style: italic; -fx-text-fill: blue");

        menuPS.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (appPS == 1) {
                    appPS++;
                    STACK_PANE.getChildren().addAll(MenuButtonPS.getButtonAppPSen(), MenuButtonPS.getButtonNegPSen(),
                            MenuButtonPS.getButtonQuesPSen(), MenuButtonPS.getButtonAppPSru(), MenuButtonPS.getButtonNegPSru(),
                            MenuButtonPS.getButtonQuesPSru(), MenuButtonPS.getReturnPS(), MenuButtonPS.getAllPS(),
                            MenuButtonPS.getExamOnePS());
                } else {
                    System.out.println("MenuBarProgram.menuBarStrarter");
                }
            }
        });

        menuWHITE.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                STACK_PANE.setBackground(new Background(new BackgroundFill(Color.web(EffectColorOpacity.WHITE_PANEL, 0.5), CornerRadii.EMPTY,
                        new Insets(50,50,50,50))));
                STACK_PANE.getChildren().remove(SliderMenu.getSliderOpacityClassic());
                STACK_PANE.getChildren().remove(SliderMenu.getSliderOpacityBLACK());
                STACK_PANE.getChildren().addAll(SliderMenu.getSliderOpacityWHITE());
            }
        });
        menuBLACK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                STACK_PANE.setBackground(new Background(new BackgroundFill(Color.web(EffectColorOpacity.BLACK_PANEL, 0.5), CornerRadii.EMPTY,
                        new Insets(50,50,50,50))));
                STACK_PANE.getChildren().remove(SliderMenu.getSliderOpacityClassic());
                STACK_PANE.getChildren().remove(SliderMenu.getSliderOpacityWHITE());
                STACK_PANE.getChildren().addAll(SliderMenu.getSliderOpacityBLACK());
            }
        });
        menuSetting.getItems().addAll(menuWHITE, menuBLACK);
        menuExercise.getItems().addAll(menuPS, menuToBe);
        menuBar.getMenus().addAll(menuExercise, menuExam, menuHelp, menuSetting);


    }
    MenuBar getMenuBar(){
//        menuBar.setId("358");
        menuBarStarter();
        System.out.println("MenuBarProgram.getMenuBar");
        return menuBar;
    }
}
