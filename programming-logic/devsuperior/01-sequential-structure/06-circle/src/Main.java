import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert circle radius");
        float radius = scanner.nextFloat();

        double area = Math.PI*(Math.pow(radius, 2));
        String area_Formated = String.format("%.3f", area);

        System.out.println("Area: " + area_Formated);
    }
}