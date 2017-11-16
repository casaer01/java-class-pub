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

// abstract means cannot create new object of the class
public abstract class Animal2 {
    protected double bloodTemperature;

    public Animal2(double bloodTemperature) {
        this.bloodTemperature = bloodTemperature;
    }
    
    
    
    public void breath(){
        System.out.println("Oxigen level increased.");
    }
    
    //abstract means
    public abstract void move();
    
    @Override
    public String toString() {
        return "I'm an animal";
    }
    
}
