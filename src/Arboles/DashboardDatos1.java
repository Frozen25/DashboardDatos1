/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;
import Algoritmos1.*;
import static Algoritmos1.BubbleSort.*;
import static Algoritmos1.InsertionSort.*;
import static Algoritmos1.SelectionSort.*;
import static Algoritmos1.ShellSort.*;
import static Algoritmos1.MergeSort.*;
import Grafos.Dijkstra;
import static Grafos.Dijkstra.*;
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
        /*
        int w[][]={{0,5,0,8,0},{0,0,6,9,0},{0,0,0,0,4},{0,0,2,0,7},{0,5,0,0,0}};
        //int q[][]={{1,2},{6,4}};
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                  {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {0, 0, 0, 0, 0, 2, 0, 1, 6},
                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}};

        Dijkstra.main(graph);
        //dijkstra(graph, 0);
        System.out.println("{{1,2},{6,4}}");
        Dijkstra.main(q);
        System.out.println("{{0,5,0,8,0},{0,0,6,9,0},{0,0,0,0,4},{0,0,2,0,7},{0,5,0,0,0}}");
        Dijkstra.main(w);
        System.out.println("Arboles.DashboardDatos1.main()");
        
        */
        
        
        
        
        
    String a[] = {"1", "2","x","b", "a"};
    int b[] = {1,6,3,54,5,12,75,-1};
    
    int[] z  = {9,8,7,6,5,4,3,2,1};
    String[] unsorted = {"bab","z", "4","u" , "a"};
    
    //selection_sort (unsorted);
    
    //display(unsorted);
    //shellSort(unsorted);
    //display(unsorted);
    
    for(Integer i : z){
            System.out.print(i + " ");
        }
    System.out.println();
    
    mergesort(z);
    
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
    
    
    

