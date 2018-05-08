package ghostInter.controlToBe;

import ghostInter.interfaceRoot.EffectColor;
import ghostInter.interfaceRoot.EffectFont;
import ghostInter.interfaceRoot.MenuBarEngRus;
import ghostInter.interfaceRoot.Root;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class JobControlToBe implements Root
{
    private HBox lengthButtonApp = new HBox();
    private HBox lengthButtonNeg = new HBox();
    private HBox lengthButtonQues = new HBox();
    private HBox lengthButtonExam = new HBox();

    private ToggleGroup group = new ToggleGroup();
    private RadioButton enBut = new RadioButton("English");
    private RadioButton ruBut = new RadioButton("Русский");
    private RadioButton exit = new RadioButton("В меню");

    private Label tobeApp = new Label();
    private Label tobeNeg = new Label();
    private Label tobeQues = new Label();
    private Label tobeExam = new Label();

    public void exercise(final SceletVBoxToBe[] app, final SceletVBoxToBe[] neg, final SceletVBoxToBe[] ques,
                         final Button[] buttonToBeapp, final Button[] buttonToBeneg, final Button[] buttonToBeques)
    {
        Runnable runAppLab = () -> {
            tobeApp.setText("Утверждения");
//                tobeApp.setStyle("-fx-border-color: RED");
            tobeApp.setPrefWidth(widthSize-widthSize/1.25);
            tobeApp.setAlignment(Pos.CENTER);
            tobeApp.setFont(EffectFont.fontTitle);
            tobeApp.setTextFill(EffectColor.colorTitle);
            tobeApp.setLayoutX((widthSize/2)-(widthSize-widthSize/1.25)/2);
            tobeApp.setLayoutY(heightSize-heightSize/1.15);
            ROOT.getChildren().add(tobeApp);
        };
        runAppLab.run();
        Runnable runNegLab = () -> {
            tobeNeg.setText("Отрицания");
//                tobeNeg.setStyle("-fx-border-color: RED");
            tobeNeg.setPrefWidth(widthSize-widthSize/1.25);
            tobeNeg.setAlignment(Pos.CENTER);
            tobeNeg.setFont(EffectFont.fontTitle);
            tobeNeg.setTextFill(EffectColor.colorTitle);
            tobeNeg.setLayoutX((widthSize/2)-(widthSize-widthSize/1.25)/2);
            tobeNeg.setLayoutY(tobeApp.getLayoutY()+heightSize-heightSize/1.2);
            ROOT.getChildren().add(tobeNeg);
        };
        runNegLab.run();
        Runnable runQuesLab = () -> {
            tobeQues.setText("Вопросительные предложения");
//                tobeQues.setStyle("-fx-border-color: RED");
            tobeQues.setPrefWidth(widthSize-widthSize/1.25);
            tobeQues.setAlignment(Pos.CENTER);
            tobeQues.setFont(EffectFont.fontTitle);
            tobeQues.setTextFill(EffectColor.colorTitle);
            tobeQues.setLayoutX((widthSize/2)-(widthSize-widthSize/1.25)/2);
            tobeQues.setLayoutY(tobeNeg.getLayoutY()+heightSize-heightSize/1.2);
            ROOT.getChildren().add(tobeQues);
        };
        runQuesLab.run();

        Runnable runnable1 = () -> {
            for (int i = 0; i < buttonToBeapp.length; i++) {
                buttonToBeapp[i] = new Button();
                buttonToBeapp[i].setText("Задание " + (i+1));
                buttonToBeapp[i].setPrefWidth(widthSize-widthSize/1.07);
                buttonToBeapp[i].setPrefHeight(widthSize-widthSize/1.03);
                int finalI = i;
                buttonToBeapp[i].setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        enBut.setToggleGroup(group);
                        enBut.setSelected(true);
                        ruBut.setToggleGroup(group);
                        groupRadBut.getChildren().addAll(enBut, ruBut, exit);
                        groupRadBut.setSpacing(widthSize-widthSize/1.03);
//                            groupRadBut.setStyle("-fx-border-color: RED");
                        groupRadBut.setPadding(new Insets(10, 10, 10, 10));
                        groupRadBut.setLayoutX(widthSize-widthSize/1.5);
                        groupRadBut.setLayoutY(heightSize-heightSize/1.04);
                        ROOT.getChildren().addAll(groupRadBut);
                        enBut.setOnAction(e ->
                        {
                            leftColumm.getChildren().clear();
                            rightColumm.getChildren().clear();
                            ROOT.getChildren().clear();
                            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                            menuBarEngRus.getMenu();
                            ROOT.getChildren().addAll(groupRadBut);
                            app[finalI].getLeftEn();
                            app[finalI].getRightEn();
                        });
                        ruBut.setOnAction(e ->
                        {
                            leftColumm.getChildren().clear();
                            rightColumm.getChildren().clear();
                            ROOT.getChildren().clear();
                            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                            menuBarEngRus.getMenu();
                            ROOT.getChildren().addAll(groupRadBut);
                            app[finalI].getLeftRu();
                            app[finalI].getRightRu();
                        });
                        exit.setOnAction(e ->
                        {
                            leftColumm.getChildren().clear();
                            rightColumm.getChildren().clear();
                            groupRadBut.getChildren().clear();
                            ROOT.getChildren().clear();
                            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                            menuBarEngRus.getMenu();
                            AddButAndLabelToBe addButAndLabelToBe = new AddButAndLabelToBe();
                            addButAndLabelToBe.AddMenuButton();
                        });
                        app[finalI].getLeftEn();
                        app[finalI].getRightEn();
                        ROOT.getChildren().remove(lengthButtonApp);
                        ROOT.getChildren().remove(lengthButtonNeg);
                        ROOT.getChildren().remove(lengthButtonQues);
                        ROOT.getChildren().remove(lengthButtonExam);
                        ROOT.getChildren().removeAll(tobeApp, tobeNeg, tobeQues, tobeExam);
                        lengthButtonApp.getChildren().removeAll(buttonToBeapp);
                        lengthButtonNeg.getChildren().removeAll(buttonToBeneg);
                        lengthButtonQues.getChildren().removeAll(buttonToBeques);
//                            lengthButtonExam.getChildren().removeAll(buttonPSexam);

                    }
                });
            }
//                lengthButtonApp.setStyle("-fx-border-color: RED");
            lengthButtonApp.setSpacing(widthSize-widthSize/1.03);
            lengthButtonApp.setPrefWidth((buttonToBeapp[0].getPrefWidth()+lengthButtonApp.getSpacing())*buttonToBeapp.length);
            lengthButtonApp.setLayoutX(widthSize/2-((lengthButtonApp.getPrefWidth())/2));
            lengthButtonApp.setLayoutY(heightSize-heightSize/1.2);
            lengthButtonApp.setPadding(new Insets(10, 10, 10, 10));
            lengthButtonApp.getChildren().addAll(buttonToBeapp);
            ROOT.getChildren().addAll(lengthButtonApp);
        };
        runnable1.run();
        Runnable runnable2 = () -> {
            for (int i = 0; i < buttonToBeneg.length; i++) {
                buttonToBeneg[i] = new Button();
                buttonToBeneg[i].setText("Задание " + (i + 1));
                buttonToBeneg[i].setPrefWidth(widthSize-widthSize/1.07);
                buttonToBeneg[i].setPrefHeight(widthSize-widthSize/1.03);
                int finalI = i;
                buttonToBeneg[i].setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event) {

                        enBut.setToggleGroup(group);
                        enBut.setSelected(true);
                        ruBut.setToggleGroup(group);
                        groupRadBut.getChildren().addAll(enBut, ruBut, exit);
                        groupRadBut.setSpacing(widthSize-widthSize/1.03);
//                            groupRadBut.setStyle("-fx-border-color: RED");
                        groupRadBut.setPadding(new Insets(10, 10, 10, 10));
                        groupRadBut.setLayoutX(widthSize-widthSize/1.5);
                        groupRadBut.setLayoutY(heightSize-heightSize/1.04);
                        ROOT.getChildren().addAll(groupRadBut);
                        enBut.setOnAction(e ->
                        {
                            leftColumm.getChildren().clear();
                            rightColumm.getChildren().clear();
                            ROOT.getChildren().clear();
                            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                            menuBarEngRus.getMenu();
                            ROOT.getChildren().addAll(groupRadBut);
                            neg[finalI].getLeftEn();
                            neg[finalI].getRightEn();
                        });
                        ruBut.setOnAction(e ->
                        {
                            leftColumm.getChildren().clear();
                            rightColumm.getChildren().clear();
                            ROOT.getChildren().clear();
                            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                            menuBarEngRus.getMenu();
                            ROOT.getChildren().addAll(groupRadBut);
                            neg[finalI].getLeftRu();
                            neg[finalI].getRightRu();
                        });
                        exit.setOnAction(e ->
                        {
                            leftColumm.getChildren().clear();
                            rightColumm.getChildren().clear();
                            groupRadBut.getChildren().clear();
                            ROOT.getChildren().clear();
                            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                            menuBarEngRus.getMenu();
                            AddButAndLabelToBe addButAndLabelToBe = new AddButAndLabelToBe();
                            addButAndLabelToBe.AddMenuButton();
                        });
                        neg[finalI].getLeftEn();
                        neg[finalI].getRightEn();
                        ROOT.getChildren().remove(lengthButtonApp);
                        ROOT.getChildren().remove(lengthButtonNeg);
                        ROOT.getChildren().remove(lengthButtonQues);
                        ROOT.getChildren().remove(lengthButtonExam);
                        ROOT.getChildren().removeAll(tobeApp, tobeNeg, tobeQues, tobeExam);
                        lengthButtonApp.getChildren().removeAll(buttonToBeapp);
                        lengthButtonNeg.getChildren().removeAll(buttonToBeneg);
                        lengthButtonQues.getChildren().removeAll(buttonToBeques);
//                            lengthButtonExam.getChildren().removeAll(buttonPSexam);

                    }
                });
            }
//                lengthButtonNeg.setStyle("-fx-border-color: RED");
            lengthButtonNeg.setSpacing(widthSize-widthSize/1.03);
            lengthButtonNeg.setPrefWidth((buttonToBeneg[0].getPrefWidth()+lengthButtonNeg.getSpacing())*buttonToBeneg.length);
            lengthButtonNeg.setLayoutX(widthSize/2-((lengthButtonNeg.getPrefWidth())/2));
            lengthButtonNeg.setLayoutY(lengthButtonApp.getLayoutY()+heightSize-heightSize/1.2);
            lengthButtonNeg.setPadding(new Insets(10, 10, 10, 10));
            lengthButtonNeg.getChildren().addAll(buttonToBeneg);
            ROOT.getChildren().addAll(lengthButtonNeg);
        };
        runnable2.run();
        Runnable runnable3 = () -> {
            for (int i = 0; i < buttonToBeques.length; i++) {
                buttonToBeques[i] = new Button();
                buttonToBeques[i].setText("Задание " + (i + 1));
                buttonToBeques[i].setPrefWidth(widthSize-widthSize/1.07);
                buttonToBeques[i].setPrefHeight(widthSize-widthSize/1.03);
                int finalI = i;
                buttonToBeques[i].setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event) {

                        enBut.setToggleGroup(group);
                        enBut.setSelected(true);
                        ruBut.setToggleGroup(group);
                        groupRadBut.getChildren().addAll(enBut, ruBut, exit);
                        groupRadBut.setSpacing(widthSize-widthSize/1.03);
//                            groupRadBut.setStyle("-fx-border-color: RED");
                        groupRadBut.setPadding(new Insets(10, 10, 10, 10));
                        groupRadBut.setLayoutX(widthSize-widthSize/1.5);
                        groupRadBut.setLayoutY(heightSize-heightSize/1.04);
                        ROOT.getChildren().addAll(groupRadBut);
                        enBut.setOnAction(e ->
                        {
                            leftColumm.getChildren().clear();
                            rightColumm.getChildren().clear();
                            ROOT.getChildren().clear();
                            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                            menuBarEngRus.getMenu();
                            ROOT.getChildren().addAll(groupRadBut);
                            ques[finalI].getLeftEn();
                            ques[finalI].getRightEn();
                        });
                        ruBut.setOnAction(e ->
                        {
                            leftColumm.getChildren().clear();
                            rightColumm.getChildren().clear();
                            ROOT.getChildren().clear();
                            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                            menuBarEngRus.getMenu();
                            ROOT.getChildren().addAll(groupRadBut);
                            ques[finalI].getLeftRu();
                            ques[finalI].getRightRu();
                        });
                        exit.setOnAction(e ->
                        {
                            leftColumm.getChildren().clear();
                            rightColumm.getChildren().clear();
                            groupRadBut.getChildren().clear();
                            ROOT.getChildren().clear();
                            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                            menuBarEngRus.getMenu();
                            AddButAndLabelToBe addButAndLabelToBe = new AddButAndLabelToBe();
                            addButAndLabelToBe.AddMenuButton();
                        });
                        ques[finalI].getLeftEn();
                        ques[finalI].getRightEn();
                        ROOT.getChildren().remove(lengthButtonApp);
                        ROOT.getChildren().remove(lengthButtonNeg);
                        ROOT.getChildren().remove(lengthButtonQues);
                        ROOT.getChildren().remove(lengthButtonExam);
                        ROOT.getChildren().removeAll(tobeApp, tobeNeg, tobeQues, tobeExam);
                        lengthButtonApp.getChildren().removeAll(buttonToBeapp);
                        lengthButtonNeg.getChildren().removeAll(buttonToBeneg);
                        lengthButtonQues.getChildren().removeAll(buttonToBeques);
//                            lengthButtonExam.getChildren().removeAll(buttonPSexam);

                    }
                });
            }
//                lengthButtonQues.setStyle("-fx-border-color: RED");
            lengthButtonQues.setSpacing(widthSize-widthSize/1.03);
            lengthButtonQues.setPrefWidth((buttonToBeques[0].getPrefWidth()+lengthButtonQues.getSpacing())*buttonToBeques.length);
            lengthButtonQues.setLayoutX(widthSize/2-((lengthButtonQues.getPrefWidth())/2));
            lengthButtonQues.setLayoutY(lengthButtonNeg.getLayoutY()+heightSize-heightSize/1.2);
            lengthButtonQues.setPadding(new Insets(10, 10, 10, 10));
            lengthButtonQues.getChildren().addAll(buttonToBeques);
            ROOT.getChildren().addAll(lengthButtonQues);
        };
        runnable3.run();
    }
    public void examMethod(final SceletVBoxToBe[] exam, final Button[] buttonPSexam){
        Runnable runExamLab = () -> {
            tobeExam.setText("Контрольные работы");
//                tobeQues.setStyle("-fx-border-color: RED");
            tobeExam.setPrefWidth(widthSize-widthSize/1.25);
            tobeExam.setAlignment(Pos.CENTER);
            tobeExam.setFont(EffectFont.fontTitle);
            tobeExam.setTextFill(EffectColor.colorTitle);
            tobeExam.setLayoutX((widthSize/2)-(widthSize-widthSize/1.25)/2);
            tobeExam.setLayoutY(heightSize-heightSize/1.15);
            ROOT.getChildren().add(tobeExam);
        };
        runExamLab.run();
        Runnable runnable4 = () -> {
            for (int i = 0; i < buttonPSexam.length; i++) {
                buttonPSexam[i] = new Button();
                buttonPSexam[i].setText("Часть №" + (i + 1));
                buttonPSexam[i].setPrefWidth(widthSize-widthSize/1.06);
                buttonPSexam[i].setPrefHeight(widthSize-widthSize/1.03);
                int finalI = i;
                buttonPSexam[i].setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event) {

                        groupRadBut.getChildren().addAll(exit);
                        groupRadBut.setSpacing(widthSize-widthSize/1.03);
//                            groupRadBut.setStyle("-fx-border-color: RED");
                        groupRadBut.setPadding(new Insets(10, 10, 10, 10));
                        groupRadBut.setLayoutX(widthSize-widthSize/2.8);
                        groupRadBut.setLayoutY(heightSize-heightSize/1.09);
                        ROOT.getChildren().addAll(groupRadBut);
                        exit.setOnAction(e ->
                        {
                            clearMethod();
                            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                            menuBarEngRus.getMenu();
                            AddButAndLabelToBe addButAndLabelToBe = new AddButAndLabelToBe();
                            addButAndLabelToBe.AddMenuButtonExamToBe();
                        });

                        ///////////////////////
                        //Временная заставка:
                        exam[finalI].getExamList();
                        Label labelWW = new Label("В разработке...");
                        labelWW.setFont(Font.font("Time New Roman", FontWeight.BOLD,
                                FontPosture.ITALIC, heightSize*0.05));
                        labelWW.setLayoutX(widthSize-widthSize/1.03);
                        labelWW.setLayoutY(heightSize-heightSize/1.08);
                        ROOT.getChildren().add(labelWW);

                        ROOT.getChildren().remove(lengthButtonExam);
                        ROOT.getChildren().removeAll(/*tobeApp, tobeNeg, tobeQues, */tobeExam);
                        lengthButtonExam.getChildren().removeAll(buttonPSexam);
                    }
                });
            }
//                lengthButtonQues.setStyle("-fx-border-color: RED");
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
}
