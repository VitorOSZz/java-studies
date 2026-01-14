import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many elements will have in array: ");
        int times = scanner.nextInt();

        int[] array = new int[times];
        for (int i = 0; i < times; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }

        int total_even = 0;
        int quantity_even = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                total_even += i;
                quantity_even++;
            }
        }

        if (quantity_even > 0) {
            System.out.println("Average of evens: " + ((float) total_even/quantity_even));
        } else {
            System.out.println("Any even number.");
        }

    }
}