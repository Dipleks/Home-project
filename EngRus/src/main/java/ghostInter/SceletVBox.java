package ghostInter;

import ghostInter.dataBase.StringFiles;
import ghostInter.interfaceRoot.EffectColor;
import ghostInter.interfaceRoot.EffectFont;
import ghostInter.interfaceRoot.Root;
import javafx.geometry.Insets;
import javafx.scene.control.Label;

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

    private void getLeftColummLab() {
        Thread thread1 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                for (int i = 0; i < arrayOfOffersLeft.length; i++) {
                    arrayOfOffersLeft[i] = new Label();
                    try {
                        arrayOfOffersLeft[i].setFont(EffectFont.fontText);
                        arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
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
                leftColumm.setLayoutX(widthSize-widthSize/1.24);
                leftColumm.setLayoutY(heightSize-heightSize/1.08);
                leftColumm.setSpacing(heightSize-heightSize/1.01);
                leftColumm.setPadding(new Insets(0, 0, 0, 0));
                leftColumm.setPrefSize(widthSize/3, heightSize/1.25);
                leftColumm.getChildren().addAll(arrayOfOffersLeft);
                ROOT.getChildren().addAll(leftColumm);
            }
        });
        thread1.run();
    }
    ///////////////////////
    private void getRightColummLab() {
        Thread thread2 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                int a = 15;
                for (int i = 0; i < arrayOfOffersRight.length; i++) {
                    arrayOfOffersRight[i] = new Label();
//                    label1[i].setText(map.get(i));
                    try {
                        arrayOfOffersRight[i].setFont(EffectFont.fontText);
                        arrayOfOffersRight[i].setTextFill(EffectColor.colorText);
                        arrayOfOffersRight[i].setText(addLabStr()[i+a]);
                        int finalI = i;
                        int finalI1 = i;
                        arrayOfOffersRight[i].setOnMouseClicked(event -> {
                            try {
                                if (arrayOfOffersRight[finalI].getText().equals(addLabStr()[finalI1+a])){
                                    arrayOfOffersRight[finalI].setText(addLabStr1()[finalI1+a]);
                                    arrayOfOffersRight[finalI].setTextFill(EffectColor.colorTextClic);
                                } else {
                                    try {
                                        arrayOfOffersRight[finalI].setText(addLabStr()[finalI1+a]);
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
                rightColumm.setLayoutX(widthSize-widthSize/2.24);
                rightColumm.setLayoutY(heightSize-heightSize/1.08);
                rightColumm.setSpacing(heightSize-heightSize/1.01);
                rightColumm.setPadding(new Insets(0, 0, 0, 0));
                rightColumm.setPrefSize(widthSize/3, heightSize/1.25);
                rightColumm.getChildren().addAll(arrayOfOffersRight);
                ROOT.getChildren().addAll(rightColumm);
            }
        });
        thread2.run();
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
