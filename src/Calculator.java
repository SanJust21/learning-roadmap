import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to the Calculator!");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scan.nextDouble();

        System.out.print("Enter second number: ");
        double b = scan.nextDouble();

        System.out.print("Enter the operator (+ - * / %54): ");
        char operator = scan.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            case '%':
                if (b != 0) {
                    result = a % b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }

       System.out.println("The result is: " + result);
    }
}
