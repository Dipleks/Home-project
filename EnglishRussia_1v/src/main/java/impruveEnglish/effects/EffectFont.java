package impruveEnglish.effects;

import impruveEnglish.control.Root;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class EffectFont implements Root
{
    private Font fontText = Font.font("Time New Roman", FontWeight.BOLD, FontPosture.ITALIC, heightSize*0.020/*20*/); //0,018
    private static Font fontNumber = Font.font("Time New Roman", FontWeight.BOLD, FontPosture.ITALIC, heightSize*0.018);

    public Font getFontText() {
        return fontText;
    }

    public static Font getFontNumber() {
        return fontNumber;
    }
}
