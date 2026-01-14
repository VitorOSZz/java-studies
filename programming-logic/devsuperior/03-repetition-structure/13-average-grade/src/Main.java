import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many items do you want to digit: ");
        int times = scanner.nextInt();

        for (int i = 0; i < times; i++) {
            System.out.println("Digit three numbers:");
            System.out.print("1: ");
            float first = scanner.nextFloat();
            System.out.print("2: ");
            float second = scanner.nextFloat();
            System.out.print("3: ");
            float third = scanner.nextFloat();
            float average = ((first*2)+(second*3)+(third*5))/(2+3+5);
            System.out.println("Average: " + String.format("%.1f", average));
        }
    }
}