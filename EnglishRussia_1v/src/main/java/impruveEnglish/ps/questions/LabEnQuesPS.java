package impruveEnglish.ps.questions;

import impruveEnglish.control.Root;
import impruveEnglish.effects.EffectColor;
import impruveEnglish.effects.EffectFont;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class LabEnQuesPS implements Root
{
    private Label[] labQuesEn = new Label[205];
    private StringEngQuesPS stringQuesEng = new StringEngQuesPS();
    private StringRusQuesPS stringQuesRus = new StringRusQuesPS();
    private EffectFont effectFont = new EffectFont();
    private EffectColor effectColor = new EffectColor();

    public Label[] getLabQuesEn() {
        quesLabEn();
        return labQuesEn;
    }
    private void quesLabEn() {
        for (int i = 1; i < labQuesEn.length; i++) {
            labQuesEn[i] = new Label();
            labQuesEn[i].setTextFill(effectColor.getColorText());
            labQuesEn[i].setFont(effectFont.getFontText());
            labQuesEn[i].setText(stringQuesEng.getStrQuesEn()[i]);
            int finalI = i;
            labQuesEn[i].setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    if (labQuesEn[finalI].getText().equals(stringQuesEng.getStrQuesEn()[finalI])) {
                        labQuesEn[finalI].setText(stringQuesRus.getStrQuesRu()[finalI]);
                        labQuesEn[finalI].setTextFill(effectColor.getColorTextClic());
                    } else {
                        labQuesEn[finalI].setText(stringQuesEng.getStrQuesEn()[finalI]);
                        labQuesEn[finalI].setTextFill(effectColor.getColorText());
                    }
                }
            });
        }
    }
}
