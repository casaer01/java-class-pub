/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *  # means protected
 *  + means public
 *  - means private
 * @author casaer01
 */
public class Employee {
    protected String name;
    protected String ssn = "000-00-0000";
    protected double netPay;
    
    public Employee() {}

    public Employee(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
        //this.netPay = netPay;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    protected double getNetPay() {
        return netPay;
    }
    
    
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    protected void printWeeklyCheck(){
        //System.out.println(name + " weekly check is " + netPay);
    }
    
}
