package impruveEnglish.ps.negative;

import impruveEnglish.control.Root;
import impruveEnglish.effects.EffectColor;
import impruveEnglish.effects.EffectFont;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class LabEnNegPS implements Root
{
    private Label[] labNegEn = new Label[73];
    private StringEngNegPS stringNegEng = new StringEngNegPS();
    private StringRusNegPS stringNegRus = new StringRusNegPS();
    private EffectFont effectFont = new EffectFont();
    private EffectColor effectColor = new EffectColor();

    public Label[] getLabQuesEn() {
        negLabEn();
        return labNegEn;
    }
    private void negLabEn() {
        for (int i = 1; i < labNegEn.length; i++) {
            labNegEn[i] = new Label();
            labNegEn[i].setTextFill(effectColor.getColorText());
            labNegEn[i].setFont(effectFont.getFontText());
            labNegEn[i].setText(stringNegEng.getStrNegEn()[i]);
            int finalI = i;
            labNegEn[i].setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    if (labNegEn[finalI].getText().equals(stringNegEng.getStrNegEn()[finalI])) {
                        labNegEn[finalI].setText(stringNegRus.getStrNegRu()[finalI]);
                        labNegEn[finalI].setTextFill(effectColor.getColorTextClic());
                    } else {
                        labNegEn[finalI].setText(stringNegEng.getStrNegEn()[finalI]);
                        labNegEn[finalI].setTextFill(effectColor.getColorText());
                    }
                }
            });
        }
    }
}
