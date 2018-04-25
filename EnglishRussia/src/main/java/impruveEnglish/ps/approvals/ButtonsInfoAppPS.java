package impruveEnglish.ps.approvals;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonsInfoAppPS
{
    private Button[] infoAppPS = new Button[241];

    public Button[] getInfoAppPS() {
        appButInfoPS();
        return infoAppPS;
    }
    private void appButInfoPS(){
        for (int i = 1; i < 241; i++) {
            infoAppPS[i] = new Button();
            Image image = new Image("info2.png");
            ImageView imageView = new ImageView(image);
            infoAppPS[i].setGraphic(imageView);
            infoAppPS[i].setStyle("-fx-background-color: transparent;");
        }
    }
}
