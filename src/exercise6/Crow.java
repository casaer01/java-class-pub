/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

import java.util.Objects;

/**
 *
 * @author casaer01
 */
public class Crow {
    private String name;
    private String age;
    private int iq = 100;

    public Crow(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getIq() {
        return iq;
    }

    @Override
    public int hashCode() {
        char[] nameChar = name.toCharArray();
        char[] ageChar = age.toCharArray();
        int total = 0;
        
        for (int i = 0; i < nameChar.length; i++){
            int ascii = nameChar[i];
            total += ascii * i;
        }
        for (int i = 0; i < ageChar.length; i++) {
            int ascii = ageChar[i];
            total += ascii * i;
        }
        return total + iq;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Crow other = (Crow) obj;
        if (this.iq != other.iq) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Crow{" + "name=" + name + ", age=" + age + ", iq=" + iq + '}';
    }
        
    
}
