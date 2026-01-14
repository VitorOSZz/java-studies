import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many items do you want to digit: ");
        int times = scanner.nextInt();

        for (int i = 0; i < times; i++) {
            System.out.print("Digit a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("Null");
            } else if (number % 2 == 0) {
                System.out.print("even ");
                if (number > 0) {
                    System.out.println("positive");
                } else {
                    System.out.println("negative");
                }
            } else if (number % 2 == 1 || number % 2 == -1) {
                System.out.print("odd ");
                if (number > 0) {
                    System.out.println("positive");
                } else {
                    System.out.println("negative");
                }
            }
        }
    }
}