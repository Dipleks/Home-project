package impruveEnglish.ps.questions;

import impruveEnglish.control.Root;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class AddTextQuesPSen implements Root
{
    public void getEnglishListQuesPS(){
        englishListQuesPs.setPageFactory(this::indexLabelQuesPS);
        englishListQuesPs.setMaxPageIndicatorCount(15);
        englishListQuesPs.setMaxSize(widthSize*0.8, heightSize*0.8);
    }

    private GridPane indexLabelQuesPS(Integer str) {

        int numberLeft = 1;
        int numberRight = 4;
        int textLeft = 2;
        int textRight = 5;
        GridPane gridPane = new GridPane();

        gridPane.setHgap(10);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(30));
        gridPane.setTranslateX(20);
//        gridPane.setGridLinesVisible(true);
        ColumnConstraints c1 = new ColumnConstraints();
        ColumnConstraints c2 = new ColumnConstraints();
        ColumnConstraints c3 = new ColumnConstraints();
        ColumnConstraints c4 = new ColumnConstraints();
        ColumnConstraints c5 = new ColumnConstraints();
        ColumnConstraints c6 = new ColumnConstraints();
        c1.setPercentWidth(10);
        c2.setHalignment(HPos.CENTER);
        c2.setPercentWidth(10);
        c3.setPercentWidth(70);
        c4.setPercentWidth(10);
        c5.setPercentWidth(10);
        c6.setPercentWidth(70);

        gridPane.getColumnConstraints().addAll(c1, c2, c3, c4, c5, c6);

        if (str.byteValue()==0) {
            for (int i = 1; i <= 22; i++) {
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberLeft, i);
                LabEnQuesPS labQuesEn = new LabEnQuesPS();
                gridPane.add(labQuesEn.getLabQuesEn()[i], textLeft, i);
            }
            for (int i = 23; i <= 44; i++) {
                NumerationsQuesPS numerationsNegPS = new NumerationsQuesPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberRight, i-22);
                LabEnQuesPS labNegEn = new LabEnQuesPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textRight, i - 22);
            }
        } else if (str.byteValue()==1){
            for (int i = 45; i <= 58; i++) {
                NumerationsQuesPS numerationsNegPS = new NumerationsQuesPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberLeft, i-44);
                LabEnQuesPS labNegEn = new LabEnQuesPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textLeft, i-44);
            }
            for (int i = 59; i <= 72; i++) {
                NumerationsQuesPS numerationsNegPS = new NumerationsQuesPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberRight, i-58);
                LabEnQuesPS labNegEn = new LabEnQuesPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textRight, i - 58);
            }
        } else if (str.byteValue()==2){
            for (int i = 45; i <= 66; i++) {
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberLeft, i-44);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textLeft, i-44);
            }
            for (int i = 67; i <= 88; i++) {
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberRight, i-66);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textRight, i - 66);
            }
        } else if (str.byteValue()==3){
            for (int i = 89; i <= 110; i++) {
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberLeft, i-88);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textLeft, i-88);
            }
            for (int i = 111; i <= 132; i++) {
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberRight, i-110);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textRight, i - 110);
            }
        } else if (str.byteValue()==4){
            for (int i = 133; i <= 154; i++) {
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberLeft, i-132);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textLeft, i-132);
            }
            for (int i = 155; i <= 176; i++) {
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberRight, i-154);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textRight, i - 154);
            }
        } else if (str.byteValue()==5){
            for (int i = 177; i <= 190; i++) {
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberLeft, i-176);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textLeft, i-176);
            }
            for (int i = 191; i <= 204; i++) {
                NumerationsQuesPS numerationsQuesPS = new NumerationsQuesPS();
                gridPane.add(numerationsQuesPS.getNumerationQues()[i], numberRight, i-190);
                LabEnQuesPS labEn = new LabEnQuesPS();
                gridPane.add(labEn.getLabQuesEn()[i], textRight, i - 190);
            }
        }

        return gridPane;
    }
}
