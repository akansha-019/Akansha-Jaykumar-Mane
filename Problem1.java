import java.util.Scanner;

class Calculator {

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public double subtract(double a, double b) {
        return a - b;
    }

  
    public double multiply(double a, double b) {
        return a * b;
    }

    
    public double divide(double a, double b) {
        return a / b;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter 2 numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Enter the Operator (+, -, *, /):");
        String operator = sc.next();

        switch (operator) {
            case "+":
                System.out.println("Summation = " + calc.add(a, b));
                break;
            case "-":
                System.out.println("Subtraction = " + calc.subtract(a, b));
                break;
            case "*":
                System.out.println("Multiplication = " + calc.multiply(a, b));
                break;
            case "/":
                System.out.println("Division = " + calc.divide(a, b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
