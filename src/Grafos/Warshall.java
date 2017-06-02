/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos;

/**
 *
 * @author Alexis
 */

//import java.util.Scanner;

public class Warshall
{
    private static int V;    
    private static boolean[][] tc;
    /** Function to make the transitive closure **/
    public static void getTC(int[][] graph)
    {
        V = graph.length;
        tc = new boolean[V][V];
        for (int i = 0; i < V; i++) 
        {    
            for (int j = 0; j < V; j++) 
                if (graph[i][j] != 0)
                    tc[i][j] = true;
            tc[i][i] = true;
        }
        for (int i = 0; i < V; i++) 
        {
            for (int j = 0; j < V; j++) 
            {
                if (tc[j][i]) 
                    for (int k = 0; k < V; k++) 
                        if (tc[j][i] && tc[i][k]) 
                            tc[j][k] = true;             
            }
        }
        
    }
    /** Funtion to display the trasitive closure **/
    public static void displayTC()
    {
        System.out.println("\nTransitive closure :\n");
        System.out.print(" ");
        for (int v = 0; v < V; v++)
           System.out.print("   " + v );
        System.out.println();
        for (int v = 0; v < V; v++) 
        {
            System.out.print(v +" ");
            for (int w = 0; w < V; w++) 
            {
                if (tc[v][w]) 
                    System.out.print("  * ");
                else                  
                    System.out.print("    ");
            }
            System.out.println();
        }
    }    
 
    /** Main function **/
    public static void warshall (int[][]graph) 
    {
        

 
        
 
        getTC(graph);
        displayTC();
    }
}