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
public class ListaSimple<T>
    {
        public NodoSimple<T>  First, Last;
        private int size;
        public ListaSimple(){
            NodoSimple First = null;
            NodoSimple Last = null;
            int size = 0;
        }
        public boolean Vacio() { return size == 0; }

        public int getSize(){return size;}



        public void AddFirst(T data) {
            NodoSimple<T> n1 = new NodoSimple<T>();
            n1.setData( data);
            if (Vacio()) {
                 First= n1;
                Last= n1 ;
                this.size++;}
            else {
                n1.setNext( this.First);
                this.First = n1;
                this.size++;}

        }

        
        public void AddLast(T data)
        {
            NodoSimple<T> n1 = new NodoSimple<T>();
            n1.setData(data);
            if (Vacio())
            {
                First = n1;
                Last = n1;
                this.size++;
            }
            else
            {
                Last.setNext(n1);
                this.Last= n1;
                this.size++;
            }

        }

        public void AddAtIndex(T data, int index ) {
            if (index == size-1) { AddLast(data); }
            else if (index <= 1 ) { AddFirst(data); }
            else
            {
                NodoSimple<T> n1 = new NodoSimple<T>();
                n1.setData(data);
                NodoSimple<T> temp = First;
                for(int i=1;i<index-1; i++)
                {
                    temp = temp.getNext();
                }
                n1.setNext(temp.getNext());
                temp.setNext(n1);
            }
           
        }

        public void DeleteFirst()
        {
            
            First = First.getNext();
            size--;
        }

        public void DeleteLast()
        {
            NodoSimple<T> n1 = First;
            while(n1.getNext()!=Last)
            {
                n1 =n1.getNext();
            }
            Last = n1;
            Last.setNext(null);
            size--;
        }


        public void DeleteAt(int index) {
            NodoSimple<T> n1 = First;
            for (int i = 1; i < index - 1; i++)
            {
                n1 = n1.getNext();
            }
            n1.setNext(n1.getNext().getNext());
        }










        public void print()
        {
            NodoSimple<T> n = this.First;

            while (n != null)
            {
                System.out.println(n.getData());
                n = n.getNext();
            }
        }
}
    