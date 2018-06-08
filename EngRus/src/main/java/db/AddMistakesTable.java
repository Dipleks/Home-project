package db;

public class AddMistakesTable
{
    String numberText;
    String originalText;
    String mistakesText;

    public AddMistakesTable(String numberText, String originalText, String mistakesText) {
        this.numberText = numberText;
        this.originalText = originalText;
        this.mistakesText = mistakesText;
    }

    public String getNumberText() {
        return numberText;
    }

    public String getOriginalText() {
        return originalText;
    }

    public String getMistakesText() {
        return mistakesText;
    }

    @Override
    public String toString() {
        return "AddMistakesTable{" +
                "numberText='" + numberText + '\'' +
                ", originalText='" + originalText + '\'' +
                ", mistakesText='" + mistakesText + '\'' +
                '}';
    }
}
