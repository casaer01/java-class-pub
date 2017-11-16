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
public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;   

    public HourlyEmployee(double wageRate, double hours) {
        this.wageRate = wageRate;
        this.hours = hours;
    }

    public HourlyEmployee(String name, String ssn, double wageRate, double hours) {
        super(name, ssn);
        this.wageRate = wageRate;
        this.hours = hours;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }
    
    @Override
    public void printWeeklyCheck() {
        System.out.println(name + " earned " + (wageRate * hours) + " weekly.");
    }
    
}
