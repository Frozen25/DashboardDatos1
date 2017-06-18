/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

import static org.tec.search.BusquedaBinaria.busquedaBinaria;
import static org.tec.search.BusquedaInterpolada.busquedaBinariaI;



//import static org.tec.algoritmos.Floyd.floyd;
import static org.tec.algoritmos.Floyd.*;
import org.tec.algoritmos.Floyd;


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
    
        int q[][]={{0,3,4,0,0},{0,0,0,5,0},{0,0,0,3,0},{8,0,0,0,0},{1,2,7,0,0}};
        
        /*
        for(int[] i : q){
            for(Integer b : i){
                System.out.print(b + " ");
            }
            System.out.print("\n");
        }*/
        System.out.println("Floyd");
        floyd(q);
        Floyd.imprimir();
        int[][] graph = Floyd.recorridos();
        int[][] recorridos = Floyd.recorridos();
        Floyd.imprimir(graph);
        Floyd.imprimir(recorridos);
        
        
        /*
        System.out.println("Warshall");
        warshall(q);
        System.out.println("dijkstra");
        dijkstra(q,2);
        String a[] = {"1", "2","x","b", "a"};
        busquedaBinaria(a,"x");
        Integer[] z  = {9,8,7,6,5,4,3,2,1};
        busquedaBinariaI(z,5);
        String[] unsorted = {"bab","z", "4","u" , "a"};
        int b[] = {1,6,3,54,5,12,75,-1};
        for(Integer i : z){
        System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(z);
        bubbleSort(z);
        insertionSort(z);
        quickSort(z);
        shellSort(z);
        radixSort(b);
        mergeSort(z);
        for(Integer i : z){
        System.out.print(i + " ");
        }
        System.out.println();
         */
        
        
        
        
        
        }
        
    
    
    
    

    
    
    
    

    
    
    }
    
    
    

