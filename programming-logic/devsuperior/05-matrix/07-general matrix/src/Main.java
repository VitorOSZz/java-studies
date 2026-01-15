import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the size of matrix: ");
        int size = scanner.nextInt();

        float[][] matrix = new float[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Element [" + i + "," + j + "]: ");
                matrix[i][j] = scanner.nextFloat();
            }
        }

        int positive_sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] > 0 ) {
                    positive_sum += matrix[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("Sum of positives: " + positive_sum);

        System.out.println();
        System.out.print("Choose a line: ");
        int line = scanner.nextInt();

        System.out.print("Line selected: [ ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == line) {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
        }
        System.out.print("]");

        System.out.println();
        System.out.println();
        System.out.print("Choose a column: ");
        int column = scanner.nextInt();

        System.out.print("Column selected: [ ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == column) {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.println();
        System.out.println("Main Diagonal: ");
        System.out.print("[ ");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                if (i == j) {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
        }
        System.out.println("]");

        System.out.println("Alternated Matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] < 0) {
                    System.out.print(" " + Math.pow(matrix[i][j], 2) + " ");
                } else {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}