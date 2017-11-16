/*
 * Testing out Employee class and it ssub classes (HourlyEmployee & SalariedEmployee)
 */
package exercise7;

/**
 *
 * @author casaer01
 */
public class EmployeeChecker {    
    public static void brk() {
        System.out.println(" ");
        System.out.println("-----------------------");
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        Employee e = new Employee("Ben", "123-45-6789");
        System.out.println(e);
        brk();
        
        System.out.println("HourlyEmployee");
        HourlyEmployee he = new HourlyEmployee(10.50, 34.25);
        System.out.println(he);
        brk();
        String getSSN = he.getSsn();
        System.out.println("Employee's SSN is " + getSSN);
        he.printWeeklyCheck();
        brk();
        System.out.println("Salaried Employee");
        
    }
    
}
