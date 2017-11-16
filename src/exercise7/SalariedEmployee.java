/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author casaer01
 */
public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(double salary, String name, String ssn) {
        super(name, ssn);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getNetPay() {
        return netPay;
    }
    
    @Override
    public void printWeeklyCheck() {
        System.out.println(name + "earned " + (salary/52) + "weekly.");
    }
    
}
