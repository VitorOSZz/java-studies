import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the width rectangle: ");
        float rectangle_width = scanner.nextFloat();
        System.out.println("Insert the height rectangle: ");
        float rectangle_height = scanner.nextFloat();

        float rectangle_area = rectangle_height*rectangle_width;
        float rectangle_perimeter = (rectangle_width*2)+(rectangle_height*2);

        double rectangle_diagonal = Math.sqrt(Math.pow(rectangle_width, 2)+ Math.pow(rectangle_height, 2));

        System.out.println("Area: " + rectangle_area);
        System.out.println("Perimeter: " + rectangle_perimeter);
        System.out.println("Diagonal: " + rectangle_diagonal);
    }
}