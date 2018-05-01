package ghostInter.controlPS;

import ghostInter.interfaceRoot.Root;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;

public class AddButAndLabel implements Root
{
    private SceletVBox[] sceletVBox1 = new SceletVBox[7];
    private SceletVBox[] sceletVBox2 = new SceletVBox[4];
    private SceletVBox[] sceletVBox3 = new SceletVBox[7];
    private SceletVBox[] sceletVBox4 = new SceletVBox[/*7*/2];
    private JobControl jobControlLesson = new JobControl();
    private JobControl jobControlExam = new JobControl();

    public void AddMenuButton(){
        getUpr();
    }
    public void AddMenuButton1(){
        getUpr1();
    }

    private void getUpr(){

        sceletVBox1[0] = new SceletVBox(new Label[15], new Label[15],0, 15);
        sceletVBox1[1] = new SceletVBox(new Label[15], new Label[15],30, 45);
        sceletVBox1[2] = new SceletVBox(new Label[15], new Label[15], 60, 75);
        sceletVBox1[3] = new SceletVBox(new Label[15], new Label[15],90, 105);
        sceletVBox1[4] = new SceletVBox(new Label[15], new Label[15],120, 135);
        sceletVBox1[5] = new SceletVBox(new Label[15], new Label[15],150, 165);
        sceletVBox1[6] = new SceletVBox(new Label[6], new Label[7],180, 186);

        sceletVBox2[0] = new SceletVBox(new Label[15], new Label[15],193, 208);
        sceletVBox2[1] = new SceletVBox(new Label[15], new Label[15],223, 238);
        sceletVBox2[2] = new SceletVBox(new Label[15], new Label[15],253, 268);
        sceletVBox2[3] = new SceletVBox(new Label[14], new Label[15],283, 297);

        sceletVBox3[0] = new SceletVBox(new Label[15], new Label[15],312, 327);
        sceletVBox3[1] = new SceletVBox(new Label[15], new Label[15],342, 357);
        sceletVBox3[2] = new SceletVBox(new Label[15], new Label[15],372, 387);
        sceletVBox3[3] = new SceletVBox(new Label[15], new Label[15],402, 417);
        sceletVBox3[4] = new SceletVBox(new Label[15], new Label[15],432, 447);
        sceletVBox3[5] = new SceletVBox(new Label[15], new Label[15],462, 477);
        sceletVBox3[6] = new SceletVBox(new Label[12], new Label[12],492, 504);

        jobControlLesson.exercise(sceletVBox1, sceletVBox2, sceletVBox3,
                new Button[7], new Button[4], new Button[7]);
    }
    private void getUpr1(){

        sceletVBox4[0] = new SceletVBox(new Label[50], new Label[50], new Label[50],  0);
        sceletVBox4[1] = new SceletVBox(new Label[50], new Label[50], new Label[50],  50);

        jobControlExam.examMethod(sceletVBox4,new Button[/*7*/2]);
    }
}
