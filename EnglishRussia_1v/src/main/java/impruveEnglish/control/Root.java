package impruveEnglish.control;

import javafx.scene.control.Pagination;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;

public interface Root
{
    Screen SCREEN = Screen.getPrimary();
    StackPane STACK_PANE = new StackPane();
    Pagination englishListAppPs = new Pagination(8,0);
    Pagination englishListNegPs = new Pagination(3,0);
    Pagination englishListQuesPs = new Pagination(7,0);

    double widthSize = SCREEN.getBounds().getWidth();
    double heightSize = SCREEN.getBounds().getHeight();
}
