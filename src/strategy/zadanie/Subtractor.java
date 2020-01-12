package strategy.zadanie;

public class Subtractor implements CalcStrategy {
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}

