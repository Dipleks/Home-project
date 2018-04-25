import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.*;

interface ITest2
{
    Group root = new Group();

    default BufferedReader tTTT(String s) throws IOException {
        File file = new File(s);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        return br;
    }

    //////////////////////////

    default Label testGetLabel(Label labs, String engText, String rusText, int x, int y){

        labs = new Label();
        labs.setText(engText);
        labs.setLayoutX(x);
        labs.setLayoutY(y);
        Label finalLabs = labs;
        labs.setOnMouseClicked(event -> {
                if (finalLabs.getText().equals(engText)){
                    finalLabs.setText(rusText);
                } else {
                    finalLabs.setText(engText);
                }
        });
        return labs;
    }
}
