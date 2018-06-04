package db;

public class AddStatisticTable
{

    private String dateTime;
    private String returnY;
    private String returnN;

    public AddStatisticTable(String dateTime, String returnY, String returnN) {
        this.dateTime = dateTime;
        this.returnY = returnY;
        this.returnN = returnN;
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
    @Override
    public String toString() {
        return "AddStatisticTable{" +
                "dateTime='" + dateTime + '\'' +
                ", returnY='" + returnY + '\'' +
                ", returnN='" + returnN + '\'' +
                '}';
    }

}
