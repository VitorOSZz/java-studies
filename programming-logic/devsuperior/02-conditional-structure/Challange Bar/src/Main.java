import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your gender, M for male, F for female: ");

        String gender = (scanner.nextLine()).toUpperCase().replace(" ","");

        int ticket = 0;
        int couvert = 0;
        if (Objects.equals(gender, "M")) {
            ticket = 10;
        } else if (Objects.equals(gender, "F")) {
            ticket = 8;
            couvert = 4;
        }

        System.out.println("Beer Quantity");
        int beer = scanner.nextInt();
        System.out.println("Refrigerant Quantity");
        int refrigerant = scanner.nextInt();
        System.out.println("Skewer Quantity");
        int skewer = scanner.nextInt();

        // Result
        System.out.println("--Result");

        int consume = (beer*5)+(refrigerant*3)+(skewer*7);
        System.out.println("Consume: " + consume);

        System.out.print("Couvert: ");
        if (couvert == 0) {
            System.out.println("Free");
        } else {
            System.out.println(couvert);
        }
        System.out.println("Ticket: " + ticket);
        System.out.println();
        int total = consume+couvert+ticket;
        System.out.println("Total: "+ total);
    }
}