package com.worker.app;

import com.worker.domain.Department;
import com.worker.domain.HourContract;
import com.worker.domain.Worker;
import com.worker.domain.WorkerLevel;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();
        Department department = new Department(departmentName);

        System.out.println();
        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(scanner.nextLine().trim().toUpperCase());

        System.out.print("Base salary: ");
        long salary = (long) (scanner.nextDouble()*1000L);

        System.out.print("How many contracts to this worker: ");
        int quantityContract = scanner.nextInt();

        Worker worker = new Worker(name, workerLevel, salary, department);
        for (int i = 0; i < quantityContract; i++) {
            System.out.println("Enter contract #" + (i+1) + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            scanner.nextLine();
            String dateString = scanner.nextLine();
            Instant date = dateStringToDateInstant(dateString);

            System.out.print("Value per hour: ");
            long valuePerHour = (long) (scanner.nextDouble()*1000L);
            System.out.print("Duration in horus: ");
            int hours = scanner.nextInt();

            HourContract contract = new HourContract(date, hours, valuePerHour);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        scanner.nextLine();
        String dateToCheckString = scanner.nextLine();
        StringBuilder yearString = new StringBuilder();
        yearString.append(dateToCheckString.charAt(dateToCheckString.length() - 4));
        yearString.append(dateToCheckString.charAt(dateToCheckString.length()-3));
        yearString.append(dateToCheckString.charAt(dateToCheckString.length()-2));
        yearString.append(dateToCheckString.charAt(dateToCheckString.length()-1));

        StringBuilder monthString = new StringBuilder();
        monthString.append(dateToCheckString.charAt(0));
        monthString.append(dateToCheckString.charAt(1));
        int year = Integer.valueOf(String.valueOf(yearString));
        int month = Integer.valueOf(String.valueOf(monthString));

        System.out.println();
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthString + "/" +yearString + ": " + ( (worker.getBaseSalary()/1000.00) + (worker.income(year, month)/1000.00) ) );
    }

    public static Instant dateStringToDateInstant(String dateString) {
        StringBuilder stringFormattedDate = new StringBuilder();

        stringFormattedDate.append((dateString.charAt((dateString.length()-4))));
        stringFormattedDate.append((dateString.charAt((dateString.length()-3))));
        stringFormattedDate.append((dateString.charAt((dateString.length()-2))));
        stringFormattedDate.append((dateString.charAt((dateString.length()-1))));
        stringFormattedDate.append("-"); // 5 = -
        stringFormattedDate.append((dateString.charAt((dateString.length()-7))));
        stringFormattedDate.append((dateString.charAt((dateString.length()-6))));
        stringFormattedDate.append("-"); // 8 = -
        stringFormattedDate.append((dateString.charAt((dateString.length()-10))));
        stringFormattedDate.append((dateString.charAt((dateString.length()-9))));
        stringFormattedDate.append("T00:00:00Z");


        return Instant.parse(String.valueOf(stringFormattedDate));
    }
}