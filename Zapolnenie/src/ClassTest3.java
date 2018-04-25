import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.IOException;

public class ClassTest3 implements ITest2
{

    public ClassTest3(Label[] labels, String[] strEn, String[] strRu, String fileEn, String fileRu, int iMim, int iMax, int center, int x1, int x2, int y, int yH) {
        this.labels = labels;
        this.strEn = strEn;
        this.strRu = strRu;
        this.fileEn = fileEn;
        this.fileRu = fileRu;
        this.iMim = iMim;
        this.iMax = iMax;
        this.center = center;
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;
        this.yH = yH;
    }

    private Label[] labels;
    private String[] strEn;
    private String[] strRu;
    private String fileEn;
    private String fileRu;
    private int iMim;
    private int iMax;
    private int center;
    private int x1;
    private int x2;
    private int y;
    private int yH;

    private Label[] getTestCl() throws IOException {
        BufferedReader s = tTTT(fileEn);
        BufferedReader br1 = tTTT(fileRu);

        for (int i = iMim; i < iMax; i++) {

            if(i<center) {
                strEn[i] = s.readLine();
                strRu[i] = br1.readLine();
                root.getChildren().addAll(testGetLabel(labels[i], strEn[i], strRu[i], x1, y + (i* yH)));
            } else {
                strEn[i] = s.readLine();
                strRu[i] = br1.readLine();
                root.getChildren().addAll(testGetLabel(labels[i], strEn[i], strRu[i], x2, y +((i-center)*yH)));
            }
        }
        return labels;
    }

    public Label[] getLabels() throws IOException {
        getTestCl();
        return labels;
    }
}
