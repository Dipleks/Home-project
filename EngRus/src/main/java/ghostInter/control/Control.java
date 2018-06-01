package ghostInter.control;

import ghostInter.interfaceRoot.EffectColor;
import ghostInter.interfaceRoot.EffectFont;
import ghostInter.interfaceRoot.RootMethod;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

import java.sql.SQLException;

public class Control implements RootMethod
{
    private HBox lengthButtonApp = new HBox();
    private HBox lengthButtonNeg = new HBox();
    private HBox lengthButtonQues = new HBox();
    private HBox lengthButtonExam = new HBox();

    private ToggleGroup group = new ToggleGroup();
    private RadioButton enBut = new RadioButton("English");
    private RadioButton ruBut = new RadioButton("Русский");
    private RadioButton exit = new RadioButton("В меню");

    private Label appL = new Label();
    private Label negL = new Label();
    private Label quesL = new Label();
    private Label examL = new Label();

    public void exercise(final FillingColumns[] app, final FillingColumns[] neg, final FillingColumns[] ques,
                         final Button[] buttonApp, final Button[] buttonNeg, final Button[] buttonQues, String m)
    {
        methodAppNegQues();
        for (int i = 0; i < buttonApp.length; i++) {
            buttonApp[i] = new Button();
            buttonApp[i].setText("Задание " + (i+1));
            buttonApp[i].setPrefWidth(widthSize-widthSize/1.07);
            buttonApp[i].setPrefHeight(widthSize-widthSize/1.03);
            int finalI = i;
            buttonApp[i].setOnAction(event -> {
                soundClick();
                radioBut();
                enBut.setOnAction(e ->
                {
                    try {
                        clearColumn();
                        clock();
                    } catch (SQLException | ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                    app[finalI].getLeftEn();
                    app[finalI].getRightEn();
                });
                ruBut.setOnAction(e ->
                {
                    try {
                        clearColumn();
                        clock();
                    } catch (SQLException | ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                    app[finalI].getLeftRu();
                    app[finalI].getRightRu();
                });
                exit.setOnAction(e -> {
                    try {
                        methodClearExercise(m);
                    } catch (SQLException | ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                });
                app[finalI].getLeftEn();
                app[finalI].getRightEn();
                removeBut();
                lengthButtonApp.getChildren().removeAll(buttonApp);
                lengthButtonNeg.getChildren().removeAll(buttonNeg);
                lengthButtonQues.getChildren().removeAll(buttonQues);
            });
        }
//          lengthButtonApp.setStyle("-fx-border-color: RED");
        lengthButtonApp.setSpacing(widthSize-widthSize/1.03);
        lengthButtonApp.setPrefWidth((buttonApp[0].getPrefWidth()+lengthButtonApp.getSpacing())*buttonApp.length);
        lengthButtonApp.setLayoutX(widthSize/2-((lengthButtonApp.getPrefWidth())/2));
        lengthButtonApp.setLayoutY(heightSize-heightSize/1.2);
        lengthButtonApp.setPadding(new Insets(10, 10, 10, 10));
        lengthButtonApp.getChildren().addAll(buttonApp);
        ROOT.getChildren().addAll(lengthButtonApp);

        for (int i = 0; i < buttonNeg.length; i++) {
            buttonNeg[i] = new Button();
            buttonNeg[i].setText("Задание " + (i + 1));
            buttonNeg[i].setPrefWidth(widthSize-widthSize/1.07);
            buttonNeg[i].setPrefHeight(widthSize-widthSize/1.03);
            int finalI = i;
            buttonNeg[i].setOnAction(event -> {
                Runnable r = this::soundClick;
                r.run();
                radioBut();
                enBut.setOnAction(e ->
                {
                    try {
                        clearColumn();
                        clock();
                    } catch (SQLException | ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                    neg[finalI].getLeftEn();
                    neg[finalI].getRightEn();
                });
                ruBut.setOnAction(e ->
                {
                    try {
                        clearColumn();
                        clock();
                    } catch (SQLException | ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                    neg[finalI].getLeftRu();
                    neg[finalI].getRightRu();
                });
                exit.setOnAction(e -> {
                    try {
                        methodClearExercise(m);
                    } catch (SQLException | ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                });
                neg[finalI].getLeftEn();
                neg[finalI].getRightEn();
                removeBut();
                lengthButtonApp.getChildren().removeAll(buttonApp);
                lengthButtonNeg.getChildren().removeAll(buttonNeg);
                lengthButtonQues.getChildren().removeAll(buttonQues);

            });
        }
//          lengthButtonNeg.setStyle("-fx-border-color: RED");
        lengthButtonNeg.setSpacing(widthSize-widthSize/1.03);
        lengthButtonNeg.setPrefWidth((buttonNeg[0].getPrefWidth()+lengthButtonNeg.getSpacing())*buttonNeg.length);
        lengthButtonNeg.setLayoutX(widthSize/2-((lengthButtonNeg.getPrefWidth())/2));
        lengthButtonNeg.setLayoutY(lengthButtonApp.getLayoutY()+heightSize-heightSize/1.2);
        lengthButtonNeg.setPadding(new Insets(10, 10, 10, 10));
        lengthButtonNeg.getChildren().addAll(buttonNeg);
        ROOT.getChildren().addAll(lengthButtonNeg);

        for (int i = 0; i < buttonQues.length; i++) {
            buttonQues[i] = new Button();
            buttonQues[i].setText("Задание " + (i + 1));
            buttonQues[i].setPrefWidth(widthSize-widthSize/1.07);
            buttonQues[i].setPrefHeight(widthSize-widthSize/1.03);
            int finalI = i;
            buttonQues[i].setOnAction(event -> {
                Runnable r = this::soundClick;
                r.run();
                radioBut();
                enBut.setOnAction(e ->
                {
                    try {
                        clearColumn();
                        clock();
                    } catch (SQLException | ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                    ques[finalI].getLeftEn();
                    ques[finalI].getRightEn();
                });
                ruBut.setOnAction(e ->
                {
                    try {
                        clearColumn();
                        clock();
                    } catch (SQLException | ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                    ques[finalI].getLeftRu();
                    ques[finalI].getRightRu();
                });
                exit.setOnAction(e -> {
                    try {
                        methodClearExercise(m);
                    } catch (SQLException | ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                });
                ques[finalI].getLeftEn();
                ques[finalI].getRightEn();
                removeBut();
                lengthButtonApp.getChildren().removeAll(buttonApp);
                lengthButtonNeg.getChildren().removeAll(buttonNeg);
                lengthButtonQues.getChildren().removeAll(buttonQues);
            });
        }
//          lengthButtonQues.setStyle("-fx-border-color: RED");
        lengthButtonQues.setSpacing(widthSize-widthSize/1.03);
        lengthButtonQues.setPrefWidth((buttonQues[0].getPrefWidth()+lengthButtonQues.getSpacing())*buttonQues.length);
        lengthButtonQues.setLayoutX(widthSize/2-((lengthButtonQues.getPrefWidth())/2));
        lengthButtonQues.setLayoutY(lengthButtonNeg.getLayoutY()+heightSize-heightSize/1.2);
        lengthButtonQues.setPadding(new Insets(10, 10, 10, 10));
        lengthButtonQues.getChildren().addAll(buttonQues);
        ROOT.getChildren().addAll(lengthButtonQues);
    }
    public void examMethod(final FillingColumns[] exam, final Button[] buttonExam, String m){

        this.examL.setText("Контрольные работы");
//        quesL.setStyle("-fx-border-color: RED");
        this.examL.setPrefWidth(widthSize-widthSize/1.25);
        this.examL.setAlignment(Pos.CENTER);
        this.examL.setFont(EffectFont.fontTitle);
        this.examL.setTextFill(EffectColor.colorTitle);
        this.examL.setLayoutX((widthSize/2)-(widthSize-widthSize/1.25)/2);
        this.examL.setLayoutY(heightSize-heightSize/1.15);
        ROOT.getChildren().add(this.examL);

        for (int i = 0; i < buttonExam.length; i++) {
            buttonExam[i] = new Button();
            buttonExam[i].setText("Часть №" + (i + 1));
            buttonExam[i].setPrefWidth(widthSize-widthSize/1.06);
            buttonExam[i].setPrefHeight(widthSize-widthSize/1.03);
            int finalI = i;
            buttonExam[i].setOnAction(event -> {

                soundClick();
                groupRadBut.setSpacing(widthSize-widthSize/1.03);
//                groupRadBut.setStyle("-fx-border-color: RED");
                groupRadBut.setPadding(new Insets(10, 10, 10, 10));
                groupRadBut.setLayoutX(widthSize-widthSize/2.8);
                groupRadBut.setLayoutY(heightSize-heightSize/1.09);
                ROOT.getChildren().addAll(groupRadBut);
                exitInMenu.setOnAction(e -> {
                    try {
                        methodClearExam(m);
                    } catch (SQLException | ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                });
                exam[finalI].getExamList();
                ROOT.getChildren().remove(lengthButtonExam);
                ROOT.getChildren().removeAll(this.examL);
                lengthButtonExam.getChildren().removeAll(buttonExam);
            });
        }
//        lengthButtonQues.setStyle("-fx-border-color: RED");
        lengthButtonExam.setSpacing(widthSize-widthSize/1.03);
        lengthButtonExam.setPrefWidth((buttonExam[0].getPrefWidth()+lengthButtonExam.getSpacing())*buttonExam.length);
        lengthButtonExam.setLayoutX(widthSize/2-((lengthButtonExam.getPrefWidth())/2));
        lengthButtonExam.setLayoutY(lengthButtonQues.getLayoutY()+heightSize-heightSize/1.2);
        lengthButtonExam.setPadding(new Insets(10, 10, 10, 10));
        lengthButtonExam.getChildren().addAll(buttonExam);
        ROOT.getChildren().addAll(lengthButtonExam);
    }

    private void radioBut(){
        enBut.setToggleGroup(group);
        enBut.setSelected(true);
        ruBut.setToggleGroup(group);
        groupRadBut.getChildren().addAll(enBut, ruBut, exit);
        groupRadBut.setSpacing(widthSize-widthSize/1.03);
//        groupRadBut.setStyle("-fx-border-color: RED");
        groupRadBut.setPadding(new Insets(10, 10, 10, 10));
        groupRadBut.setLayoutX(widthSize-widthSize/1.5);
        groupRadBut.setLayoutY(heightSize-heightSize/1.04);
        ROOT.getChildren().addAll(groupRadBut);
    }
    private void removeBut(){
        ROOT.getChildren().remove(lengthButtonApp);
        ROOT.getChildren().remove(lengthButtonNeg);
        ROOT.getChildren().remove(lengthButtonQues);
        ROOT.getChildren().remove(lengthButtonExam);
        ROOT.getChildren().removeAll(appL, negL, quesL, examL);
    }
    private void methodAppNegQues(){

        appL.setText("Утверждения");
//        appL.setStyle("-fx-border-color: RED");
        appL.setPrefWidth(widthSize-widthSize/1.25);
        appL.setAlignment(Pos.CENTER);
        appL.setFont(EffectFont.fontTitle);
        appL.setTextFill(EffectColor.colorTitle);
        appL.setLayoutX((widthSize/2)-(widthSize-widthSize/1.25)/2);
        appL.setLayoutY(heightSize-heightSize/1.15);
        ROOT.getChildren().add(appL);

        negL.setText("Отрицания");
//        negL.setStyle("-fx-border-color: RED");
        negL.setPrefWidth(widthSize-widthSize/1.25);
        negL.setAlignment(Pos.CENTER);
        negL.setFont(EffectFont.fontTitle);
        negL.setTextFill(EffectColor.colorTitle);
        negL.setLayoutX((widthSize/2)-(widthSize-widthSize/1.25)/2);
        negL.setLayoutY(appL.getLayoutY()+heightSize-heightSize/1.2);
        ROOT.getChildren().add(negL);

        quesL.setText("Вопросительные предложения");
//        quesL.setStyle("-fx-border-color: RED");
        quesL.setPrefWidth(widthSize-widthSize/1.25);
        quesL.setAlignment(Pos.CENTER);
        quesL.setFont(EffectFont.fontTitle);
        quesL.setTextFill(EffectColor.colorTitle);
        quesL.setLayoutX((widthSize/2)-(widthSize-widthSize/1.25)/2);
        quesL.setLayoutY(negL.getLayoutY()+heightSize-heightSize/1.2);
        ROOT.getChildren().add(quesL);
    }
}
