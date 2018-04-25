package impruveEnglish.ps.approvals;

import impruveEnglish.control.Root;
import impruveEnglish.effects.EffectColor;
import impruveEnglish.effects.EffectFont;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class LabEnAppPS implements Root
{
    private Label[] labEn = new Label[241];
    private StringEngAppPS stringEng = new StringEngAppPS();
    private StringRusAppPS stringRus = new StringRusAppPS();
    private EffectFont effectFont = new EffectFont();
    private EffectColor effectColor = new EffectColor();

    public Label[] getLabEn() {
        appLabEng();
        return labEn;
    }

    private void appLabEng() {
        for (int i = 1; i < labEn.length; i++) {
            labEn[i] = new Label();
            labEn[i].setTextFill(effectColor.getColorText());
            labEn[i].setFont(effectFont.getFontText());
            labEn[i].setText(stringEng.getStrEn()[i]);
            int finalI = i;
            labEn[i].setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    if (labEn[finalI].getText().equals(stringEng.getStrEn()[finalI])) {
                        labEn[finalI].setText(stringRus.getStrRu()[finalI]);
                        labEn[finalI].setTextFill(effectColor.getColorTextClic());
                    } else {
                        labEn[finalI].setText(stringEng.getStrEn()[finalI]);
                        labEn[finalI].setTextFill(effectColor.getColorText());
                    }
                }
            });
        }
    }
}
