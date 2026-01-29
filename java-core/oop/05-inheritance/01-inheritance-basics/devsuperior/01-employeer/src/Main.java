import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many employees want to register: ");
        int quantity = scanner.nextInt();

        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            System.out.println("-".repeat(7));
            System.out.print("Outsourced (y/n) : ");
            boolean outsourced = String.valueOf(scanner.next().charAt(0)).equalsIgnoreCase("y");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            double additional = 0;
            if (outsourced) {
                System.out.print("Additional charge: ");
                additional = scanner.nextDouble();
            }

            Employee employee;
            if (!outsourced) {
                employee = new Employee(name, hours, valuePerHour);
            } else {
                employee = new OutsourcedEmployee(name, hours, valuePerHour, additional);
            }

            employeeList.add(employee);
        }

        System.out.println("List: "+ employeeList);
        System.out.println();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}