import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First value: ");
        float first_value = scanner.nextFloat();
        System.out.print("Second value: ");
        float second_value = scanner.nextFloat();
        System.out.print("Third value: ");
        float third_value = scanner.nextFloat();

        float lower = first_value;
        if (lower > second_value) {
            lower = second_value;
        }
        if (lower > third_value) {
            lower = third_value;
        }
        System.out.println("Lower: " + lower);
    }
}