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
public class NodoArbolBinario <B extends Comparable<B>>{
    private B data;
    NodoArbolBinario left;
    NodoArbolBinario right;	
    
    public NodoArbolBinario(B data){
        this.data = data;
        left = null;
        right = null;
    }

    
    public String getData()
    {
        return (String) data;
    }
}