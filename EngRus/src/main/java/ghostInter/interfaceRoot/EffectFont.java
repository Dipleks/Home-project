package ghostInter.interfaceRoot;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class EffectFont implements Root
{
    static final Font fontText = Font.font("Time New Roman", FontWeight.BOLD,
            FontPosture.ITALIC, heightSize*0.025);
    public static final Font fontNumber = Font.font("Time New Roman", FontWeight.BOLD,
            FontPosture.ITALIC, heightSize*0.02);
}
