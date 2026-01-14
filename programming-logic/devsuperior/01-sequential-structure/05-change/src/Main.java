import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the unit price");
        int unit_price = scanner.nextInt();

        System.out.println("Insert the quantity bought");
        int quantity_bought = scanner.nextInt();

        System.out.println("Insert the money payed");
        float money_payed = scanner.nextFloat();

        float balance = money_payed - (quantity_bought*unit_price);

        System.out.println("Change: " + balance);
    }
}