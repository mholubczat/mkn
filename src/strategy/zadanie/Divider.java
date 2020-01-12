package strategy.zadanie;

public class Divider implements CalcStrategy {
    @Override
    public int calculate(int a, int b) {
        return a/b;
    }
}
