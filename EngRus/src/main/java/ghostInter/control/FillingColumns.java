package ghostInter.control;

import ghostInter.interfaceRoot.EffectColor;
import ghostInter.interfaceRoot.EffectFont;
import ghostInter.interfaceRoot.Root;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class FillingColumns implements Root
{
    private Label[] arrayOfOffersLeft;
    private Label[] arrayOfOffersRight;
    private Label[] arrayOfOffersExam;
    private Label[] number;
    private Label[] correctly;
    private int START;
    private int CLOSE;
    private String m;

    private Exercise text = new Exercise();
    private Exam exam = new Exam();

    private String methRu(int a, int b){
        switch (m) {
            case "PS":
                return text.getAppPSfileRu().get(a + b);
            case "ToBe":
                return text.getAppToBefileRu().get(a + b);
            case "ExamPS":
                return exam.getExamRuPS().get(a + b);
            case "ExamToBe":
                return exam.getExamRuToBe().get(a + b);
        }
        return "No files";
    }
    private String methEn(int a, int b){
        switch (m) {
            case "PS":
                return text.getAppPSfileEn().get(a + b);
            case "ToBe":
                return text.getAppToBefileEn().get(a + b);
            case "ExamPS":
                return exam.getExamEnPS().get(a + b);
            case "ExamToBe":
                return exam.getExamEnToBe().get(a + b);
        }
        return "No files";
    }

    public FillingColumns(Label[] arrayOfOffersLeft, Label[] arrayOfOffersRight, int START, int CLOSE, String m)
    {
        //Для заданий
        this.arrayOfOffersLeft = arrayOfOffersLeft;
        this.arrayOfOffersRight = arrayOfOffersRight;
        this.START = START;
        this.CLOSE = CLOSE;
        this.m = m;
    }
    public FillingColumns(Label[] arrayOfOffersExam, Label[] number, Label[] correctly, int START, String m)
    {
        //Для контрольных
        this.arrayOfOffersExam = arrayOfOffersExam;
        this.number = number;
        this.correctly = correctly;
        this.START = START;
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
    public void getExamList(){
        getExamColumnLab();
    }

    private void getLeftColumnLabEn() {
        Runnable runnable1 = () -> {
            for (int i = 0; i < arrayOfOffersLeft.length; i++) {
                arrayOfOffersLeft[i] = new Label();
                arrayOfOffersLeft[i].setFont(EffectFont.fontText);
                arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
//              arrayOfOffersLeft[i].setStyle("-fx-border-color: RED");
                arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.45);
                arrayOfOffersLeft[i].setWrapText(true);
                arrayOfOffersLeft[i].setText(methEn(i, START));

                int finalI = i;
                arrayOfOffersLeft[i].setCursor(Cursor.HAND);
                arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                    Runnable r = this::soundClick;
                    r.run();
                    if (arrayOfOffersLeft[finalI].getText().equals(methEn(finalI, START))){
                        arrayOfOffersLeft[finalI].setText(methRu(finalI, START));
                        arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClick);
                    } else {
                        arrayOfOffersLeft[finalI].setText(methEn(finalI, START));
                        arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorText);
                    }
                });
            }
//          leftColumn.setStyle("-fx-border-color: RED");
            leftColumn.setSpacing(heightSize-heightSize/1.009);
            leftColumn.setLayoutX(widthSize/6);
            leftColumn.setLayoutY(heightSize-heightSize/1.12);
            leftColumn.setPadding(new Insets(0, 0, 0, 0));
            leftColumn.setPrefSize(widthSize/3.2, heightSize/1.25);
            leftColumn.getChildren().addAll(arrayOfOffersLeft);

            ROOT.getChildren().addAll(leftColumn);
        };
        runnable1.run();
    }
    private void getRightColumnLabEn() {
        Runnable runnable2 = () -> {
            for (int i = 0; i < arrayOfOffersRight.length; i++) {
                arrayOfOffersRight[i] = new Label();
                arrayOfOffersRight[i].setFont(EffectFont.fontText);
                arrayOfOffersRight[i].setTextFill(EffectColor.colorText);
//              arrayOfOffersRight[i].setStyle("-fx-border-color: RED");
                arrayOfOffersRight[i].setPrefWidth(widthSize-widthSize/1.45);
                arrayOfOffersRight[i].setWrapText(true);

                arrayOfOffersRight[i].setText(methEn(i, CLOSE));

                int finalI = i;
                arrayOfOffersRight[i].setCursor(Cursor.HAND);
                arrayOfOffersRight[i].setOnMouseClicked(event -> {
                    Runnable r = this::soundClick;
                    r.run();
                    if (arrayOfOffersRight[finalI].getText().equals(methEn(finalI, CLOSE))){
                        arrayOfOffersRight[finalI].setText(methRu(finalI, CLOSE));
                        arrayOfOffersRight[finalI].setTextFill(EffectColor.colorTextClick);
                    } else {
                        arrayOfOffersRight[finalI].setText(methEn(finalI, CLOSE));
                        arrayOfOffersRight[finalI].setTextFill(EffectColor.colorText);
                    }
                });
            }

//          rightColumn.setStyle("-fx-border-color: RED");
            rightColumn.setLayoutX(widthSize/1.9);
            rightColumn.setLayoutY(heightSize-heightSize/1.12);
            rightColumn.setSpacing(heightSize-heightSize/1.009);
            rightColumn.setPadding(new Insets(0, 0, 0, 0));
            rightColumn.setPrefSize(widthSize/3.2, heightSize/1.25);
            rightColumn.getChildren().addAll(arrayOfOffersRight);
            ROOT.getChildren().addAll(rightColumn);
        };
        runnable2.run();
    }
    private void getLeftColumnLabRu() {
        Runnable runnable1 = () -> {
            for (int i = 0; i < arrayOfOffersLeft.length; i++) {
                arrayOfOffersLeft[i] = new Label();
                arrayOfOffersLeft[i].setFont(EffectFont.fontText);
                arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
//              arrayOfOffersLeft[i].setStyle("-fx-border-color: RED");
                arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.45);
                arrayOfOffersLeft[i].setWrapText(true);
                arrayOfOffersLeft[i].setText(methRu(i, START));
                int finalI = i;
                arrayOfOffersLeft[i].setCursor(Cursor.HAND);
                arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                    Runnable r = this::soundClick;
                    r.run();
                    if (arrayOfOffersLeft[finalI].getText().equals(methRu(finalI, START))){
                        arrayOfOffersLeft[finalI].setText(methEn(finalI, START));
                        arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClick);
                    } else {
                        arrayOfOffersLeft[finalI].setText(methRu(finalI, START));
                        arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorText);
                    }
                });
            }

//          leftColumn.setStyle("-fx-border-color: RED");
            leftColumn.setSpacing(heightSize-heightSize/1.009);
            leftColumn.setLayoutX(widthSize/6);
            leftColumn.setLayoutY(heightSize-heightSize/1.12);
            leftColumn.setPadding(new Insets(0, 0, 0, 0));
            leftColumn.setPrefSize(widthSize/3.2, heightSize/1.25);
            leftColumn.getChildren().addAll(arrayOfOffersLeft);
            ROOT.getChildren().addAll(leftColumn);
        };
        runnable1.run();
    }
    private void getRightColumnLabRu() {
        Runnable runnable2 = () -> {
            for (int i = 0; i < arrayOfOffersRight.length; i++) {
                arrayOfOffersRight[i] = new Label();
                arrayOfOffersRight[i].setFont(EffectFont.fontText);
                arrayOfOffersRight[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersRight[i].setStyle("-fx-border-color: RED");
                arrayOfOffersRight[i].setPrefWidth(widthSize-widthSize/1.45);
                arrayOfOffersRight[i].setWrapText(true);
                arrayOfOffersRight[i].setText(methRu(i, CLOSE));
                int finalI = i;
                arrayOfOffersRight[i].setCursor(Cursor.HAND);
                arrayOfOffersRight[i].setOnMouseClicked(event -> {
                    Runnable r = this::soundClick;
                    r.run();
                    if (arrayOfOffersRight[finalI].getText().equals(methRu(finalI, CLOSE))){
                        arrayOfOffersRight[finalI].setText(methEn(finalI, CLOSE));
                        arrayOfOffersRight[finalI].setTextFill(EffectColor.colorTextClick);
                    } else {
                        arrayOfOffersRight[finalI].setText(methRu(finalI, CLOSE));
                        arrayOfOffersRight[finalI].setTextFill(EffectColor.colorText);
                    }
                });
            }

//                rightColumn.setStyle("-fx-border-color: RED");
            rightColumn.setLayoutX(widthSize/1.9);
            rightColumn.setLayoutY(heightSize-heightSize/1.12);
            rightColumn.setSpacing(heightSize-heightSize/1.009);
            rightColumn.setPadding(new Insets(0, 0, 0, 0));
            rightColumn.setPrefSize(widthSize/3.2, heightSize/1.25);
            rightColumn.getChildren().addAll(arrayOfOffersRight);
            ROOT.getChildren().addAll(rightColumn);
        };
        runnable2.run();
    }
    private void getExamColumnLab() {
        Runnable runnable1 = () -> {
            for (int i = 0; i < arrayOfOffersExam.length; i++) {
                arrayOfOffersExam[i] = new Label();
                arrayOfOffersExam[i].setFont(EffectFont.fontTextExam);
                arrayOfOffersExam[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersExam[i].setStyle("-fx-border-color: RED");
                arrayOfOffersExam[i].setPrefWidth(widthSize-widthSize/2.45);
                arrayOfOffersExam[i].setWrapText(true);
                arrayOfOffersExam[i].setText(methRu(i, START));
                arrayOfOffersExam[i].setCursor(Cursor.HAND);

                correctly[i] = new Label();
                correctly[i].setFont(EffectFont.fontTextExam);
//              correctly[i].setStyle("-fx-border-color: RED");
                correctly[i].setPrefWidth(widthSize-widthSize/1.45);
                correctly[i].setAlignment(Pos.BASELINE_RIGHT);

                int finalI = i;
                arrayOfOffersExam[i].setOnMouseClicked(event -> {
                    Runnable r = this::soundClick;
                    r.run();
                    if (improve.getText().equalsIgnoreCase(methEn(finalI, START))){
                        arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextClick);
                        correctly[finalI].setText("ВЕРНО!!!");
                        correctly[finalI].setTextFill(EffectColor.colorTextClick);
                    } else {
                        arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextClickRED);
                        correctly[finalI].setText("НЕ ВЕРНО!!!");
                        correctly[finalI].setTextFill(EffectColor.colorTextClickRED);
                    }
                });

            }
            for (int i = 0; i < number.length; i++) {
                number[i] = new Label();
                number[i].setFont(EffectFont.fontTextExam);
                number[i].setTextFill(EffectColor.colorTitle);
//                    number[i].setStyle("-fx-border-color: RED");
                number[i].setPrefWidth(widthSize-widthSize/1.45);
                number[i].setAlignment(Pos.CENTER);
                number[i].setCursor(Cursor.HAND);
                number[i].setText("-"+(i+1+START)+"-");
                int finalI = i;
                number[i].setOnMouseClicked(ev -> {
                    Runnable r = this::soundClick;
                    r.run();
                    if (arrayOfOffersExam[finalI].getText().equals(methRu(finalI, START))){
                        arrayOfOffersExam[finalI].setText(methEn(finalI, START));
                        arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextImpr);
                    }
                });
            }

//          numberColumn.setStyle("-fx-border-color: RED");
            numberColumn.setSpacing(heightSize-heightSize/1.009);
            numberColumn.setPadding(new Insets(0, 0, 0, 0));
            numberColumn.setPrefSize(widthSize/25, heightSize/1.25);
            numberColumn.getChildren().addAll(number);

//          iprColumn.setStyle("-fx-border-color: RED");
            iprColumn.setSpacing(heightSize-heightSize/1.009);
            iprColumn.setPadding(new Insets(0, 0, 0, 0));
            iprColumn.setPrefSize(widthSize/11, heightSize/1.25);
            iprColumn.getChildren().addAll(correctly);

//          leftColumn.setStyle("-fx-border-color: RED");
            leftColumn.setSpacing(heightSize-heightSize/1.009);
            leftColumn.setPadding(new Insets(0, 0, 0, 0));
            leftColumn.setPrefSize(widthSize/2.5, heightSize/1.25);
            leftColumn.getChildren().addAll(arrayOfOffersExam);

            groupExam.setSpacing(heightSize-heightSize/1.009);
            groupExam.getChildren().addAll(numberColumn, leftColumn, iprColumn);

            examPane.setContent(groupExam);
//          examPane.setStyle("-fx-border-color: RED");
            examPane.setLayoutX(widthSize - widthSize / 1.25);
            examPane.setLayoutY(heightSize - heightSize / 1.16);
            examPane.setPrefSize(widthSize / 1.8, heightSize / 1.5);

            VBox vBox = new VBox();
            improve.setPrefWidth(widthSize/3);
            improveClick1.setAlignment(Pos.CENTER);
            improveClick1.setTextFill(EffectColor.colorTextClickPERU);
            vBox.getChildren().addAll(improveClick1, improve);
            vBox.setSpacing(heightSize-heightSize/1.009);
            vBox.setLayoutX(widthSize-widthSize/1.4);
            vBox.setLayoutY(heightSize-heightSize/1.05);

            ROOT.getChildren().addAll(examPane, vBox);
        };
        runnable1.run();
    }
}
