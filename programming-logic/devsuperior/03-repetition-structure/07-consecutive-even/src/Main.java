import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int number = scanner.nextInt();

        int total = 0;
        if (number % 2 == 0){ // even
            for (int i = 0; i < 5; i++) {
                total += (number)+(i*2);
            }
        } else { // odd
            number += 1;
            for (int i = 0; i < 5; i++) {
                total += (number)+(i*2);
            }
        }

        System.out.println("Sum: " + total);
    }
}