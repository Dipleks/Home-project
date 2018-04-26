package ghostInter.interfaceRoot.buttonPS;

import ghostInter.SceletVBox;
import ghostInter.dataBase.StringFiles;
import ghostInter.interfaceRoot.Root;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class JobControl implements Root, StringFiles
{
    private HBox lengthButtonApp = new HBox();
    private HBox lengthButtonNeg = new HBox();
    private HBox lengthButtonQues = new HBox();

    public void exercise1(final SceletVBox[] app, final SceletVBox[] neg, final SceletVBox[] ques,
                          final Button[] buttonPSapp, final Button[] buttonPSneg, final Button[] buttonPSques)
    {
//        Runnable runnable1 = new Runnable()
//        {
//            @Override
//            public void run() {
                for (int i = 0; i < buttonPSapp.length; i++) {
                    buttonPSapp[i] = new Button();
                    buttonPSapp[i].setText("Задание " + (i+1));
                    buttonPSapp[i].setPrefWidth(widthSize-widthSize/1.07);
                    buttonPSapp[i].setPrefHeight(widthSize-widthSize/1.03);
                    int finalI = i;
                    buttonPSapp[i].setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
//                            leftColumm.getChildren().clear();
//                            rightColumm.getChildren().clear();
                            app[finalI].getLeft();
                            app[finalI].getRight();
                            ROOT.getChildren().remove(lengthButtonApp);
                            ROOT.getChildren().remove(lengthButtonNeg);
                            ROOT.getChildren().remove(lengthButtonQues);
                            lengthButtonApp.getChildren().removeAll(buttonPSapp);
                            lengthButtonNeg.getChildren().removeAll(buttonPSneg);
                            lengthButtonQues.getChildren().removeAll(buttonPSques);
                        }
                    });
                }
                lengthButtonApp.setStyle("-fx-border-color: RED");
                lengthButtonApp.setSpacing(widthSize-widthSize/1.03);
                lengthButtonApp.setPrefWidth((buttonPSapp[0].getPrefWidth()+lengthButtonApp.getSpacing())*buttonPSapp.length);
                lengthButtonApp.setLayoutX(widthSize/2-((lengthButtonApp.getPrefWidth())/2));
                lengthButtonApp.setLayoutY(heightSize-heightSize/1.2);
                lengthButtonApp.setPadding(new Insets(10, 10, 10, 10));
                lengthButtonApp.getChildren().addAll(buttonPSapp);

                ROOT.getChildren().addAll(lengthButtonApp);
//            }
//        };
//        runnable1.run();
//
//        Runnable runnable2 = new Runnable()
//        {
//            @Override
//            public void run() {
                for (int i = 0; i < buttonPSneg.length; i++) {
                    buttonPSneg[i] = new Button();
                    buttonPSneg[i].setText("Задание " + (i + 1));
                    buttonPSneg[i].setPrefWidth(widthSize-widthSize/1.07);
                    buttonPSneg[i].setPrefHeight(widthSize-widthSize/1.03);
                    int finalI = i;
                    buttonPSneg[i].setOnAction(new EventHandler<ActionEvent>()
                    {
                        @Override
                        public void handle(ActionEvent event) {
//                            leftColumm.getChildren().clear();
//                            rightColumm.getChildren().clear();
                            neg[finalI].getLeft();
                            neg[finalI].getRight();
                            ROOT.getChildren().remove(lengthButtonApp);
                            ROOT.getChildren().remove(lengthButtonNeg);
                            ROOT.getChildren().remove(lengthButtonQues);
                            lengthButtonApp.getChildren().removeAll(buttonPSapp);
                            lengthButtonNeg.getChildren().removeAll(buttonPSneg);
                            lengthButtonQues.getChildren().removeAll(buttonPSques);
                        }
                    });
                }
                lengthButtonNeg.setStyle("-fx-border-color: RED");
                lengthButtonNeg.setSpacing(widthSize-widthSize/1.03);
                lengthButtonNeg.setPrefWidth((buttonPSneg[0].getPrefWidth()+lengthButtonNeg.getSpacing())*buttonPSneg.length);
                lengthButtonNeg.setLayoutX(widthSize/2-((lengthButtonNeg.getPrefWidth())/2));
                lengthButtonNeg.setLayoutY(lengthButtonApp.getLayoutY()+widthSize-widthSize/1.08);
                lengthButtonNeg.setPadding(new Insets(10, 10, 10, 10));
                lengthButtonNeg.getChildren().addAll(buttonPSneg);
                ROOT.getChildren().addAll(lengthButtonNeg);
//            }
//        };
//        runnable2.run();
//
//        Runnable runnable3 = new Runnable()
//        {
//            @Override
//            public void run() {
                for (int i = 0; i < buttonPSques.length; i++) {
                    buttonPSques[i] = new Button();
                    buttonPSques[i].setText("Задание " + (i + 1));
                    buttonPSques[i].setPrefWidth(widthSize-widthSize/1.07);
                    buttonPSques[i].setPrefHeight(widthSize-widthSize/1.03);
                    int finalI = i;
                    buttonPSques[i].setOnAction(new EventHandler<ActionEvent>()
                    {
                        @Override
                        public void handle(ActionEvent event) {
//                            leftColumm.getChildren().clear();
//                            rightColumm.getChildren().clear();
                            ques[finalI].getLeft();
                            ques[finalI].getRight();
                            ROOT.getChildren().remove(lengthButtonApp);
                            ROOT.getChildren().remove(lengthButtonNeg);
                            ROOT.getChildren().remove(lengthButtonQues);
                            lengthButtonApp.getChildren().removeAll(buttonPSapp);
                            lengthButtonNeg.getChildren().removeAll(buttonPSneg);
                            lengthButtonQues.getChildren().removeAll(buttonPSques);
                        }
                    });
                }
                lengthButtonQues.setStyle("-fx-border-color: RED");
                lengthButtonQues.setSpacing(widthSize-widthSize/1.03);
                lengthButtonQues.setPrefWidth((buttonPSques[0].getPrefWidth()+lengthButtonQues.getSpacing())*buttonPSques.length);
                lengthButtonQues.setLayoutX(widthSize/2-((lengthButtonQues.getPrefWidth())/2));
                lengthButtonQues.setLayoutY(lengthButtonNeg.getLayoutY()+widthSize-widthSize/1.08);
                lengthButtonQues.setPadding(new Insets(10, 10, 10, 10));
                lengthButtonQues.getChildren().addAll(buttonPSques);
                ROOT.getChildren().addAll(lengthButtonQues);
//            }
//        };
//        runnable3.run();
    }
}
