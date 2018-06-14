package db;

import javafx.scene.layout.HBox;

public class AddMistakesTable
{
    private String dateTime;
    private String numberText;
    private String originalText;
    private HBox mistakesText;
    private String numberPart;

    public AddMistakesTable(String dateTime, String numberText, String originalText, HBox mistakesText, String numberPart) {
        this.dateTime = dateTime;
        this.numberText = numberText;
        this.originalText = originalText;
        this.mistakesText = mistakesText;
        this.numberPart = numberPart;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getNumberText() {
        return numberText;
    }

    public String getOriginalText() {
        return originalText;
    }

    public HBox getMistakesText() {
        return mistakesText;
    }

    public String getNumberPart() {
        return numberPart;
    }

    @Override
    public String toString() {
        return "AddMistakesTable{" +
                "dateTime='" + dateTime + '\'' +
                ", numberText='" + numberText + '\'' +
                ", originalText='" + originalText + '\'' +
                ", mistakesText=" + mistakesText +
                ", numberPart='" + numberPart + '\'' +
                '}';
    }
}
