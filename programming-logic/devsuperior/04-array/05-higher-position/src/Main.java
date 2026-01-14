import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digit how many numbers you will digit: ");
        int times = scanner.nextInt();

        float[] numbers = new float[times];

        for (int i = 0; i < times; i++) {
            System.out.print("Digit a number: ");
            numbers[i] = scanner.nextFloat();
        }

        float higher = 0;
        int higher_index= 0;
        int index = 0;
        for (float i : numbers) {
            if (Math.max(higher, i) == i ) {
                higher = i;
                higher_index = index;
            }
            index++;
        }

        System.out.println("Higher value: " + higher);
        System.out.println("Higher value index: " + higher_index);
    }
}