import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculation of Grading System!");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        String[] names = new String[numStudents];
        double[] marks = new double[numStudents];
        input.nextLine();
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = input.nextDouble();
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.print(names[i] + " (" + marks[i] + "): ");

            if (marks[i] >= 90) {
                System.out.println("Grade: A");
            } else if (marks[i] >= 75) {
                System.out.println("Grade: B");
            } else if (marks[i] >= 50) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: F");
            }
        }
    }
}
