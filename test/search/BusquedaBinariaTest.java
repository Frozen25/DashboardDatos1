/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

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
public class BusquedaBinariaTest {
    
    public BusquedaBinariaTest() {
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
     * Test of busquedaBinaria method, of class BusquedaBinaria.
     */
    @Test
    public void testBusquedaBinaria() {
        System.out.println("busquedaBinaria");
        Object[] data = {1,2,3,4,6,18,56};
        Object key = 3;
        int expResult = 2;
        int result = BusquedaBinaria.busquedaBinaria(data, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testBusquedaBinaria2() {
        System.out.println("busquedaBinaria2");
        Object[] data = {1,2,3,4,6,18,56};
        Object key = 5;
        int expResult = -1;
        int result = BusquedaBinaria.busquedaBinaria(data, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test(expected= ClassCastException.class)
    public void testBusquedaBinaria3() {
        System.out.println("busquedaBinaria3");
        Object[] data = {1,2,3,4,6,18,56};
        Object key = "2";
        int expResult = 1;
        int result = BusquedaBinaria.busquedaBinaria(data, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
