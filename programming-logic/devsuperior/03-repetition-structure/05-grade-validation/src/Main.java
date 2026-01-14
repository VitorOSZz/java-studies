import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first grade: ");
        float first_grade = scanner.nextFloat();

        while (first_grade < 0 || first_grade > 10) {
            System.out.print("Value invalid! Try again: ");
            first_grade = scanner.nextFloat();
        }

        System.out.print("Enter second grade: ");
        float second_grade = scanner.nextFloat();

        while (second_grade < 0 || second_grade > 10) {
            System.out.print("Value invalid! Try again: ");
            second_grade = scanner.nextFloat();
        }

        System.out.println("Average: " + ((first_grade+second_grade)/2));

    }
}