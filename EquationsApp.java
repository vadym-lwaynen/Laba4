public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        System.out.println(" y=tg(x)/(sin(4x) – 2cos(x)) = " + calc.doCalculation(100));
        System.out.println(" y=tg(x)/(sin(4x) – 2cos(x)) = " + calc.doCalculation(8));
        System.out.println(" y=tg(x)/(sin(4x) – 2cos(x)) = " + calc.doCalculation(-5555));

        System.out.println(" y=tg(x)/(sin(4x) – 2cos(x)) = " + calc.doCalculationWithInputInside());
    }
}
