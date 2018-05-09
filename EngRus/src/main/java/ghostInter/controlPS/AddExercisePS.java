package ghostInter.controlPS;

import ghostInter.interfaceRoot.Root;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AddExercisePS implements Root
{
    private FillingColumnsPS[] appPS = new FillingColumnsPS[7];
    private FillingColumnsPS[] negPS = new FillingColumnsPS[4];
    private FillingColumnsPS[] quesPS = new FillingColumnsPS[7];
    private FillingColumnsPS[] examPS = new FillingColumnsPS[2];
    private ControlPS controlExercisePS = new ControlPS();
    private ControlPS controlExamPS = new ControlPS();

    public void AddMenuButton(){
        getUpr();
    }
    public void AddMenuButtonExamPS(){
        getExamPS();
    }

    private void getUpr(){

        appPS[0] = new FillingColumnsPS(new Label[15], new Label[15],0, 15);
        appPS[1] = new FillingColumnsPS(new Label[15], new Label[15],30, 45);
        appPS[2] = new FillingColumnsPS(new Label[15], new Label[15], 60, 75);
        appPS[3] = new FillingColumnsPS(new Label[15], new Label[15],90, 105);
        appPS[4] = new FillingColumnsPS(new Label[15], new Label[15],120, 135);
        appPS[5] = new FillingColumnsPS(new Label[15], new Label[15],150, 165);
        appPS[6] = new FillingColumnsPS(new Label[6], new Label[7],180, 186);

        negPS[0] = new FillingColumnsPS(new Label[15], new Label[15],193, 208);
        negPS[1] = new FillingColumnsPS(new Label[15], new Label[15],223, 238);
        negPS[2] = new FillingColumnsPS(new Label[15], new Label[15],253, 268);
        negPS[3] = new FillingColumnsPS(new Label[14], new Label[15],283, 297);

        quesPS[0] = new FillingColumnsPS(new Label[15], new Label[15],312, 327);
        quesPS[1] = new FillingColumnsPS(new Label[15], new Label[15],342, 357);
        quesPS[2] = new FillingColumnsPS(new Label[15], new Label[15],372, 387);
        quesPS[3] = new FillingColumnsPS(new Label[15], new Label[15],402, 417);
        quesPS[4] = new FillingColumnsPS(new Label[15], new Label[15],432, 447);
        quesPS[5] = new FillingColumnsPS(new Label[15], new Label[15],462, 477);
        quesPS[6] = new FillingColumnsPS(new Label[12], new Label[12],492, 504);

        controlExercisePS.exercise(appPS, negPS, quesPS,
                new Button[7], new Button[4], new Button[7]);
    }
    private void getExamPS(){

        examPS[0] = new FillingColumnsPS(new Label[100], new Label[100], new Label[100],  0);
        examPS[1] = new FillingColumnsPS(new Label[100], new Label[100], new Label[100],  100);

        controlExamPS.examMethod(examPS,new Button[2]);
    }
}
