import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fixed_password = 2002;

        System.out.println("Enter the password: ");
        int password = scanner.nextInt();
        if (password == fixed_password) {
            System.out.println("Access allowed.");
        } else {
            while (password != fixed_password) {
                System.out.println("Invalid password! Try again: ");
                password = scanner.nextInt();
            }
            System.out.println("Access allowed.");
        }
    }
}