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
public class PersonFaculty extends Person{
    private static final String officeBuilding;
    private final int officeRoom;

    public PersonFaculty(String officeBuilding, int officeRoom) {
        this.officeBuilding = officeBuilding;
        this.officeRoom = officeRoom;
    }

    public PersonFaculty(String officeBuilding, int officeRoom, String name, String race, int age) {
        super(name, race, age);
        this.officeBuilding = officeBuilding;
        this.officeRoom = officeRoom;
    }
    
    
    
    public String getPersonalInfo() {
        return this.name + " " + this.race;
    }

    @Override
    public String toString() {
        return super.toString() + "resides in " + officeBuilding + officeRoom;
    }
    
    
}
