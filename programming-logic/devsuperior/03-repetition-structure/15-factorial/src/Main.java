import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial: " + factorial);
    }
}