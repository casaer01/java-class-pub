package exercise6;

import java.util.Objects;

/**
 * Class Kangaroo
 * @author casaer01
 * String name, integer age, and integer babies (1 by default
 */
public class Kangaroo {
    private String name;
    private int age;
    private int babies = 1;

    public Kangaroo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBabies() {
        return babies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.age;
        hash = 29 * hash + this.babies;
        return hash;
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
        final Kangaroo other = (Kangaroo) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.babies != other.babies) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Kangaroo{" + "name=" + name + ", age=" + age + ", babies=" + babies + '}';
    }
    
    
    
}
