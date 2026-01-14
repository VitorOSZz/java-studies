import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Annual income with salary: ");
        float annual_salary = scanner.nextFloat();

        System.out.print("Annual income with services: ");
        float services = scanner.nextFloat();
        System.out.print("Annual income with gain on capital: ");
        float gain_capital = scanner.nextFloat();
        System.out.print("Spent with doctor: ");
        float doctor = scanner.nextFloat();
        System.out.print("Spent with education: ");
        float education = scanner.nextFloat();

        System.out.println();
        System.out.println("=== Income tax result");

        System.out.println();
        System.out.println("== Tax Income");
        System.out.print("Salary: ");
        float salary_tax = 0;
        if ((annual_salary/12) >= 5000) {
            salary_tax = (float) (annual_salary * 0.20);
        } else if ((annual_salary/12) >= 3000) {
            salary_tax = (float) (annual_salary * 0.10);
        } else {
            salary_tax = 0;
        }
        System.out.println(salary_tax);

        float services_tax = (float) (services * 0.15);
        System.out.println("Services: " + services_tax);

        float gain_capital_tax = (float) (gain_capital * 0.20);
        System.out.println("Gain in capital: " + gain_capital_tax);

        System.out.println();
        System.out.println("== Deductible");
        float max_deductible = (float) ((salary_tax + services_tax + gain_capital_tax) * 0.30);
        float spends_deductible = doctor + education;
        System.out.println("Max deductible: " + max_deductible);
        System.out.println("Spend deductible: " + spends_deductible);

        System.out.println();
        System.out.println("== Resume");
        System.out.println("Brute tax total: " + (salary_tax + services_tax + gain_capital_tax));
        System.out.print("Discount: ");
        if (spends_deductible > max_deductible) {
            System.out.println(max_deductible);
            System.out.println("Tax due: " + ((salary_tax+services_tax+gain_capital_tax)-max_deductible));
        } else {
            System.out.println(spends_deductible);
            System.out.println("Tax due: " + ((salary_tax+services_tax+gain_capital_tax)-spends_deductible));
        }
    }
}