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
public class Pila<T> extends ListaSimple<T>
    {
        public Pila() {
            First = null;
            
        }

        public void Push(T data) {
            AddFirst(data);
        }
        public void Pop() {
            DeleteFirst();
        }
        public NodoSimple<T> Peek() {
            return First;
        }
    }