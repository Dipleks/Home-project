package ghostInter.control;

import db.TableDB;
import ghostInter.interfaceRoot.EffectColor;
import ghostInter.interfaceRoot.EffectFont;
import ghostInter.interfaceRoot.Root;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.sql.*;

public class FillingColumns implements Root, TableDB
{
    private Label[] arrayOfOffersLeft;
    private Label[] arrayOfOffersRight;
    private Label[] arrayOfOffersExam;
    private Label[] number;
    private Label[] correctly;
    private int START;
    private int CLOSE;
    private String m;

    private Label[] my_word_en = new Label[500];
    private Label[] my_word_ru = new Label[500];

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
    public FillingColumns(Label[] arrayOfOffersLeft, Label[] arrayOfOffersRight, int START, int CLOSE, String m) {
        //Для заданий
        this.arrayOfOffersLeft = arrayOfOffersLeft;
        this.arrayOfOffersRight = arrayOfOffersRight;
        this.START = START;
        this.CLOSE = CLOSE;
        this.m = m;
    }
    public FillingColumns(Label[] arrayOfOffersExam, Label[] number, Label[] correctly, int START, String m) {
        //Для контрольных
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
        Runnable runnable1 = () -> {
            for (int i = 0; i < arrayOfOffersLeft.length; i++) {
                arrayOfOffersLeft[i] = new Label();
                arrayOfOffersLeft[i].setFont(EffectFont.fontText);
                arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
//              arrayOfOffersLeft[i].setStyle("-fx-border-color: RED");
                arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.45);
                arrayOfOffersLeft[i].setWrapText(true);
                arrayOfOffersLeft[i].setText(methEn(i, START));

                int finalI = i;
                arrayOfOffersLeft[i].setCursor(Cursor.HAND);
                arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                    Runnable r = this::soundClick;
                    r.run();
                    if (arrayOfOffersLeft[finalI].getText().equals(methEn(finalI, START))){
                        arrayOfOffersLeft[finalI].setText(methRu(finalI, START));
                        arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClick);
                    } else {
                        arrayOfOffersLeft[finalI].setText(methEn(finalI, START));
                        arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorText);
                    }
                });
            }
//          leftColumn.setStyle("-fx-border-color: RED");
            leftColumn.setSpacing(heightSize-heightSize/1.009);
            leftColumn.setLayoutX(widthSize/6);
            leftColumn.setLayoutY(heightSize-heightSize/1.12);
            leftColumn.setPadding(new Insets(0, 0, 0, 0));
            leftColumn.setPrefSize(widthSize/3.2, heightSize/1.25);
            leftColumn.getChildren().addAll(arrayOfOffersLeft);

            ROOT.getChildren().addAll(leftColumn);
        };
        runnable1.run();
    }
    private void getRightColumnLabEn() {
        Runnable runnable2 = () -> {
            for (int i = 0; i < arrayOfOffersRight.length; i++) {
                arrayOfOffersRight[i] = new Label();
                arrayOfOffersRight[i].setFont(EffectFont.fontText);
                arrayOfOffersRight[i].setTextFill(EffectColor.colorText);
//              arrayOfOffersRight[i].setStyle("-fx-border-color: RED");
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

//          rightColumn.setStyle("-fx-border-color: RED");
            rightColumn.setLayoutX(widthSize/1.9);
            rightColumn.setLayoutY(heightSize-heightSize/1.12);
            rightColumn.setSpacing(heightSize-heightSize/1.009);
            rightColumn.setPadding(new Insets(0, 0, 0, 0));
            rightColumn.setPrefSize(widthSize/3.2, heightSize/1.25);
            rightColumn.getChildren().addAll(arrayOfOffersRight);
            ROOT.getChildren().addAll(rightColumn);
        };
        runnable2.run();
    }
    private void getLeftColumnLabRu() {
        Runnable runnable1 = () -> {
            for (int i = 0; i < arrayOfOffersLeft.length; i++) {
                arrayOfOffersLeft[i] = new Label();
                arrayOfOffersLeft[i].setFont(EffectFont.fontText);
                arrayOfOffersLeft[i].setTextFill(EffectColor.colorText);
//              arrayOfOffersLeft[i].setStyle("-fx-border-color: RED");
                arrayOfOffersLeft[i].setPrefWidth(widthSize-widthSize/1.45);
                arrayOfOffersLeft[i].setWrapText(true);
                arrayOfOffersLeft[i].setText(methRu(i, START));
                int finalI = i;
                arrayOfOffersLeft[i].setCursor(Cursor.HAND);
                arrayOfOffersLeft[i].setOnMouseClicked(event -> {
                    Runnable r = this::soundClick;
                    r.run();
                    if (arrayOfOffersLeft[finalI].getText().equals(methRu(finalI, START))){
                        arrayOfOffersLeft[finalI].setText(methEn(finalI, START));
                        arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorTextClick);
                    } else {
                        arrayOfOffersLeft[finalI].setText(methRu(finalI, START));
                        arrayOfOffersLeft[finalI].setTextFill(EffectColor.colorText);
                    }
                });
            }

//          leftColumn.setStyle("-fx-border-color: RED");
            leftColumn.setSpacing(heightSize-heightSize/1.009);
            leftColumn.setLayoutX(widthSize/6);
            leftColumn.setLayoutY(heightSize-heightSize/1.12);
            leftColumn.setPadding(new Insets(0, 0, 0, 0));
            leftColumn.setPrefSize(widthSize/3.2, heightSize/1.25);
            leftColumn.getChildren().addAll(arrayOfOffersLeft);
            ROOT.getChildren().addAll(leftColumn);
        };
        runnable1.run();
    }
    private void getRightColumnLabRu() {
        Runnable runnable2 = () -> {
            for (int i = 0; i < arrayOfOffersRight.length; i++) {
                arrayOfOffersRight[i] = new Label();
                arrayOfOffersRight[i].setFont(EffectFont.fontText);
                arrayOfOffersRight[i].setTextFill(EffectColor.colorText);
//                        arrayOfOffersRight[i].setStyle("-fx-border-color: RED");
                arrayOfOffersRight[i].setPrefWidth(widthSize-widthSize/1.45);
                arrayOfOffersRight[i].setWrapText(true);
                arrayOfOffersRight[i].setText(methRu(i, CLOSE));
                int finalI = i;
                arrayOfOffersRight[i].setCursor(Cursor.HAND);
                arrayOfOffersRight[i].setOnMouseClicked(event -> {
                    Runnable r = this::soundClick;
                    r.run();
                    if (arrayOfOffersRight[finalI].getText().equals(methRu(finalI, CLOSE))){
                        arrayOfOffersRight[finalI].setText(methEn(finalI, CLOSE));
                        arrayOfOffersRight[finalI].setTextFill(EffectColor.colorTextClick);
                    } else {
                        arrayOfOffersRight[finalI].setText(methRu(finalI, CLOSE));
                        arrayOfOffersRight[finalI].setTextFill(EffectColor.colorText);
                    }
                });
            }

//                rightColumn.setStyle("-fx-border-color: RED");
            rightColumn.setLayoutX(widthSize/1.9);
            rightColumn.setLayoutY(heightSize-heightSize/1.12);
            rightColumn.setSpacing(heightSize-heightSize/1.009);
            rightColumn.setPadding(new Insets(0, 0, 0, 0));
            rightColumn.setPrefSize(widthSize/3.2, heightSize/1.25);
            rightColumn.getChildren().addAll(arrayOfOffersRight);
            ROOT.getChildren().addAll(rightColumn);
        };
        runnable2.run();
    }
    private void getExamColumnLab() {
        Runnable runnable1 = () -> {
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
                    Runnable r = this::soundClick;
                    r.run();
                    if (improve.getText().equalsIgnoreCase(methEn(finalI, START))){
                        arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextClick);
                        correctly[finalI].setText("ВЕРНО!!!");
                        correctly[finalI].setTextFill(EffectColor.colorTextClick);
                    } else {
                        arrayOfOffersExam[finalI].setTextFill(EffectColor.colorTextClickRED);
                        correctly[finalI].setText("НЕ ВЕРНО!!!");
                        correctly[finalI].setTextFill(EffectColor.colorTextClickRED);
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
                number[i].setCursor(Cursor.HAND);
                number[i].setText("-"+(i+1+START)+"-");
                int finalI = i;
                number[i].setOnMouseClicked(ev -> {
                    Runnable r = this::soundClick;
                    r.run();
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
//          examPane.setStyle("-fx-border-color: RED");
            examPane.setLayoutX(widthSize - widthSize / 1.25);
            examPane.setLayoutY(heightSize - heightSize / 1.16);
            examPane.setPrefSize(widthSize / 1.8, heightSize / 1.5);

            VBox vBox = new VBox();
            improve.setPrefWidth(widthSize/3);
            improveClick1.setAlignment(Pos.CENTER);
            improveClick1.setTextFill(EffectColor.colorTextClickPERU);
            vBox.getChildren().addAll(improveClick1, improve);
            vBox.setSpacing(heightSize-heightSize/1.009);
            vBox.setLayoutX(widthSize-widthSize/1.4);
            vBox.setLayoutY(heightSize-heightSize/1.05);

            ROOT.getChildren().addAll(examPane, vBox);
        };
        runnable1.run();
    }

    // Добавление Базы данных, меню "Мои слова":
    public void getMyWordsList(){
        getMyWordsColumnLab();
    }
    private void getMyWordsColumnLab() {
            Runnable runnable = () -> {
                restartMyWordsTable();

                rightC.getChildren().addAll();
                rightC.setSpacing(7);
                rightC.setPrefWidth(widthSize - widthSize / 1.3);
//                rightC.setStyle("-fx-border-color: RED");
                leftC.getChildren().addAll();
                leftC.setSpacing(7);
                leftC.setPadding(new Insets(0, 30, 0, 0));
                leftC.setPrefWidth(widthSize - widthSize / 1.3);
//                leftC.setStyle("-fx-border-color: RED");
                groupMy.setSpacing(20);
                groupMy.getChildren().addAll(leftC, rightC);

//                addElement.setStyle("-fx-border-color: RED");
                addElement.setLayoutX(widthSize - widthSize / 1.25);
                addElement.setLayoutY(heightSize - heightSize / 1.16);
                addElement.setPrefSize(widthSize / 1.8, heightSize / 1.5);
                addElement.setSpacing(10);

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
                searchWords.setOnAction(e -> {
                    try {
                        Connection connection =  DriverManager.getConnection(DB_URL + db, USER, PASS);
                        Statement statement1 = connection.createStatement();
                        Statement statement2 = connection.createStatement();
                        Statement statement3 = connection.createStatement();
                        ResultSet r1 = statement1.executeQuery("SELECT word_en FROM my_words");
                        for (int i = 0; r1.next(); i++) {
                            leftC.getChildren().remove(my_word_en[i]);
                            rightC.getChildren().remove(my_word_ru[i]);
                        }
                        ResultSet r2 = statement2.executeQuery("SELECT * FROM my_words WHERE word_en LIKE '%"+
                                textSearch.getText()+"%'");
                        ResultSet r3 = statement3.executeQuery("SELECT * FROM my_words WHERE word_ru LIKE '%"+
                                textSearch.getText()+"%'");
                        for (int i = 0; r2.next(); i++) {
                            my_word_en[i] = new Label();
                            my_word_en[i].setFont(EffectFont.fontTextExam);
                            my_word_en[i].setTextFill(EffectColor.colorText);
                            my_word_en[i].setPrefWidth(widthSize-widthSize/2.45);
//                            my_word_en[i].setWrapText(true);
//                            my_word_en[i].setCursor(Cursor.HAND);
                            my_word_en[i].setText(r2.getString("word_en"));

                            leftC.getChildren().addAll(my_word_en[i]);
                            rightC.getChildren().addAll(my_word_ru[i]);
                        }
                        r2.close();
                        for (int i = 0; r3.next(); i++) {
                            my_word_ru[i] = new Label();
                            my_word_ru[i].setFont(EffectFont.fontTextExam);
                            my_word_ru[i].setTextFill(EffectColor.colorText);
                            my_word_ru[i].setPrefWidth(widthSize-widthSize/2.45);
//                            my_word_ru[i].setWrapText(true);
//                            my_word_ru[i].setCursor(Cursor.HAND);
                            my_word_ru[i].setText(r3.getString("word_ru"));

                            leftC.getChildren().addAll(my_word_en[i]);
                            rightC.getChildren().addAll(my_word_ru[i]);
                        }
                        r3.close();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                });

                hBox.getChildren().addAll(textSearch, searchWords);
                hBox.setSpacing(heightSize-heightSize/1.009);
                hBox.setLayoutX(widthSize-widthSize/1.4);
                hBox.setLayoutY(heightSize-heightSize/1.05);

                ROOT.getChildren().addAll(addElement, hBox);
            };
            runnable.run();
    }
    private void addNewWords(){
        addWords.setOnAction(e -> {
            try {
                Connection connection1 =  DriverManager.getConnection(DB_URL + db, USER, PASS);
                Statement statement1 = connection1.createStatement();
                statement1.executeUpdate("INSERT INTO my_words (word_en, word_ru) VALUES ('" + textEn.getText()
                        +"', '"+ textRu.getText() +"')");
                ResultSet r = statement1.executeQuery("SELECT word_en FROM my_words");
                for (int i = 0; r.next(); i++) {
                    leftC.getChildren().remove(my_word_en[i]);
                    rightC.getChildren().remove(my_word_ru[i]);
                }
                restartMyWordsTable();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            textEn.clear();
            textRu.clear();
        });
    }
    private void restartMyWordsTable(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement stmt = connection.createStatement();
            Statement stmt2 = connection.createStatement();
            Statement stmt3 = connection.createStatement();
            stmt3.executeUpdate(my_words);
            ResultSet rs = stmt.executeQuery("SELECT word_en FROM my_words ORDER BY id;"); //sql запрос
            ResultSet rs2 = stmt2.executeQuery("SELECT word_ru FROM my_words ORDER BY id;"); //sql запрос

            addNewWords();

            for (int i = 0; rs.next(); i++) {
                rs2.next();
                my_word_en[i] = new Label();
//                my_word_en[i].setStyle("-fx-border-color: RED");
                my_word_en[i].setFont(EffectFont.fontTextExam);
                my_word_en[i].setTextFill(EffectColor.colorText);
                my_word_en[i].setPrefWidth(widthSize-widthSize/2.45);
                my_word_en[i].setAlignment(Pos.BASELINE_RIGHT);
//                my_word_en[i].setWrapText(true);
//                my_word_en[i].setCursor(Cursor.HAND);
                my_word_en[i].setText(rs.getString("word_en"));

                my_word_ru[i] = new Label();
//                my_word_ru[i].setStyle("-fx-border-color: RED");
                my_word_ru[i].setFont(EffectFont.fontTextExam);
                my_word_ru[i].setTextFill(EffectColor.colorText);
                my_word_ru[i].setPrefWidth(widthSize-widthSize/2.45);
//                my_word_ru[i].setWrapText(true);
//                my_word_ru[i].setCursor(Cursor.HAND);
                my_word_ru[i].setText(rs2.getString("word_ru"));
                if (my_word_ru[i].getText().length()>33) {
                    Tooltip tooltip = new Tooltip();
                    tooltip.setWrapText(true);
                    tooltip.setText(my_word_ru[i].getText());
                    tooltip.setPrefWidth(widthSize/5);
                    my_word_ru[i].setTooltip(tooltip);
                }
                //TODO создать действие по нажантию на правую кнопку мыши

                leftC.getChildren().addAll(my_word_en[i]);
                rightC.getChildren().addAll(my_word_ru[i]);
            }
            rs.close();
            rs2.close();
            stmt.close();
            stmt2.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
