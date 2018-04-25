package impruveEnglish.ps.questions;

import impruveEnglish.control.Root;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class AddTextQuesPSen implements Root
{
    private final int CONST = 16;

    public void getEnglishListQuesPS(){
        englishListQuesPs.setPageFactory(this::indexLabelQuesPS);
        englishListQuesPs.setMaxPageIndicatorCount(15);
        englishListQuesPs.setVisible(true);
//        englishListQuesPs.setMaxSize(widthSize-100, widthSize-300);
        englishListQuesPs.setMinHeight(heightSize-300);
        englishListQuesPs.setMinWidth(widthSize-180);
        englishListQuesPs.setStyle("-fx-border-color: RED;");
        englishListQuesPs.setMaxSize(widthSize*0.8, heightSize*0.3);
    }

    private GridPane indexLabelQuesPS(Integer str) {

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
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoLeft, i);
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberLeft, i);
                LabEnQuesPS labQuesEn = new LabEnQuesPS();
                gridPane.add(labQuesEn.getLabQuesEn()[i], textLeft, i);
            }
            for (int i = CONST+1; i <= CONST*2; i++) {
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoRight, i-CONST);
                NumerationsQuesPS numerationsNegPS = new NumerationsQuesPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberRight, i-CONST);
                LabEnQuesPS labNegEn = new LabEnQuesPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textRight, i - CONST);
            }
        } else if (str.byteValue()==1){
            for (int i = CONST*2+1; i <= CONST*3; i++) {
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoLeft, i-CONST*2);
                NumerationsQuesPS numerationsNegPS = new NumerationsQuesPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberLeft, i-CONST*2);
                LabEnQuesPS labNegEn = new LabEnQuesPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textLeft, i-CONST*2);
            }
            for (int i = CONST*3+1; i <= CONST*4; i++) {
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoRight, i-CONST*3);
                NumerationsQuesPS numerationsNegPS = new NumerationsQuesPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberRight, i-CONST*3);
                LabEnQuesPS labNegEn = new LabEnQuesPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textRight, i - CONST*3);
            }
        } else if (str.byteValue()==2){
            for (int i = CONST*4+1; i <= CONST*5; i++) {
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoLeft, i-CONST*4);
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberLeft, i-CONST*4);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textLeft, i-CONST*4);
            }
            for (int i = CONST*5+1; i <= CONST*6; i++) {
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoRight, i-CONST*5);
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberRight, i-CONST*5);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textRight, i - CONST*5);
            }
        } else if (str.byteValue()==3){
            for (int i = CONST*6+1; i <= CONST*7; i++) {
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoLeft, i-CONST*6);
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberLeft, i-CONST*6);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textLeft, i-CONST*6);
            }
            for (int i = CONST*7+1; i <= CONST*8; i++) {
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoRight, i-CONST*7);
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberRight, i-CONST*7);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textRight, i - CONST*7);
            }
        } else if (str.byteValue()==4){
            for (int i = CONST*8+1; i <= CONST*9; i++) {
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoLeft, i-CONST*8);
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberLeft, i-CONST*8);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textLeft, i-CONST*8);
            }
            for (int i = CONST*9+1; i <= CONST*10; i++) {
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoRight, i-CONST*9);
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberRight, i-CONST*9);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textRight, i - CONST*9);
            }
        } else if (str.byteValue()==5){
            for (int i = CONST*10+1; i <= CONST*11; i++) {
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoLeft, i-(CONST*10));
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberLeft, i-(CONST*10));
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textLeft, i-(CONST*10));
            }
            for (int i = CONST*11+1; i <= CONST*12; i++) {
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoRight, i-(CONST*11));
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberRight, i-(CONST*11));
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textRight, i - (CONST*11));
            }
        } else if (str.byteValue()==6) {
            for (int i = CONST * 12 + 1; i <= 204; i++) {
                ButtonsInfoQuesPS buttonsInfoQuesPS = new ButtonsInfoQuesPS();
                gridPane.add(buttonsInfoQuesPS.getInfoQuesPS()[i], numberInfoLeft, i-(CONST*12));
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberLeft, i - (CONST * 12));
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textLeft, i - (CONST * 12));
            }
        }

        return gridPane;
    }
}
