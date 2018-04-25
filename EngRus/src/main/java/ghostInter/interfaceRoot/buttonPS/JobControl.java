package ghostInter.interfaceRoot.buttonPS;

import ghostInter.dataBase.StringFiles;
import ghostInter.interfaceRoot.CompletionOfTheSheet;
import ghostInter.interfaceRoot.Root;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class JobControl implements Root, StringFiles
{
    private Button buttonPS = new Button("Задание 1");

    private Button jBut(){
            buttonPS.setLayoutX(200);
            buttonPS.setLayoutY(200);

        buttonPS.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) {
                Label[] label = new Label[31];
                String[] str1 = new String[31];
                String[] str2 = new String[31];
                CompletionOfTheSheet completionOfTheSheet = new CompletionOfTheSheet(label, str1, str2,
                        fileAppEnPSA, fileAppRuPSA, 0, 31, 15, 1.2, 4.2, 1, 0.3);

                try {
                    completionOfTheSheet.getArrayOfOffers();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ROOT.getChildren().remove(buttonPS);
            }
        });
        return buttonPS;
    }

    public Button getButton() {
        jBut();
        return buttonPS;
    }

}
