import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total Price of property: ");
        float price = scanner.nextFloat();
        System.out.print("Entry Value: ");
        float entry_value = scanner.nextFloat();
        System.out.print("Will be financed in how many months: ");
        int months = scanner.nextInt();

        System.out.println("Value of each provision: " + value_each_provision(price, entry_value, months));
    }

    public static float value_each_provision(float total_price, float entry_value, int months) {
        total_price -= entry_value;
        return total_price/months;
    }
}