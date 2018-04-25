package impruveEnglish.ps.approvals;

import impruveEnglish.effects.EffectColor;
import impruveEnglish.effects.EffectFont;
import javafx.scene.control.Label;

public class NumerationsAppPS extends StringNumerationsPS
{
    private Label[] numeration = new Label[241];

    public Label[] getNumeration() {
        numerationSetStr();
        return numeration;
    }

    private void numerationSetStr() {
        for (int i = 1; i < numeration.length; i++) {
            numeration[i] = new Label();
            numeration[i].setText(getNumeratoinStr()[i]);
            numeration[i].setTextFill(EffectColor.getColorNumber());
            numeration[i].setFont(EffectFont.getFontNumber());
        }
    }

}
