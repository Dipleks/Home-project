package exercise;

import interfaceRoot.EffectColor;
import interfaceRoot.EffectFont;;
import interfaceRoot.RootMethod;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class FillingColumnsExercise implements RootMethod
{
    private Label[] arrayOfOffersLeft;
    private Label[] arrayOfOffersRight;
    private int START;
    private int CLOSE;
    private String m;
    private Exercise text = new Exercise();

    //Для заданий
    public FillingColumnsExercise(Label[] arrayOfOffersLeft, Label[] arrayOfOffersRight,
                                  int START, int CLOSE, String m) {

        this.arrayOfOffersLeft = arrayOfOffersLeft;
        this.arrayOfOffersRight = arrayOfOffersRight;
        this.START = START;
        this.CLOSE = CLOSE;
        this.m = m;
    }
    public void getEnRu(String leftRight, String ENRU){
        if (ENRU.equals("EN")) {
            if (leftRight.equals("LEFT")) {
                getColumnLabEn(arrayOfOffersLeft, leftColumn, 6, START, "EN", "RU");
            } else if (leftRight.equals("RIGHT")) {
                getColumnLabEn(arrayOfOffersRight, rightColumn, 1.9, CLOSE, "EN", "RU");
            }
        } else if (ENRU.equals("RU")){
            if (leftRight.equals("LEFT")) {
                getColumnLabEn(arrayOfOffersLeft, leftColumn, 6, START, "RU", "EN");
            } else if (leftRight.equals("RIGHT")){
                getColumnLabEn(arrayOfOffersRight, rightColumn, 1.9, CLOSE, "RU", "EN");
            }
        }
    }
    private String methodExercise(int a, int b, String lang){
        if (lang.equals("EN")) {
            switch (m) {
                case "PS":
                    return text.getAppPSfileEn().get(a + b);
                case "ToBe":
                    return text.getAppToBefileEn().get(a + b);
            }
        } else if (lang.equals("RU")) {
            switch (m) {
                case "PS":
                    return text.getAppPSfileRu().get(a + b);
                case "ToBe":
                    return text.getAppToBefileRu().get(a + b);
            }
        }
        return "No files";
    }
    private void getColumnLabEn(Label[] list, VBox listCol, double coordinateX,
                                int START_CLOSE, String set, String get) {
        for (int i = 0; i < list.length; i++) {
            list[i] = new Label();
            list[i].setFont(EffectFont.fontText);
            list[i].setTextFill(EffectColor.colorText);
//            list[i].setStyle("-fx-border-color: RED");
            list[i].setPrefWidth(widthSize-widthSize/1.45);
            list[i].setWrapText(true);
            list[i].setText(methodExercise(i, START_CLOSE, set));

            int finalI = i;
            list[i].setCursor(Cursor.HAND);
            list[i].setOnMouseClicked(event -> {
                soundClick();
                if (list[finalI].getText().equals(methodExercise(finalI, START_CLOSE, set))){
                    list[finalI].setText(methodExercise(finalI, START_CLOSE, get));
                    list[finalI].setTextFill(EffectColor.colorTextClick);
                } else {
                    list[finalI].setText(methodExercise(finalI, START_CLOSE, set));
                    list[finalI].setTextFill(EffectColor.colorText);
                }
            });
        }
//        listCol.setStyle("-fx-border-color: RED");
        listCol.setSpacing(heightSize-heightSize/1.009);
        listCol.setLayoutX(widthSize/coordinateX);
        listCol.setLayoutY(heightSize-heightSize/1.12);
        listCol.setPadding(new Insets(0, 0, 0, 0));
        listCol.setPrefSize(widthSize/3.2, heightSize/1.25);
        listCol.getChildren().addAll(list);

        ROOT.getChildren().addAll(listCol);
    }
}