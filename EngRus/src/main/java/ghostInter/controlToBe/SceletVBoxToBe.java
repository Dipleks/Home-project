package ghostInter.controlToBe;

import ghostInter.interfaceRoot.EffectColor;
import ghostInter.interfaceRoot.EffectFont;
import ghostInter.interfaceRoot.Root;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SceletVBoxToBe implements Root
{
    private Label[] arrayOfOffersLeft;
    private Label[] arrayOfOffersRight;
    private Label[] arrayOfOffersExam;
    private Label[] number;
    private Label[] correctly;
    private int START;
    private int CLOSE;

    private AppToBeLessonEnRu text = new AppToBeLessonEnRu();
    private ExamToBe examToBe = new ExamToBe();


    public SceletVBoxToBe(Label[] arrayOfOffersLeft, Label[] arrayOfOffersRight, int START, int CLOSE)
    {
        //Для заданий
        this.arrayOfOffersLeft = arrayOfOffersLeft;
        this.arrayOfOffersRight = arrayOfOffersRight;
        this.START = START;
        this.CLOSE = CLOSE;
    }
    public SceletVBoxToBe(Label[] arrayOfOffersExam, Label[] number, Label[] correctly, int START)
    {
        //Для контрольных
        this.arrayOfOffersExam = arrayOfOffersExam;
        this.number = number;
        this.correctly = correctly;
        this.START = START;
    }

    public void getLeftEn(){
        getLeftColummLabEn();
    }
    public void getRightEn(){
        getRightColummLabEn();
    }
    public void getLeftRu(){
        getLeftColummLabRu();
    }
    public void getRightRu(){
        getRightColummLabRu();
    }
    public void getExamList(){
        getExamColummLab();
    }

    private void getLeftColummLabEn() {
        Runnable runnable1 = () -> {
            for (int i = 0; i < arrayOfOffersLeft.length; i++) {
                arrayOfOffersLeft[i] = new Label();
                arrayOfOffersLeft[i].setFont(EffectFont.fontText);
                arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersLeft[i].setStyle("-fx-border-color: RED");
                arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.45);
                arrayOfOffersLeft[i].setWrapText(true);

                arrayOfOffersLeft[i].setText(text.getAppToBefileEn().get(i+ START));

                int finalI = i;
                arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                    if (arrayOfOffersLeft[finalI].getText().equals(text.getAppToBefileEn().get(finalI + START))){
                        arrayOfOffersLeft[finalI].setText(text.getAppToBefileRu().get(finalI + START));
                        arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClic);
                    } else {
                        arrayOfOffersLeft[finalI].setText(text.getAppToBefileEn().get(finalI+ START));
                        arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorText);
                    }
                });
            }
//                leftColumm.setStyle("-fx-border-color: RED");
            leftColumm.setSpacing(heightSize-heightSize/1.009);
            leftColumm.setLayoutX(widthSize/6);
            leftColumm.setLayoutY(heightSize-heightSize/1.12);
            leftColumm.setPadding(new Insets(0, 0, 0, 0));
            leftColumm.setPrefSize(widthSize/3.2, heightSize/1.25);
            leftColumm.getChildren().addAll(arrayOfOffersLeft);

            ROOT.getChildren().addAll(leftColumm);
        };
        runnable1.run();
    }
    private void getRightColummLabEn() {
        Runnable runnable2 = () -> {
            for (int i = 0; i < arrayOfOffersRight.length; i++) {
                arrayOfOffersRight[i] = new Label();
                arrayOfOffersRight[i].setFont(EffectFont.fontText);
                arrayOfOffersRight[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersRight[i].setStyle("-fx-border-color: RED");
                arrayOfOffersRight[i].setPrefWidth(widthSize-widthSize/1.45);
                arrayOfOffersRight[i].setWrapText(true);

                arrayOfOffersRight[i].setText(text.getAppToBefileEn().get(i+CLOSE));

                int finalI = i;

                arrayOfOffersRight[i].setOnMouseClicked(event -> {
                    if (arrayOfOffersRight[finalI].getText().equals(text.getAppToBefileEn().get(finalI +CLOSE))){
                        arrayOfOffersRight[finalI].setText(text.getAppToBefileRu().get(finalI+CLOSE));
                        arrayOfOffersRight[finalI].setTextFill(EffectColor.colorTextClic);
                    } else {
                        arrayOfOffersRight[finalI].setText(text.getAppToBefileEn().get(finalI + CLOSE));
                        arrayOfOffersRight[finalI].setTextFill(EffectColor.colorText);
                    }
                });
            }

//                rightColumm.setStyle("-fx-border-color: RED");
            rightColumm.setLayoutX(widthSize/1.9);
            rightColumm.setLayoutY(heightSize-heightSize/1.12);
            rightColumm.setSpacing(heightSize-heightSize/1.009);
            rightColumm.setPadding(new Insets(0, 0, 0, 0));
            rightColumm.setPrefSize(widthSize/3.2, heightSize/1.25);
            rightColumm.getChildren().addAll(arrayOfOffersRight);
            ROOT.getChildren().addAll(rightColumm);
        };
        runnable2.run();
    }
    private void getLeftColummLabRu() {

        Runnable runnable1 = () -> {
            for (int i = 0; i < arrayOfOffersLeft.length; i++) {
                arrayOfOffersLeft[i] = new Label();
                arrayOfOffersLeft[i].setFont(EffectFont.fontText);
                arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersLeft[i].setStyle("-fx-border-color: RED");
                arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.45);
                arrayOfOffersLeft[i].setWrapText(true);
                arrayOfOffersLeft[i].setText(text.getAppToBefileRu().get(i+START));
                int finalI = i;
                arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                    if (arrayOfOffersLeft[finalI].getText().equals(text.getAppToBefileRu().get(finalI+START))){
                        arrayOfOffersLeft[finalI].setText(text.getAppToBefileEn().get(finalI+START));
                        arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClic);
                    } else {
                        arrayOfOffersLeft[finalI].setText(text.getAppToBefileRu().get(finalI+START));
                        arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorText);
                    }
                });
            }

//                leftColumm.setStyle("-fx-border-color: RED");
            leftColumm.setSpacing(heightSize-heightSize/1.009);
            leftColumm.setLayoutX(widthSize/6);
            leftColumm.setLayoutY(heightSize-heightSize/1.12);
            leftColumm.setPadding(new Insets(0, 0, 0, 0));
            leftColumm.setPrefSize(widthSize/3.2, heightSize/1.25);
            leftColumm.getChildren().addAll(arrayOfOffersLeft);
            ROOT.getChildren().addAll(leftColumm);
        };
        runnable1.run();
    }
    private void getRightColummLabRu() {
        Runnable runnable2 = () -> {
            for (int i = 0; i < arrayOfOffersRight.length; i++) {
                arrayOfOffersRight[i] = new Label();
                arrayOfOffersRight[i].setFont(EffectFont.fontText);
                arrayOfOffersRight[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersRight[i].setStyle("-fx-border-color: RED");
                arrayOfOffersRight[i].setPrefWidth(widthSize-widthSize/1.45);
                arrayOfOffersRight[i].setWrapText(true);
                arrayOfOffersRight[i].setText(text.getAppToBefileRu().get(i+CLOSE));
                int finalI = i;
                arrayOfOffersRight[i].setOnMouseClicked(event -> {
                    if (arrayOfOffersRight[finalI].getText().equals(text.getAppToBefileRu().get(finalI+CLOSE))){
                        arrayOfOffersRight[finalI].setText(text.getAppToBefileEn().get(finalI+CLOSE));
                        arrayOfOffersRight[finalI].setTextFill(EffectColor.colorTextClic);
                    } else {
                        arrayOfOffersRight[finalI].setText(text.getAppToBefileRu().get(finalI+CLOSE));
                        arrayOfOffersRight[finalI].setTextFill(EffectColor.colorText);
                    }
                });
            }

//                rightColumm.setStyle("-fx-border-color: RED");
            rightColumm.setLayoutX(widthSize/1.9);
            rightColumm.setLayoutY(heightSize-heightSize/1.12);
            rightColumm.setSpacing(heightSize-heightSize/1.009);
            rightColumm.setPadding(new Insets(0, 0, 0, 0));
            rightColumm.setPrefSize(widthSize/3.2, heightSize/1.25);
            rightColumm.getChildren().addAll(arrayOfOffersRight);
            ROOT.getChildren().addAll(rightColumm);
        };
        runnable2.run();
    }
    private void getExamColummLab() {
        Runnable runnable1 = () -> {
            for (int i = 0; i < arrayOfOffersExam.length; i++) {
                arrayOfOffersExam[i] = new Label();
                arrayOfOffersExam[i].setFont(EffectFont.fontTextExam);
                arrayOfOffersExam[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersExam[i].setStyle("-fx-border-color: RED");
                arrayOfOffersExam[i].setPrefWidth(widthSize-widthSize/2.45);
                arrayOfOffersExam[i].setWrapText(true);
                arrayOfOffersExam[i].setText(examToBe.getExamRu().get(i+ START));

                correctly[i] = new Label();
                correctly[i].setFont(EffectFont.fontTextExam);
//                    correctly[i].setStyle("-fx-border-color: RED");
                correctly[i].setPrefWidth(widthSize-widthSize/1.45);
                correctly[i].setAlignment(Pos.BASELINE_RIGHT);

                int finalI = i;
                arrayOfOffersExam[i].setOnMouseClicked(event -> {
                    if (improve.getText().equalsIgnoreCase(examToBe.getExamEn().get(finalI+START))){
                        arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextClic);
                        correctly[finalI].setText("ВЕРНО!!!");
                        correctly[finalI].setTextFill(EffectColor.colorTextClic);
                    } else {
                        arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextClicRED);
                        correctly[finalI].setText("НЕ ВЕРНО!!!");
                        correctly[finalI].setTextFill(EffectColor.colorTextClicRED);
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
                number[i].setText("-"+(i+1+START)+"-");
                int finalI = i;
                number[i].setOnMouseClicked(ev -> {
                    if (arrayOfOffersExam[finalI].getText().equals(examToBe.getExamRu().get(finalI+START))){
                        arrayOfOffersExam[finalI].setText(examToBe.getExamEn().get(finalI+START));
                        arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextImpr);
                    }
                });
            }

//                numberColumm.setStyle("-fx-border-color: RED");
            numberColumm.setSpacing(heightSize-heightSize/1.009);
            numberColumm.setPadding(new Insets(0, 0, 0, 0));
            numberColumm.setPrefSize(widthSize/25, heightSize/1.25);
            numberColumm.getChildren().addAll(number);

//                iprColumm.setStyle("-fx-border-color: RED");
            iprColumm.setSpacing(heightSize-heightSize/1.009);
            iprColumm.setPadding(new Insets(0, 0, 0, 0));
            iprColumm.setPrefSize(widthSize/11, heightSize/1.25);
            iprColumm.getChildren().addAll(correctly);

//                leftColumm.setStyle("-fx-border-color: RED");
            leftColumm.setSpacing(heightSize-heightSize/1.009);
            leftColumm.setPadding(new Insets(0, 0, 0, 0));
            leftColumm.setPrefSize(widthSize/2.5, heightSize/1.25);
            leftColumm.getChildren().addAll(arrayOfOffersExam);

            groupExam.setSpacing(heightSize-heightSize/1.009);
            groupExam.getChildren().addAll(numberColumm, leftColumm, iprColumm);

            examPane.setContent(groupExam);
//                examPane.setStyle("-fx-border-color: RED");
            examPane.setLayoutX(widthSize - widthSize / 1.25);
            examPane.setLayoutY(heightSize - heightSize / 1.16);
            examPane.setPrefSize(widthSize / 1.8, heightSize / 1.5);

            VBox vBox = new VBox();
            improve.setPrefWidth(widthSize/3);
            improveClick1.setAlignment(Pos.CENTER);
            improveClick1.setTextFill(EffectColor.colorTextClicPERU);
            vBox.getChildren().addAll(improveClick1, improve);
            vBox.setSpacing(heightSize-heightSize/1.009);
            vBox.setLayoutX(widthSize-widthSize/1.4);
            vBox.setLayoutY(heightSize-heightSize/1.05);

            ROOT.getChildren().addAll(examPane, vBox);
        };
        runnable1.run();
    }
}
