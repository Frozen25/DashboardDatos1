/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author Alexis
 */
public class BusquedaBinaria{


	    public static <E>  int  busquedaBinaria(E[] data ,E key) 
	    {
	         int min = 0;
	         int max = data.length-1;
	          
	         while(max >= min) {
	             int medio = (min + max) / 2;
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
