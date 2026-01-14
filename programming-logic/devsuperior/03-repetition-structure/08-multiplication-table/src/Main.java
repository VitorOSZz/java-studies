import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number you want to see multiple table: ");
        int number = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}