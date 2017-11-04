/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class Ex4DriverTest {
  
  public Ex4DriverTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of task1 method, of class Ex4Driver.
   */
  @Test
  public void testTask1() {
    System.out.println("task1");
    Integer n = 5;
    Ex4Driver instance = new Ex4Driver();
    Integer expResult = 10;
    Integer result = instance.task1(n);
    assertEquals(expResult, result);
    n = -5;
    expResult = -10;
    result = instance.task1(n);
    assertEquals(expResult, result);
  }

    /**
     * Test of task2 method, of class Ex4Driver.
     */
    @Test
    public void testTask2() {
        System.out.println("task2");
        String userstring = "Word";
        Ex4Driver instance = new Ex4Driver();
        int expResult = 4;
        int result = instance.task2(userstring);
        assertEquals(expResult, result);
        userstring = "Jackson";
        expResult = 7;
        result = instance.task2(userstring);
        assertEquals(expResult, result);
    }

    /**
     * Test of task3 method, of class Ex4Driver.
     */
    @Test
    public void testTask3() {
        System.out.println("task3");
        char charinput = 'c';
        Ex4Driver instance = new Ex4Driver();
        int expResult = 3;
        int result = instance.task3(charinput);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
  
}
