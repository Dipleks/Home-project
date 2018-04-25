package impruveEnglish.effects;

import javafx.scene.paint.Color;

public class EffectColor
{
    private Color colorText = Color.web("#00FF00");
    private Color colorTextClic = Color.RED;
    private static Color colorNumber = Color.DARKGRAY;

    public Color getColorText() {
        return colorText;
    }

    public static Color getColorNumber() {
        return colorNumber;
    }

    public Color getColorTextClic() {
        return colorTextClic;
    }
}
