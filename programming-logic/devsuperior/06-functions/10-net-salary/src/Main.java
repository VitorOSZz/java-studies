import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of brute salary: ");
        float salary = scanner.nextFloat();

        System.out.println("Net Salary: " + net_salary(salary));
    }

    public static float net_salary(float salary) {
        float net_salary = 0;
        float social_security = 0;
        float income_tax = 0;

        if (salary <= 4000) {
            income_tax = (float) (salary*0.20);
        } else {
            income_tax = (float) (salary*0.25);
        }
        if (salary <= 1500) {
            social_security = (float) (salary*0.10);
        } else {
            social_security = (float) (salary*0.15);
        }

        net_salary = salary - income_tax - social_security;

        return net_salary;
    }
}