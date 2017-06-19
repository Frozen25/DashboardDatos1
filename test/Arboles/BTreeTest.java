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
public class BTreeTest {
    
    public BTreeTest() {
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
     * Test of preOrder method, of class BTree.
     * 42 4 45
     */
    @Test
    public void testPreOrder() {
        System.out.println("preOrder");
        BTree instance = new BTree();
        
        instance.insert(4);
        instance.insert(42);
        instance.insert(45);
        String expResult = "42 4 45 ";
        String result = instance.preOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testPreOrder2() {
        System.out.println("preOrder");
        BTree instance = new BTree();
        
        instance.insert(4);
        instance.insert(42);

        String expResult = "4 42 ";
        String result = instance.preOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test(expected=ClassCastException.class)
    public void testInsert() {
        System.out.println("Insert");
        BTree instance = new BTree();
        
        instance.insert(4);
        instance.insert("num");


        
    }

  
}
