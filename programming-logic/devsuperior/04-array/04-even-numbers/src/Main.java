import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many items do you want to digit: ");
        int times = scanner.nextInt();

        int[] numbers = new int[times];

        for (int i = 0; i < times; i++) {
            System.out.print("Digit a number: ");
            numbers[i] = scanner.nextInt();
        }

        int total_evens = 0;
        System.out.println("Even Numbers: ");
        for (int i : numbers) {
            if (i % 2  == 0) {
                System.out.print(" " + i + " ");
                total_evens++;
            }
        }
        System.out.println();
        System.out.println("Quantity of evens: " + total_evens);
    }
}