import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people you will digit: ");
        int times = scanner.nextInt();

        float lower_height = Float.POSITIVE_INFINITY;
        float higher_height = 0;
        float total_height_women = 0;
        int total_women = 0;
        int total_men = 0;
        for (int i = 0; i < times; i++) {
            System.out.print("Height of " + (i+1) + "th person: ");
            float height = scanner.nextFloat();
            System.out.print("Gender of " + (i+1) + "th person: ");
            String gender = scanner.next();

            if (Math.min(lower_height, height) == height) {
                lower_height = height;
            }
            if (Math.max(higher_height, height) == height) {
                higher_height = height;
            }
            if (gender.equalsIgnoreCase("M")) {
                total_men++;
            } else {
                total_women++;
                total_height_women += height;
            }
        }

        System.out.println("Lower height: " + lower_height);
        System.out.println("Higher height: " + higher_height);
        System.out.println("Average height of women: " + String.format("%.2f", (total_height_women/total_women)));
        System.out.println("Number of mens: " + total_men);


    }
}