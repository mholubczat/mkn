package strategy;

public class StringFormatter {
    private String format;

    public StringFormatter(String format) {
        this.format = format;
    }

    public String format(String text) {
        if (format.equals("upperCase")) {
            return text.toUpperCase();
        } else if (format.equals("lowerCase")) {
            return text.toLowerCase();
        } else if (format.equals("capitalize")) {
            return text.substring(0, 1).toUpperCase() + text.substring(1);
        } else {
            System.out.println("Brak formatu");
            return text;
        }
    }
}
