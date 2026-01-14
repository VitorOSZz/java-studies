import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value to X: ");
        int x = scanner.nextInt();

        if (x > 0) {
            for (int i = 0; i < (x+1); i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = x; i < 0; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }


    }
}