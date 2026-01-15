import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is quantity lines of matrix: ");
        int lines = scanner.nextInt();
        System.out.print("What is quantity columns of matrix: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element ["+i+","+j+"]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Negatives numbers: [ ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        System.out.println("]");
    }
}