package ghostInter.interfaceRoot;

import ghostInter.interfaceRoot.buttonPS.JobControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuBarEngRus implements IMenuBar, Root
{
    private final MenuBar menuBar = new MenuBar();

    private final Menu menuExercise = new Menu("Задания");
    private final MenuItem menuPS = new MenuItem("Present Simple");
    private final MenuItem menuToBe = new MenuItem("Форма \"to be\"");

    private final Menu menuExam = new Menu("Контрольные");

    private final Menu menuHelp = new Menu("Подсказки");

    private final Menu menuSetting = new Menu("Настройки");
    private final MenuItem menuWHITE = new MenuItem("Белый");
    private final MenuItem menuBLACK = new MenuItem("Черный");

    public void getMenu() {
        ROOT.getChildren().addAll(getMenuBar());
    }

    private MenuBar getMenuBar(){

        menuPS.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) {
                JobControl jobControl = new JobControl();
                ROOT.getChildren().addAll(jobControl.getButton());
            }
        });

        menuBar.setMinWidth(widthSize);
        menuSetting.getItems().addAll(menuWHITE, menuBLACK);
        menuExercise.getItems().addAll(menuPS, menuToBe);
        menuBar.getMenus().addAll(menuExercise, menuExam, menuHelp, menuSetting);
        return menuBar;
    }
}
