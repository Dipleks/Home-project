package impruveEnglish.ps.approvals;

import impruveEnglish.control.Root;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class AddTextAppPSen implements Root
{
    private final int CONST = 16;

//    private NumbersAppPS numbersAppPS = new NumbersAppPS();

    public void getEnglishListAppPS(){
        englishListAppPs.setPageFactory(this::indexLabelAppPS);
        englishListAppPs.setMaxPageIndicatorCount(15);
        englishListAppPs.setVisible(true);
//        englishListAppPs.setMaxSize(widthSize-100, widthSize-300);
        englishListAppPs.setMinHeight(heightSize-300);
        englishListAppPs.setStyle("-fx-border-color: RED;");
        englishListAppPs.setMaxSize(widthSize*0.8, heightSize*0.3);
    }

    private GridPane indexLabelAppPS(Integer str) {

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
//        gridPane.setPrefSize(widthSize-1400, heightSize-500);
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
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoLeft, i);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i);
            }
            for (int i = CONST+1; i <= CONST*2; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoRight, i-CONST);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i-CONST);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i-CONST);
            }
        } else if (str.byteValue()==1){
            for (int i = CONST*2+1; i <= CONST*3; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoLeft, i-CONST*2);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i-CONST*2);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i-CONST*2);
            }
            for (int i = CONST*3+1; i <= CONST*4; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoRight, i-CONST*3);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i-CONST*3);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - CONST*3);
            }
        } else if (str.byteValue()==2){
            for (int i = CONST*4+1; i <= CONST*5; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoLeft, i-CONST*4);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i-CONST*4);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i-CONST*4);
            }
            for (int i = CONST*5+1; i <= CONST*6; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoRight, i-CONST*5);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i-CONST*5);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - CONST*5);
            }
        } else if (str.byteValue()==3){
            for (int i = CONST*6+1; i <= CONST*7; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoLeft, i-CONST*6);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i-CONST*6);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i-CONST*6);
            }
            for (int i = CONST*7+1; i <= CONST*8; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoRight, i-CONST*7);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i-CONST*7);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - CONST*7);
            }
        } else if (str.byteValue()==4){
            for (int i = CONST*8+1; i <= CONST*9; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoLeft, i-CONST*8);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i-CONST*8);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i-CONST*8);
            }
            for (int i = CONST*9+1; i <= CONST*10; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoRight, i-CONST*9);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i-CONST*9);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - CONST*9);
            }
        } else if (str.byteValue()==5){
            for (int i = CONST*10+1; i <= CONST*11; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoLeft, i-CONST*10);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i-CONST*10);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i-CONST*10);
            }
            for (int i = CONST*11+1; i <= CONST*12; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoRight, i-CONST*11);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i-CONST*11);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - CONST*11);
            }
        } else if (str.byteValue()==6) {
            for (int i = CONST*12+1; i <= CONST*13; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoLeft, i-CONST*12);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i - CONST*12);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i - CONST*12);
            }
            for (int i = CONST*13+1; i <= CONST*14; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoRight, i-CONST*13);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i - CONST*13);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - CONST*13);
            }
        } else if (str.byteValue()==7) {
            for (int i = CONST*14+1; i <= CONST*15-8; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoLeft, i-CONST*14);
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberLeft, i - CONST*14);
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textLeft, i - CONST*14);
            }
            for (int i = CONST*15-7; i <= 240; i++) {
                ButtonsInfoAppPS buttonsInfoAppPS = new ButtonsInfoAppPS();
                gridPane.add(buttonsInfoAppPS.getInfoAppPS()[i], numberInfoRight, i-(CONST*15-8));
                NumerationsAppPS numerationsAppPS = new NumerationsAppPS();
                gridPane.add(numerationsAppPS.getNumeration()[i], numberRight, i - (CONST*15-8));
                LabEnAppPS labEn = new LabEnAppPS();
                gridPane.add(labEn.getLabEn()[i], textRight, i - (CONST*15-8));
            }
        }
        return gridPane;
    }
}
