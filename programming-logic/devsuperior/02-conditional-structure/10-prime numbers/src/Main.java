import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers numbers");
        int number_First = scanner.nextInt();
        int number_Second = scanner.nextInt();

        float division_first = number_First/number_Second;
        float division_second = number_Second /number_First;

        boolean multiples = false;
        if ((division_first * number_Second) == (double) number_First) {
            multiples = true;
        } else if ((division_second * number_First) == (double) number_Second) {
            multiples = true;
        }

        if (multiples) {
            System.out.println("Are multiples");
        } else {
            System.out.println("Are NOT multiples");
        }
    }
}