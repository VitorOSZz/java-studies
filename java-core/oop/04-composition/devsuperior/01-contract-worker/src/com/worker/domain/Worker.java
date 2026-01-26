package com.worker.domain;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Worker {

    private Department department;
    private String name;
    private WorkerLevel level;
    private long baseSalary;
    private List<HourContract> hourContractList;

    public Worker(String name, WorkerLevel level, long baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
        this.hourContractList = new ArrayList<>();
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void addContract(HourContract contract) {
        hourContractList.add(contract);
    }

    public void removeContract (HourContract contract) {
        hourContractList.remove(contract);
    }

    public long income(int year, int month) {
        StringBuilder dateString = new StringBuilder();
        // "2024-11-20T15:30:00Z"
        dateString.append(year);
        dateString.append("-");
        if (month < 10) {
            dateString.append("0");
            dateString.append(month);
        } else {
            dateString.append(month);
        }
        dateString.append("-");
        dateString.append("01T15:30:00Z");
        Instant data = Instant.parse(dateString);

        int monthR = LocalDateTime.ofInstant(data, ZoneId.systemDefault()).getMonthValue();
//        System.out.println(monthR);
        Instant dataAfter = null;
        switch (monthR) {
            case 1, 3, 5, 7, 8, 10 , 12:
                dataAfter = data.plus(31, ChronoUnit.DAYS);
                break;
            case 2:
                dataAfter = data.plus(28, ChronoUnit.DAYS);
                break;
            case 4, 6, 9, 11:
                dataAfter = data.plus(30, ChronoUnit.DAYS);
                break;
        }
//        System.out.println();

        data = data.minus(1, ChronoUnit.DAYS);
//        System.out.println(data);
//        System.out.println(dataAfter);

        Long money = 0L;
        for (HourContract hourContract : hourContractList) {
//            System.out.println(hourContract.getDate().isAfter(data.minus(1, ChronoUnit.DAYS)));
            if (hourContract.getDate().isAfter(data) && hourContract.getDate().isBefore(dataAfter)) {
                money += hourContract.getTotalValue();
            }
        }
        return money;
    }
}
