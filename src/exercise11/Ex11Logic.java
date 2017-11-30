package exercise11;

import java.util.Collection;

/**
 * Exercise 11 logic
 * @author yasiro01
 */
public class Ex11Logic {

    /**
    * Task 1
    * @param <T>
    * @param item
    * @return length of the parameter's string representation
    */
    // TODO: Implement method strLen
    public <T> int strLen (T item){
        return item.toString().length();
    }
    /**
    * Task 2
    * @param <T>
    * @param item1
    * @param item2
    * @param item3
    * @return the greater of three parameters
    */
    // TODO: Implement method greater
    public <T extends Comparable> int greater(T item1, T item2, T item3) {
        if (item1.compareTo(item2) >= 0){
            return Integer.parseInt(item1.toString());
        } else if (item1.compareTo(item3) >= 0) {
            return Integer.parseInt(item2.toString());
        } else if (item2.compareTo(item1) >= 0) {
            return Integer.parseInt(item2.toString());
        } else if (item2.compareTo(item3) >= 0) {
            return Integer.parseInt(item2.toString());
        } else if (item3.compareTo(item1) >= 0) {
            return Integer.parseInt(item3.toString());
        } else {
            return Integer.parseInt(item3.toString());
        }
    }

    /**
    * Task 3
    * @param <T>
    * @param list of objects
    * print a list of items
    */
    // TODO: Implement method printList
    public <T> void printList(Collection<T> coll){
        for (T item: coll) {
            System.out.println(item);
        }
    }

    /**
    * Task 4
    * @param <T>
    * @param list of objects
    * @return the smallest item in the collection
    */
    // TODO: Implement method findMinItem
    public <T> String findMinItem (Collection<T> coll) {
        for (T item: coll) {
            
        }
        return "null";
    }
}

    /**
    * Task 5
    * @param <T>
    * @param <U>
    * A class with two data members, T fuzz and U buzz
    * Implement the constructor, getters, setters, and toString
    */
    // TODO: Implement class Foo
