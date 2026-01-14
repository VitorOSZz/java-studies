import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ages");

        boolean while_continue = true;
        int age = 0;
        int total_age = 0;
        int times = 0;
        while (while_continue) {
            times++;
            age = scanner.nextInt();

            if ( age < 0 && total_age == 0) {
                System.out.println("Impossible calculate.");
                while_continue = false;
            }
            if (age > 0) {
                total_age += age;
            } else if (age < 0 && total_age > 0) {
                System.out.println("Average: " + String.format("%.2f",(float) total_age/(times-1)) );
                while_continue = false;
            }
        }
    }
}