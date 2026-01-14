import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many elements will have the array: ");
        int times = scanner.nextInt();

        float[] array = new float[times];
        for (int i = 0; i < times; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextFloat();
        }

        float total = 0;
        for (float f : array) {
            total += f;
        }
        float average = total/times;
        System.out.println("Average value of array: " + average);

        System.out.println("Elements under the average: ");
        for (float f : array) {
            if (f < average) {
                System.out.println(f);
            }
        }

    }
}