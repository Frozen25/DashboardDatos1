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
public class algs <E>{
    
    
    public static <E> void Bubble_Sort(E[] unsorted) {
        for(int iter =1; iter< unsorted.length; iter++){
            for(int inner = 0; inner < (unsorted.length - iter); inner ++){
                if((((Comparable) (unsorted[inner])).compareTo(unsorted[inner+1])) > 0){
                    E tmp = unsorted[inner];
                    unsorted[inner] = unsorted[inner + 1];
                    unsorted[inner + 1] = tmp;
                }                
            }
        }
    }
    
    public static <E> void Insertion_Sort(E arr[])
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
    
    public static <E> void Selection_Sort(E[] arr){
         
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
        
    }
    
    
    public static <E> void Shell_Sort(E[] sequence) 
    {
        int increment = sequence.length / 2;
        while (increment > 0) 
        {
            for (int i = increment; i < sequence.length; i++) 
            {
                int j = i;
                E temp = sequence[i];
                while (j >= increment && ((((Comparable) (sequence[j - increment])).compareTo(temp)) > 0) ) 
                {
                    sequence[j] = sequence[j - increment];
                    j = j - increment;
                }
                sequence[j] = temp;
            }
            if (increment == 2)
                increment = 1;
            else
                increment -= 1;
 
        }
    }
    
    
    
    
}
