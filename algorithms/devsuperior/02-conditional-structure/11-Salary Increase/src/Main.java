import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary");
        float salary = scanner.nextFloat();

        int percent = 5;
        if (salary > 8000) {
            percent = 5;
        } else if (salary>3000) {
            percent = 10;
        } else if (salary>1000) {
            percent = 15;
        } else {
            percent = 20;
        }

        float new_salary = salary*((float) (percent+100) /100);

        System.out.println("New Salary: " + new_salary);
        System.out.println("Increase: " + (new_salary-salary));
        System.out.println("Percent: " + percent);
    }
}