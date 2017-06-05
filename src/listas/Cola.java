/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Gabriel
 */
public class Cola<T> extends ListaSimple<T> 
    {
        public Cola() { First = null; }
        public void Queue(T data)
        {
            AddLast(data);
        }
        public void Unqueue()
        {
            DeleteFirst();
        }
        public NodoSimple<T> Peek()
        {
            return First;
        }
    }