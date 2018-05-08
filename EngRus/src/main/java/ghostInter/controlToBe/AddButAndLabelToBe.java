package ghostInter.controlToBe;

import ghostInter.interfaceRoot.Root;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AddButAndLabelToBe implements Root
{
    private SceletVBoxToBe[] sceletVBoxToBe1 = new SceletVBoxToBe[6];
    private SceletVBoxToBe[] sceletVBoxToBe2 = new SceletVBoxToBe[4];
    private SceletVBoxToBe[] sceletVBoxToBe3 = new SceletVBoxToBe[7];
    private SceletVBoxToBe[] sceletVBoxToBe4 = new SceletVBoxToBe[3];
    private JobControlToBe jobControlToBeLesson = new JobControlToBe();
    private JobControlToBe jobControlToBeExam = new JobControlToBe();

    public void AddMenuButton(){
        getUpr();
    }
    public void AddMenuButtonExamToBe(){
        getExamToBe();
    }

    private void getUpr(){

        sceletVBoxToBe1[0] = new SceletVBoxToBe(new Label[15], new Label[15],0, 15);
        sceletVBoxToBe1[1] = new SceletVBoxToBe(new Label[15], new Label[15],30, 45);
        sceletVBoxToBe1[2] = new SceletVBoxToBe(new Label[15], new Label[15], 60, 75);
        sceletVBoxToBe1[3] = new SceletVBoxToBe(new Label[15], new Label[15],90, 105);
        sceletVBoxToBe1[4] = new SceletVBoxToBe(new Label[15], new Label[15],120, 135);
        sceletVBoxToBe1[5] = new SceletVBoxToBe(new Label[19], new Label[19],150, 169);

        sceletVBoxToBe2[0] = new SceletVBoxToBe(new Label[15], new Label[15],193, 208);
        sceletVBoxToBe2[1] = new SceletVBoxToBe(new Label[15], new Label[15],223, 238);
        sceletVBoxToBe2[2] = new SceletVBoxToBe(new Label[15], new Label[15],253, 268);
        sceletVBoxToBe2[3] = new SceletVBoxToBe(new Label[14], new Label[15],283, 297);

        sceletVBoxToBe3[0] = new SceletVBoxToBe(new Label[15], new Label[15],312, 327);
        sceletVBoxToBe3[1] = new SceletVBoxToBe(new Label[15], new Label[15],342, 357);
        sceletVBoxToBe3[2] = new SceletVBoxToBe(new Label[15], new Label[15],372, 387);
        sceletVBoxToBe3[3] = new SceletVBoxToBe(new Label[15], new Label[15],402, 417);
        sceletVBoxToBe3[4] = new SceletVBoxToBe(new Label[15], new Label[15],432, 447);
        sceletVBoxToBe3[5] = new SceletVBoxToBe(new Label[15], new Label[15],462, 477);
        sceletVBoxToBe3[6] = new SceletVBoxToBe(new Label[12], new Label[12],492, 504);

        jobControlToBeLesson.exercise(sceletVBoxToBe1, sceletVBoxToBe2, sceletVBoxToBe3,
                new Button[6], new Button[4], new Button[7]);
    }
    private void getExamToBe(){

        sceletVBoxToBe4[0] = new SceletVBoxToBe(new Label[50], new Label[50], new Label[50],  0);
        sceletVBoxToBe4[1] = new SceletVBoxToBe(new Label[50], new Label[50], new Label[50],  50);
        sceletVBoxToBe4[2] = new SceletVBoxToBe(new Label[50], new Label[50], new Label[50],  100);

        jobControlToBeExam.examMethod(sceletVBoxToBe4,new Button[3]);
    }
}
