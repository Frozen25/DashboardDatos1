/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;
import static Algoritmos.BubbleSort.*;
import static Algoritmos.BusBinario.busquedaBinaria;
import static Algoritmos.BusBinarioI.busquedaBinariaI;
import static Algoritmos.InsertionSort.*;
import static Algoritmos.SelectionSort.*;
import static Algoritmos.ShellSort.*;
import static Algoritmos.MergeSort.*;
import static Grafos.Dijsktra.dijkstra;
import Grafos.Floyd;
import static Grafos.Floyd.*;
import static Grafos.Warshall.*;

/**
 *
 * @author Alexis
 */
public class DashboardDatos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
    
        int q[][]={{0,3,4,0},{0,0,0,5},{0,0,0,3},{8,0,0,0}};
        
        /*
        for(int[] i : q){
            for(Integer b : i){
                System.out.print(b + " ");
            }
            System.out.print("\n");
        }*/
        System.out.println("Floyd");
        floyd(q);
        System.out.println("Warshall");
        warshall(q);
        System.out.println("dijkstra");
        dijkstra(q,2);
        
        
        

        String a[] = {"1", "2","x","b", "a"};
        busquedaBinaria(a,"x");
        Integer[] z  = {9,8,7,6,5,4,3,2,1};
        busquedaBinariaI(z,5);
        
    
        
        
        
    int b[] = {1,6,3,54,5,12,75,-1};
    
    
    String[] unsorted = {"bab","z", "4","u" , "a"};
    
    //selection_sort (unsorted);
    
    //display(unsorted);
    //shellSort(unsorted);
    //display(unsorted);
    
    for(Integer i : z){
            System.out.print(i + " ");
        }
    System.out.println();
    
    shellSort(z);
    
    for(Integer i : z){
            System.out.print(i + " ");
        }
    System.out.println();
    
    }
    
    
    
    
    public static <E> void display(E[] unsorted) {
        for(E i : unsorted){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    
    }
    
    
    

