package strategy.zadanie;

public class CalculatorContext {
    private CalcStrategy strategy;

    public void set(CalcStrategy strategy){this.strategy=strategy;}

    public void calculate(int a, int b){
        int result = strategy.calculate(a,b);
        System.out.println(result);
    }
}
