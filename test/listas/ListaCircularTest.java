/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

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
public class ListaCircularTest {
    
    public ListaCircularTest() {
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
     * Test of AddFirst method, of class ListaCircular.
     */
    @Test
    public void circular1() {
        System.out.println("AddFirst");
        Object data1 = 1;
        Object data2 = 2;
        ListaCircular instance = new ListaCircular();
        instance.AddFirst(data1);
        //  1  -> \
        //   <----/
        instance.AddFirst(data2);
        //  2 -> 1 ->\
        //   <-------/
        Object expResult = 2;
        Object result = instance.Last.getNext().getData();
        assertEquals(expResult, result);
    }
    @Test
    public void circular2() {
        System.out.println("AddFirst");
        Object data1 = 1;
        Object data2 = 2;
        Object data3 = 3;
        ListaCircular instance = new ListaCircular();
        instance.AddFirst(data1);
        //  1  -> \
        //   <----/
        instance.AddFirst(data2);
        //  2 -> 1 ->\
        //   <-------/
        instance.AddLast(data3);
        //  2 -> 1 -> 3->\
        //   <-----------/
        Object expResult = 2;
        Object result = instance.Last.getNext().getData();
        assertEquals(expResult, result);
    }




    
}
