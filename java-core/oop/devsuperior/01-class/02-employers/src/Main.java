import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employer employer = new Employer();

        System.out.print("Name: ");
        employer.name = scanner.nextLine();
        System.out.print("Gross Salary: ");
        employer.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        employer.tax = scanner.nextDouble();


        System.out.println();
        System.out.println(employer);

        System.out.print("What is the percentage of salary incremental: ");
        double percentage = scanner.nextDouble();

        employer.increaseSalary(percentage);

        System.out.println();
        System.out.println("Data updated: " + employer);

    }
}