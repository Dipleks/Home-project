package impruveEnglish.control;

import impruveEnglish.ps.approvals.AddTextAppPSen;
import impruveEnglish.ps.negative.AddTextNegPSen;
import impruveEnglish.ps.questions.AddTextQuesPSen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MenuButtonPS implements Root
{
    private final static Button buttonAppPSen = new Button();
    private final static Button buttonNegPSen = new Button();
    private final static Button buttonQuesPSen = new Button();
    private final static Button buttonAppPSru = new Button();
    private final static Button buttonNegPSru = new Button();
    private final static Button buttonQuesPSru = new Button();
    private final static Button allPS = new Button();
    private final static Button examOnePS = new Button();
    private final static Button returnPS = new Button();

    public static Button getButtonAppPSen() {
        setButtonAppPS();
        return buttonAppPSen;
    }
    public static Button getButtonNegPSen() {
        setButtonNegPSen();
        return buttonNegPSen;
    }
    public static Button getButtonQuesPSen() {
        setButtonQuesPSen();
        return buttonQuesPSen;
    }
    public static Button getButtonAppPSru() {
        setButtonAppPSru();
        return buttonAppPSru;
    }
    public static Button getButtonNegPSru() {
        setButtonNegPSru();
        return buttonNegPSru;
    }
    public static Button getButtonQuesPSru() {
        setButtonQuesPSru();
        return buttonQuesPSru;
    }
    public static Button getReturnPS() {
        setReturnPS();
        return returnPS;
    }
    public static Button getAllPS() {
        setAllPS();
        return allPS;
    }
    public static Button getExamOnePS() {
        setExamOnePS();
        return examOnePS;
    }

    private static void setButtonAppPS(){
        Image image = new Image("app en-ru.png");
        ImageView imageView = new ImageView(image);
        buttonAppPSen.setGraphic(imageView);
        buttonAppPSen.setStyle("-fx-background-color: transparent;");
        buttonAppPSen.setTranslateX(-250);
        buttonAppPSen.setTranslateY(-200);
        AddTextAppPSen addTextEn = new AddTextAppPSen();
        addTextEn.getEnglishListAppPS();
        buttonAppPSen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                STACK_PANE.getChildren().add(englishListAppPs);
                STACK_PANE.getChildren().remove(englishListNegPs);
                STACK_PANE.getChildren().remove(englishListQuesPs);
                STACK_PANE.getChildren().remove(buttonAppPSen);
                STACK_PANE.getChildren().remove(buttonAppPSru);
                STACK_PANE.getChildren().remove(buttonNegPSen);
                STACK_PANE.getChildren().remove(buttonNegPSru);
                STACK_PANE.getChildren().remove(buttonQuesPSen);
                STACK_PANE.getChildren().remove(buttonQuesPSru);
                STACK_PANE.getChildren().remove(allPS);
                STACK_PANE.getChildren().remove(examOnePS);
            }
        });

    }
    private static void setButtonNegPSen(){
        Image image = new Image("neg en-ru.png");
        ImageView imageView = new ImageView(image);
        buttonNegPSen.setGraphic(imageView);
        buttonNegPSen.setStyle("-fx-background-color: transparent;");
        buttonNegPSen.setTranslateX(0);
        buttonNegPSen.setTranslateY(-200);
        AddTextNegPSen negTextEn = new AddTextNegPSen();
        negTextEn.getEnglishListNegPS();
        buttonNegPSen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                STACK_PANE.getChildren().add(englishListNegPs);
                STACK_PANE.getChildren().remove(englishListAppPs);
                STACK_PANE.getChildren().remove(englishListQuesPs);
                STACK_PANE.getChildren().remove(buttonAppPSen);
                STACK_PANE.getChildren().remove(buttonAppPSru);
                STACK_PANE.getChildren().remove(buttonNegPSen);
                STACK_PANE.getChildren().remove(buttonNegPSru);
                STACK_PANE.getChildren().remove(buttonQuesPSen);
                STACK_PANE.getChildren().remove(buttonQuesPSru);
                STACK_PANE.getChildren().remove(allPS);
                STACK_PANE.getChildren().remove(examOnePS);
            }
        });
    }
    private static void setButtonQuesPSen(){
        Image image = new Image("quest en-ru.png");
        ImageView imageView = new ImageView(image);
        buttonQuesPSen.setGraphic(imageView);
        buttonQuesPSen.setStyle("-fx-background-color: transparent;");
        buttonQuesPSen.setTranslateX(250);
        buttonQuesPSen.setTranslateY(-200);
        AddTextQuesPSen quesTextEn = new AddTextQuesPSen();
        quesTextEn.getEnglishListQuesPS();
        buttonQuesPSen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                STACK_PANE.getChildren().add(englishListQuesPs);
                STACK_PANE.getChildren().remove(englishListNegPs);
                STACK_PANE.getChildren().remove(englishListAppPs);
                STACK_PANE.getChildren().remove(buttonAppPSen);
                STACK_PANE.getChildren().remove(buttonAppPSru);
                STACK_PANE.getChildren().remove(buttonNegPSen);
                STACK_PANE.getChildren().remove(buttonNegPSru);
                STACK_PANE.getChildren().remove(buttonQuesPSen);
                STACK_PANE.getChildren().remove(buttonQuesPSru);
                STACK_PANE.getChildren().remove(allPS);
                STACK_PANE.getChildren().remove(examOnePS);
            }
        });
    }
    private static void setButtonAppPSru(){
        Image image = new Image("app ru-en.png");
        ImageView imageView = new ImageView(image);
        buttonAppPSru.setGraphic(imageView);
        buttonAppPSru.setStyle("-fx-background-color: transparent;");
        buttonAppPSru.setTranslateX(-250);
        buttonAppPSru.setTranslateY(0);
        //        AddTextAppPSen addTextEn = new AddTextAppPSen();
//        addTextEn.getEnglishListNegPS();
        buttonAppPSru.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                STACK_PANE.getChildren().add(englishListAppPs);
                STACK_PANE.getChildren().remove(buttonAppPSen);
                STACK_PANE.getChildren().remove(buttonAppPSru);
                STACK_PANE.getChildren().remove(buttonNegPSen);
                STACK_PANE.getChildren().remove(buttonNegPSru);
                STACK_PANE.getChildren().remove(buttonQuesPSen);
                STACK_PANE.getChildren().remove(buttonQuesPSru);
                STACK_PANE.getChildren().remove(allPS);
                STACK_PANE.getChildren().remove(examOnePS);
            }
        });
    }
    private static void setButtonNegPSru(){
        Image image = new Image("neg ru-en.png");
        ImageView imageView = new ImageView(image);
        buttonNegPSru.setGraphic(imageView);
        buttonNegPSru.setStyle("-fx-background-color: transparent;");
        buttonNegPSru.setTranslateX(0);
        buttonNegPSru.setTranslateY(0);
        //        AddTextAppPSen addTextEn = new AddTextAppPSen();
//        addTextEn.getEnglishListNegPS();
        buttonNegPSru.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                STACK_PANE.getChildren().add(englishListAppPs);
                STACK_PANE.getChildren().remove(buttonAppPSen);
                STACK_PANE.getChildren().remove(buttonAppPSru);
                STACK_PANE.getChildren().remove(buttonNegPSen);
                STACK_PANE.getChildren().remove(buttonNegPSru);
                STACK_PANE.getChildren().remove(buttonQuesPSen);
                STACK_PANE.getChildren().remove(buttonQuesPSru);
                STACK_PANE.getChildren().remove(allPS);
                STACK_PANE.getChildren().remove(examOnePS);
            }
        });
    }
    private static void setButtonQuesPSru(){
        Image image = new Image("quest ru-en.png");
        ImageView imageView = new ImageView(image);
        buttonQuesPSru.setGraphic(imageView);
        buttonQuesPSru.setStyle("-fx-background-color: transparent;");
        buttonQuesPSru.setTranslateX(250);
        buttonQuesPSru.setTranslateY(0);
        //        AddTextAppPSen addTextEn = new AddTextAppPSen();
//        addTextEn.getEnglishListNegPS();
        buttonQuesPSru.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                STACK_PANE.getChildren().add(englishListAppPs);
                STACK_PANE.getChildren().remove(buttonAppPSen);
                STACK_PANE.getChildren().remove(buttonAppPSru);
                STACK_PANE.getChildren().remove(buttonNegPSen);
                STACK_PANE.getChildren().remove(buttonNegPSru);
                STACK_PANE.getChildren().remove(buttonQuesPSen);
                STACK_PANE.getChildren().remove(buttonQuesPSru);
                STACK_PANE.getChildren().remove(allPS);
                STACK_PANE.getChildren().remove(examOnePS);
            }
        });
    }
    private static void setReturnPS(){
        Image image = new Image("return3.png");
        ImageView imageView = new ImageView(image);
        returnPS.setGraphic(imageView);
        returnPS.setStyle("-fx-background-color: transparent;");
        returnPS.setTranslateX(widthSize/2-320);
        returnPS.setTranslateY(heightSize/2-heightSize+100);
        returnPS.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                STACK_PANE.getChildren().remove(englishListAppPs);
                STACK_PANE.getChildren().remove(englishListNegPs);
                STACK_PANE.getChildren().remove(englishListQuesPs);
                STACK_PANE.getChildren().remove(buttonAppPSen);
                STACK_PANE.getChildren().remove(buttonAppPSru);
                STACK_PANE.getChildren().remove(buttonNegPSen);
                STACK_PANE.getChildren().remove(buttonNegPSru);
                STACK_PANE.getChildren().remove(buttonQuesPSen);
                STACK_PANE.getChildren().remove(buttonQuesPSru);
                STACK_PANE.getChildren().remove(allPS);
                STACK_PANE.getChildren().remove(examOnePS);

                STACK_PANE.getChildren().addAll(MenuButtonPS.getButtonAppPSen(), MenuButtonPS.getButtonNegPSen(),
                        MenuButtonPS.getButtonQuesPSen(), MenuButtonPS.getButtonAppPSru(), MenuButtonPS.getButtonNegPSru(),
                        MenuButtonPS.getButtonQuesPSru(), MenuButtonPS.getAllPS(), MenuButtonPS.getExamOnePS());
            }
        });
    }
    private static void setAllPS(){
        Image image = new Image("all.png");
        ImageView imageView = new ImageView(image);
        allPS.setGraphic(imageView);
        allPS.setStyle("-fx-background-color: transparent;");
        allPS.setTranslateX(-150);
        allPS.setTranslateY(200);
//        AddTextAppPSen addTextEn = new AddTextAppPSen();
//        addTextEn.getEnglishListNegPS();
        allPS.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                STACK_PANE.getChildren().add(englishListAppPs);
//                STACK_PANE.getChildren().remove(englishListNegPs);
//                STACK_PANE.getChildren().remove(buttonAppPSen);
//                STACK_PANE.getChildren().remove(buttonAppPSru);
//                STACK_PANE.getChildren().remove(buttonNegPSen);
//                STACK_PANE.getChildren().remove(buttonNegPSru);
//                STACK_PANE.getChildren().remove(buttonQuesPSen);
//                STACK_PANE.getChildren().remove(buttonQuesPSru);
//                STACK_PANE.getChildren().remove(allPS);
//                STACK_PANE.getChildren().remove(examOnePS);
            }
        });
    }
    private static void setExamOnePS(){
        Image image = new Image("exam.png");
        ImageView imageView = new ImageView(image);
        examOnePS.setGraphic(imageView);
        examOnePS.setStyle("-fx-background-color: transparent;");
        examOnePS.setTranslateX(150);
        examOnePS.setTranslateY(200);
//        AddTextAppPSen addTextEn = new AddTextAppPSen();
//        addTextEn.getEnglishListNegPS();
        examOnePS.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                STACK_PANE.getChildren().add(englishListAppPs);
//                STACK_PANE.getChildren().remove(englishListNegPs);
//                STACK_PANE.getChildren().remove(buttonAppPSen);
//                STACK_PANE.getChildren().remove(buttonAppPSru);
//                STACK_PANE.getChildren().remove(buttonNegPSen);
//                STACK_PANE.getChildren().remove(buttonNegPSru);
//                STACK_PANE.getChildren().remove(buttonQuesPSen);
//                STACK_PANE.getChildren().remove(buttonQuesPSru);
//                STACK_PANE.getChildren().remove(allPS);
//                STACK_PANE.getChildren().remove(examOnePS);
            }
        });
    }
}
