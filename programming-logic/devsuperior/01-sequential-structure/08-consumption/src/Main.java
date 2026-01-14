import java.text.Format;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the distance traveled");
        int distance_traveled = scanner.nextInt();
        System.out.println("Enter the fuel consumed");
        float fuel_consumed = scanner.nextFloat();

        double average_consume = distance_traveled/fuel_consumed;

        String average_consume_Formatted = String.format("%.3f", average_consume);

        System.out.println("Average consume: " + average_consume_Formatted);
    }
}