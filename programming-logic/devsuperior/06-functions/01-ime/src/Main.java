import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        float weight = scanner.nextFloat();
        System.out.print("Enter your height: ");
        float height = scanner.nextFloat();

        System.out.println("IMC: " + String.format("%.2f", imc(weight, height)));
    }

    public static float imc(float weight, float height) {
        return (float) ((weight)/(Math.pow(height, 2)));
    }
}