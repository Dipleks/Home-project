package impruveEnglish.ps.questions;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonsInfoQuesPS
{
    private Button[] infoQuesPS = new Button[205];

    public Button[] getInfoQuesPS() {
        appButInfoPS();
        return infoQuesPS;
    }
    private void appButInfoPS(){
        for (int i = 1; i < 205; i++) {
            infoQuesPS[i] = new Button();
            Image image = new Image("info2.png");
            ImageView imageView = new ImageView(image);
            infoQuesPS[i].setGraphic(imageView);
            infoQuesPS[i].setStyle("-fx-background-color: transparent;");
        }
    }
}
