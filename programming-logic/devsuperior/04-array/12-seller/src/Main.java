import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many items will be digitized? ");
        int times = scanner.nextInt();

        String[] names = new String[times];
        float[] price_to_buy = new float[times];
        float[] price_to_sell = new float[times];
        for (int i = 0; i < times; i++) {
            System.out.println("Product " + (i+1) + ":");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Price to buy: ");
            float price_buy = scanner.nextFloat();
            System.out.print("Price to sell: ");
            float price_sell = scanner.nextFloat();

            names[i] = name;
            price_to_buy[i] = price_buy;
            price_to_sell[i] = price_sell;
        }
        int under_10 =0;
        int between_10_and_20 =0;
        int above_20 =0;
        float total_to_buy = 0;
        float total_to_sell = 0;

        int index = 0;
        for (String name : names) {
            float profit = ((price_to_sell[index]-price_to_buy[index])/price_to_buy[index]);

            if (profit > 0.2) {
                above_20 ++;
            } else if (profit >= 0.10 && profit <= 0.20) {
                between_10_and_20 ++;
            } else {
                under_10++;
            }

            total_to_buy += price_to_buy[index];
            total_to_sell += price_to_sell[index];

            index++;
        }

        System.out.println("==Report:");

        System.out.println("Profit under 10%: " + under_10);
        System.out.println("Profit between 10% and 20%: " + between_10_and_20);
        System.out.println("Profit above 20%: " + above_20);
        System.out.println("Value total to buy: " + total_to_buy);
        System.out.println("Value total to sell: " + total_to_sell);
        System.out.println("Profit total: " + (total_to_sell-total_to_buy));

    }
}