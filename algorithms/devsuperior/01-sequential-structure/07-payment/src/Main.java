import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the name of employee");
        String name = scanner.nextLine();

        System.out.println("Insert the value per hour");
        float value_Hour = scanner.nextFloat();

        System.out.println("Insert the quantity hours worked");
        int hours = scanner.nextInt();

        System.out.println("The payment to " + name + " is: " + (hours*value_Hour));
    }
}