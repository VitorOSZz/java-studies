import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a quantity of seconds");
        int seconds = scanner.nextInt();

        int hours = seconds / (60*60);
        int minutes = (seconds / 60) - (hours*60);
        int real_seconds = seconds - (hours*60*60) - (minutes*60);

        System.out.println(hours + ":" + minutes + ":" + real_seconds);
    }
}