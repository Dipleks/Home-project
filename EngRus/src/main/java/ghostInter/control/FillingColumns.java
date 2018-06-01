package ghostInter.control;

import db.TableDB;
import ghostInter.interfaceRoot.EffectColor;
import ghostInter.interfaceRoot.EffectFont;;
import ghostInter.interfaceRoot.RootMethod;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.sql.SQLException;

public class FillingColumns implements RootMethod, TableDB
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

    public FillingColumns() {
    }
    //Для заданий
    public FillingColumns(Label[] arrayOfOffersLeft, Label[] arrayOfOffersRight, int START, int CLOSE, String m) {

        this.arrayOfOffersLeft = arrayOfOffersLeft;
        this.arrayOfOffersRight = arrayOfOffersRight;
        this.START = START;
        this.CLOSE = CLOSE;
        this.m = m;
    }
    //Для контрольных
    public FillingColumns(Label[] arrayOfOffersExam, Label[] number, Label[] correctly, int START, String m) {

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
        for (int i = 0; i < arrayOfOffersLeft.length; i++) {
            arrayOfOffersLeft[i] = new Label();
            arrayOfOffersLeft[i].setFont(EffectFont.fontText);
            arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
//                arrayOfOffersLeft[i].setStyle("-fx-border-color: RED");
            arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.45);
            arrayOfOffersLeft[i].setWrapText(true);
            arrayOfOffersLeft[i].setText(methEn(i, START));

            int finalI = i;
            arrayOfOffersLeft[i].setCursor(Cursor.HAND);
            arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                soundClick();
                if (arrayOfOffersLeft[finalI].getText().equals(methEn(finalI, START))){
                    arrayOfOffersLeft[finalI].setText(methRu(finalI, START));
                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClick);
                } else {
                    arrayOfOffersLeft[finalI].setText(methEn(finalI, START));
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
            arrayOfOffersLeft[i].setText(methRu(i, START));
            int finalI = i;
            arrayOfOffersLeft[i].setCursor(Cursor.HAND);
            arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                soundClick();
                if (arrayOfOffersLeft[finalI].getText().equals(methRu(finalI, START))){
                    arrayOfOffersLeft[finalI].setText(methEn(finalI, START));
                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClick);
                } else {
                    arrayOfOffersLeft[finalI].setText(methRu(finalI, START));
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
            arrayOfOffersRight[i].setText(methRu(i, CLOSE));
            int finalI = i;
            arrayOfOffersRight[i].setCursor(Cursor.HAND);
            arrayOfOffersRight[i].setOnMouseClicked(event -> {
                soundClick();
                if (arrayOfOffersRight[finalI].getText().equals(methRu(finalI, CLOSE))){
                    arrayOfOffersRight[finalI].setText(methEn(finalI, CLOSE));
                    arrayOfOffersRight[finalI].setTextFill(EffectColor.colorTextClick);
                } else {
                    arrayOfOffersRight[finalI].setText(methRu(finalI, CLOSE));
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
    private void getExamColumnLab() {
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
                soundClick();
                if (improve.getText().equalsIgnoreCase(methEn(finalI, START))){
                    arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextClick);
                    correctly[finalI].setText("ВЕРНО!!!");
                    correctly[finalI].setTextFill(EffectColor.colorTextClick);
                    improveClick1.setFont(EffectFont.fontTextExam);
                    improveClick1.setTextFill(EffectColor.colorText);
                    improveClick1.setText(improve.getText());
                    // TODO сделать счетчик через БД
//                    counterYES.setText("Счетчик в\nразработке");
                    improve.clear();
                } else if (!improve.getText().equalsIgnoreCase("")){
                    arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextClickRED);
                    correctly[finalI].setText("НЕ ВЕРНО!!!");
                    correctly[finalI].setTextFill(EffectColor.colorTextClickRED);
                    improveClick1.setFont(EffectFont.fontTextExam);
                    improveClick1.setTextFill(EffectColor.colorText);
                    improveClick1.setText(improve.getText());
                    // TODO сделать счетчик через БД
//                    counterNO.setText("Счетчик в\nразработке");
                    improve.clear();
                } else if (improve.getText().equalsIgnoreCase("")) {
                    improveClick1.setFont(EffectFont.fontTextExam);
                    improveClick1.setTextFill(EffectColor.colorTextClickRED);
                    improveClick1.setText("Введите текст для проверки!");
                    panes("Напишите перевод для проверки...");
                }
            });
        }
        ///////////////////
        ROOT.getChildren().remove(counter);
        YES.setFont(EffectFont.fontTextExam);
        YES.setTextFill(EffectColor.colorTextClickPERU);
        NO.setFont(EffectFont.fontTextExam);
        NO.setTextFill(EffectColor.colorTextClickPERU);
        counterYES.setText("Счетчик в\nразработке"); //удалить после реализации метода
        counterNO.setText("Счетчик в\nразработке"); //удалить после реализации метода

        counter.setSpacing(10);
        counter.setAlignment(Pos.CENTER);
        counter.setLayoutX(widthSize/10);
        counter.setLayoutY(heightSize/5);
//        counter.setStyle("-fx-border-color: RED");
        counter.getChildren().addAll(YES, counterYES, NO, counterNO);
        ROOT.getChildren().add(counter);
        /////////////////

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
                soundClick();
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
//        examPane.setStyle("-fx-background-color: transparent; -fx-background: #FFFFFF;");
        examPane.setLayoutX(widthSize - widthSize / 1.25);
        examPane.setLayoutY(heightSize - heightSize / 1.16);
        examPane.setPrefSize(widthSize / 1.8, heightSize / 1.5);

        HBox hBox = new HBox();
        Button button = new Button("?");
        button.setOnAction(e -> {
            panes(str);
        });
        improve.setPrefWidth(widthSize/3);
        hBox.setSpacing(10);
        hBox.getChildren().addAll(button, improve, exitInMenu);
        improveClick1.setAlignment(Pos.CENTER);
        improveClick1.setTextFill(EffectColor.colorTextClickPERU);
        improveV.getChildren().addAll(improveClick1, hBox);
        improveV.setSpacing(heightSize-heightSize/1.009);
        improveV.setLayoutX(widthSize-widthSize/1.4);
        improveV.setLayoutY(heightSize-heightSize/1.05);

        ROOT.getChildren().addAll(examPane, improveV);
    }

    // Добавление Базы данных, меню "Мои слова":
    public void getMyWordsList(){
        getMyWordsColumnLab();
    }
    private void getMyWordsColumnLab() {
        restartMyWordsTable();

        rightC.getChildren().addAll();
        rightC.setSpacing(7);
        rightC.setPrefWidth(widthSize - widthSize / 1.3);
//        rightC.setStyle("-fx-border-color: RED");
        leftC.getChildren().addAll();
        leftC.setSpacing(7);
        leftC.setPadding(new Insets(0, 30, 0, 0));
        leftC.setPrefWidth(widthSize - widthSize / 1.3);
//        leftC.setStyle("-fx-border-color: RED");
        groupMy.setSpacing(20);
        groupMy.getChildren().addAll(leftC, rightC);

//        addElement.setStyle("-fx-border-color: RED");
        addElement.setLayoutX(widthSize - widthSize / 1.25);
        addElement.setLayoutY(heightSize - heightSize / 1.16);
        addElement.setPrefSize(widthSize / 1.8, heightSize / 1.5);
        addElement.setSpacing(10);

        textMy.setStyle("-fx-background-color: transparent; -fx-background: #FFFFFF;");
        textMy.setPrefSize(widthSize / 1.8, heightSize / 1.6);
        textMy.setContent(groupMy);

        textEn.setPrefWidth(widthSize - widthSize / 1.3);
        textEn.setPromptText("English");
        textRu.setPrefWidth(widthSize - widthSize / 1.3);
        textRu.setPromptText("Русский");
        addTextAndButton.setSpacing(20);
        addTextAndButton.getChildren().addAll(textEn, textRu, addWords);

        addElement.getChildren().addAll(addTextAndButton, textMy);

        HBox hBox = new HBox();
        textSearch.setPrefWidth(widthSize/3);

        // Поиск в "Мои слова":
        getSearch();

        hBox.getChildren().addAll(textSearch, searchWords);
        hBox.setSpacing(heightSize-heightSize/1.009);
        hBox.setLayoutX(widthSize-widthSize/1.4);
        hBox.setLayoutY(heightSize-heightSize/1.05);

        ROOT.getChildren().addAll(addElement, hBox);
    }
}