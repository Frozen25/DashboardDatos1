/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

//import static org.tec.algoritmos.Floyd.floyd;
//import static org.tec.algoritmos.Floyd.*;
//import org.tec.algoritmos.Floyd;
import static Grafos.Dijkstra.dijkstra;
import Grafos.Floyd;
import static Grafos.Floyd.*;
import Grafos.Warshall;
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

        int q[][]={{0,3,4,0},{0,0,0,5},{0,0,0,3},{8,0,0,0}};
        int q_m[][]={{0,3,4,0,0},{0,0,0,5,0},{0,0,0,3,0},{8,0,0,0,0},{1,2,7,0,0}};
        
        
        
        System.out.println("   3->B->5   \n"
                + "  /       \\ \n"
                + " A<---8----D\n"
                + " \\        / \n"
                + "  4->C-3->"
                + " ");
        System.out.println("Adyacencia");
        for(int[] i : q){
            for(Integer b : i){
                System.out.print(b + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Floyd");
        floyd(q);
        int[][] graph = Floyd.graph();
        int[][] recorridos = Floyd.recorridos();
        System.out.println("Pesos");
        Floyd.imprimir(graph);
        System.out.println("Recorridos");
        Floyd.imprimir(recorridos);
        
        
        
        System.out.println("Warshall");
        warshall(q);
        int[][] war = Warshall.recorridos();
        Warshall.imprimir(war);
        //System.out.println("dijkstra");
        //dijkstra(q,2);
        
        
        /*
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
    
    
    

