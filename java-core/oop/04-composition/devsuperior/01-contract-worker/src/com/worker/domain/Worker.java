package com.worker.domain;

import java.time.LocalDate;
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

    public long income(LocalDate date) {

        LocalDate dateAfter = date;
        date = date.minus(1, ChronoUnit.DAYS);
        dateAfter = date.plus(1, ChronoUnit.MONTHS);

        long money = 0L;
        for (HourContract hourContract : hourContractList) {
            if (hourContract.getDate().isAfter(date) && hourContract.getDate().isBefore(dateAfter)) {
                money += hourContract.getTotalValue();
            }
        }
        return money;
    }
}
