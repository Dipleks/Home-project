package ghostInter.control;

import ghostInter.interfaceRoot.Root;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AddExercise implements Root
{
    private FillingColumns[] appPS = new FillingColumns[7];
    private FillingColumns[] negPS = new FillingColumns[4];
    private FillingColumns[] quesPS = new FillingColumns[7];
    private FillingColumns[] examPS = new FillingColumns[3];

    private FillingColumns[] appToBe = new FillingColumns[6];
    private FillingColumns[] negToBe = new FillingColumns[4];
    private FillingColumns[] quesToBe = new FillingColumns[7];
    private FillingColumns[] examToBe = new FillingColumns[1];

    private Control controlExercisePS = new Control();
    private Control controlExamPS = new Control();
    private Control controlExerciseToBe = new Control();
    private Control controlExamToBe = new Control();

    public void AddMenuButtonPS(){
        getUprPS();
    }
    public void AddMenuButtonExamPS(){
        getExamPS();
    }
    public void AddMenuButtonToBe(){
        getUprToBe();
    }
    public void AddMenuButtonExamToBe(){
        getExamToBe();
    }

    // PS
    private void getUprPS(){

        appPS[0] = new FillingColumns(new Label[15], new Label[15],0, 15, "PS");
        appPS[1] = new FillingColumns(new Label[15], new Label[15],30, 45, "PS");
        appPS[2] = new FillingColumns(new Label[15], new Label[15], 60, 75, "PS");
        appPS[3] = new FillingColumns(new Label[15], new Label[15],90, 105, "PS");
        appPS[4] = new FillingColumns(new Label[15], new Label[15],120, 135, "PS");
        appPS[5] = new FillingColumns(new Label[15], new Label[15],150, 165, "PS");
        appPS[6] = new FillingColumns(new Label[6], new Label[7],180, 186, "PS");

        negPS[0] = new FillingColumns(new Label[15], new Label[15],193, 208, "PS");
        negPS[1] = new FillingColumns(new Label[15], new Label[15],223, 238, "PS");
        negPS[2] = new FillingColumns(new Label[15], new Label[15],253, 268, "PS");
        negPS[3] = new FillingColumns(new Label[14], new Label[15],283, 297, "PS");

        quesPS[0] = new FillingColumns(new Label[15], new Label[15],312, 327, "PS");
        quesPS[1] = new FillingColumns(new Label[15], new Label[15],342, 357, "PS");
        quesPS[2] = new FillingColumns(new Label[15], new Label[15],372, 387, "PS");
        quesPS[3] = new FillingColumns(new Label[15], new Label[15],402, 417, "PS");
        quesPS[4] = new FillingColumns(new Label[15], new Label[15],432, 447, "PS");
        quesPS[5] = new FillingColumns(new Label[15], new Label[15],462, 477, "PS");
        quesPS[6] = new FillingColumns(new Label[12], new Label[12],492, 504, "PS");

        controlExercisePS.exercise(appPS, negPS, quesPS,
                new Button[7], new Button[4], new Button[7], "AddMenuButtonPS");
    }
    private void getExamPS(){

        examPS[0] = new FillingColumns(new Label[100], new Label[100], new Label[100],  0, "ExamPS");
        examPS[1] = new FillingColumns(new Label[100], new Label[100], new Label[100],  100, "ExamPS");
        examPS[2] = new FillingColumns(new Label[50], new Label[50], new Label[50],  200, "ExamPS");

        controlExamPS.examMethod(examPS,new Button[3], "AddMenuButtonExamPS");
    }

    // ToBe
    private void getUprToBe(){

        appToBe[0] = new FillingColumns(new Label[15], new Label[15],0, 15, "ToBe");
        appToBe[1] = new FillingColumns(new Label[15], new Label[15],30, 45, "ToBe");
        appToBe[2] = new FillingColumns(new Label[15], new Label[15], 60, 75, "ToBe");
        appToBe[3] = new FillingColumns(new Label[15], new Label[15],90, 105, "ToBe");
        appToBe[4] = new FillingColumns(new Label[15], new Label[15],120, 135, "ToBe");
        appToBe[5] = new FillingColumns(new Label[19], new Label[19],150, 169, "ToBe");

        negToBe[0] = new FillingColumns(new Label[15], new Label[15],193, 208, "ToBe");
//        negToBe[1] = new FillingColumns(new Label[15], new Label[15],223, 238);
//        negToBe[2] = new FillingColumns(new Label[15], new Label[15],253, 268);
//        negToBe[3] = new FillingColumns(new Label[14], new Label[15],283, 297);

        quesToBe[0] = new FillingColumns(new Label[15], new Label[15],312, 327, "ToBe");
//        quesToBe[1] = new FillingColumns(new Label[15], new Label[15],342, 357);
//        quesToBe[2] = new FillingColumns(new Label[15], new Label[15],372, 387);
//        quesToBe[3] = new FillingColumns(new Label[15], new Label[15],402, 417);
//        quesToBe[4] = new FillingColumns(new Label[15], new Label[15],432, 447);
//        quesToBe[5] = new FillingColumns(new Label[15], new Label[15],462, 477);
//        quesToBe[6] = new FillingColumns(new Label[12], new Label[12],492, 504);

        controlExerciseToBe.exercise(appToBe, negToBe, quesToBe,
                new Button[6], new Button[1], new Button[1], "AddMenuButtonToBe");
    }
    private void getExamToBe(){

        examToBe[0] = new FillingColumns(new Label[100], new Label[100], new Label[100],  0, "ExamToBe");
//        examToBe[1] = new FillingColumns(new Label[100], new Label[100], new Label[100],  100);

        controlExamToBe.examMethod(examToBe,new Button[1], "AddMenuButtonExamToBe");
    }


}
