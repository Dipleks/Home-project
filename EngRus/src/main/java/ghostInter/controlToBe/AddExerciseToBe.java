package ghostInter.controlToBe;

import ghostInter.interfaceRoot.Root;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AddExerciseToBe implements Root
{
    private FillingColumnsToBe[] appToBe = new FillingColumnsToBe[6];
    private FillingColumnsToBe[] negToBe = new FillingColumnsToBe[4];
    private FillingColumnsToBe[] quesToBe = new FillingColumnsToBe[7];
    private FillingColumnsToBe[] examToBe = new FillingColumnsToBe[1];

    private ControlToBe controlExerciseToBe = new ControlToBe();
    private ControlToBe controlExamToBe = new ControlToBe();

    public void AddMenuButton(){
        getUpr();
    }
    public void AddMenuButtonExamToBe(){
        getExamToBe();
    }

    private void getUpr(){

        appToBe[0] = new FillingColumnsToBe(new Label[15], new Label[15],0, 15);
        appToBe[1] = new FillingColumnsToBe(new Label[15], new Label[15],30, 45);
        appToBe[2] = new FillingColumnsToBe(new Label[15], new Label[15], 60, 75);
        appToBe[3] = new FillingColumnsToBe(new Label[15], new Label[15],90, 105);
        appToBe[4] = new FillingColumnsToBe(new Label[15], new Label[15],120, 135);
        appToBe[5] = new FillingColumnsToBe(new Label[19], new Label[19],150, 169);

        negToBe[0] = new FillingColumnsToBe(new Label[15], new Label[15],193, 208);
//        negToBe[1] = new FillingColumnsToBe(new Label[15], new Label[15],223, 238);
//        negToBe[2] = new FillingColumnsToBe(new Label[15], new Label[15],253, 268);
//        negToBe[3] = new FillingColumnsToBe(new Label[14], new Label[15],283, 297);

        quesToBe[0] = new FillingColumnsToBe(new Label[15], new Label[15],312, 327);
//        quesToBe[1] = new FillingColumnsToBe(new Label[15], new Label[15],342, 357);
//        quesToBe[2] = new FillingColumnsToBe(new Label[15], new Label[15],372, 387);
//        quesToBe[3] = new FillingColumnsToBe(new Label[15], new Label[15],402, 417);
//        quesToBe[4] = new FillingColumnsToBe(new Label[15], new Label[15],432, 447);
//        quesToBe[5] = new FillingColumnsToBe(new Label[15], new Label[15],462, 477);
//        quesToBe[6] = new FillingColumnsToBe(new Label[12], new Label[12],492, 504);

        controlExerciseToBe.exercise(appToBe, negToBe, quesToBe,
                new Button[6], new Button[1], new Button[1]);
    }
    private void getExamToBe(){

        examToBe[0] = new FillingColumnsToBe(new Label[100], new Label[100], new Label[100],  0);
//        examToBe[1] = new FillingColumnsToBe(new Label[100], new Label[100], new Label[100],  100);

        controlExamToBe.examMethod(examToBe,new Button[1]);
    }
}
