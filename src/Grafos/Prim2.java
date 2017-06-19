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

import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Prim2
{
    private static boolean settled[];
    private static int graph[][];
    private static int prim [][];
    private static int distance[];
    private static int from[];
    private static int INF = 9999;
 
    public static void primsAlgorithm(int adjacencyMatrix[][])
    {
        
        graph=adjacencyMatrix;
        prim = new int [graph.length][graph.length];
        from = new int [graph.length];
        distance = new int [graph.length];
        settled= new boolean [graph.length];
        
        int current=0;
        for (int i=0;i<graph.length;i++){
            
            int[] array = graph[current];
            
            int minValue = INF;
            int j=0;
            int k=0;
            for (j = 0; j < array.length; j++){
                if ((array[j]!=0)&&(!settled[j])&&(array[j] < minValue)){
                    minValue = array[j];
                    k=j;
                }
            }
            prim[current][k]=minValue;
            settled[current]=true;
            
            
            
            
            
        }
        
        
    } 
 
 

}
