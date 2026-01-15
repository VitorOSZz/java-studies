import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many lines will have in each matrix: ");
        int lines = scanner.nextInt();
        System.out.print("How many columns will have in each matrix: ");
        int columns = scanner.nextInt();

        int[][] matrixA = new int[lines][columns];
        int[][] matrixB = new int[lines][columns];

        System.out.println("Enter the values of matrix A:");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element ["+i+","+j+"]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the values of matrix B:");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element ["+i+","+j+"]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        int[][] matrixC = new int[lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrixC[i][j] = (matrixA[i][j])+(matrixB[i][j]);
            }
        }
        
        System.out.println();
        System.out.println("Matrix A: ");
        show_int_matrix(matrixA);
        System.out.println();
        System.out.println("Matrix B: ");
        show_int_matrix(matrixB);
        System.out.println();
        System.out.println("Sum matrix: ");
        System.out.println("Matrix C: ");
        show_int_matrix(matrixC);
    }
    public static void show_int_matrix(int[][] matrix) {
        for (int[] i : matrix) {
            System.out.print("[ ");
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}