package exercise1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * @author casaer01
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
//    task10();

  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.println("Hello World");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
      for(int i = 1; i < 100; i++) {
          if ( i % 3 == 0 && i % 5 ==0) {
              System.out.println("huh");
          } else if (i % 5 == 0) {
              System.out.println("bar");
          } else if (i % 3 == 0) {
              System.out.println("foo");
          } else {
              System.out.println(i);
          }
      }
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    int sum = 0;
    for (int i = 0; i < 100; i++) {
        if (i % 7 == 0 ) {
            sum += i;
        }
    }
    System.out.println("The sum of all multiples of 7 between 1 and 100 is " + sum);
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
    int sum = 0;
    long product = 1;
    
    for (int i = 1; i <= 20; i++) {
        sum += i;
        product *= i;
    }
    System.out.println("The sum of all numbers between 1 and 20 is " + sum);
    System.out.println("The product of all numbers between 1 and 20 is " + product);
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your full name");
    String fullName = keyboard.nextLine();
    
    String[] namebits = fullName.split(" ");
    
    for (int i = 0; i < namebits.length; i++) {       
        System.out.print(namebits[i].charAt(0));
    }
    System.out.println(" ");
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    int[] arraylst = new int[10];
    for (int i = 0; i < arraylst.length; i++){
        arraylst[i] = i * i * i;
        System.out.print(arraylst[i] + " ");
    }
    System.out.println(" ");
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    Scanner keyboard = new Scanner(System.in);
    Random rnd = new Random();
    rnd.setSeed(252);
    System.out.println("Enter a number");
    String userstring = keyboard.nextLine();
    int userNum = Integer.valueOf(userstring);
    int[] arrayNum = new int[100];
    boolean numFound = false;
    
    for (int i = 0; i < 100;i++){
        arrayNum[i] = rnd.nextInt(100);
    }
    for (int i = 0; i < 100; i++){  
        if (arrayNum[i]==userNum){
            //System.out.println(userNum + "was found.");
            numFound = true;
        }
        else if(arrayNum[99]!=userNum){
            //System.out.println(userNum + "was not found.");
            numFound = false;
        }
    }
    if (numFound == true){
        System.out.println(userNum + " was found.");
    }
    else if (numFound == false) {
        System.out.println(userNum + " was not found.");
    }
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    int sumArray = 0;
    for (int i = 0; i < numbers.length;i++){
      sumArray += numbers[i];
    }
    
    System.out.println("The sum of all items in " + Arrays.toString(numbers) + " is " + sumArray);
    return sumArray;
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    boolean letterOrder = false;
    char[] alp = new char[26]; 
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a word.");
    String userWord = keyboard.nextLine();
    char[] userChar = userWord.toCharArray();
    
    //Creates Alphabet 
    int position = 0;
    for (char c = 'a'; c <= 'z'; c++) {
        alp[position] = c;
        position++;
    }
    int userInt = 0;
    int alpIndex = 0;
    while (userInt < userChar.length+1) {
        if (userChar[userInt] == alp[alpIndex]){
            userInt++;
        }else if (userChar[userInt] != alp[alpIndex]){
            alpIndex++;
        }else if (alp[alpIndex] == 'z' && userInt == userChar.length){
            letterOrder = false;
        }else if (userInt == userChar.length){
            letterOrder = true;
        }
    }
//    for (int i = 0; i < alp.length; i++){
//        if (userChar[userInt] == alp[i]){
//            userInt++;
//        }else if (userInt > userChar.length){
//            letterOrder = true;
//        }
//    }
    //System.out.println(Arrays.toString(alp));
    //System.out.println(Arrays.toString(userChar));
    return letterOrder;
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
    throw new UnsupportedOperationException("Task 3 is not implemented yet.");
  }

}
