package exam;

import interfaceRoot.EffectColor;
import interfaceRoot.EffectFont;
import interfaceRoot.RootMethod;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class FillingColumnsExam implements RootMethod
{
    private Label[] arrayOfOffersExam;
    private Label[] number;
    private Label[] correctly;
    private int START;
    private String m;
    private Exam exam = new Exam();

    //Для контрольных
    public FillingColumnsExam(Label[] arrayOfOffersExam, Label[] number, Label[] correctly, int START, String m) {

        this.arrayOfOffersExam = arrayOfOffersExam;
        this.number = number;
        this.correctly = correctly;
        this.START = START;
        this.m = m;
    }
    public void getExamList(){
        getExamColumnLab();
    }

    private String methodRuExam(int a, int b){
        switch (m) {
            case "ExamPS":
                return exam.getExamRuPS().get(a + b);
            case "ExamToBe":
                return exam.getExamRuToBe().get(a + b);
        }
        return "No files";
    }
    private String methodEnExam(int a, int b){
        switch (m) {
            case "ExamPS":
                return exam.getExamEnPS().get(a + b);
            case "ExamToBe":
                return exam.getExamEnToBe().get(a + b);
        }
        return "No files";
    }
    private void getExamColumnLab() {
        for (int i = 0; i < arrayOfOffersExam.length; i++) {
            arrayOfOffersExam[i] = new Label();
            arrayOfOffersExam[i].setFont(EffectFont.fontTextExam);
            arrayOfOffersExam[i].setTextFill(EffectColor.colorText);
//            arrayOfOffersExam[i].setStyle("-fx-border-color: RED");
            arrayOfOffersExam[i].setPrefWidth(widthSize-widthSize/2.45);
            arrayOfOffersExam[i].setWrapText(true);
            arrayOfOffersExam[i].setText(methodRuExam(i, START));
            arrayOfOffersExam[i].setCursor(Cursor.HAND);

            correctly[i] = new Label();
            correctly[i].setFont(EffectFont.fontTextExam);
//            correctly[i].setStyle("-fx-border-color: RED");
            correctly[i].setPrefWidth(widthSize-widthSize/1.45);
            correctly[i].setAlignment(Pos.BASELINE_RIGHT);

            int finalI = i;
            arrayOfOffersExam[i].setOnMouseClicked(event -> {
                soundClick();
                if (improve.getText().equalsIgnoreCase(methodEnExam(finalI, START))){
                    arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextClick);
                    correctly[finalI].setText("ВЕРНО!!!");
                    correctly[finalI].setTextFill(EffectColor.colorTextClick);
                    improveClick1.setFont(EffectFont.fontTextExam);
                    improveClick1.setTextFill(EffectColor.colorText);
                    improveClick1.setText(improve.getText());
                    improve.clear();
                } else if (!improve.getText().equalsIgnoreCase("")){
                    arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextClickRED);
                    correctly[finalI].setText("НЕ ВЕРНО!!!");
                    correctly[finalI].setTextFill(EffectColor.colorTextClickRED);
                    improveClick1.setFont(EffectFont.fontTextExam);
                    improveClick1.setTextFill(EffectColor.colorText);
                    improveClick1.setText(improve.getText());
                    improve.clear();
                } else if (improve.getText().equalsIgnoreCase("")) {
                    improveClick1.setFont(EffectFont.fontTextExam);
                    improveClick1.setTextFill(EffectColor.colorTextClickRED);
                    improveClick1.setText("Введите текст для проверки!");
                    panes("Напишите перевод для проверки...");
                }
                // Работа счетчика:
                counterRun();
            });
        }
        // Счетчик:
        counter();
        // Нумерация контольных:
        numberingOfExam();
        // Добавляем все на панели:
        addPaneExam();
    }
    private void counterRun(){
        int a = 0;
        int b = 0;
        for (int j = 0; j < 100; j++) {
            if (correctly[j].getText().equals("ВЕРНО!!!")){
                ++a;
            } else if (correctly[j].getText().equals("НЕ ВЕРНО!!!")) {
                ++b;
            }
        }
        counterYES.setText(String.valueOf(a));
        counterNO.setText(String.valueOf(b));
    }
    private void numberingOfExam(){
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
                if (arrayOfOffersExam[finalI].getText().equals(methodRuExam(finalI, START))){
                    arrayOfOffersExam[finalI].setText(methodEnExam(finalI, START));
                    arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextImpr);
                }
            });
        }
    }
    private void addPaneExam(){
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
}
