package ghostInter.control;

import ghostInter.interfaceRoot.EffectColor;
import ghostInter.interfaceRoot.EffectFont;
import ghostInter.interfaceRoot.Root;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

public class Control implements Root
{
    private HBox lengthButtonApp = new HBox();
    private HBox lengthButtonNeg = new HBox();
    private HBox lengthButtonQues = new HBox();
    private HBox lengthButtonExam = new HBox();

    private ToggleGroup group = new ToggleGroup();
    private RadioButton enBut = new RadioButton("English");
    private RadioButton ruBut = new RadioButton("Русский");
    private RadioButton exit = new RadioButton("В меню");

    private Label psApp = new Label();
    private Label psNeg = new Label();
    private Label psQues = new Label();
    private Label psExam = new Label();

    public void exercise(final FillingColumns[] app, final FillingColumns[] neg, final FillingColumns[] ques,
                         final Button[] buttonPSapp, final Button[] buttonPSneg, final Button[] buttonPSques, String m)
    {
        methodAppNegQues();
        Runnable runnable1 = () -> {
            for (int i = 0; i < buttonPSapp.length; i++) {
                buttonPSapp[i] = new Button();
                buttonPSapp[i].setText("Задание " + (i+1));
                buttonPSapp[i].setPrefWidth(widthSize-widthSize/1.07);
                buttonPSapp[i].setPrefHeight(widthSize-widthSize/1.03);
                int finalI = i;
                buttonPSapp[i].setOnAction(event -> {
                    radioBut();
                    enBut.setOnAction(e ->
                    {
                        clearColumn();
                        app[finalI].getLeftEn();
                        app[finalI].getRightEn();
                    });
                    ruBut.setOnAction(e ->
                    {
                        clearColumn();
                        app[finalI].getLeftRu();
                        app[finalI].getRightRu();
                    });
                    exit.setOnAction(e -> methodClearExercise(m));
                    app[finalI].getLeftEn();
                    app[finalI].getRightEn();
                    removeBut();
                    lengthButtonApp.getChildren().removeAll(buttonPSapp);
                    lengthButtonNeg.getChildren().removeAll(buttonPSneg);
                    lengthButtonQues.getChildren().removeAll(buttonPSques);
                });
            }
//          lengthButtonApp.setStyle("-fx-border-color: RED");
            lengthButtonApp.setSpacing(widthSize-widthSize/1.03);
            lengthButtonApp.setPrefWidth((buttonPSapp[0].getPrefWidth()+lengthButtonApp.getSpacing())*buttonPSapp.length);
            lengthButtonApp.setLayoutX(widthSize/2-((lengthButtonApp.getPrefWidth())/2));
            lengthButtonApp.setLayoutY(heightSize-heightSize/1.2);
            lengthButtonApp.setPadding(new Insets(10, 10, 10, 10));
            lengthButtonApp.getChildren().addAll(buttonPSapp);
            ROOT.getChildren().addAll(lengthButtonApp);
        };
        runnable1.run();
        Runnable runnable2 = () -> {
            for (int i = 0; i < buttonPSneg.length; i++) {
                buttonPSneg[i] = new Button();
                buttonPSneg[i].setText("Задание " + (i + 1));
                buttonPSneg[i].setPrefWidth(widthSize-widthSize/1.07);
                buttonPSneg[i].setPrefHeight(widthSize-widthSize/1.03);
                int finalI = i;
                buttonPSneg[i].setOnAction(event -> {
                    radioBut();
                    enBut.setOnAction(e ->
                    {
                        clearColumn();
                        neg[finalI].getLeftEn();
                        neg[finalI].getRightEn();
                    });
                    ruBut.setOnAction(e ->
                    {
                        clearColumn();
                        neg[finalI].getLeftRu();
                        neg[finalI].getRightRu();
                    });
                    exit.setOnAction(e -> methodClearExercise(m));
                    neg[finalI].getLeftEn();
                    neg[finalI].getRightEn();
                    removeBut();
                    lengthButtonApp.getChildren().removeAll(buttonPSapp);
                    lengthButtonNeg.getChildren().removeAll(buttonPSneg);
                    lengthButtonQues.getChildren().removeAll(buttonPSques);

                });
            }
//          lengthButtonNeg.setStyle("-fx-border-color: RED");
            lengthButtonNeg.setSpacing(widthSize-widthSize/1.03);
            lengthButtonNeg.setPrefWidth((buttonPSneg[0].getPrefWidth()+lengthButtonNeg.getSpacing())*buttonPSneg.length);
            lengthButtonNeg.setLayoutX(widthSize/2-((lengthButtonNeg.getPrefWidth())/2));
            lengthButtonNeg.setLayoutY(lengthButtonApp.getLayoutY()+heightSize-heightSize/1.2);
            lengthButtonNeg.setPadding(new Insets(10, 10, 10, 10));
            lengthButtonNeg.getChildren().addAll(buttonPSneg);
            ROOT.getChildren().addAll(lengthButtonNeg);
        };
        runnable2.run();
        Runnable runnable3 = () -> {
            for (int i = 0; i < buttonPSques.length; i++) {
                buttonPSques[i] = new Button();
                buttonPSques[i].setText("Задание " + (i + 1));
                buttonPSques[i].setPrefWidth(widthSize-widthSize/1.07);
                buttonPSques[i].setPrefHeight(widthSize-widthSize/1.03);
                int finalI = i;
                buttonPSques[i].setOnAction(event -> {
                    radioBut();
                    enBut.setOnAction(e ->
                    {
                        clearColumn();
                        ques[finalI].getLeftEn();
                        ques[finalI].getRightEn();
                    });
                    ruBut.setOnAction(e ->
                    {
                        clearColumn();
                        ques[finalI].getLeftRu();
                        ques[finalI].getRightRu();
                    });
                    exit.setOnAction(e -> methodClearExercise(m));
                    ques[finalI].getLeftEn();
                    ques[finalI].getRightEn();
                    removeBut();
                    lengthButtonApp.getChildren().removeAll(buttonPSapp);
                    lengthButtonNeg.getChildren().removeAll(buttonPSneg);
                    lengthButtonQues.getChildren().removeAll(buttonPSques);
                });
            }
//          lengthButtonQues.setStyle("-fx-border-color: RED");
            lengthButtonQues.setSpacing(widthSize-widthSize/1.03);
            lengthButtonQues.setPrefWidth((buttonPSques[0].getPrefWidth()+lengthButtonQues.getSpacing())*buttonPSques.length);
            lengthButtonQues.setLayoutX(widthSize/2-((lengthButtonQues.getPrefWidth())/2));
            lengthButtonQues.setLayoutY(lengthButtonNeg.getLayoutY()+heightSize-heightSize/1.2);
            lengthButtonQues.setPadding(new Insets(10, 10, 10, 10));
            lengthButtonQues.getChildren().addAll(buttonPSques);
            ROOT.getChildren().addAll(lengthButtonQues);
        };
        runnable3.run();
    }
    public void examMethod(final FillingColumns[] exam, final Button[] buttonPSexam, String m){
        Runnable runExamLab = () -> {
            psExam.setText("Контрольные работы");
//                psQues.setStyle("-fx-border-color: RED");
            psExam.setPrefWidth(widthSize-widthSize/1.25);
            psExam.setAlignment(Pos.CENTER);
            psExam.setFont(EffectFont.fontTitle);
            psExam.setTextFill(EffectColor.colorTitle);
            psExam.setLayoutX((widthSize/2)-(widthSize-widthSize/1.25)/2);
            psExam.setLayoutY(heightSize-heightSize/1.15);
            ROOT.getChildren().add(psExam);
        };
        runExamLab.run();
        Runnable runnable4 = () -> {
            for (int i = 0; i < buttonPSexam.length; i++) {
                buttonPSexam[i] = new Button();
                buttonPSexam[i].setText("Часть №" + (i + 1));
                buttonPSexam[i].setPrefWidth(widthSize-widthSize/1.06);
                buttonPSexam[i].setPrefHeight(widthSize-widthSize/1.03);
                int finalI = i;
                buttonPSexam[i].setOnAction(event -> {

                    groupRadBut.getChildren().addAll(exit);
                    groupRadBut.setSpacing(widthSize-widthSize/1.03);
//                            groupRadBut.setStyle("-fx-border-color: RED");
                    groupRadBut.setPadding(new Insets(10, 10, 10, 10));
                    groupRadBut.setLayoutX(widthSize-widthSize/2.8);
                    groupRadBut.setLayoutY(heightSize-heightSize/1.09);
                    ROOT.getChildren().addAll(groupRadBut);
                    exit.setOnAction(e -> methodClearExam(m));
                    exam[finalI].getExamList();
                    ROOT.getChildren().remove(lengthButtonExam);
                    ROOT.getChildren().removeAll(psExam);
                    lengthButtonExam.getChildren().removeAll(buttonPSexam);
                });
            }
//          lengthButtonQues.setStyle("-fx-border-color: RED");
            lengthButtonExam.setSpacing(widthSize-widthSize/1.03);
            lengthButtonExam.setPrefWidth((buttonPSexam[0].getPrefWidth()+lengthButtonExam.getSpacing())*buttonPSexam.length);
            lengthButtonExam.setLayoutX(widthSize/2-((lengthButtonExam.getPrefWidth())/2));
            lengthButtonExam.setLayoutY(lengthButtonQues.getLayoutY()+heightSize-heightSize/1.2);
            lengthButtonExam.setPadding(new Insets(10, 10, 10, 10));
            lengthButtonExam.getChildren().addAll(buttonPSexam);
            ROOT.getChildren().addAll(lengthButtonExam);
        };
        runnable4.run();
    }

    private void radioBut(){
        enBut.setToggleGroup(group);
        enBut.setSelected(true);
        ruBut.setToggleGroup(group);
        groupRadBut.getChildren().addAll(enBut, ruBut, exit);
        groupRadBut.setSpacing(widthSize-widthSize/1.03);
//                  groupRadBut.setStyle("-fx-border-color: RED");
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
        ROOT.getChildren().removeAll(psApp, psNeg, psQues, psExam);
    }
    private void methodAppNegQues(){
        Runnable runAppLab = () -> {
            psApp.setText("Утверждения");
//                psApp.setStyle("-fx-border-color: RED");
            psApp.setPrefWidth(widthSize-widthSize/1.25);
            psApp.setAlignment(Pos.CENTER);
            psApp.setFont(EffectFont.fontTitle);
            psApp.setTextFill(EffectColor.colorTitle);
            psApp.setLayoutX((widthSize/2)-(widthSize-widthSize/1.25)/2);
            psApp.setLayoutY(heightSize-heightSize/1.15);
            ROOT.getChildren().add(psApp);
        };
        runAppLab.run();
        Runnable runNegLab = () -> {
            psNeg.setText("Отрицания");
//                psNeg.setStyle("-fx-border-color: RED");
            psNeg.setPrefWidth(widthSize-widthSize/1.25);
            psNeg.setAlignment(Pos.CENTER);
            psNeg.setFont(EffectFont.fontTitle);
            psNeg.setTextFill(EffectColor.colorTitle);
            psNeg.setLayoutX((widthSize/2)-(widthSize-widthSize/1.25)/2);
            psNeg.setLayoutY(psApp.getLayoutY()+heightSize-heightSize/1.2);
            ROOT.getChildren().add(psNeg);
        };
        runNegLab.run();
        Runnable runQuesLab = () -> {
            psQues.setText("Вопросительные предложения");
//                psQues.setStyle("-fx-border-color: RED");
            psQues.setPrefWidth(widthSize-widthSize/1.25);
            psQues.setAlignment(Pos.CENTER);
            psQues.setFont(EffectFont.fontTitle);
            psQues.setTextFill(EffectColor.colorTitle);
            psQues.setLayoutX((widthSize/2)-(widthSize-widthSize/1.25)/2);
            psQues.setLayoutY(psNeg.getLayoutY()+heightSize-heightSize/1.2);
            ROOT.getChildren().add(psQues);
        };
        runQuesLab.run();
    }
}