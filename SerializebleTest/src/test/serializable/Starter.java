package test.serializable;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.*;

public class Starter extends Application /*implements Serializable*/
{
    private Group root = new Group();
    private Scene scene = new Scene(root, 800, 800);
    private Label[] labels = new Label[5];
    private Label[] labels1 = new Label[5];
    private String[] str = new String[5];
    private TextField textField1 = new TextField();
    private TextField textField2 = new TextField();
    private Button button = new Button("SAVE");

    public static void main(String[] args) throws IOException {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        root.getChildren().addAll(getLabel());
        root.getChildren().addAll(getLabe2());
        root.getChildren().addAll(getTextField1(), getTextField2(), getButton());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Label[] getLabel() throws IOException {
        for (int i = 0; i < 5; i++) {
            labels[i] = new Label();
            labels[i].setLayoutX(50);
            labels[i].setLayoutY(40*i);
            labels[i].setText(addLabStr()[i]);
            int finalI = i;
//            labels[i].setOnMouseClicked(new EventHandler<MouseEvent>()
//            {
//                @Override
//                public void handle(MouseEvent event) {
//                    try {
//                        labels[finalI].setText(addLabStrRu()[finalI]);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
            labels[i].setOnMouseClicked(event -> {
                try {
                    labels[finalI].setText(addLabStrRu()[finalI]);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        return labels;
    }
    private Label[] getLabe2() throws IOException {
        for (int i = 0; i < 5; i++) {
            labels1[i] = new Label();
            labels1[i].setLayoutX(350);
            labels1[i].setLayoutY(40*i);
            labels1[i].setText(addLabStr1()[i]);
            int finalI = i;
            labels1[i].setOnMouseClicked(event -> {
                try {
                    labels[finalI].setText(addLabStrRu1()[finalI]);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        return labels1;
    }
    //Читаем из файла существующего
    private String[] addLabStr() throws IOException {
        File file = new File("src/testpacege/en.er");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        for (int i = 0; i < 5; i++) {
            str[i] = br.readLine();
        }
        return str;
    }
    //Читаем из файла пустого, в который добавляем руками:
    private String[] addLabStr1() throws IOException {
        File file = new File("src/testpacege/witerTest.er");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        for (int i = 0; i < 5; i++) {
            str[i] = br.readLine();
        }
        return str;
    }
    private String[] addLabStrRu() throws IOException {
        File file = new File("src/testpacege/ru.er");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        for (int i = 0; i < 5; i++) {
            str[i] = br.readLine();
        }
        return str;
    }
    private String[] addLabStrRu1() throws IOException {
        File file = new File("src/testpacege/ru.er");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        for (int i = 0; i < 5; i++) {
            str[i] = br.readLine();
        }
        return str;
    }
    //Поле для английских слов:
    private TextField getTextField1(){
        textField1.setLayoutX(250);
        textField1.setLayoutY(500);
        return textField1;
    }
    //Поле для русских слов:
    private TextField getTextField2(){
        textField2.setLayoutX(250);
        textField2.setLayoutY(550);
        return textField2;
    }
    private void setStr() throws IOException {

        FileOutputStream fos = new FileOutputStream("src/testpacege/witerTest.er", true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write(textField1.getText());
        bw.write(System.getProperty("line.separator"));
        bw.flush();
        bw.close();

    }
    private Button getButton(){
        button.setLayoutX(450);
        button.setLayoutY(500);
        button.setOnAction(event -> {
            try {
                setStr();
                System.out.println("test load");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        return button;
    }
}
