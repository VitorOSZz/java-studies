import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Each array will have how many items: ");
        int times = scanner.nextInt();

        System.out.println("Enter the values of array A");
        int[] arrayA = new int[times];
        for (int i = 0; i < times; i++) {
            System.out.print(i + "- ");
            arrayA[i] = scanner.nextInt();
        }

        System.out.println("Enter the values of array B");
        int[] arrayB = new int[times];
        for (int i = 0; i < times; i++) {
            System.out.print(i + "- ");
            arrayB[i] = scanner.nextInt();
        }

        System.out.println("Sum Array: ");
        for (int i = 0; i < times; i++) {
            System.out.println((arrayA[i] + arrayB[i]));
        }

    }
}