import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value to see its multiplication: ");
        int number = scanner.nextInt();

        multiplication_table(number);
    }

    public static void multiplication_table(int number) {
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}