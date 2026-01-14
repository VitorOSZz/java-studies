import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int first = 0;
        int second = 1;

        do {
            System.out.println("===");
            System.out.println("Enter two numbers:");
            System.out.print("first: ");
            first = scanner.nextInt();
            System.out.print("second: ");
            second = scanner.nextInt();

            if (first > second) {
                System.out.println("Descending.");
            } else if (second > first) {
                System.out.println("Ascending.");
            } else {
                System.out.println("Equal.");
            }
            Thread.sleep(500);

        } while (first != second);


    }
}