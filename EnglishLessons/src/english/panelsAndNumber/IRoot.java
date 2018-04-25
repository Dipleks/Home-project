package english.panelsAndNumber;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;

public interface IRoot {

    Group root = new Group();
    Pagination englishListAppPs = new Pagination(7,0);
    Pagination englishListNegPs = new Pagination(2,0);

}
