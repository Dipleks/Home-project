package english.ps.negative;

import english.panelsAndNumber.IRoot;
import english.panelsAndNumber.NumbersNegPS;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class MethodEngNeg implements IRoot
{
    private LabEnN labEnN = new LabEnN();
    private NumbersNegPS numbersNegPS = new NumbersNegPS();

    public void getEnglishListNegPS(){
        englishListNegPs.setPageFactory(this::indexLabelNegPS);
        englishListNegPs.setLayoutX(20);
        englishListNegPs.setLayoutY(60);
        englishListNegPs.setPrefSize(1360, 800);
    }
    private GridPane indexLabelNegPS(Integer str) {

        GridPane enPanel = new GridPane();
        enPanel.setLayoutX(0);
        enPanel.setLayoutY(0);
        enPanel.setPadding(new Insets(30));

//        enPanel.setGridLinesVisible(true);
//        enPanel.setStyle("-fx-border-color: RED;");

        enPanel.setHgap(10);
        enPanel.setVgap(5);
        ColumnConstraints c1 = new ColumnConstraints();
        ColumnConstraints c2 = new ColumnConstraints();
        ColumnConstraints c3 = new ColumnConstraints();
        ColumnConstraints c4 = new ColumnConstraints();
        ColumnConstraints c5 = new ColumnConstraints();
        ColumnConstraints c6 = new ColumnConstraints();
        c1.setPercentWidth(5);
        c2.setHalignment(HPos.CENTER);
        c2.setPercentWidth(10);
        c3.setPercentWidth(100);
        c4.setPercentWidth(5);
        c5.setHalignment(HPos.CENTER);
        c5.setPercentWidth(10);
        c6.setPercentWidth(100);
        enPanel.getColumnConstraints().addAll(c1, c2, c3, c4, c5, c6);

        int numberLeft = 1;
        int numberRight = 4;
        int textLeft = 2;
        int textRight = 5;

        if (str.byteValue() == 0) {

            enPanel.add(numbersNegPS.getN241(), numberLeft, 0);
            enPanel.add(numbersNegPS.getN242(), numberLeft, 1);
            enPanel.add(numbersNegPS.getN243(), numberLeft, 2);
            enPanel.add(numbersNegPS.getN244(), numberLeft, 3);
            enPanel.add(numbersNegPS.getN245(), numberLeft, 4);
            enPanel.add(numbersNegPS.getN246(), numberLeft, 5);
            enPanel.add(numbersNegPS.getN247(), numberLeft, 6);
            enPanel.add(numbersNegPS.getN248(), numberLeft, 7);
            enPanel.add(numbersNegPS.getN249(), numberLeft, 8);
            enPanel.add(numbersNegPS.getN250(), numberLeft, 9);
            enPanel.add(numbersNegPS.getN251(), numberLeft, 10);
            enPanel.add(numbersNegPS.getN252(), numberLeft, 11);
            enPanel.add(numbersNegPS.getN253(), numberLeft, 12);
            enPanel.add(numbersNegPS.getN254(), numberLeft, 13);
            enPanel.add(numbersNegPS.getN255(), numberLeft, 14);
            enPanel.add(numbersNegPS.getN256(), numberLeft, 15);
            enPanel.add(numbersNegPS.getN257(), numberLeft, 16);
            enPanel.add(numbersNegPS.getN258(), numberLeft, 17);
            enPanel.add(numbersNegPS.getN259(), numberLeft, 18);
            enPanel.add(numbersNegPS.getN260(), numberRight, 0);
            enPanel.add(numbersNegPS.getN261(), numberRight, 1);
            enPanel.add(numbersNegPS.getN262(), numberRight, 2);
            enPanel.add(numbersNegPS.getN263(), numberRight, 3);
            enPanel.add(numbersNegPS.getN264(), numberRight, 4);
            enPanel.add(numbersNegPS.getN265(), numberRight, 5);
            enPanel.add(numbersNegPS.getN266(), numberRight, 6);
            enPanel.add(numbersNegPS.getN267(), numberRight, 7);
            enPanel.add(numbersNegPS.getN268(), numberRight, 8);
            enPanel.add(numbersNegPS.getN269(), numberRight, 9);
            enPanel.add(numbersNegPS.getN270(), numberRight, 10);
            enPanel.add(numbersNegPS.getN271(), numberRight, 11);
            enPanel.add(numbersNegPS.getN272(), numberRight, 12);
            enPanel.add(numbersNegPS.getN273(), numberRight, 13);
            enPanel.add(numbersNegPS.getN274(), numberRight, 14);
            enPanel.add(numbersNegPS.getN275(), numberRight, 15);
            enPanel.add(numbersNegPS.getN276(), numberRight, 16);
            enPanel.add(numbersNegPS.getN277(), numberRight, 17);
            enPanel.add(numbersNegPS.getN278(), numberRight, 18);

            enPanel.add(labEnN.getLabEn241(), textLeft, 0);
            enPanel.add(labEnN.getLabEn242(), textLeft, 1);
            enPanel.add(labEnN.getLabEn243(), textLeft, 2);
            enPanel.add(labEnN.getLabEn244(), textLeft, 3);
            enPanel.add(labEnN.getLabEn245(), textLeft, 4);
            enPanel.add(labEnN.getLabEn246(), textLeft, 5);
            enPanel.add(labEnN.getLabEn247(), textLeft, 6);
            enPanel.add(labEnN.getLabEn248(), textLeft, 7);
            enPanel.add(labEnN.getLabEn249(), textLeft, 8);
            enPanel.add(labEnN.getLabEn250(), textLeft, 9);
            enPanel.add(labEnN.getLabEn251(), textLeft, 10);
            enPanel.add(labEnN.getLabEn252(), textLeft, 11);
            enPanel.add(labEnN.getLabEn253(), textLeft, 12);
            enPanel.add(labEnN.getLabEn254(), textLeft, 13);
            enPanel.add(labEnN.getLabEn255(), textLeft, 14);
            enPanel.add(labEnN.getLabEn256(), textLeft, 15);
            enPanel.add(labEnN.getLabEn257(), textLeft, 16);
            enPanel.add(labEnN.getLabEn258(), textLeft, 17);
            enPanel.add(labEnN.getLabEn259(), textLeft, 18);
            enPanel.add(labEnN.getLabEn260(), textRight, 0);
            enPanel.add(labEnN.getLabEn261(), textRight, 1);
            enPanel.add(labEnN.getLabEn262(), textRight, 2);
            enPanel.add(labEnN.getLabEn263(), textRight, 3);
            enPanel.add(labEnN.getLabEn264(), textRight, 4);
            enPanel.add(labEnN.getLabEn265(), textRight, 5);
            enPanel.add(labEnN.getLabEn266(), textRight, 6);
            enPanel.add(labEnN.getLabEn267(), textRight, 7);
            enPanel.add(labEnN.getLabEn268(), textRight, 8);
            enPanel.add(labEnN.getLabEn269(), textRight, 9);
            enPanel.add(labEnN.getLabEn270(), textRight, 10);
            enPanel.add(labEnN.getLabEn271(), textRight, 11);
            enPanel.add(labEnN.getLabEn272(), textRight, 12);
            enPanel.add(labEnN.getLabEn273(), textRight, 13);
            enPanel.add(labEnN.getLabEn274(), textRight, 14);
            enPanel.add(labEnN.getLabEn275(), textRight, 15);
            enPanel.add(labEnN.getLabEn276(), textRight, 16);
            enPanel.add(labEnN.getLabEn277(), textRight, 17);
            enPanel.add(labEnN.getLabEn278(), textRight, 18);


        } else if (str.byteValue() == 1) {

            enPanel.add(numbersNegPS.getN279(), numberLeft, 0);
            enPanel.add(numbersNegPS.getN280(), numberLeft, 1);
            enPanel.add(numbersNegPS.getN281(), numberLeft, 2);
            enPanel.add(numbersNegPS.getN282(), numberLeft, 3);
            enPanel.add(numbersNegPS.getN283(), numberLeft, 4);
            enPanel.add(numbersNegPS.getN284(), numberLeft, 5);
            enPanel.add(numbersNegPS.getN285(), numberLeft, 6);
            enPanel.add(numbersNegPS.getN286(), numberLeft, 7);
            enPanel.add(numbersNegPS.getN287(), numberLeft, 8);
            enPanel.add(numbersNegPS.getN288(), numberLeft, 9);
            enPanel.add(numbersNegPS.getN289(), numberLeft, 10);
            enPanel.add(numbersNegPS.getN290(), numberLeft, 11);
            enPanel.add(numbersNegPS.getN291(), numberLeft, 12);
            enPanel.add(numbersNegPS.getN292(), numberLeft, 13);
            enPanel.add(numbersNegPS.getN293(), numberLeft, 14);
            enPanel.add(numbersNegPS.getN294(), numberLeft, 15);
            enPanel.add(numbersNegPS.getN295(), numberLeft, 16);
            enPanel.add(numbersNegPS.getN296(), numberLeft, 17);
            enPanel.add(numbersNegPS.getN297(), numberLeft, 18);
            enPanel.add(numbersNegPS.getN298(), numberRight, 0);
            enPanel.add(numbersNegPS.getN299(), numberRight, 1);
            enPanel.add(numbersNegPS.getN300(), numberRight, 2);
            enPanel.add(numbersNegPS.getN301(), numberRight, 3);
            enPanel.add(numbersNegPS.getN302(), numberRight, 4);
            enPanel.add(numbersNegPS.getN303(), numberRight, 5);
            enPanel.add(numbersNegPS.getN304(), numberRight, 6);
            enPanel.add(numbersNegPS.getN305(), numberRight, 7);
            enPanel.add(numbersNegPS.getN306(), numberRight, 8);
            enPanel.add(numbersNegPS.getN307(), numberRight, 9);
            enPanel.add(numbersNegPS.getN308(), numberRight, 10);
            enPanel.add(numbersNegPS.getN309(), numberRight, 11);
            enPanel.add(numbersNegPS.getN310(), numberRight, 12);
            enPanel.add(numbersNegPS.getN311(), numberRight, 13);
            enPanel.add(numbersNegPS.getN312(), numberRight, 14);

            enPanel.add(labEnN.getLabEn279(), textLeft, 0);
            enPanel.add(labEnN.getLabEn280(), textLeft, 1);
            enPanel.add(labEnN.getLabEn281(), textLeft, 2);
            enPanel.add(labEnN.getLabEn282(), textLeft, 3);
            enPanel.add(labEnN.getLabEn283(), textLeft, 4);
            enPanel.add(labEnN.getLabEn284(), textLeft, 5);
            enPanel.add(labEnN.getLabEn285(), textLeft, 6);
            enPanel.add(labEnN.getLabEn286(), textLeft, 7);
            enPanel.add(labEnN.getLabEn287(), textLeft, 8);
            enPanel.add(labEnN.getLabEn288(), textLeft, 9);
            enPanel.add(labEnN.getLabEn289(), textLeft, 10);
            enPanel.add(labEnN.getLabEn290(), textLeft, 11);
            enPanel.add(labEnN.getLabEn291(), textLeft, 12);
            enPanel.add(labEnN.getLabEn292(), textLeft, 13);
            enPanel.add(labEnN.getLabEn293(), textLeft, 14);
            enPanel.add(labEnN.getLabEn294(), textLeft, 15);
            enPanel.add(labEnN.getLabEn295(), textLeft, 16);
            enPanel.add(labEnN.getLabEn296(), textLeft, 17);
            enPanel.add(labEnN.getLabEn297(), textLeft, 18);
            enPanel.add(labEnN.getLabEn298(), textRight, 0);
            enPanel.add(labEnN.getLabEn299(), textRight, 1);
            enPanel.add(labEnN.getLabEn300(), textRight, 2);
            enPanel.add(labEnN.getLabEn301(), textRight, 3);
            enPanel.add(labEnN.getLabEn302(), textRight, 4);
            enPanel.add(labEnN.getLabEn303(), textRight, 5);
            enPanel.add(labEnN.getLabEn304(), textRight, 6);
            enPanel.add(labEnN.getLabEn305(), textRight, 7);
            enPanel.add(labEnN.getLabEn306(), textRight, 8);
            enPanel.add(labEnN.getLabEn307(), textRight, 9);
            enPanel.add(labEnN.getLabEn308(), textRight, 10);
            enPanel.add(labEnN.getLabEn309(), textRight, 11);
            enPanel.add(labEnN.getLabEn310(), textRight, 12);
            enPanel.add(labEnN.getLabEn311(), textRight, 13);
            enPanel.add(labEnN.getLabEn312(), textRight, 14);       }
        return enPanel;
    }
}
