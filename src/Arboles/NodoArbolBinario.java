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
public class NodoArbolBinario <B>{
    private B data;
    public NodoArbolBinario left;
    public NodoArbolBinario right;	
    
    public NodoArbolBinario(B data){
        this.data = data;
        left = null;
        right = null;
    }

    
    public B getData()
    {
        return  data;
    }
}