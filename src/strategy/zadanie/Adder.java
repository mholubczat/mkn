package strategy.zadanie;

public class Adder implements CalcStrategy {
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
