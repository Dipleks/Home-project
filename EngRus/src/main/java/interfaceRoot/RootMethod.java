package interfaceRoot;

import db.TableDB;
import control.AddExerciseExam;
import control.MenuBarEngRus;
import javafx.animation.Timeline;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import myWords.FillingColumnsMyWords;
import java.sql.*;

public interface RootMethod extends Root
{
    // Очистка колонок упражнений:
    default void clearColumn() throws SQLException, ClassNotFoundException {
        leftColumn.getChildren().clear();
        rightColumn.getChildren().clear();
        ROOT.getChildren().clear();
        MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
        menuBarEngRus.getMenu();
        ROOT.getChildren().addAll(groupRadBut);
    }
    // Полная зачистка главного окна:
    default void clearMethod(){
        leftC.getChildren().clear();
        rightC.getChildren().clear();
        groupMy.getChildren().clear();
        addElement.getChildren().clear();
        addTextAndButton.getChildren().clear();
        leftColumn.getChildren().clear();
        rightColumn.getChildren().clear();
        groupRadBut.getChildren().clear();
        groupExam.getChildren().clear();
        iprColumn.getChildren().clear();
        numberColumn.getChildren().clear();
        improveV.getChildren().clear();
        counterVB.getChildren().clear();
        ROOT.getChildren().clear();
        clock();
    }
    // Зачистка окна упражнений:
    default void methodClearExercise(String m) throws SQLException, ClassNotFoundException {
        if (m.equals("AddMenuButtonPS")){
            clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            AddExerciseExam addExerciseExam = new AddExerciseExam();
            addExerciseExam.AddMenuButtonPS();
        } else if (m.equals("AddMenuButtonToBe")){
            clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            AddExerciseExam addExerciseExam = new AddExerciseExam();
            addExerciseExam.AddMenuButtonToBe();
        }
    }
    // Зачистка окна контрольных:
    default void methodClearExam(String m) throws SQLException, ClassNotFoundException {
        if (m.equals("AddMenuButtonExamPS")){
            clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            AddExerciseExam addExerciseExam = new AddExerciseExam();
            addExerciseExam.AddMenuButtonExamPS();
        } else if (m.equals("AddMenuButtonExamToBe")){
            clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            AddExerciseExam addExerciseExam = new AddExerciseExam();
            addExerciseExam.AddMenuButtonExamToBe();
        }
    }
    // Звуковой эффект при нажатии на предложение:
    default void soundClick() {
        // TODO делаем код для клика;
//        Runnable runnable = () -> {
//            String file = "resources/click.mp3";
//            Media sound = new Media(new File(file).toURI().toString());
//            MediaPlayer mediaPlayer = new MediaPlayer(sound);
//            mediaPlayer.play();
//        };
//        runnable.run();
    }
    // Часы главного окна:
    default void clock() {
        uiTimer.setLayoutX(widthSize / 25);
        uiTimer.setLayoutY(heightSize / 20);
        uiTimer.setFont(EffectFont.fontTextExam);
        uiTimer.setTextFill(EffectColor.colorClock);
        uiTimer.setWrapText(true);
        uiTimer.setAlignment(Pos.CENTER);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        ROOT.getChildren().addAll(uiTimer);
    }
    // Поиск меню my_words:
    default void getSearch(){
        searchWords.setOnAction(e -> {
            if (textSearch.getText().equals("")){
                textSearch.setPromptText("Введите букву или слово для поиска...");
                Stage searchWindow = new Stage();
                Label label = new Label("Введите букву или слово для поиска...");
                Button button = new Button("Закрыть");
                button.setOnAction(event -> searchWindow.close());
                VBox group = new VBox();
                group.setSpacing(20);
                group.setAlignment(Pos.CENTER);
                group.getChildren().addAll(label, button);
                Scene scene = new Scene(group, 250, 150);
                searchWindow.initModality(Modality.APPLICATION_MODAL);
                searchWindow.setScene(scene);
                searchWindow.show();
            } else {
                try {
                    Connection connection =  DriverManager.getConnection(TableDB.DB_URL + TableDB.db, TableDB.USER, TableDB.PASS);
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
                        r3.next();
                        my_word_en[i] = new Label();
                        my_word_en[i].setFont(EffectFont.fontTextExam);
                        my_word_en[i].setTextFill(EffectColor.colorText);
                        my_word_en[i].setPrefWidth(widthSize-widthSize/2.45);
                        my_word_en[i].setText(r2.getString("word_en"));
                        my_word_ru[i].setText(r2.getString("word_ru"));
                        my_word_en[i].setAlignment(Pos.BASELINE_RIGHT);

                        leftC.getChildren().addAll(my_word_en[i]);
                        rightC.getChildren().addAll(my_word_ru[i]);
                    }
                    for (int i = 0; r3.next(); i++) {
                        r2.next();
                        my_word_ru[i] = new Label();
                        my_word_ru[i].setFont(EffectFont.fontTextExam);
                        my_word_ru[i].setTextFill(EffectColor.colorText);
                        my_word_ru[i].setPrefWidth(widthSize-widthSize/2.45);
                        my_word_ru[i].setText(r3.getString("word_ru"));
                        my_word_en[i].setText(r3.getString("word_en"));

                        leftC.getChildren().addAll(my_word_en[i]);
                        rightC.getChildren().addAll(my_word_ru[i]);
                    }
                    r2.close();
                    r3.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }

        });
    }
    // Добавление новых слов меню my_words:
    default void addNewWords(){
        addWords.setOnAction(e -> {
            if (!textEn.getText().equals("") & !textRu.getText().equals("")) {
                try {
                    Connection connection = DriverManager.getConnection(TableDB.DB_URL + TableDB.db, TableDB.USER, TableDB.PASS);
                    Statement statement = connection.createStatement();
                    statement.executeUpdate("INSERT INTO my_words (word_en, word_ru) VALUES ('" + textEn.getText()
                            + "', '" + textRu.getText() + "')");
                    ResultSet r = statement.executeQuery("SELECT word_en FROM my_words");
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
            } else {
                // TODO добавиить модальное окно, при попытки ввести пустые данные
                System.out.println("попытка добавить пустое поле!");
            }
        });
    }
    // Обновление таблицы my_words:
    default void restartMyWordsTable(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(TableDB.DB_URL + TableDB.db, TableDB.USER, TableDB.PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            assert connection != null;
            Statement stmt1 = connection.createStatement();
            Statement stmt2 = connection.createStatement();
            Statement stmt3 = connection.createStatement();
            // Добавление таблиц:
            stmt3.executeUpdate(TableDB.my_words);
            ResultSet rs1 = stmt1.executeQuery("SELECT word_en FROM my_words ORDER BY id;"); //sql запрос
            ResultSet rs2 = stmt2.executeQuery("SELECT word_ru FROM my_words ORDER BY id;"); //sql запрос

            addNewWords();

            for (int i = 0; rs1.next(); i++) {
                rs2.next();

                // Создаем контекстное меню:
                int finalI = i;
                ContextMenu contextMenuMyWords = new ContextMenu();
                MenuItem menuDeleteWord = new MenuItem("Удалить");

                menuDeleteWord.setOnAction(e -> {
                    try {
                        Connection connection5 =
                                DriverManager.getConnection(TableDB.DB_URL + TableDB.db, TableDB.USER, TableDB.PASS);
                        Statement statement5 = connection5.createStatement();
                        statement5.executeUpdate("DELETE FROM my_words WHERE word_en = '"
                                + my_word_en[finalI].getText() + "';");
                        ResultSet r = statement5.executeQuery("SELECT word_en FROM my_words");
                        for (int j = 0; r.next(); j++) {
                            leftC.getChildren().remove(my_word_en[j]);
                            rightC.getChildren().remove(my_word_ru[j]);
                        }
                        r.close();
                        clearMethod();
                        MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                        menuBarEngRus.getMenu();
                        FillingColumnsMyWords fillingColumns = new FillingColumnsMyWords();
                        fillingColumns.getMyWordsList();
                    } catch (SQLException | ClassNotFoundException ex) {
                        ex.printStackTrace();
                    }
                });
                contextMenuMyWords.getItems().addAll(menuDeleteWord);

                my_word_en[i] = new Label();
//                my_word_en[i].setStyle("-fx-border-color: RED");
                my_word_en[i].setFont(EffectFont.fontTextExam);
                my_word_en[i].setTextFill(EffectColor.colorText);
                my_word_en[i].setPrefWidth(widthSize-widthSize/2.45);
                my_word_en[i].setAlignment(Pos.BASELINE_RIGHT);
//                my_word_en[i].setWrapText(true);
//                my_word_en[i].setCursor(Cursor.HAND);
                my_word_en[i].setText(rs1.getString("word_en"));
                my_word_en[i].setOnContextMenuRequested(e ->
                        contextMenuMyWords.show(my_word_en[finalI], e.getScreenX(), e.getScreenY()));

                my_word_ru[i] = new Label();
//                my_word_ru[i].setStyle("-fx-border-color: RED");
                my_word_ru[i].setFont(EffectFont.fontTextExam);
                my_word_ru[i].setTextFill(EffectColor.colorText);
                my_word_ru[i].setPrefWidth(widthSize-widthSize/2.45);
//                my_word_ru[i].setWrapText(true);
//                my_word_ru[i].setCursor(Cursor.HAND);
                my_word_ru[i].setText(rs2.getString("word_ru"));
                my_word_ru[i].setOnContextMenuRequested(e ->
                        contextMenuMyWords.show(my_word_ru[finalI], e.getScreenX(), e.getScreenY()));
                if (my_word_ru[i].getText().length()>33) {
                    Tooltip tooltip = new Tooltip();
                    tooltip.setWrapText(true);
                    tooltip.setText(my_word_ru[i].getText());
                    tooltip.setPrefWidth(widthSize/5);
                    my_word_ru[i].setTooltip(tooltip);
                }
                leftC.getChildren().addAll(my_word_en[i]);
                rightC.getChildren().addAll(my_word_ru[i]);
            }
            rs1.close();
            rs2.close();
            stmt1.close();
            stmt2.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // Окно подсказки при нажатии на поис при пустом поле:
    default void panes(String str) {
        Stage win = new Stage();
        Label label = new Label(str);
        Button button = new Button("Закрыть");
        button.setOnAction(e -> win.close());
        VBox group = new VBox();
        group.setSpacing(20);
        group.setAlignment(Pos.CENTER);
        group.getChildren().addAll(label, button);
        Scene scene = new Scene(group, 250, 150);
        win.initModality(Modality.APPLICATION_MODAL);
        win.setScene(scene);
        win.show();
    }

}
