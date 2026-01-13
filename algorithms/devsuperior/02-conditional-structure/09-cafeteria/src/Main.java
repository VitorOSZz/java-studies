import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Code of product bought: ");
        int id_product = scanner.nextInt();
        System.out.println("Quantity bought: ");
        int quantity = scanner.nextInt();

        float total = 0;

        switch (id_product) {
            case 1:
                total = quantity*5;
                break;
            case 2:
                total = (float) (quantity*3.50);
                break;
            case 3:
                total = (float) (quantity*4.80);
                break;
            case 4:
                total = (float) (quantity*8.90);
                break;
            default:
                total = (float) (quantity*7.32);
        }

        System.out.println("Value to pay: " + total);
    }
}