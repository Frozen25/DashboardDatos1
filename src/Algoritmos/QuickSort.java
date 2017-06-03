/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

/**
 *
 * @author Alexis
 */
class QuickSort{
        public static <T>  void  quickSort(T[] arr) 
        {
            Sort(arr, 0, arr.length - 1);
        }
        private static <T> void Sort(T[] arr, int low, int high) 
        {
            if (low >= high)
            {
                return;
            }
            int pivot = Partition(arr, low, high);

            Sort(arr, low, pivot - 1);
            Sort(arr, pivot + 1, high);
        }

        private static <T> int Partition(T[] lista, int primero, int ultimo) 
        {
            if (primero == ultimo)
            {
                return ultimo;
            }

            int pivot = primero;
            int i = primero + 1;
            int j = ultimo;

            while (true)
            {
                while ((((Comparable)lista[i]).compareTo(lista[pivot]) < 0) && i < ultimo) i++;
                {
                    while ((((Comparable)lista[j]).compareTo(lista[pivot]) > 0) && j > primero) j--;
                    if (j <= i)
                    {
                        break;
                    }
                    Swap(lista, i, j);
                }
            }
            Swap(lista, pivot, j);
            return j;
        }

        private static <T> void Swap(T[] lista, int i, int j)
        {
            T hold = lista[i];
            lista[i] = lista[j];
            lista[j] = hold;
        }
}