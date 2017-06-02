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
public class SelectionSort {

    public static <E> void selectionSort(E[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                 
                 
                        
                if ((((Comparable) (arr[index])).compareTo(arr[j])) > 0)
                    index = j;
      
            E smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        //return arr;
    }

 
    
}
