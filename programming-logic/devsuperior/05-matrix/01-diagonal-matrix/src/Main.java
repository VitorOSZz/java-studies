import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the size of each array?");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Element ["+i+", " + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

//        for (int i = 0; i < size; i++) {
//            System.out.println();
//            for (int j = 0; j < size; j++) {
//                System.out.print("[" + matrix[i][j] + "], ");
//            }
//        }

        int quantity_negative_numbers = 0;
        System.out.println("Main diagonal: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ( i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
                if (matrix[i][j] < 0) {
                    quantity_negative_numbers++;
                }
            }
        }
        System.out.println();
        System.out.println("Quantity of negative numbers: " + quantity_negative_numbers);
    }
}