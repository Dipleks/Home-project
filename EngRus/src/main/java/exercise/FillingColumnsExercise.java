package exercise;

import interfaceRoot.EffectColor;
import interfaceRoot.EffectFont;;
import interfaceRoot.RootMethod;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.*;

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

    public void getLeftEn(){
        getLeftColumnLabEn();
    }
    public void getRightEn(){
        getRightColumnLabEn();
    }
    public void getLeftRu(){
        getLeftColumnLabRu();
    }
    public void getRightRu(){
        getRightColumnLabRu();
    }

    private String methodRuExercise(int a, int b){
        switch (m) {
            case "PS":
                return text.getAppPSfileRu().get(a + b);
            case "ToBe":
                return text.getAppToBefileRu().get(a + b);
        }
        return "No files";
    }
    private String methodEnExercise(int a, int b){
        switch (m) {
            case "PS":
                return text.getAppPSfileEn().get(a + b);
            case "ToBe":
                return text.getAppToBefileEn().get(a + b);
        }
        return "No files";
    }

    private void getLeftColumnLabEn() {
        for (int i = 0; i < arrayOfOffersLeft.length; i++) {
            arrayOfOffersLeft[i] = new Label();
            arrayOfOffersLeft[i].setFont(EffectFont.fontText);
            arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
//                arrayOfOffersLeft[i].setStyle("-fx-border-color: RED");
            arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.45);
            arrayOfOffersLeft[i].setWrapText(true);
            arrayOfOffersLeft[i].setText(methodEnExercise(i, START));

            int finalI = i;
            arrayOfOffersLeft[i].setCursor(Cursor.HAND);
            arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                soundClick();
                if (arrayOfOffersLeft[finalI].getText().equals(methodEnExercise(finalI, START))){
                    arrayOfOffersLeft[finalI].setText(methodRuExercise(finalI, START));
                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClick);
                } else {
                    arrayOfOffersLeft[finalI].setText(methodEnExercise(finalI, START));
                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorText);
                }
            });
        }
//            leftColumn.setStyle("-fx-border-color: RED");
        leftColumn.setSpacing(heightSize-heightSize/1.009);
        leftColumn.setLayoutX(widthSize/6);
        leftColumn.setLayoutY(heightSize-heightSize/1.12);
        leftColumn.setPadding(new Insets(0, 0, 0, 0));
        leftColumn.setPrefSize(widthSize/3.2, heightSize/1.25);
        leftColumn.getChildren().addAll(arrayOfOffersLeft);

        ROOT.getChildren().addAll(leftColumn);
    }
    private void getRightColumnLabEn() {
        for (int i = 0; i < arrayOfOffersRight.length; i++) {
            arrayOfOffersRight[i] = new Label();
            arrayOfOffersRight[i].setFont(EffectFont.fontText);
            arrayOfOffersRight[i].setTextFill(EffectColor.colorText);
//                arrayOfOffersRight[i].setStyle("-fx-border-color: RED");
            arrayOfOffersRight[i].setPrefWidth(widthSize-widthSize/1.45);
            arrayOfOffersRight[i].setWrapText(true);

            arrayOfOffersRight[i].setText(methodEnExercise(i, CLOSE));

            int finalI = i;
            arrayOfOffersRight[i].setCursor(Cursor.HAND);
            arrayOfOffersRight[i].setOnMouseClicked(event -> {
                Runnable r = this::soundClick;
                r.run();
                if (arrayOfOffersRight[finalI].getText().equals(methodEnExercise(finalI, CLOSE))){
                    arrayOfOffersRight[finalI].setText(methodRuExercise(finalI, CLOSE));
                    arrayOfOffersRight[finalI].setTextFill(EffectColor.colorTextClick);
                } else {
                    arrayOfOffersRight[finalI].setText(methodEnExercise(finalI, CLOSE));
                    arrayOfOffersRight[finalI].setTextFill(EffectColor.colorText);
                }
            });
        }

//            rightColumn.setStyle("-fx-border-color: RED");
        rightColumn.setLayoutX(widthSize/1.9);
        rightColumn.setLayoutY(heightSize-heightSize/1.12);
        rightColumn.setSpacing(heightSize-heightSize/1.009);
        rightColumn.setPadding(new Insets(0, 0, 0, 0));
        rightColumn.setPrefSize(widthSize/3.2, heightSize/1.25);
        rightColumn.getChildren().addAll(arrayOfOffersRight);
        ROOT.getChildren().addAll(rightColumn);
    }
    private void getLeftColumnLabRu() {
        for (int i = 0; i < arrayOfOffersLeft.length; i++) {
            arrayOfOffersLeft[i] = new Label();
            arrayOfOffersLeft[i].setFont(EffectFont.fontText);
            arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
//            arrayOfOffersLeft[i].setStyle("-fx-border-color: RED");
            arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.45);
            arrayOfOffersLeft[i].setWrapText(true);
            arrayOfOffersLeft[i].setText(methodRuExercise(i, START));
            int finalI = i;
            arrayOfOffersLeft[i].setCursor(Cursor.HAND);
            arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                soundClick();
                if (arrayOfOffersLeft[finalI].getText().equals(methodRuExercise(finalI, START))){
                    arrayOfOffersLeft[finalI].setText(methodEnExercise(finalI, START));
                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClick);
                } else {
                    arrayOfOffersLeft[finalI].setText(methodRuExercise(finalI, START));
                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorText);
                }
            });
        }

//        leftColumn.setStyle("-fx-border-color: RED");
        leftColumn.setSpacing(heightSize-heightSize/1.009);
        leftColumn.setLayoutX(widthSize/6);
        leftColumn.setLayoutY(heightSize-heightSize/1.12);
        leftColumn.setPadding(new Insets(0, 0, 0, 0));
        leftColumn.setPrefSize(widthSize/3.2, heightSize/1.25);
        leftColumn.getChildren().addAll(arrayOfOffersLeft);
        ROOT.getChildren().addAll(leftColumn);
    }
    private void getRightColumnLabRu() {
        for (int i = 0; i < arrayOfOffersRight.length; i++) {
            arrayOfOffersRight[i] = new Label();
            arrayOfOffersRight[i].setFont(EffectFont.fontText);
            arrayOfOffersRight[i].setTextFill(EffectColor.colorText);
//            arrayOfOffersRight[i].setStyle("-fx-border-color: RED");
            arrayOfOffersRight[i].setPrefWidth(widthSize-widthSize/1.45);
            arrayOfOffersRight[i].setWrapText(true);
            arrayOfOffersRight[i].setText(methodRuExercise(i, CLOSE));
            int finalI = i;
            arrayOfOffersRight[i].setCursor(Cursor.HAND);
            arrayOfOffersRight[i].setOnMouseClicked(event -> {
                soundClick();
                if (arrayOfOffersRight[finalI].getText().equals(methodRuExercise(finalI, CLOSE))){
                    arrayOfOffersRight[finalI].setText(methodEnExercise(finalI, CLOSE));
                    arrayOfOffersRight[finalI].setTextFill(EffectColor.colorTextClick);
                } else {
                    arrayOfOffersRight[finalI].setText(methodRuExercise(finalI, CLOSE));
                    arrayOfOffersRight[finalI].setTextFill(EffectColor.colorText);
                }
            });
        }

//        rightColumn.setStyle("-fx-border-color: RED");
        rightColumn.setLayoutX(widthSize/1.9);
        rightColumn.setLayoutY(heightSize-heightSize/1.12);
        rightColumn.setSpacing(heightSize-heightSize/1.009);
        rightColumn.setPadding(new Insets(0, 0, 0, 0));
        rightColumn.setPrefSize(widthSize/3.2, heightSize/1.25);
        rightColumn.getChildren().addAll(arrayOfOffersRight);
        ROOT.getChildren().addAll(rightColumn);
    }



}