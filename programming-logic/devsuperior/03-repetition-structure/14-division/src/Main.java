import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many times do you want to digit: ");
        int times = scanner.nextInt();

        for (int i = 0; i < times; i++) {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("=Division impossible");
            } else {
                System.out.println("=Division: " + ((float) numerator/denominator));
            }
        }
    }
}