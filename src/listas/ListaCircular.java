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
public class ListaCircular<T>
    {
        public NodoSimple<T>  Last;
        private int size;
        public ListaCircular()
        {
            
            Last = null;
            size = 0;
        }
        public boolean Vacio() { return size == 0; }





        public void AddFirst(T data)
        {
            NodoSimple<T> n1 = new NodoSimple<T>();
            n1.setData(data);
            if (Vacio())
            {
                
                Last = n1;
                Last.setNext(Last);
                this.size++;
            }
            else
            {
                n1.setNext(Last.getNext());
                Last.setNext(n1);
                this.size++;
            }

        }


        public void AddLast(T data)
        {
            NodoSimple<T> n1 = new NodoSimple<T>();
            n1.setData(data);
            if (Vacio())
            {
                
                Last = n1;
                Last.setNext(Last);
                this.size++;
            }
            else
            {
                n1.setNext(Last.getNext());
                Last.setNext(n1);
                this.Last = n1;
                this.size++;
            }
        
        }
        public void AddAtIndex(T data,int index) {
            NodoSimple<T> temp = Last.getNext();
            NodoSimple<T> n1 = new NodoSimple<T>();

            n1.setData(data);
            for (int i = 1; i < index - 1; i++)
            {
                temp = temp.getNext();
            }
            n1.setNext(temp.getNext());
            temp.setNext(n1);
            this.size++;
        }

       public void DeleteFirst() {
            Last.setNext(Last.getNext().getNext());
            size--;

        }
        public void DeleteLast() {
            NodoSimple<T> n1 = Last.getNext();

            for (int i =1;i<size-1;i++) {
                n1 = n1.getNext();
            }
            n1.setNext(Last.getNext());
            Last = n1;
            size--;
        }

        public void DeleteAtIndex(int index) {
            NodoSimple<T> n1 = Last.getNext();
            for (int i = 1; i < index - 1; i++)
            {
                n1 = n1.getNext();
            }
            n1.setNext(n1.getNext().getNext());
            size--;
        }

        public void Print() {
            NodoSimple<T> n1 = Last.getNext();
            for (int i = 0; i < size ; i++)
            {
                System.out.println(n1.getData());
                n1 = n1.getNext();
            }
        }










    }