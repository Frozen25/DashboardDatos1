package Grafos;

public class Kruskal{
    
    
	public static void kruskal(int [][] mat){
		
		//Scanner scan = new Scanner(System.in);
		//int[][] matrix = new int[5][5];
                int[][] matrix = mat;
		//int[] parent = new int[5];
                int[] parent = new int[mat.length];
		int min;
		int u = 0; 
		int v = 0;
		int noOfEdges = 1;
		int total = 0;
		
		for(int i = 0; i < mat.length; i++){
			
			parent[i] = 0;
			
			for(int j = 0; j < mat.length; j++){
				
				matrix[i][j] = mat[i][j];
				if(matrix[i][j]==0){
					matrix[i][j] = 999;
				}
				
			}
			
		}
		
		while(noOfEdges < mat.length){
			
			min = 999;
			
			for(int i = 0; i < mat.length; i++){
				
				for(int j = 0; j < mat.length; j++){
					
					if(matrix[i][j] < min){
						
						min = matrix[i][j];
						u = i;
						v = j;
						
					}
					
				}
				
			}
			
			while(parent[u]!=0){
				u = parent[u];
			}
			
			while(parent[v]!=0){
				v = parent[v];
			}
			
			if(v!=u){
				
				noOfEdges++;
				System.out.println("" + u + "->" + v+" : " + min);
				total+=min;
				parent[v] = u;
				
			}
			
			matrix[u][v] = 999;
			matrix[v][u] = 999;
			
		}
		
		//System.out.println("The weight of the minimum spanning tree is "+total);
		
	}
	
}