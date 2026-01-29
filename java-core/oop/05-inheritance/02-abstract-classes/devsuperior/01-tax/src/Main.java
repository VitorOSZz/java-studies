import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int quantity = scanner.nextInt();

        List<TaxPayer> taxPayerList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c): ");
            char individualOrCompany = scanner.next().toLowerCase().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = scanner.nextDouble();

            TaxPayer taxPayer;
            if (individualOrCompany == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();

                taxPayer = new Individual(name, annualIncome, healthExpenditures);
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();

                taxPayer = new Company(name, annualIncome, numberOfEmployees);
            }

            taxPayerList.add(taxPayer);
        }

        long total = 0;
        System.out.println();
        System.out.println("Taxes paid: ");
        for (TaxPayer taxPayer : taxPayerList) {
            System.out.println(taxPayer);
            total += taxPayer.tax();
        }
        System.out.println();
        System.out.println("Total taxes: " + total / 1000.00);
    }
}