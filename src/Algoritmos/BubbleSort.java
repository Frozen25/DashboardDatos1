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
public class BubbleSort{

    public static <E> void bubbleSort(E[] unsorted) {
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

    
    
    
}
