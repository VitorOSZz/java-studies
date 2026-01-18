import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the exchange of USD/BRL: ");
        float price_usd = scanner.nextFloat();

        System.out.print("How many BRLs you have: ");
        float money = scanner.nextFloat();

        System.out.println("You can buy " + String.format("%.2f", brl_to_usd(money, price_usd)) + " USD with " + money + " BRL.");
    }

    public static float brl_to_usd(float brl, float usd) {
        return brl/usd;
    }
}