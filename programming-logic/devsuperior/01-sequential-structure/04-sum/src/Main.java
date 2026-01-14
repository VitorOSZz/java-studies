import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the value of X");
        int X = scanner.nextInt();
        System.out.println("Insert the value of Y");
        int Y = scanner.nextInt();

        System.out.println("SUM = " + (X+Y));
    }
}