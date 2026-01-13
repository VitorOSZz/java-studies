import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first grade: ");
        float first_grade = scanner.nextFloat();
        System.out.print("Enter your second grade: ");
        float second_grade = scanner.nextFloat();

        if ((first_grade+second_grade) >= 60) {
            System.out.println("Final grade: " + (first_grade+second_grade));
        } else {
            System.out.println("Failed");
        }
    }
}