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
public class ShellSort 
{
    
 
    public static <E> void shellSort(E[] sequence) 
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
