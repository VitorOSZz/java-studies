import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity of minutes: ");
        int minutes = scanner.nextByte();

        int extra = 0;
        if (minutes > 100) {
            extra = (minutes-100)*2;
        }
        int value_to_pay = 50 + extra;

        System.out.println("Total to pay: " + value_to_pay);
    }
}