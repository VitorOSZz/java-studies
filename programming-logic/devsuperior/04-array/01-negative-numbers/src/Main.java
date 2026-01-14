import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers you want to digit: ");
        int times = scanner.nextInt();

        int[] numbers = new int[9];

        for (int i = 0; i < times; i++) {
            System.out.print("Digit a number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Negative numbers: ");
        for (int i : numbers) {
            if (i < 0) {
                System.out.println(i);
            }
        }
    }
}