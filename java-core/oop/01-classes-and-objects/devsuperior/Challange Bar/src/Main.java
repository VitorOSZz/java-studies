import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bill bill = new Bill();
        System.out.print("Gender: ");
        bill.gender = scanner.next().charAt(0);

        System.out.print("How many beers: ");
        bill.beer = scanner.nextInt();
        System.out.print("How many barbecue: ");
        bill.barbecue = scanner.nextInt();
        System.out.print("How many soft Drinks: ");
        bill.softDrink = scanner.nextInt();


        System.out.println();
        System.out.println("Result:");
        System.out.println("Feeding: " + bill.feeding());
        System.out.println("Cover: " + bill.cover());
        System.out.println("Ticket: " + bill.ticket());


        System.out.println();
        System.out.println("Total to pay: " + bill.total());
    }
}