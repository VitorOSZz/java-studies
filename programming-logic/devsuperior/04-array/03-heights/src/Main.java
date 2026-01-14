import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many person will be digitized: ");
        int times = scanner.nextInt();

        String[] names_under_16 = new String[times];
        float total_height = 0;
        for (int i = 0; i < times; i++) {
            System.out.println("--Data of " + (i+1) + "th person");
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Height: ");
            float height = scanner.nextFloat();

            total_height += height;

            if (age < 16) {
                names_under_16[i] = name;
            }
        }

        System.out.println();
        System.out.println("Average Height: " + String.format("%.2f", (total_height/times)));

        int under_16 = 0;
        for (String s : names_under_16) {
            if (!(s == null)) {
                under_16 ++;
            }
        }
        System.out.println("People under 16 years old: " + String.format("%.2f" ,(((float) under_16/times)*100)) + "%");
        for (String s : names_under_16) {
            if (!(s == null)) {
                System.out.println(s);
            }
        }
    }
}