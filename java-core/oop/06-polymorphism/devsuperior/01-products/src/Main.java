import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int times = scanner.nextInt();

        System.out.println("-".repeat(7));
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            System.out.println("-Product #" + (i+1) + " data:");
            System.out.println("Common, used or imported");
            System.out.println("Common: 1");
            System.out.println("Used: 2");
            System.out.println("Imported: 3");
            System.out.print("Answer: ");
            int commonOrUsedOrImported = scanner.nextInt();

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            Product product;
            switch (commonOrUsedOrImported) {
                case 2:
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                    scanner.nextLine();
                    LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);
                    product = new UsedProduct(name, price, date);
                    break;
                case 3:
                    System.out.print("Custom fee: ");
                    double customFee = scanner.nextDouble();
                    product = new ImportedProduct(name, price, customFee);
                    break;
                default:
                    product = new Product(name, price);
            }

            productList.add(product);
        }

        System.out.println();
        System.out.println("-".repeat(7));
        System.out.println("Price Tag");

        for (Product product : productList) {
            System.out.println(product.priceTag());
        }
    }
}