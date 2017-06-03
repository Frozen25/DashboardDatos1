/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

/**
 *
 * @author Alexis
 */
public class InsertionSort {
    public static <E>  void insertionSort(E arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            E key = arr[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && ((((Comparable) (arr[j])).compareTo(key)) > 0))
            { 
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    

            
            
            
           
    
}
