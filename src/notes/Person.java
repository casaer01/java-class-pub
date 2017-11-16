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
public class Person {
    protected String name;
    protected String race;
    protected int age;
    public static int

    @Override
    public String toString() {
        return name + "(" + age + ") is " + race;
    }
    
    public Person(){}
    
    public Person(String name, String race, int age){
        this.name = name;
        this.race = race;
        this.age = age;
    }
    
    
    
}
