import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();


        int sum = 0;
        for (int i = (Math.min(first,second))+1; i < Math.max(first, second); i++) {
            if (i % 2 == 1 || i % 2 == -1) {
                sum += i;
            }
        }

        System.out.println("Sum: " + sum);
    }
}