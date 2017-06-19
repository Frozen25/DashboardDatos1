/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos;

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
public class FloydTest {
    
    public FloydTest() {
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
     * Test of recorridos method, of class Floyd.
     */
    @Test
    public void testRecorridos() {
        System.out.println("recorridos");
        int[][] ad ={{0,1,3},{8,0,2},{0,0,0}};
        int[][] expResult = {{0,0,0},{1,0,1},{-1,-1,0}};
        
        Floyd.floyd(ad);
        int[][] result = Floyd.recorridos();
        
        
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of graph method, of class Floyd.
     */
    @Test
    public void testGraph() {
        System.out.println("graph");
        int[][] ad ={{0,1,0},{8,0,2},{3,0,0}};
        int[][] expResult = {{0,1,3},{5,0,2},{3,4,0}};
        Floyd.floyd(ad);
        int[][] result = Floyd.graph();
        assertArrayEquals(expResult, result);
        
        
    }
    
}
