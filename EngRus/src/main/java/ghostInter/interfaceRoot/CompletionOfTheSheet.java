package ghostInter.interfaceRoot;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.util.Callback;

import java.io.BufferedReader;
import java.io.IOException;

public class CompletionOfTheSheet implements ITemple, Root
{
    public CompletionOfTheSheet(Label[] arrayOfOffers, String[] arrayStrEn, String[] arrayStrRu,
                                String fileEn, String fileRu, int iMim, int iMax,
                                int center, double x1, double x2, double y, double theDistanceFromTheText)
    {
        this.arrayOfOffers = arrayOfOffers;
        this.arrayStrEn = arrayStrEn;
        this.arrayStrRu = arrayStrRu;
        this.fileEn = fileEn;
        this.fileRu = fileRu;
        this.iMim = iMim;
        this.iMax = iMax;
        this.center = center;
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;
        this.theDistanceFromTheText = theDistanceFromTheText;
    }

    private Label[] arrayOfOffers;
    private String[] arrayStrEn;
    private String[] arrayStrRu;
    private String fileEn;
    private String fileRu;
    private int iMim;
    private int iMax;
    private int center;
    private double x1;
    private double x2;
    private double y;
    private double theDistanceFromTheText;

    public Label[] getArrayOfOffers() throws IOException {
        gettingWordTable();
        return arrayOfOffers;
    }

    private Label[] gettingWordTable() throws IOException {
        BufferedReader reading1 = readingFromSheet(fileEn);
        BufferedReader reading2 = readingFromSheet(fileRu);

        for (int i = iMim; i < iMax; i++) {

            if(i<center) {
                arrayStrEn[i] = reading1.readLine();
                arrayStrRu[i] = reading2.readLine();
                ROOT.getChildren().addAll(complete(arrayOfOffers[i], arrayStrEn[i], arrayStrRu[i],
                        x1, y + (i* theDistanceFromTheText)));
            } else {
                arrayStrEn[i] = reading1.readLine();
                arrayStrRu[i] = reading2.readLine();
                ROOT.getChildren().addAll(complete(arrayOfOffers[i], arrayStrEn[i], arrayStrRu[i],
                        x2, y +((i-center)* theDistanceFromTheText)));
            }
        }
        return arrayOfOffers;
    }

}
