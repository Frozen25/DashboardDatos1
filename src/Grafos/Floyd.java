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
public class Floyd  {
    static int size;
    static int[][] graph;
    static int[][] recorridos;
    static boolean flag = true;
    public static void main(int[][] ad){
        graph = ad;
        size = ad.length;
        
        recorridos = new int [size][size];
        

        change_vals();
        
        /*
        for(int[] i : graph){
            for(Integer b : i){
                System.out.print(b + " ");
            }
            System.out.print("\n");
        }
        System.out.println("");
        
        
        for(int[] i : recorridos){
            for(Integer b : i){
                System.out.print(b + " ");
            }
            System.out.print("\n");
        }*/
        //System.out.println("________________________");
        
        
        
        while (flag){
            flag=false;
            modify();
        }
        
        for(int[] i : graph){
            for(Integer b : i){
                System.out.print(b + " ");
            }
            System.out.print("\n");
        }
        System.out.println("");
        
        
        for(int[] i : recorridos){
            for(Integer b : i){
                System.out.print(b + " ");
            }
            System.out.print("\n");
        }
        System.out.println("");
        
        

        
    }
    private static void modify(){
        for (int k=0; k<size; k++){
                for(int i=0; i<size; i++){
                    for(int j=0; j<size; j++){
                        if(graph[i][j] == 9999)
                            {
                                flag = true;
                            }
                        if ((i!=k)&&(j!=k)&&(i!=j)){
                            
                            if(graph[i][k]+graph[k][j] < graph[i][j]){
                                
                                recorridos[i][j]=k;
                                graph[i][j] = graph[i][k]+graph[k][j];
                            }
                        }
                    }
                }
            }
    }
    
    private static void change_vals(){
    for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if (i!=j){
                    if ((graph[i][j]==0)){
                        graph[i][j]=9999;
                        recorridos[i][j]=-1;
                    }
                    else{
                        recorridos[i][j]=i;
                    }
                }
            }
        }
    
    }
    
    
    
    
    
    
    
    
    
    
}
