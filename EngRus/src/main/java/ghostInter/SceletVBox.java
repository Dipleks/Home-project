package ghostInter;

import ghostInter.dataBase.StringFiles;
import ghostInter.interfaceRoot.EffectColor;
import ghostInter.interfaceRoot.EffectFont;
import ghostInter.interfaceRoot.MenuBarEngRus;
import ghostInter.interfaceRoot.Root;
import ghostInter.interfaceRoot.buttonPS.AddButAndLabel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.*;

public class SceletVBox implements Root, StringFiles
{
    private Label[] arrayOfOffersLeft;
    private Label[] arrayOfOffersRight;
    private String[] arrayStrEn;
    private String[] arrayStrRu;
    private String fileEn;
    private String fileRu;

    public SceletVBox(Label[] arrayOfOffersLeft, Label[] arrayOfOffersRight,
                      String[] arrayStrEn, String[] arrayStrRu, String fileEn, String fileRu)
    {
        this.arrayOfOffersLeft = arrayOfOffersLeft;
        this.arrayOfOffersRight = arrayOfOffersRight;
        this.arrayStrEn = arrayStrEn;
        this.arrayStrRu = arrayStrRu;
        this.fileEn = fileEn;
        this.fileRu = fileRu;
    }

    public void getLeft(){
        getLeftColummLab();
    }
    public void getRight(){
        getRightColummLab();
    }
    public void getLeft1(){
        getLeftColummLab1();
    }
    public void getRight1(){
        getRightColummLab1();
    }

    private void getLeftColummLab() {
        Runnable runnable1 = new Runnable()
        {
            @Override
            public void run() {
                for (int i = 0; i < arrayOfOffersLeft.length; i++) {
                    arrayOfOffersLeft[i] = new Label();
                    try {
                        arrayOfOffersLeft[i].setFont(EffectFont.fontText);
                        arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersLeft[i].setStyle("-fx-border-color: RED");
                        arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.65);
                        arrayOfOffersLeft[i].setText(addLabStr()[i]);
                        int finalI = i;
                        int finalI1 = i;
                        arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                            try {
                                if (arrayOfOffersLeft[finalI].getText().equals(addLabStr()[finalI1])){
                                    arrayOfOffersLeft[finalI].setText(addLabStr1()[finalI1]);
                                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClic);
                                } else {
                                    try {
                                        arrayOfOffersLeft[finalI].setText(addLabStr()[finalI1]);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorText);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//                leftColumm.setStyle("-fx-border-color: RED");
                leftColumm.setSpacing(heightSize-heightSize/1.009);
                leftColumm.setLayoutX(widthSize/10);
                leftColumm.setLayoutY(heightSize-heightSize/1.1);
                leftColumm.setPadding(new Insets(0, 0, 0, 0));
                leftColumm.setPrefSize(widthSize/2, heightSize/1.25);
                leftColumm.getChildren().addAll(arrayOfOffersLeft);

                ROOT.getChildren().addAll(leftColumm);
            }
        };
        runnable1.run();
    }
    private void getRightColummLab() {
        Runnable runnable2 = new Runnable()
        {
            @Override
            public void run() {
                int a = 0;
                try {
                    a = (int)Math.ceil(addLabStr().length/2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < arrayOfOffersRight.length; i++) {
                    arrayOfOffersRight[i] = new Label();
//                    label1[i].setText(map.get(i));
                    try {
                        arrayOfOffersRight[i].setFont(EffectFont.fontText);
                        arrayOfOffersRight[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersRight[i].setStyle("-fx-border-color: RED");
                        arrayOfOffersRight[i].setPrefWidth(widthSize-widthSize/1.65);
                        arrayOfOffersRight[i].setText(addLabStr()[i+a]);
                        int finalI = i;
                        int finalI1 = i;
                        int finalA = a;
                        arrayOfOffersRight[i].setOnMouseClicked(event -> {
                            try {
                                if (arrayOfOffersRight[finalI].getText().equals(addLabStr()[finalI1+ finalA])){
                                    arrayOfOffersRight[finalI].setText(addLabStr1()[finalI1+ finalA]);
                                    arrayOfOffersRight[finalI].setTextFill(EffectColor.colorTextClic);
                                } else {
                                    try {
                                        arrayOfOffersRight[finalI].setText(addLabStr()[finalI1+ finalA]);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    arrayOfOffersRight[finalI].setTextFill(EffectColor.colorText);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

//                rightColumm.setStyle("-fx-border-color: RED");
                rightColumm.setLayoutX(widthSize/1.8);
                rightColumm.setLayoutY(heightSize-heightSize/1.1);
                rightColumm.setSpacing(heightSize-heightSize/1.009);
                rightColumm.setPadding(new Insets(0, 0, 0, 0));
                rightColumm.setPrefSize(widthSize/2, heightSize/1.25);
                rightColumm.getChildren().addAll(arrayOfOffersRight);
                ROOT.getChildren().addAll(rightColumm);
            }
        };
        runnable2.run();
    }
    private void getLeftColummLab1() {

        Runnable runnable1 = new Runnable()
        {
            @Override
            public void run() {
                for (int i = 0; i < arrayOfOffersLeft.length; i++) {
                    arrayOfOffersLeft[i] = new Label();
                    try {
                        arrayOfOffersLeft[i].setFont(EffectFont.fontText);
                        arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersLeft[i].setStyle("-fx-border-color: RED");
                        arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.65);
                        arrayOfOffersLeft[i].setText(addLabStr1()[i]);
                        int finalI = i;
                        int finalI1 = i;
                        arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                            try {
                                if (arrayOfOffersLeft[finalI].getText().equals(addLabStr1()[finalI1])){
                                    arrayOfOffersLeft[finalI].setText(addLabStr()[finalI1]);
                                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClic);
                                } else {
                                    try {
                                        arrayOfOffersLeft[finalI].setText(addLabStr1()[finalI1]);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorText);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

//                leftColumm.setStyle("-fx-border-color: RED");
                leftColumm.setSpacing(heightSize-heightSize/1.009);
                leftColumm.setLayoutX(widthSize/10);
                leftColumm.setLayoutY(heightSize-heightSize/1.1);
                leftColumm.setPadding(new Insets(0, 0, 0, 0));
                leftColumm.setPrefSize(widthSize/2, heightSize/1.25);
                leftColumm.getChildren().addAll(arrayOfOffersLeft);
                ROOT.getChildren().addAll(leftColumm);
            }
        };
        runnable1.run();
    }
    private void getRightColummLab1() {
        Runnable runnable2 = new Runnable()
        {
            @Override
            public void run() {
                int a = 0;
                try {
                    a = (int)Math.ceil(addLabStr().length/2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < arrayOfOffersRight.length; i++) {
                    arrayOfOffersRight[i] = new Label();
                    try {
                        arrayOfOffersRight[i].setFont(EffectFont.fontText);
                        arrayOfOffersRight[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersRight[i].setStyle("-fx-border-color: RED");
                        arrayOfOffersRight[i].setPrefWidth(widthSize-widthSize/1.65);
                        arrayOfOffersRight[i].setText(addLabStr1()[i+a]);
                        int finalI = i;
                        int finalI1 = i;
                        int finalA = a;
                        arrayOfOffersRight[i].setOnMouseClicked(event -> {
                            try {
                                if (arrayOfOffersRight[finalI].getText().equals(addLabStr1()[finalI1+ finalA])){
                                    arrayOfOffersRight[finalI].setText(addLabStr()[finalI1+ finalA]);
                                    arrayOfOffersRight[finalI].setTextFill(EffectColor.colorTextClic);
                                } else {
                                    try {
                                        arrayOfOffersRight[finalI].setText(addLabStr1()[finalI1+ finalA]);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    arrayOfOffersRight[finalI].setTextFill(EffectColor.colorText);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

//                rightColumm.setStyle("-fx-border-color: RED");
                rightColumm.setLayoutX(widthSize/1.8);
                rightColumm.setLayoutY(heightSize-heightSize/1.1);
                rightColumm.setSpacing(heightSize-heightSize/1.009);
                rightColumm.setPadding(new Insets(0, 0, 0, 0));
                rightColumm.setPrefSize(widthSize/2, heightSize/1.25);
                rightColumm.getChildren().addAll(arrayOfOffersRight);
                ROOT.getChildren().addAll(rightColumm);
            }
        };
        runnable2.run();
    }

    private String[] addLabStr() throws IOException {
        File file = new File(fileEn);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        for (int i = 0; i < arrayStrEn.length; i++) {
            arrayStrEn[i] = br.readLine();
        }
        return arrayStrEn;
    }
    private String[] addLabStr1() throws IOException {
        File file = new File(fileRu);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        for (int i = 0; i < arrayStrRu.length; i++) {
            arrayStrRu[i] = br.readLine();
        }
        return arrayStrRu;
    }
}
