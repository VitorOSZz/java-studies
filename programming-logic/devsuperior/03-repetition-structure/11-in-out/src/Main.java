import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to digit: ");
        int numbers_to_digit = scanner.nextInt();

        int in = 0;
        int out = 0;
        for (int i = 0; i < numbers_to_digit; i++) {
            System.out.print("Digit a number: ");
            int number = scanner.nextInt();

            if (number >= 10 && number <= 20) {
                in ++;
            } else {
                out++;
            }
        }
        System.out.println(in + " Inside");
        System.out.println(out + " outside");
    }
}