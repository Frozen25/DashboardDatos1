/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

/**
 *
 * @author Alexis
 */
public class TestArboles {
    
    public static void main(String[] args){
    String x = "Splay";
        
 //----------------------------------------------------------------------------       
    if (x=="AVL")    {  
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
    if (x=="Splay"){
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
    if (x=="BST"){
        
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
    if (x=="B"){
        
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
