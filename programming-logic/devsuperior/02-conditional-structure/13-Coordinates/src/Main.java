import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of X: ");
        float x = scanner.nextFloat();
        System.out.println("Value of Y: ");
        float y = scanner.nextFloat();

        System.out.print("this point is in: ");
        if (x == 0 && y == 0) {
            System.out.println("Origin");
        }
        // Q1
        if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        // Q2
        if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        // Q3
        if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        // Q4
        if (x > 0 && y < 0) {
            System.out.println("Q4");
        }

        // Axis
        // Axis X
        if (y == 0 && x != 0) {
            System.out.println("Axis X");
        }
        // Axis Y
        if (y != 0 && x == 0) {
            System.out.println("Axis Y");
        }
    }
}