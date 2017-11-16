/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

/**
 *
 * @author casaer01
 */
public class PersonCheck {
    
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p);
        
        System.out.println("Faculty");
        PersonFaculty pf = new PersonFaculty("Olin", 202);
        System.out.println(pf);
        String personalInfo = pf.getPersonalInfo();
        System.out.println(personalInfo);
        
        System.out.println("Another faculty");
        PersonFaculty apf = new PersonFaculty("Koren", 120, "Alce", "White", 57);
        System.out.println(apf);
    }
}
