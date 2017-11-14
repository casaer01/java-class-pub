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
public class CheckPhone {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        System.out.println(myPhone.getModel());
        myPhone.setModel("Apple Iphone X");
        System.out.println(myPhone.getModel());
    }
}
