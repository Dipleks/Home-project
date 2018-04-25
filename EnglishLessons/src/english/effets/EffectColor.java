package english.effets;

import javafx.scene.paint.Color;

public class EffectColor
{
    private Color colorText = Color.BLUE;
    private Color colorTextClic = Color.web("#00FF00");
    private Color colorNumber = Color.DARKGRAY;

    public Color getColorText() {
        return colorText;
    }

    public Color getColorNumber() {
        return colorNumber;
    }

    public Color getColorTextClic() {
        return colorTextClic;
    }

}
