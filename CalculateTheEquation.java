import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateTheEquation implements CalculateTheEquationInterface {
    @Override
    public double doCalculation(double variable) {
        try {
            return Math.tan(variable) / (1/Math.tan(variable));
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception: illegal value.");
        }
        return 0;
    }

    @Override
    public double doCalculationWithInputInside() {
        try {
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Enter value: ");
            double value = inputScanner.nextDouble();
            inputScanner.nextLine();
            return Math.tan(value) / (Math.sin(4*value) - 2*Math.cos(value));



        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception: illegal value.");
        }
        catch (InputMismatchException e){
            System.out.println("Input exception: illegal value.");
        }
        return 0;
    }
}
