/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos1;

/**
 *
 * @author Alexis
 */
public class BusBinarioI{


	    public static  <E> int  busquedaBinariaI(E[] data ,E key) 
	    {
	         int min = 0;
	         int max = data.length-1;
	          
	         while(max >= min) {
                     
	             int medio = min + (((Comparable) (key)).compareTo(data[min])) * (max - min) / (((Comparable) (data[max])).compareTo(data[min]));
	             if(data[medio].equals(key)) {
	                return medio;
	             }
                     
	             if((((Comparable) (data[medio])).compareTo(key)) < 0){
	                 min = medio + 1;
	             }
	             if((((Comparable) (data[medio])).compareTo(key)) > 0) {
	                 max = medio - 1;
	             }
	        }
	       return -1;
	   }

	    
	    
}