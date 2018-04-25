package impruveEnglish.ps.questions;

import impruveEnglish.effects.EffectColor;
import impruveEnglish.effects.EffectFont;
import javafx.scene.control.Label;

public class NumerationsQuesPS extends StringNumerationsQuesPS
{
    private Label[] numerationQues = new Label[205];

    public Label[] getNumerationQues() {
        numerationSetQuesStr();
        return numerationQues;
    }

    private void numerationSetQuesStr() {
        for (int i = 1; i < numerationQues.length; i++) {
            numerationQues[i] = new Label();
            numerationQues[i].setText(getQuesNumeratoinStr()[i]);
            numerationQues[i].setTextFill(EffectColor.getColorNumber());
            numerationQues[i].setFont(EffectFont.getFontNumber());
        }
    }
}
