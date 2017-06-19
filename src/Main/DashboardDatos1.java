/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.tec.datastructures.*;
import org.tec.gafos.*;
import org.tec.search.*;
import org.tec.sort.*;


/**
 *
 * @author Alexis
 */
public class DashboardDatos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        //  listas
        //  ordenamiento
        //  busqueda
        //  Grafos
        //   BST    AVL   B   Splay
        String x="ordenamiento";
        System.out.println(x+"\n");
        
        
        
        
 //----------------------------------------------------------------------------    
        if (x=="listas"){     
//---------------------------------------------------------------
//                           Lista Simple
//---------------------------------------------------------------
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Lista Simple");
            ListaSimple ls = new ListaSimple();
            System.out.println("agrega 1 al inicio");
            ls.AddFirst(1);
            System.out.println("agrega tres al final");
            ls.AddLast("tres");
            System.out.println("tamaño = "+ls.getSize());
            System.out.println("agrega 2 en la posicion 2");
            ls.AddAtIndex(2, 2);
            System.out.println("muestra la lista");
            ls.print();
            System.out.println("\nagrega 4 al inicio");
            ls.AddFirst(4);
            System.out.println("muestra la lista");
            ls.print();
            System.out.println("agrega 0 al final");
            ls.AddLast(0);
            System.out.println("agrega 5 en la posicion 3");
            ls.AddAtIndex(5, 3);
            System.out.println("muestra la lista");
            ls.print();
            System.out.println("se elimina el primero");
            ls.DeleteFirst();
            System.out.println("muestra la lista");
            ls.print();
            System.out.println("se elimina el valor en la posicion 2");
            ls.DeleteAt(2);
            System.out.println("\nmuestra la lista");
            ls.print();
            System.out.println("\nse elimina el ultimo");
            ls.DeleteLast();
            System.out.println("muestra la lista");
            ls.print();



            System.out.println(" ");

int r47a=1;
//---------------------------------------------------------------
//                           Lista Doble
//---------------------------------------------------------------
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Lista Doble");
            ListaDoble ld = new ListaDoble();
            System.out.println("agrega 1 al inicio");
            ld.AddFirst(1);
            System.out.println("agrega 3 al final");
            ld.AddLast(3);
            System.out.println("agrega 2 en la posicion 2");
            ld.AddAtIndex(2, 2);
            System.out.println("muestra la lista de forma del index 0 al ultimo");
            ld.PrintForwards();
            System.out.println("muestra la lista de forma del index ultimo al 0");
            ld.PrintBackwards();

            System.out.println("agrega 4 al inicio");
            ld.AddFirst(4);
            System.out.println("muestra la lista");
            ld.PrintForwards();
            System.out.println("agrega 0 al final");
            ld.AddLast(0);
            System.out.println("muestra la lista");
            ld.PrintForwards();
            System.out.println("agrega 5 en la posicion 3");
            ld.AddAtIndex(5, 3);
            System.out.println("muestra la lista");
            ld.PrintForwards();
            System.out.println("se elimina el 4");
            ld.DeleteFirst();
            System.out.println("muestra la lista");
            ld.PrintForwards();
            System.out.println("se elimina el 5 en la posicion 2");
            ld.DeleteAt(2);
            System.out.println("muestra la lista");
            ld.PrintForwards();
            System.out.println("se elimina el 0");
            ld.DeleteLast();
            System.out.println("muestra la lista");
            ld.PrintForwards();

            System.out.println(" ");

int ra74=1;
//---------------------------------------------------------------
//                           Lista Circular
//---------------------------------------------------------------
            System.out.println("----------------------------------------------------------------------");
            System.out.println("crea un lista circular");
            ListaCircular lc = new ListaCircular();
            System.out.println("agrega 1 al inicio");
            lc.AddFirst(1);
            System.out.println("agrega 3 al final");
            lc.AddLast(3);
            System.out.println("agrega 2 en la posicion 2");
            lc.AddAtIndex(2, 2);
            System.out.println("muestra la lista");
            lc.Print();

            System.out.println("agrega 4 al inicio");
            lc.AddFirst(4);
            System.out.println("muestra la lista");
            lc.Print();
            System.out.println("agrega 0 al final");
            lc.AddLast(0);
            System.out.println("muestra la lista");
            lc.Print();
            System.out.println("agrega 5 en la posicion 3");
            lc.AddAtIndex(5, 3);
            System.out.println("muestra la lista");
            lc.Print();
            System.out.println("se elimina el 4");
            lc.DeleteFirst();
            System.out.println("muestra la lista");
            lc.Print();
            System.out.println("se elimina el 5 en la posicion 2");
            lc.DeleteAtIndex(2);
            System.out.println("muestra la lista");
            lc.Print();
            System.out.println("se elimina el 0");
            lc.DeleteLast();
            System.out.println("muestra la lista");
            lc.Print();

            System.out.println(" ");
int r57a=1;
//---------------------------------------------------------------
//                           Pila
//---------------------------------------------------------------
            System.out.println("----------------------------------------------------------------------");
            System.out.println("crea una pila");
            Pila pil = new Pila();
            System.out.println("se empuja el 5");
            pil.Push(5);
            System.out.println("se empuja el 6");
            pil.Push(6);
            System.out.println("se revisa la pila");
            System.out.println(pil.Peek().getData() +" fue el ultimo en introducirse");
            System.out.println("se se saca el primero");
            pil.Pop();
            System.out.println("se revisa la pila de nuevo");
            System.out.println(pil.Peek().getData() + " fue el ultimo en introducirse");
            System.out.println(" ");


int ra9=1;
//---------------------------------------------------------------
//                           Cola
//---------------------------------------------------------------
            System.out.println("----------------------------------------------------------------------");
            System.out.println("se crea una cola");
            Cola col = new Cola();
            System.out.println("encolo el 8");
            col.Queue(8);
            System.out.println("encolo el 9");
            col.Queue(9);
            System.out.println("encolo el 10");
            col.Queue(10);
            System.out.println("desencolo el 8");
            col.Unqueue();
            System.out.println("reviso la cola");
            System.out.println( col.Peek().getData()+ " es el siguente en la cola");
            System.out.println("desencolo el 9");
            col.Unqueue();
            System.out.println("reviso la cola");
            System.out.println(col.Peek().getData() + " es el siguente en la cola");
            System.out.println(" ");





        }
       
    int r6a=1;    
    //-----------------------------------------------------------------------------------   
    //                               Ordenamiento
    //----------------------------------------------------------------------------------- 
        if(x=="ordenamiento"){
            
            Integer[] z  = {9,66,7,6,555,4,33,2,1};
            
            System.out.println("Ordenamiento Integers");
            for(Object i : z){
            System.out.print(i + " ");
            }
            System.out.println();
            
            SelectionSort.selectionSort(z);
            BubbleSort.bubbleSort(z);
            InsertionSort.insertionSort(z);
            QuickSort.quickSort(z);
            ShellSort.shellSort(z);
            RadixSort.radixSort(z);
            MergeSort.mergeSort(z);
            
            for(Object i : z){
            System.out.print(i + " ");
            }
            System.out.println();
            
            
            String a[] = {"b", "2","x","1", "a"};
            
            System.out.println("Ordenamiento Strings");
            for(Object i : a){
            System.out.print(i + " ");
            }
            System.out.println();
            
            SelectionSort.selectionSort(a);
            BubbleSort.bubbleSort(a);
            InsertionSort.insertionSort(a);
            QuickSort.quickSort(a);
            ShellSort.shellSort(a);
            //RadixSort no
            MergeSort.mergeSort(a);
            
            for(Object i : a){
            System.out.print(i + " ");
            }
            System.out.println();
            
        
        }
    int r4a=2;    
    //-----------------------------------------------------------------------------------   
    //                               Busqueda
    //----------------------------------------------------------------------------------- 
        if (x=="busqueda"){
            
            System.out.println("Busqueda Binaria");
            String a_Ordenado[] = {"1", "2","a","b", "x"};
            int busquedaBinaria = BusquedaBinaria.busquedaBinaria(a_Ordenado,"x");
            System.out.println(busquedaBinaria);
            System.out.println("Busqueda Interpolada");
            Integer[] z_Ordenado  = {1,2,3,4,5,6,7,8,9};
            int busquedaBinariaI = BusquedaInterpolada.busquedaBinariaI(z_Ordenado,5);
            System.out.println(busquedaBinariaI);

        }
        
    int ra=1;
    //-----------------------------------------------------------------------------------   
    //                               Grafos
    //-----------------------------------------------------------------------------------        
    
        if (x=="Grafos"){
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
            Floyd.floyd(q);
            int[][] graph = Floyd.graph();
            int[][] recorridos = Floyd.recorridos();
            System.out.println("Pesos");
            Floyd.imprimir(graph);
            System.out.println("Recorridos");
            Floyd.imprimir(recorridos);

            System.out.println("Warshall");
            Warshall.warshall(q);
            Warshall.imprimir(Warshall.recorridos());

            System.out.println("Dijkstra");
            System.out.print("\t From = " + 2 +"\n");
            Dijkstraa.dijkstraa(q,2);

            int [][]w = {{0,10,3,4},{10,0,4,0},{3,4,0,1},{4,0,1,0}};
            int [][]ww = {{0,10,3,4,0},{10,0,4,0,33},{3,4,0,1,1},{4,0,1,0,7},{0,33,1,7,0}};


            System.out.println("      B--4   \n"
                    + "          \\ \n"
                    + " A----3----C\n"
                    + " \\        / \n"
                    + "  4--D---1"
                    + " ");
            System.out.println("Prim");
            Prim G = new Prim(w);
            G.prim();
            System.out.println("Kruskal");
            Kruskal.kruskal(w);
        
        
        }
   
        
      int rn=2;  
    //-----------------------------------------------------------------------------------   
    //                               Arboles
    //-----------------------------------------------------------------------------------   
            //   BST    AVL   B   Splay
            
    String y = "";
    
    if ((x=="AVL")||(y=="AVL") )   {  
        System.out.println("AVL String");
        ArbolAVL avl = new ArbolAVL();
        avl.Insercion("10z");
        System.out.println(avl.Preorden());
        avl.Insercion("20z");
        System.out.println(avl.Preorden());
        avl.Insercion("60z");
        System.out.println(avl.Preorden());
        avl.Insercion("30z");
        System.out.println(avl.Preorden());
        avl.Insercion("40z");
        System.out.println(avl.Preorden());
        avl.Insercion("50z");
        System.out.println(avl.Preorden());

        System.out.println("AVL Integer");
        ArbolAVL avl2 = new ArbolAVL();
        avl2.Insercion(10);
        System.out.println(avl2.Preorden());
        avl2.Insercion(20);
        System.out.println(avl2.Preorden());
        avl2.Insercion(60);
        System.out.println(avl2.Preorden());
        avl2.Insercion(30);
        System.out.println(avl2.Preorden());
        avl2.Insercion(40);
        System.out.println(avl2.Preorden());
        avl2.Insercion(50);
        System.out.println(avl2.Preorden());
    }
    
 //----------------------------------------------------------------------------     
    if ((x=="Splay")||(y=="Splay") ){
        System.out.println("Splay String");
        Splay splay1 = new Splay();
        splay1.Insertar("1a");
        splay1.Insertar("5a");
        splay1.Insertar("4a");
        splay1.Insertar("9a");
        splay1.Insertar("Aa");
        splay1.Insertar("Ja");
        splay1.Insertar("Da");
        System.out.println(splay1.Preorden());
        splay1.Buscar("1a");
        System.out.println(splay1.Preorden());
        splay1.Buscar("5a");
        System.out.println(splay1.Preorden());
        
        System.out.println("Splay Integer");
        Splay splay2 = new Splay();
        splay2.Insertar(1);
        splay2.Insertar(5);
        splay2.Insertar(40);
        splay2.Insertar(9);
        splay2.Insertar(10);
        splay2.Insertar(13);
        splay2.Insertar(50);
        System.out.println(splay2.Preorden());
        splay2.Buscar(1);
        System.out.println(splay2.Preorden());
        splay2.Buscar(40);
        System.out.println(splay2.Preorden());
    }
    //----------------------------------------------------------------------------      
    if ((x=="BST")||(y=="BST") ){
        
        System.out.println("Binary Search Tree String");
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert("tres");
        bst.insert("seis");
        bst.insert("z");
        bst.insert("c");
        bst.insert("7");
        bst.insert("1");
        bst.insert("a");
        System.out.println(bst.Inorden());
        bst.delete("tres");
        System.out.println("delete tres\n"+bst.Inorden());
        
        
        System.out.println("Binary Search Tree Integer");
        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.insert(3);
        bst2.insert(6);
        bst2.insert(12);
        bst2.insert(5);
        bst2.insert(60);
        bst2.insert(50);
        bst2.insert(1);
        System.out.println(bst2.Inorden());
        bst2.delete(3);
        System.out.println("delete  3\n"+bst2.Inorden());
        
        
        }
        
    //----------------------------------------------------------------------------      
    if ((x=="B")||(y=="B") ){
        
        System.out.println("Btree String");
        BTree bt = new BTree();
        bt.insert("4b");
        System.out.println(bt.preOrder());
        bt.insert("42b");
        System.out.println(bt.preOrder());
        bt.insert("45b");
        System.out.println(bt.preOrder());
        bt.insert("1");
        System.out.println(bt.preOrder());
        bt.insert("40a");
        bt.insert("30b");
        bt.insert("50b");
        bt.insert("51b");
        bt.insert("52b");
        bt.insert("53b");
        bt.insert("54b");
        bt.insert("55b");
        System.out.println(bt.preOrder());

        System.out.println("Btree Integer");
        BTree bt2 = new BTree();
        bt2.insert(4);
        System.out.println(bt2.preOrder());
        bt2.insert(42);
        System.out.println(bt2.preOrder());
        bt2.insert(45);
        System.out.println(bt2.preOrder());
        bt2.insert(1);
        System.out.println(bt2.preOrder());
        bt2.insert(40);
        bt2.insert(30);
        bt2.insert(50);
        bt2.insert(51);
        bt2.insert(52);
        bt2.insert(53);
        bt2.insert(54);
        bt2.insert(55);
        System.out.println(bt2.preOrder());   
    
    }
    //----------------------------------------------------------------------------  
        
    
        
    
    

    
    
    }
}
    
    
    

