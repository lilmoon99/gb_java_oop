package org.example.SRP;

public class EmployeeSalaryCalculator {
    private int baseSalary;

    public EmployeeSalaryCalculator(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculate(){
        return this.baseSalary*1.5;
    }
}
