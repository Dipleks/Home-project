package ghostInter.interfaceRoot;

import javafx.scene.control.Label;

import java.io.*;

public interface ITemple extends Root
{
    default BufferedReader readingFromSheet(String s) throws IOException {
        File file = new File(s);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        return br;
    }

    //////////////////////////

    default Label complete(Label labs, String engText, String rusText, double x, double y){

        labs = new Label();
        labs.setText(engText);
        labs.setLayoutX((widthSize/8)*x);
        labs.setLayoutY((heightSize/8)*y);
        labs.setFont(EffectFont.fontText);
        labs.setTextFill(EffectColor.colorText);
        Label finalLabs = labs;
        labs.setOnMouseClicked(event -> {
            if (finalLabs.getText().equals(engText)){
                finalLabs.setText(rusText);
                finalLabs.setTextFill(EffectColor.colorTextClic);
            } else {
                finalLabs.setText(engText);
                finalLabs.setTextFill(EffectColor.colorText);
            }
        });
        return labs;
    }
}
