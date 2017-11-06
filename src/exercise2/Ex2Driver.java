package exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yasiro01
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    task1(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6();
    task7();
    System.out.println(task8(numberLst, 75));
    task9();
    //task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function nHeads() that takes a number (n) as a parameter and prints the result of coin flips 
   * ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row. Seed the randomizer in the main() function.
   * @param n
   */
  public static void task1(int n) {
      Random rnd = new Random();
      rnd.setSeed(20);
      String[] totalHeads = new String[n];
      int randNum = 0;
      for (int i = 0; i < n; i++){
          randNum = rnd.nextInt(2);
          //System.out.println(randNum);
          if (randNum == 1){
              totalHeads[i] = "heads";
              System.out.println("Heads");
          }else {
              i = -1;
              //System.out.println(i);
              System.out.println("Tails");
          }
      }
  }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and
   * returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
    //System.out.println(n);
    boolean results = false;
    int i = 0;
    while (i < arr.length){
        if (arr[i] < n){
            //System.out.println(arr[i] + " True");
            results = true;
            i++;
        } else {
            //System.out.println(arr[i] + " false");
            i = arr.length;
            results = false;
        }
    }
    return results;
  }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static int task3(int[] arr, int threshold) {
    int i = 0;
    int belowTotal = 0;
    while (i < arr.length){
        if (arr[i] < threshold){
            belowTotal++;
            //System.out.println(arr[i] + " Below threshold");
            i++;
        } else {
            //System.out.println(arr[i] + " Above threshold");
            i++;
        }
    }
    System.out.println("There were " + belowTotal + "below the threshold");
    return belowTotal;
  }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100
   * and the largest element of the array and adds this difference to every element in the array. (Note: after this function
   * call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
      int i = 0;
      int largestNum = 0;
      int diffNum = 0;
      
      //Finding largest int in array
      while (i < arr.length){
          if (largestNum < arr[i]){
              largestNum = arr[i];
              i++;
          } else{
              i++;
          }
      }
      //resets counter
      i = 0;
      
      //System.out.println(largestNum + " is the largest int in the array.");
      diffNum = 100 - largestNum;
      while (i < arr.length){
          //System.out.println("Number in array " + i + " is " + arr[i]);
          arr[i] = arr[i] + diffNum;
          //System.out.println("Number in array " + i + " is NOW " + arr[i]);
          //System.out.println(" ");
          i++;
      }
  }
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, 
   * prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
    int countA = 0;
    int countB = 0;
    int countC = 0;
    int countD = 0;
    int countF = 0;
    int i = 0;
    while (i < arr.length){
        if (arr[i] >= 90){
            countA++;
            i++;
        }else if (arr[i] >= 80 && arr[i] <= 89) {
            countB++;
            i++;
        }else if (arr[i] >= 70 && arr[i] <= 79) {
            countC++;
            i++;
        }else if (arr[i] >= 60 && arr[i] <= 69) {
            countD++;
            i++;
        }else {
            countF++;
            i++;
        }
    }
    System.out.println("There are " + countA + " students with As");
    System.out.println("There are " + countB + " students with Bs");
    System.out.println("There are " + countC + " students with Cs");
    System.out.println("There are " + countD + " students with Ds");
    System.out.println("There are " + countF + " students with Fs");
  }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers.
   * Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList.
   * Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
    ArrayList<Double> arr = new ArrayList();
    boolean isZero = false;
    Scanner keyboard = new Scanner(System.in);
    
    while (isZero == false){
        System.out.println("Enter a number");
        double userInput = keyboard.nextInt();
        if (userInput == 0){
            isZero = true;
        }else {
            arr.add(userInput);
        }
    }
    System.out.println(arr.toString());
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
    Random rnd = new Random();
    ArrayList<Integer> arr = new ArrayList();
    int i = 0;
    
    while (i < 10){
        int rndNum = rnd.nextInt(50) + 50;
        arr.add(rndNum);
        i++;
    }
    System.out.println(arr.toString());
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and
   * a threshold as parameters and returns the number of values in the ArrayList below a threshold.
   * You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
      int i = 0;
      int below_threshold = 0;
      while ( i < arrLst.size()){
          int arrElement = arrLst.get(i);
          if (arrElement < threshold){
              below_threshold++;
              i++;
          }else{
              i++;
          }
      }
      return below_threshold;
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array
   * to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1)
   * and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
    int[][] matrix = new int[10][10];
    for (int row = 0; row < matrix.length;row++){
        for (int col = 0; col < matrix[row].length;col++){
            matrix [row][col] = row + 1 * col + 1; 
        }
    }
    System.out.println(Arrays.toString(matrix));
    return matrix;
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] matrix) {
    throw new UnsupportedOperationException("Task 3 is not implemented yet.");
  }

}
