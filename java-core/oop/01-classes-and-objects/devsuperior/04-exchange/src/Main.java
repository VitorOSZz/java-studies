import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the value of USD: ");
        double priceUSD = scanner.nextDouble();

        System.out.print("How many USD will be bought: ");
        double quantity = scanner.nextDouble();

        System.out.println("Value to pay: " + CurrencyConverter.totalPriceWithTax(priceUSD, quantity));

    }
}