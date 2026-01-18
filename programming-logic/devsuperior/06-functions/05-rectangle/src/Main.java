import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base value of the rectangle: ");
        float base = scanner.nextFloat();
        System.out.println("Enter the height value of the rectangle: ");
        float height = scanner.nextFloat();

        System.out.println("Diagonal: " + diagonal(base, height));
        System.out.println("Area: " + area(base, height));
        System.out.println("Perimeter: " + perimeter(base, height));
    }

    public static float diagonal(float base,float height) {
        return (float) Math.sqrt(((float) (Math.pow(base, 2) +(Math.pow(height, 2)))));
    }

    public static float area(float base,float height) {
        return base*height;
    }
    public static float perimeter(float base,float height) {
        return (base*2+height*2);
    }
}