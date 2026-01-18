import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data of a rectangle");

        Rectangle rectangle = new Rectangle();

        System.out.print("Width: ");
        rectangle.width = scanner.nextDouble();
        System.out.print("Height: ");
        rectangle.height = scanner.nextDouble();



        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());
    }
}