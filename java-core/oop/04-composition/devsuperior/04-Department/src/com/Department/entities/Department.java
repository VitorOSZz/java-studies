package com.Department.entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String email;
    private String telephone;
    private int payDay;
    private List<Employee> employers;

    public Department(String name, String email, String telephone, int payDay) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.payDay = payDay;
        this.employers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getPayDay() {
        return payDay;
    }

    public List<Employee> getEmployers() {
        return employers;
    }



    public void addEmployee(Employee employee) {
        this.employers.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employers.remove(employee);
    }

    public long payRoll() {
        long payRoll = 0;
        for (Employee employee: this.employers) {
            payRoll += employee.getSalary();
        }

        return payRoll;
    }
}
