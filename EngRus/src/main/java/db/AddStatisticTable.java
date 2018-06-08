package db;

import javafx.scene.control.Button;

public class AddStatisticTable
{
    private String dateTime;
    private String returnY;
    private String returnN;
    private String numberPart;

    public AddStatisticTable(String dateTime, String returnY, String returnN, String numberPart) {
        this.dateTime = dateTime;
        this.returnY = returnY;
        this.returnN = returnN;
        this.numberPart = numberPart;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getReturnY() {
        return returnY;
    }

    public String getReturnN() {
        return returnN;
    }

    public String getNumberPart() {
        return numberPart;
    }

    @Override
    public String toString() {
        return "AddStatisticTable{" +
                "dateTime='" + dateTime + '\'' +
                ", returnY='" + returnY + '\'' +
                ", returnN='" + returnN + '\'' +
                ", numberPart='" + numberPart + '\'' +
                '}';
    }
}
