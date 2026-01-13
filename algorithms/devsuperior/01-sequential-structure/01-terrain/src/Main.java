import java.math.MathContext;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the terrain width");
        float terrain_width = scanner.nextFloat();

        System.out.println("Insert the terrain height");
        float terrain_height = scanner.nextFloat();

        System.out.println("Insert the square meter price");
        float terrain_meter_price = scanner.nextFloat();

        double terrain_area = terrain_height * terrain_width;
        System.out.println("Terrain area: " + terrain_area);
        System.out.println("Terrain price: " + (terrain_area * terrain_meter_price));

    }

}