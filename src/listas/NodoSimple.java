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
public class NodoSimple<T> {
    private NodoSimple<T> Next;
        private T data;


        // T used in non-generic constructor.
        public NodoSimple()
            {
                this.Next = null;
                
            }

            

           
           
            public T getData() { return this.data; }
        public void setData(T value) { this.data = value; }
        public NodoSimple<T> getNext() { return this.Next; }
        public void setNext(NodoSimple<T> value) { this.Next = value; }
}
