package english.effets;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class EffectFont {
    private Font fontText = Font.font("Time New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
    private Font fontNumber = Font.font("Time New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18);

    public Font getFontText() {
        return fontText;
    }

    public Font getFontNumber() {
        return fontNumber;
    }
}
