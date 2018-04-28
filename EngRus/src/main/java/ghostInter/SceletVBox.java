package ghostInter;

import ghostInter.dataBase.StringFiles;
import ghostInter.interfaceRoot.EffectColor;
import ghostInter.interfaceRoot.EffectFont;
import ghostInter.interfaceRoot.Root;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private Label[] number;
    private Label[] correctly;

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
    public SceletVBox(Label[] arrayOfOffersLeft,
                      String[] arrayStrEn, String[] arrayStrRu, String fileEn, String fileRu, Label[] number, Label[] correctly)
    {
        this.arrayOfOffersLeft = arrayOfOffersLeft;
        this.arrayStrEn = arrayStrEn;
        this.arrayStrRu = arrayStrRu;
        this.fileEn = fileEn;
        this.fileRu = fileRu;
        this.number = number;
        this.correctly = correctly;
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
    public void getExamC(){
        getExamColummLab();
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
                        arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.45);
                        arrayOfOffersLeft[i].setWrapText(true);
                        arrayOfOffersLeft[i].setText(addLabStr()[i]);
                        int finalI = i;
                        int finalI1 = i;
                        arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                            try {
                                if (arrayOfOffersLeft[finalI].getText().equals(addLabStr()[finalI1])){
                                    arrayOfOffersLeft[finalI].setText(addLabStrRu()[finalI1]);
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
                leftColumm.setLayoutX(widthSize/6);
                leftColumm.setLayoutY(heightSize-heightSize/1.12);
                leftColumm.setPadding(new Insets(0, 0, 0, 0));
                leftColumm.setPrefSize(widthSize/3.2, heightSize/1.25);
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
                        arrayOfOffersRight[i].setPrefWidth(widthSize-widthSize/1.45);
                        arrayOfOffersRight[i].setWrapText(true);
                        arrayOfOffersRight[i].setText(addLabStr()[i+a]);
                        int finalI = i;
                        int finalI1 = i;
                        int finalA = a;
                        arrayOfOffersRight[i].setOnMouseClicked(event -> {
                            try {
                                if (arrayOfOffersRight[finalI].getText().equals(addLabStr()[finalI1+ finalA])){
                                    arrayOfOffersRight[finalI].setText(addLabStrRu()[finalI1+ finalA]);
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
                rightColumm.setLayoutX(widthSize/1.9);
                rightColumm.setLayoutY(heightSize-heightSize/1.12);
                rightColumm.setSpacing(heightSize-heightSize/1.009);
                rightColumm.setPadding(new Insets(0, 0, 0, 0));
                rightColumm.setPrefSize(widthSize/3.2, heightSize/1.25);
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
                        arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.45);
                        arrayOfOffersLeft[i].setWrapText(true);
                        arrayOfOffersLeft[i].setText(addLabStrRu()[i]);
                        int finalI = i;
                        int finalI1 = i;
                        arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                            try {
                                if (arrayOfOffersLeft[finalI].getText().equals(addLabStrRu()[finalI1])){
                                    arrayOfOffersLeft[finalI].setText(addLabStr()[finalI1]);
                                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClic);
                                } else {
                                    try {
                                        arrayOfOffersLeft[finalI].setText(addLabStrRu()[finalI1]);
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
                leftColumm.setLayoutX(widthSize/6);
                leftColumm.setLayoutY(heightSize-heightSize/1.12);
                leftColumm.setPadding(new Insets(0, 0, 0, 0));
                leftColumm.setPrefSize(widthSize/3.2, heightSize/1.25);
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
                        arrayOfOffersRight[i].setPrefWidth(widthSize-widthSize/1.45);
                        arrayOfOffersRight[i].setWrapText(true);
                        arrayOfOffersRight[i].setText(addLabStrRu()[i+a]);
                        int finalI = i;
                        int finalI1 = i;
                        int finalA = a;
                        arrayOfOffersRight[i].setOnMouseClicked(event -> {
                            try {
                                if (arrayOfOffersRight[finalI].getText().equals(addLabStrRu()[finalI1+ finalA])){
                                    arrayOfOffersRight[finalI].setText(addLabStr()[finalI1+ finalA]);
                                    arrayOfOffersRight[finalI].setTextFill(EffectColor.colorTextClic);
                                } else {
                                    try {
                                        arrayOfOffersRight[finalI].setText(addLabStrRu()[finalI1+ finalA]);
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
                rightColumm.setLayoutX(widthSize/1.9);
                rightColumm.setLayoutY(heightSize-heightSize/1.12);
                rightColumm.setSpacing(heightSize-heightSize/1.009);
                rightColumm.setPadding(new Insets(0, 0, 0, 0));
                rightColumm.setPrefSize(widthSize/3.2, heightSize/1.25);
                rightColumm.getChildren().addAll(arrayOfOffersRight);
                ROOT.getChildren().addAll(rightColumm);
            }
        };
        runnable2.run();
    }
    private void getExamColummLab() {
        Runnable runnable1 = new Runnable()
        {
            @Override
            public void run() {
                for (int i = 0; i < arrayOfOffersLeft.length; i++) {
                    arrayOfOffersLeft[i] = new Label();
                    try {
                        arrayOfOffersLeft[i].setFont(EffectFont.fontTextExam);
                        arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersLeft[i].setStyle("-fx-border-color: RED");
                        arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/2.45);
                        arrayOfOffersLeft[i].setWrapText(true);
                        arrayOfOffersLeft[i].setText(addLabStr()[i]);

                        correctly[i] = new Label();
                        correctly[i].setFont(EffectFont.fontTextExam);
//                    correctly[i].setTextFill(EffectColor.colorText);
//                        correctly[i].setStyle("-fx-border-color: RED");
                        correctly[i].setPrefWidth(widthSize-widthSize/1.45);
                        correctly[i].setAlignment(Pos.BASELINE_RIGHT);

                        int finalI = i;
                        arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                            try {
                                if (improve.getText().equalsIgnoreCase(addLabStrRu()[finalI])){
                                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClic);
                                    correctly[finalI].setText("ВЕРНО!!!");
                                    correctly[finalI].setTextFill(EffectColor.colorTextClic);
                                } else {
                                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClicRED);
                                    correctly[finalI].setText("НЕ ВЕРНО!!!");
                                    correctly[finalI].setTextFill(EffectColor.colorTextClicRED);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 0; i < number.length; i++) {
                    number[i] = new Label();
                    number[i].setFont(EffectFont.fontTextExam);
                    number[i].setTextFill(EffectColor.colorTitle);
//                    number[i].setStyle("-fx-border-color: RED");
                    number[i].setPrefWidth(widthSize-widthSize/1.45);
                    number[i].setAlignment(Pos.CENTER);
                    number[i].setText("-"+(i+1)+"-");
                    int finalI = i;
                    int finalI1 = i;
                    number[i].setOnMouseClicked(ev -> {
                                try {
                                if (arrayOfOffersLeft[finalI].getText().equals(addLabStr()[finalI1])){
                                    arrayOfOffersLeft[finalI].setText(addLabStrRu()[finalI1]);
                                    arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextImpr);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
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
                leftColumm.getChildren().addAll(arrayOfOffersLeft);

                groupExam.setSpacing(heightSize-heightSize/1.009);
                groupExam.getChildren().addAll(numberColumm, leftColumm, iprColumm);

                examPane.setContent(groupExam);
//                examPane.setStyle("-fx-border-color: RED");
                examPane.setLayoutX(widthSize-widthSize/1.25);
                examPane.setLayoutY(heightSize-heightSize/1.16);
                examPane.setPrefSize(widthSize/1.8, heightSize/1.5);

                VBox vBox = new VBox();
                improve.setPrefWidth(widthSize/3);
                improveClick1.setAlignment(Pos.CENTER);
                improveClick1.setTextFill(EffectColor.colorTextClicPERU);
                vBox.getChildren().addAll(improveClick1, improve);
                vBox.setSpacing(heightSize-heightSize/1.009);
                vBox.setLayoutX(widthSize-widthSize/1.4);
                vBox.setLayoutY(heightSize-heightSize/1.05);

                ROOT.getChildren().addAll(examPane, vBox);
            }
        };
        runnable1.run();
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
    private String[] addLabStrRu() throws IOException {
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
