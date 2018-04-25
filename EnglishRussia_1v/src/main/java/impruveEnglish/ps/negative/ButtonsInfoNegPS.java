package impruveEnglish.ps.negative;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonsInfoNegPS
{
    private Button[] infoNegPS = new Button[73];

    public Button[] getInfoNegPS() {
        appButInfoPS();
        return infoNegPS;
    }
    private void appButInfoPS(){
        for (int i = 1; i < 73; i++) {
            infoNegPS[i] = new Button();
            Image image = new Image("info2.png");
            ImageView imageView = new ImageView(image);
            infoNegPS[i].setGraphic(imageView);
            infoNegPS[i].setStyle("-fx-background-color: transparent;");
        }
    }
}
