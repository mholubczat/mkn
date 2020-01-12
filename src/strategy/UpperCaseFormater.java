package strategy;

public class UpperCaseFormater implements TextFormatterStrategy {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
