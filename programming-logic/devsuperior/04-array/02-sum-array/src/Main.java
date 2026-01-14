import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers you will digit: ");
        int times = scanner.nextInt();

        float[] array = new float[times];

        for (int i = 0; i < times; i++) {
            System.out.print("Digit a number: ");
            array[i] =scanner.nextFloat();
        }

        System.out.print("Values:");
        for (float i : array) {
            System.out.print(" " + i + " ");
        }
        float sum = 0;
        for (float i : array) {
            sum += i;
        }
        System.out.println();
        System.out.println("Sum: " + sum );
        System.out.println("Average: " + (sum/times));
    }
}