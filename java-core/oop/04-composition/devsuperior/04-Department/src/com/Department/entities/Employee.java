package com.Department.entities;

public class Employee {

    private String name;
    private long salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = (long) (salary*1000);
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
}
