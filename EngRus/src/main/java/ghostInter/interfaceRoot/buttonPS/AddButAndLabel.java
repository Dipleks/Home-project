package ghostInter.interfaceRoot.buttonPS;

import ghostInter.SceletVBox;
import ghostInter.dataBase.StringFiles;
import ghostInter.interfaceRoot.Root;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AddButAndLabel implements Root, StringFiles
{
    private SceletVBox[] sceletVBox1 = new SceletVBox[7];
    private SceletVBox[] sceletVBox2 = new SceletVBox[4];
    private SceletVBox[] sceletVBox3 = new SceletVBox[7];
    private SceletVBox[] sceletVBox4 = new SceletVBox[/*7*/1];
    private JobControl jobControlTest = new JobControl();
    private JobControl jobControlTest1 = new JobControl();

    public void AddMenuButton(){
        getUpr();
    }
    public void AddMenuButton1(){
        getUpr1();
    }

    private void getUpr(){

        sceletVBox1[0] = new SceletVBox(new Label[15], new Label[16], new String[32], new String[32],
                fileAppEnPSA, fileAppRuPSA);
        sceletVBox1[1] = new SceletVBox(new Label[13], new Label[14], new String[27], new String[27],
                fileAppEnPSB, fileAppRuPSB);
        sceletVBox1[2] = new SceletVBox(new Label[12], new Label[12], new String[24], new String[24],
                fileAppEnPSC, fileAppRuPSC);
        sceletVBox1[3] = new SceletVBox(new Label[13], new Label[14], new String[27], new String[27],
                fileAppEnPSD, fileAppRuPSD);
        sceletVBox1[4] = new SceletVBox(new Label[10], new Label[10], new String[20], new String[20],
                fileAppEnPSE, fileAppRuPSE);
        sceletVBox1[5] = new SceletVBox(new Label[15], new Label[15], new String[30], new String[30],
                fileAppEnPSF, fileAppRuPSF);
        sceletVBox1[6] = new SceletVBox(new Label[17], new Label[17], new String[34], new String[34],
                fileAppEnPSG, fileAppRuPSG);

        sceletVBox2[0] = new SceletVBox(new Label[16], new Label[17], new String[33], new String[33],
                fileNegEnPSA, fileNegRuPSA);
        sceletVBox2[1] = new SceletVBox(new Label[11], new Label[11], new String[22], new String[22],
                fileNegEnPSB, fileNegRuPSB);
        sceletVBox2[2] = new SceletVBox(new Label[17], new Label[17], new String[34], new String[34],
                fileNegEnPSC, fileNegRuPSC);
        sceletVBox2[3] = new SceletVBox(new Label[11], new Label[11], new String[22], new String[22],
                fileNegEnPSD, fileNegRuPSD);

        sceletVBox3[0] = new SceletVBox(new Label[17], new Label[18], new String[35], new String[35],
                fileQuesEnPSA, fileQuesRuPSA);
        sceletVBox3[1] = new SceletVBox(new Label[14], new Label[15], new String[29], new String[29],
                fileQuesEnPSB, fileQuesRuPSB);
        sceletVBox3[2] = new SceletVBox(new Label[9], new Label[10], new String[19], new String[19],
                fileQuesEnPSC, fileQuesRuPSC);
        sceletVBox3[3] = new SceletVBox(new Label[19], new Label[19], new String[38], new String[38],
                fileQuesEnPSD, fileQuesRuPSD);
        sceletVBox3[4] = new SceletVBox(new Label[15], new Label[15], new String[30], new String[30],
                fileQuesEnPSE, fileQuesRuPSE);
        sceletVBox3[5] = new SceletVBox(new Label[12], new Label[12], new String[24], new String[24],
                fileQuesEnPSF, fileQuesRuPSF);
        sceletVBox3[6] = new SceletVBox(new Label[14], new Label[15], new String[29], new String[29],
                fileQuesEnPSG, fileQuesRuPSG);

        jobControlTest.exercise1(sceletVBox1, sceletVBox2, sceletVBox3,
                new Button[7], new Button[4], new Button[7]);
    }
    private void getUpr1(){

        sceletVBox4[0] = new SceletVBox(new Label[50], new String[50], new String[50],
                fileExamEnPSA, fileExamRuPSA, new Label[50], new Label[50]);

        jobControlTest1.examMethod(sceletVBox4,new Button[/*7*/1]);
    }
}
