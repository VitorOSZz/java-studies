import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of X and Y");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        do {
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

            System.out.println("Enter the value of X and Y");
            System.out.print("x: ");
            x = scanner.nextInt();
            System.out.print("y: ");
            y = scanner.nextInt();

        } while (x != 0 && y !=0);
    }
}