package exercise4;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * @author casaer01
 */
public class Ex4Driver {
  /*
  Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity.*/
public int task1(int number){
    int sumtotal = number + number;
    return sumtotal;
}
/*Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity.*/
public int task2(String userstring){
    int wordSize = userstring.length();
    return wordSize;
};
/*Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity.*/
public int task3(char charinput){
    int charValue = 0;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    for(int i = 0; i < alphabet.length;i++){
        if (charinput == alphabet[i]){
            charValue = i + 1;
            break;
        }
    }
    return charValue;
}
/*Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity.*/
public char task4(String userString){
    char[] firstChar = userString.toCharArray();    
    return firstChar[0];
}
/*Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.*/
public int task5(int userInt01,  int userInt02){
    int total = userInt01 * userInt02;
    return total;
}
/*Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity.*/
public char task6(String userStr, int userInt){
    char[] userChars = userStr.toCharArray();
    return userChars[userInt];
}
/*Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.*/
public int task7(int[] arr){
    int lengtharr = arr.length;
    return lengtharr;
}
/*Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity.*/
public Boolean task8(int[] arr, int userInt){
    boolean lengthArr = false;
    if(arr.length == userInt){
        lengthArr = true;
    }else{
        lengthArr = false;
    }
    return lengthArr;
}
/*Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity.*/
public int task9(ArrayList<String> arrlist){
    int listSize = arrlist.size();
    return listSize;
}
/*Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity.*/
//public int task10(HashMap<String>){}
}
