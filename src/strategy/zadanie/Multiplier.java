package strategy.zadanie;

public class Multiplier implements CalcStrategy {
    @Override
    public int calculate(int a, int b) {
        return a*b;
    }
}
