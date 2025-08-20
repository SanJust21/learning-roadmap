import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {
        System.out.println("Welcome to the Biggest of Three Numbers program!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double c = scanner.nextDouble();
        double biggest;
        if (a >= b && a >= c) {
            biggest = a;
        } else if (b >= a && b >= c) {
            biggest = b;
        } else {
            biggest = c;
        }
        System.out.println("The biggest number is: " + biggest);
        scanner.close();
    }
}
