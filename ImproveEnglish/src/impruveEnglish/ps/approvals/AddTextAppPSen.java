package impruveEnglish.ps.approvals;

import impruveEnglish.control.Root;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class AddTextAppPSen implements Root
{
//    private NumbersAppPS numbersAppPS = new NumbersAppPS();

    public void getEnglishListAppPS(){
        englishListAppPs.setPageFactory(this::indexLabelAppPS);
        englishListAppPs.setMaxPageIndicatorCount(15);
        englishListAppPs.setMaxSize(widthSize*0.8, heightSize*0.8);
    }

    private GridPane indexLabelAppPS(Integer str) {

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
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i);
            }
            for (int i = 23; i <= 44; i++) {
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i-22);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - 22);
            }
        } else if (str.byteValue()==1){
            for (int i = 45; i <= 66; i++) {
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i-44);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i-44);
            }
            for (int i = 67; i <= 88; i++) {
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i-66);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - 66);
            }
        } else if (str.byteValue()==2){
            for (int i = 89; i <= 110; i++) {
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i-88);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i-88);
            }
            for (int i = 111; i <= 132; i++) {
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i-110);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - 110);
            }
        } else if (str.byteValue()==3){
            for (int i = 133; i <= 154; i++) {
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i-132);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i-132);
            }
            for (int i = 155; i <= 176; i++) {
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i-154);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - 154);
            }
        } else if (str.byteValue()==4){
            for (int i = 177; i <= 198; i++) {
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i-176);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i-176);
            }
            for (int i = 199; i <= 220; i++) {
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i-198);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - 198);
            }
        } else if (str.byteValue()==5){
            for (int i = 221; i <= 230; i++) {
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i-220);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i-220);
            }
            for (int i = 231; i <= 240; i++) {
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i-230);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - 230);
            }
        }

        return gridPane;
    }
}
