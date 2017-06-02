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
public class Dijkstra {

	//static graph scan; // scan is a Scanner Object
	static int size;
	public static void main(int[][] graph){
                size = graph.length;
		int[] preD = new int[size];
		int min = 999, nextNode = 0; // min holds the minimum value, nextNode holds the value for the next node.
		
		int[] distance = new int[size]; // the distance matrix
		int[][] matrix = new int[size][size]; // the actual matrix
		int[] visited = new int[size]; // the visited array
		
		System.out.println("Enter the cost matrix"); 
		
		for(int i = 0; i < distance.length; i++){
			
			visited[i] = 0; //initialize visited array to zeros
			
			preD[i] = 0;
			
			for(int j = 0; j < distance.length; j++){
				
				
				if(matrix[i][j]==0){
					
					matrix[i][j] = 999; // make the zeros as 999
					
				}
				
			}
			
                }
		
		distance = matrix[0]; //initialize the distance array
		visited[0] = 1; //set the source node as visited
		distance[0] = 0; //set the distance from source to source to zero which is the starting point
		
		for(int counter = 0; counter < 5; counter++){
			
			min = 999;
			
			for(int i = 0; i < 5; i++){
				
				if(min > distance[i] && visited[i]!=1){
					
					min = distance[i];
					nextNode = i;
					
				}
				
			}
			
			visited[nextNode] = 1;
			
			for(int i = 0; i < 5; i++){
				
				if(visited[i]!=1){
					
					if(min+matrix[nextNode][i] < distance[i]){
						
						distance[i] = min+matrix[nextNode][i];
						preD[i] = nextNode;
						
					}
					
				}
				
			}
			
		}
		
		for(int i = 0; i < 5; i++){
			
			System.out.print("|" + distance[i]);
			
		}
		System.out.println("|");
		
		int j;
		for(int i = 0; i < 5; i++){
			
			if(i!=0){
				
				System.out.print("Path = " + i);
				j = i;
				do{
					
					j=preD[j];
					System.out.print(" <- " + j);
					
				}while(j!=0);
				
			}
			
			System.out.println();
			
		}

	}	
	
}
