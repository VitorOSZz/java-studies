import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unit price: ");
        float unit_price = scanner.nextFloat();

        System.out.print("Enter the quantity bought: ");
        float quantity = scanner.nextFloat();

        System.out.print("Enter the money payed: ");
        float money_payed = scanner.nextFloat();

        if ((quantity*unit_price) <= money_payed) {
            System.out.println("Change: " + (money_payed-(quantity*unit_price)));
        } else {
            System.out.println("Insufficient money! short: " + ((quantity*unit_price)- money_payed));
        }
    }
}