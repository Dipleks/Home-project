package impruveEnglish.ps.negative;

import impruveEnglish.control.Root;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class AddTextNegPSen implements Root
{
    public void getEnglishListNegPS(){
        englishListNegPs.setPageFactory(this::indexLabelNegPS);
        englishListNegPs.setMaxPageIndicatorCount(15);
        englishListNegPs.setMaxSize(widthSize*0.8, heightSize*0.8);
    }

    private GridPane indexLabelNegPS(Integer str) {

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
                NumerationsNegPS numerationsNegPS = new NumerationsNegPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberLeft, i);
                LabEnNegPS labNegEn = new LabEnNegPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textLeft, i);
            }
            for (int i = 23; i <= 44; i++) {
                NumerationsNegPS numerationsNegPS = new NumerationsNegPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberRight, i-22);
                LabEnNegPS labNegEn = new LabEnNegPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textRight, i - 22);
            }
        } else if (str.byteValue()==1){
            for (int i = 45; i <= 58; i++) {
                NumerationsNegPS numerationsNegPS = new NumerationsNegPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberLeft, i-44);
                LabEnNegPS labNegEn = new LabEnNegPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textLeft, i-44);
            }
            for (int i = 59; i <= 72; i++) {
                NumerationsNegPS numerationsNegPS = new NumerationsNegPS();
                gridPane.add(numerationsNegPS.getNumerationQues()[i], numberRight, i-58);
                LabEnNegPS labNegEn = new LabEnNegPS();
                gridPane.add(labNegEn.getLabQuesEn()[i], textRight, i - 58);
            }
        }

        return gridPane;
    }
}
