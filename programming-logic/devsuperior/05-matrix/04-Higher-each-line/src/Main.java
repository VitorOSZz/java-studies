import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Whats is the size of matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Element ["+i+","+j+"]: ");
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Higher of each line: ");

        for (int i = 0; i < size; i++) {
            int higher = matrix[i][0];
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] > higher) {
                    higher = matrix[i][j];
                }
            }
            System.out.println(higher);
        }
    }
}