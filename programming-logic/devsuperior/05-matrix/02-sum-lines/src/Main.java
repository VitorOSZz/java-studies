import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the quantity of lines in matrix: ");
        int lines = scanner.nextInt();
        System.out.print("What is the quantity of columns in matrix: ");
        int columns = scanner.nextInt();

        float[][] matrix = new float[lines][columns];

        for (int i = 0; i < lines; i++) {
            System.out.println("Enter the elements of " + i + "th line");
            for (int j = 0; j < columns; j++) {
                System.out.print(j + "- ");
                matrix[i][j] = scanner.nextFloat();
            }
        }


        System.out.println("Sum: ");
        for (int i = 0; i < lines; i++) {
            float x = 0;
            for (int j = 0; j < columns; j++) {
                x+=matrix[i][j];
            }
            System.out.println("Line " + i + ": " + x);
        }
    }
}