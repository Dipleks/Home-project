package ghostInter.interfaceRoot.buttonPS;

import ghostInter.SceletVBox;
import ghostInter.dataBase.StringFiles;
import ghostInter.interfaceRoot.Root;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class JobControl implements Root, StringFiles
{
    private Button buttonPS = new Button("Задание 1");

    private SceletVBox sceletVBox = new SceletVBox(new Label[15], new Label[16], new String[32],new String[32],
            fileAppEnPSA, fileAppRuPSA);

    private Button exercise1(){
            buttonPS.setLayoutX(200);
            buttonPS.setLayoutY(200);

        buttonPS.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) {

                sceletVBox.getLeft();
                sceletVBox.getRight();

                ROOT.getChildren().remove(buttonPS);
            }
        });
        return buttonPS;
    }

    public Button getButton() {
        exercise1();
        return buttonPS;
    }
}
