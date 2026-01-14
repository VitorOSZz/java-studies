import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of athletes: ");
        int times = scanner.nextInt();

        float total_weight = 0;
        String name_higher = "";
        float height_higher = 0;
        int total_M = 0;
        int total_F = 0;
        float total_height_F = 0;
        for (int i = 0; i < times; i++) {
            System.out.println("Digit data of athlete number " + (i+1) );

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();


            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            while (!(gender.equals("M") || gender.equals("F"))) {
                System.out.print("Value Invalid, Gender: ");
                gender = scanner.nextLine();
            }

            float height = 0;

            while (height <= 0) {
                System.out.print("Height: ");
                height = scanner.nextFloat();
                if (height <= 0) {
                    System.out.print("Value invalid, ");
                }
            }

            float weight = 0;

            while (weight <= 0) {
                System.out.print("Weight: ");
                weight = scanner.nextFloat();
                if (weight <= 0) {
                    System.out.print("Value invalid, ");
                }
            }

            total_weight += weight;
            if (height > height_higher) {
                height_higher = height;
                name_higher = name;
            }
            if (gender.equals("M")) {
                total_M ++;
            }
            if (gender.equals("F")) {
                total_F ++;
                total_height_F += height;
            }
        }

        System.out.println();
        System.out.println("Result: ");
        System.out.println();

        System.out.println("Average weight: " + String.format("%.2f", (total_weight/(total_F+total_M))));
        System.out.println("Athlete higher: " + name_higher);
        System.out.println("Percent of mans: " + String.format("%.2f", (((float) total_M/(total_F+total_M))*100)) + "%");
        if (total_F == 0) {
            System.out.println("Don't have any woman registered");
        } else {
            System.out.println("Average woman height: " + String.format("%.2f", (total_height_F/total_F)));
        }

    }
}