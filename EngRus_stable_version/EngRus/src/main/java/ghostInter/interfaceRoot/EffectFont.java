package ghostInter.interfaceRoot;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class EffectFont implements Root
{
    public static final Font fontText = Font.font("Time New Roman", FontWeight.BOLD,
            FontPosture.ITALIC, heightSize*0.020);
    public static final Font fontTextExam = Font.font("Time New Roman", FontWeight.BOLD,
            FontPosture.ITALIC, heightSize*0.018);
    public static final Font fontTextLevel = Font.font("Time New Roman",
            FontPosture.ITALIC, heightSize*0.015);
    public static final Font fontTitle = Font.font("Time New Roman", FontWeight.BOLD,
            FontPosture.ITALIC, heightSize*0.018);
}
