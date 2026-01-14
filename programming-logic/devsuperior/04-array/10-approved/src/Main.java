import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students will be digitized: ");
        int times = scanner.nextInt();

        String[] names = new String[times];
        float[] first_grades = new float[times];
        float[] second_grades = new float[times];

        for (int i = 0; i < times; i++) {
            System.out.println("Digit name, first grade and second grade of " + i + "th student");
            scanner.nextLine();
            String name = scanner.nextLine();
            float first = scanner.nextFloat();
            float second = scanner.nextFloat();

            names[i] = name;
            first_grades[i] = first;
            second_grades[i] = second;
        }

        System.out.println("Students approved:");

        int index = 0;
        for (String name : names) {
            if (((first_grades[index] + second_grades[index])/2) >= 6) {
                System.out.println(name);
            }
            index++;
        }
    }
}