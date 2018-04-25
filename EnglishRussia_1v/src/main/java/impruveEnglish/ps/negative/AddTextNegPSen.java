package impruveEnglish.ps.negative;

import impruveEnglish.control.Root;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class AddTextNegPSen implements Root
{
    private final int CONST = 16;

    public void getEnglishListNegPS(){
        englishListNegPs.setPageFactory(this::indexLabelNegPS);
        englishListNegPs.setMaxPageIndicatorCount(15);
        englishListNegPs.setVisible(true);
//        englishListNegPs.setMaxSize(widthSize-100, widthSize-300);
        englishListNegPs.setStyle("-fx-border-color: RED;");
        englishListNegPs.setMinHeight(heightSize-300);
        englishListNegPs.setMaxSize(widthSize*0.8, heightSize*0.3);
    }

    private GridPane indexLabelNegPS(Integer str) {

        int numberLeft = 1;
        int numberRight = 4;
        int textLeft = 2;
        int textRight = 5;
        int numberInfoLeft = 0;
        int numberInfoRight = 3;
        GridPane gridPane = new GridPane();

        gridPane.setHgap(10);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(30));
        gridPane.setTranslateX(5);
        gridPane.setGridLinesVisible(true);
        ColumnConstraints c1 = new ColumnConstraints();
        ColumnConstraints c2 = new ColumnConstraints();
        ColumnConstraints c3 = new ColumnConstraints();
        ColumnConstraints c4 = new ColumnConstraints();
        ColumnConstraints c5 = new ColumnConstraints();
        ColumnConstraints c6 = new ColumnConstraints();
        c1.setPercentWidth(5);
        c1.setHalignment(HPos.RIGHT);
        c2.setHalignment(HPos.CENTER);
        c2.setPercentWidth(8);
        c3.setPercentWidth(70);
        c4.setPercentWidth(5);
        c4.setHalignment(HPos.RIGHT);
        c5.setPercentWidth(8);
        c5.setHalignment(HPos.CENTER);
        c6.setPercentWidth(70);

        gridPane.getColumnConstraints().addAll(c1, c2, c3, c4, c5, c6);

        if (str.byteValue()==0) {
            for (int i = 1; i <= CONST; i++) {
                ButtonsInfoNegPS buttonsInfoNegPS = new ButtonsInfoNegPS();
                gridPane.add(buttonsInfoNegPS.getInfoNegPS()[i], numberInfoLeft, i);
                NumerationsNegPS numerationsNegPS = new NumerationsNegPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberLeft, i);
                LabEnNegPS labNegEn = new LabEnNegPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textLeft, i);
            }
            for (int i = CONST+1; i <= CONST*2; i++) {
                ButtonsInfoNegPS buttonsInfoNegPS = new ButtonsInfoNegPS();
                gridPane.add(buttonsInfoNegPS.getInfoNegPS()[i], numberInfoRight, i-CONST);
                NumerationsNegPS numerationsNegPS = new NumerationsNegPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberRight, i-CONST);
                LabEnNegPS labNegEn = new LabEnNegPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textRight, i - CONST);
            }
        } else if (str.byteValue()==1){
            for (int i = CONST*2+1; i <= CONST*3; i++) {
                ButtonsInfoNegPS buttonsInfoNegPS = new ButtonsInfoNegPS();
                gridPane.add(buttonsInfoNegPS.getInfoNegPS()[i], numberInfoLeft, i-(CONST*2));
                NumerationsNegPS numerationsNegPS = new NumerationsNegPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberLeft, i-(CONST*2));
                LabEnNegPS labNegEn = new LabEnNegPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textLeft, i-(CONST*2));
            }
            for (int i = CONST*3+1; i <= CONST*4; i++) {
                ButtonsInfoNegPS buttonsInfoNegPS = new ButtonsInfoNegPS();
                gridPane.add(buttonsInfoNegPS.getInfoNegPS()[i], numberInfoRight, i-(CONST*3));
                NumerationsNegPS numerationsNegPS = new NumerationsNegPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberRight, i-(CONST*3));
                LabEnNegPS labNegEn = new LabEnNegPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textRight, i - (CONST*3));
            }
        } else if (str.byteValue()==2){
            for (int i = CONST*4+1; i <= 72; i++) {
                ButtonsInfoNegPS buttonsInfoNegPS = new ButtonsInfoNegPS();
                gridPane.add(buttonsInfoNegPS.getInfoNegPS()[i], numberInfoLeft, i-(CONST*4));
                NumerationsNegPS numerationsNegPS = new NumerationsNegPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberLeft, i-(CONST*4));
                LabEnNegPS labNegEn = new LabEnNegPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textLeft, i-(CONST*4));
            }
        }

        return gridPane;
    }
}
