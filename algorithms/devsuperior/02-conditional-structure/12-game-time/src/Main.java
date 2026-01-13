import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Initial hour: ");
        int hour_initial = scanner.nextInt();
        System.out.print("Initial hour: ");
        int hour_final = scanner.nextInt();

        System.out.print("your playtime is: ");

        if (hour_initial>hour_final) {
            System.out.print((24-hour_initial)+hour_final);
        }
        else if (hour_final>hour_initial) {
            System.out.print(hour_final-hour_initial);
        } else {
            System.out.print("24");
        }

        System.out.println(" Hours.");


    }
}