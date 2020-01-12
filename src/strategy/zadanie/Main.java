package strategy.zadanie;

public class Main {
    public static void main(String[] args) {
        int a = 8;
        int b = 8;

        CalculatorContext calculator = new CalculatorContext();
        CalcStrategy add = new Adder();
        CalcStrategy divide = new Divider();
        CalcStrategy multiply = new Multiplier();
        CalcStrategy subtract = new Subtractor();

        calculator.set(add);
        calculator.calculate(a, b);
        calculator.set(divide);
        calculator.calculate(a, b);
        calculator.set(multiply);
        calculator.calculate(a, b);
        calculator.set(subtract);
        calculator.calculate(a, b);
    }
}
