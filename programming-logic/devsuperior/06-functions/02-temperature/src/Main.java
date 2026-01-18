import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        float fahrenheit = scanner.nextFloat();

        System.out.println("Temperature in Celsius: " + String.format("%.2f", fahrenheit_to_celsius(fahrenheit)));
    }

    public static float fahrenheit_to_celsius(float fahrenheit) {
        return ((float) 5 /9)*(fahrenheit-32);
    }
}