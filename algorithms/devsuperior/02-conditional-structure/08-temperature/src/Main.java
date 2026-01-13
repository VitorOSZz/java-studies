import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you will enter the temperature in (C/F): ");
        String temperature_Typo = scanner.next().toUpperCase();
        System.out.print("Enter the temperature: ");
        float temperature = scanner.nextFloat();

        if (Objects.equals(temperature_Typo, "F")) {
            float celsius = (((float) 5 /9)*(temperature-32));
            String celsius_Formatted = String.format("%.2f", celsius);
            System.out.println("Temperature equivalent in Celsius: " + celsius_Formatted);
        } else {
            float fahrenheit = (float) ((temperature)*1.8)+32;
            String fahrenheit_Formatted = String.format("%.2f", fahrenheit);
            System.out.println("Temperature equivalent in Fahrenheit: " + fahrenheit_Formatted);
        }
    }
}