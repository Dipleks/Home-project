package ghostInter.controlPS;

import ghostInter.interfaceRoot.Root;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AddButAndLabelPS implements Root
{
    private SceletVBoxPS[] sceletVBoxPS1 = new SceletVBoxPS[7];
    private SceletVBoxPS[] sceletVBoxPS2 = new SceletVBoxPS[4];
    private SceletVBoxPS[] sceletVBoxPS3 = new SceletVBoxPS[7];
    private SceletVBoxPS[] sceletVBoxPS4 = new SceletVBoxPS[3];
    private JobControlPS jobControlPSLesson = new JobControlPS();
    private JobControlPS jobControlPSExam = new JobControlPS();

    public void AddMenuButton(){
        getUpr();
    }
    public void AddMenuButtonExamPS(){
        getExamPS();
    }

    private void getUpr(){

        sceletVBoxPS1[0] = new SceletVBoxPS(new Label[15], new Label[15],0, 15);
        sceletVBoxPS1[1] = new SceletVBoxPS(new Label[15], new Label[15],30, 45);
        sceletVBoxPS1[2] = new SceletVBoxPS(new Label[15], new Label[15], 60, 75);
        sceletVBoxPS1[3] = new SceletVBoxPS(new Label[15], new Label[15],90, 105);
        sceletVBoxPS1[4] = new SceletVBoxPS(new Label[15], new Label[15],120, 135);
        sceletVBoxPS1[5] = new SceletVBoxPS(new Label[15], new Label[15],150, 165);
        sceletVBoxPS1[6] = new SceletVBoxPS(new Label[6], new Label[7],180, 186);

        sceletVBoxPS2[0] = new SceletVBoxPS(new Label[15], new Label[15],193, 208);
        sceletVBoxPS2[1] = new SceletVBoxPS(new Label[15], new Label[15],223, 238);
        sceletVBoxPS2[2] = new SceletVBoxPS(new Label[15], new Label[15],253, 268);
        sceletVBoxPS2[3] = new SceletVBoxPS(new Label[14], new Label[15],283, 297);

        sceletVBoxPS3[0] = new SceletVBoxPS(new Label[15], new Label[15],312, 327);
        sceletVBoxPS3[1] = new SceletVBoxPS(new Label[15], new Label[15],342, 357);
        sceletVBoxPS3[2] = new SceletVBoxPS(new Label[15], new Label[15],372, 387);
        sceletVBoxPS3[3] = new SceletVBoxPS(new Label[15], new Label[15],402, 417);
        sceletVBoxPS3[4] = new SceletVBoxPS(new Label[15], new Label[15],432, 447);
        sceletVBoxPS3[5] = new SceletVBoxPS(new Label[15], new Label[15],462, 477);
        sceletVBoxPS3[6] = new SceletVBoxPS(new Label[12], new Label[12],492, 504);

        jobControlPSLesson.exercise(sceletVBoxPS1, sceletVBoxPS2, sceletVBoxPS3,
                new Button[7], new Button[4], new Button[7]);
    }
    private void getExamPS(){

        sceletVBoxPS4[0] = new SceletVBoxPS(new Label[50], new Label[50], new Label[50],  0);
        sceletVBoxPS4[1] = new SceletVBoxPS(new Label[50], new Label[50], new Label[50],  50);
        sceletVBoxPS4[2] = new SceletVBoxPS(new Label[50], new Label[50], new Label[50],  100);

        jobControlPSExam.examMethod(sceletVBoxPS4,new Button[3]);
    }
}
