/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexis
 */
public class ShellSortTest {
    
    public ShellSortTest() {
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
     * Test of shellSort method, of class ShellSort.
     */
    @Test(expected=ClassCastException.class)
    public void testShellSort() {
        System.out.println("shellSort");
        Object[] sequence = {63,661,3,"34",633.3,"3463"};
        ShellSort.shellSort(sequence);
        
    }
    
}
