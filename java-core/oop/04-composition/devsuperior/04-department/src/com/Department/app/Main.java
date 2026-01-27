package com.Department.app;

import com.Department.entities.Department;
import com.Department.entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Department name: ");
        String departmentName = scanner.nextLine();
        System.out.print("Pay day: ");
        int payDay = scanner.nextInt();
        System.out.print("Email: ");
        scanner.nextLine();
        String email = scanner.nextLine();
        System.out.print("Telephone: ");
        String telephone = scanner.nextLine();
        System.out.print("How many employees: ");
        int employeesQuantity = scanner.nextInt();

        Department department = new Department(departmentName, email, telephone, payDay);

        for (int i = 0; i < employeesQuantity; i++) {
            scanner.nextLine();
            System.out.print("Name: ");
            String employeeName = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(employeeName, salary);
            department.addEmployee(employee);
        }

        System.out.println();
        System.out.println(showDepartment(department));
    }

    public static String showDepartment(Department department) {
        StringBuilder text = new StringBuilder();

        text.append("Pay Roll");
        text.append("\n");
        text.append(department.getName() + " = R$ " + (department.payRoll()/1000.00));
        text.append("\n");
        text.append("Pay day: " + department.getPayDay());
        text.append("\n");

        text.append("Employees:");
        for (Employee employee : department.getEmployers()) {
            text.append("\n");
            text.append(employee.getName());
        }
        text.append("\n");
        text.append("Any questions in: " + department.getEmail());

        return text.toString();
    }
}