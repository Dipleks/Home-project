package impruveEnglish.ps.negative;

import impruveEnglish.effects.EffectColor;
import impruveEnglish.effects.EffectFont;
import javafx.scene.control.Label;

public class NumerationsNegPS extends StringNumerationsNegPS
{
    private Label[] numerationNeg = new Label[73];

    public Label[] getNumerationQues() {
        numerationSetNegStr();
        return numerationNeg;
    }

    private void numerationSetNegStr() {
        for (int i = 1; i < numerationNeg.length; i++) {
            numerationNeg[i] = new Label();
            numerationNeg[i].setText(getNegNumeratoinStr()[i]);
            numerationNeg[i].setTextFill(EffectColor.getColorNumber());
            numerationNeg[i].setFont(EffectFont.getFontNumber());
        }
    }
}
