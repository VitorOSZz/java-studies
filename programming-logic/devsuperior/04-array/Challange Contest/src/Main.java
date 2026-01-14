import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people: ");
        int times = scanner.nextInt();

        String[] names = new String[times];
        float[] first_grades = new float[times];
        float[] second_grades = new float[times];
        float[] averages = new float[times];


        for (int i = 0; i < times; i++) {
            System.out.println("Enter data of " + (i+1) + "th person");
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Grade in first step: ");
            float first_grade = scanner.nextFloat();
            System.out.print("Grade in second step: ");
            float second_grade = scanner.nextFloat();

            names[i] = name;
            first_grades[i] = first_grade;
            second_grades[i] = second_grade;
            averages[i] = (first_grade+second_grade)/2;
        }

        System.out.println();
        System.out.println("Table: ");
        for (int i = 0; i < times; i++) {
            System.out.print(names[i] + ", ");
            System.out.print(first_grades[i] + ", ");
            System.out.print(second_grades[i] + ", ");
            System.out.print("Average: " + averages[i]);
            System.out.println();
        }

        String higher_average_name = "";
        float higher_average = 0;
        int total_approved = 0;
        float total_approved_average = 0;
        System.out.println();
        System.out.println("People approved:");
        for (int i = 0; i < times; i++) {
            if (averages[i] >= 70) {
                System.out.println(names[i]);
                total_approved++;
                total_approved_average += averages[i];

            }
            if (Math.max(higher_average, averages[i]) == averages[i]) {
                higher_average = averages[i];
                higher_average_name = names[i];
            }
        }

        System.out.println();
        System.out.println("Percent of approved: " + (((float) total_approved/times)*100) + "%");
        System.out.println("Higher average: " + higher_average_name);

        if (total_approved == 0) {
            System.out.println("Any candidate approved");
        } else {
            System.out.println("Average grade of approved: " + String.format("%.2f", (total_approved_average/total_approved)));
        }
    }
}