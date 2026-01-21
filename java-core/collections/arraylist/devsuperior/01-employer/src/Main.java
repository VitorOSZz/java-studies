import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many employer you will register: ");
        int times = scanner.nextInt();

        List<Employer> employerList = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            System.out.println();
            System.out.println("-Employer " + (i+1));
            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employerList.add(new Employer(id, name, salary));
        }

        System.out.print("Enter the ID of the employer who will receive the increase: ");
        int id = scanner.nextInt();

        System.out.print("Enter the percent of increase: ");
        double percent = scanner.nextDouble();

        System.out.println();

        for (Employer employer : employerList) {
            if (employer.getId() == id) {
                employer.increaseSalary(percent);
                break;
            }
        }

        for (Employer employer : employerList) {
            System.out.println(employer.getId() + ", " + employer.getName() + ", " + employer.getSalary());
        }
    }
}