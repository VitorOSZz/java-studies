import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the measure A");
        float measure_A = scanner.nextFloat();

        System.out.println("Enter the measure B");
        float measure_B = scanner.nextFloat();

        System.out.println("Enter the measure C");
        float measure_C = scanner.nextFloat();

        double square_area = Math.pow(measure_A, 2);
        double triangle_area = (measure_A*measure_B)/2;
        double trapezium_area = ((measure_A+measure_B)*measure_C)/2;

        System.out.println("Area of square: " + String.format("%.4f",square_area));
        System.out.println("Area of triangle: " + String.format("%.4f",triangle_area));
        System.out.println("Area of trapezium: " + String.format("%.4f",trapezium_area));
    }
}