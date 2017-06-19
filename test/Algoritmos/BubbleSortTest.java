/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexis
 */
public class BubbleSortTest {
    
    public BubbleSortTest() {
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
     * Test of bubbleSort method, of class BubbleSort.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        Object[] unsorted = {55,2,9};
        BubbleSort.bubbleSort(unsorted);
        
        Object[] expResult = {2,9,55};
        
        Assert.assertArrayEquals(expResult, unsorted);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
