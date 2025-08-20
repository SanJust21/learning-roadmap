import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Welcome to Odd or Even Program!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println("The number " + number + " is " + result + ".");
    }
}
