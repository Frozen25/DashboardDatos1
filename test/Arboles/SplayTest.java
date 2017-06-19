/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

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
public class SplayTest {
    
    public SplayTest() {
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
     * Test of Eliminar method, of class Splay.
     */
    @Test
    public void testEliminar1() {
        System.out.println("Eliminar");
        Object codl = 1;
        Splay instance = new Splay();
        instance.Insertar(codl);
        Object expResult = 1;
        
        Object result = instance.Eliminar().getData();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testEliminar2() {
        System.out.println("Eliminar");
        Object codl = 1;
        Object cod2 = 2;
        Object cod3 = 3;
        Splay instance = new Splay();
        instance.Insertar(codl);
        instance.Insertar(cod2);
        instance.Insertar(cod3);
        
        instance.Buscar(codl);
        Object expResult = 1;
        Object result = instance.Eliminar().getData();
        assertEquals(expResult, result);
    }


  

    /**
     * Test of Preorden method, of class Splay.
     */
    @Test
    public void testPreorden1() {
        System.out.println("Eliminar");
        Object codl = 1;
        Object cod2 = 2;

        Splay instance = new Splay();
        instance.Insertar(codl);
        instance.Insertar(cod2);
  
        Object expResult = "2 - 1 - ";
        Object result = instance.Preorden();
        assertEquals(expResult, result);
    }
    @Test
    public void testPreorden2() {
        System.out.println("Eliminar");
        Object codl = 1;
        Object cod2 = 2;

        Splay instance = new Splay();
        instance.Insertar(codl);
        instance.Insertar(cod2);
        instance.Buscar(1);
        Object expResult = "1 - 2 - ";
        Object result = instance.Preorden();
        assertEquals(expResult, result);
    }


    
}
