import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is size of the matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size] [size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Element ["+i+","+j+"]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int total_above = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j> i ) {
                    total_above+= matrix[i][j];
                }
            }
        }

        System.out.println("Total above: " + total_above);


    }
}