import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter data of the taxpayer");
        System.out.print("Annual income with salary: ");
        float salary = scanner.nextFloat();
        System.out.print("Annual income with services: ");
        float services = scanner.nextFloat();
        System.out.print("Annual income with capital gains: ");
        float capital_gains = scanner.nextFloat();
        System.out.print("Medical expense: ");
        float medical = scanner.nextFloat();
        System.out.print("Educational expense: ");
        float educational = scanner.nextFloat();

        System.out.println("Result:");
        System.out.println();
        System.out.println("Tax with salary: " + tax_salary(salary));
        System.out.println("Tax with services: " + tax_services(services));
        System.out.println("Tax with capital gains: " + tax_capital_gains(capital_gains));
        float tax_total = tax_salary(salary)+tax_services(services)+tax_capital_gains(capital_gains);
        System.out.println("Tax with brute total: " + tax_total);
        float discount = discount(tax_total, medical, educational);
        System.out.println("Discount: " + discount);
        System.out.println("Tax due: " + (tax_total-discount));
    }


    public static float tax_salary(float salary) {
        float month_salary = salary/12;
        float tax = 0;
        if (month_salary >= 5000) {
            tax = (float) (salary*0.20);
        } else if (month_salary >= 3000) {
            tax = (float) (salary*0.10);
        }

        return tax;
    }
    public static float tax_services(float payment) {
        return (float) (payment*0.15);
    }

    public static float tax_capital_gains(float capital_gain) {
        return (float) (capital_gain*0.2);
    }
    public static float discount(float total_tax, float medicine, float educational) {
        float could_dont_pay = (float) (total_tax*0.3);
        float total_discount;
        if (medicine+educational > could_dont_pay) {
            total_discount = could_dont_pay;
        } else {
            total_discount = medicine+educational;
        }

        return total_discount;
    }
}