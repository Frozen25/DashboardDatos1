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
public class MergeSort {
    public static <T> void mergeSort(T[] arr) 
        {
            T[] aux = (T[])new Object[arr.length];
            Sort(arr, aux, 0, arr.length - 1);
        }
        public static <T> void Sort(T[] arr, T[] aux, int low, int high) 
        {
            if (low >= high)
            {
                return;
            }

            int mid = (low + high) / 2;
            Sort(arr, aux, low, mid);
            Sort(arr, aux, mid + 1, high);
            Sort(arr, aux, low, mid, high);
        }

        public static <T> void Sort(T[] arr, T[] aux, int low, int mid, int high) 
        {
            for (int i = low; i <= high; i++)
            {
                aux[i] = arr[i];
            }

            int curr = low;
            int minA = low, minB = mid + 1;

            while (curr <= high)
            {
                if (minA > mid)
                {
                    arr[curr] = aux[minB];
                    minB++;
                }
                else if (minB > high)
                {
                    arr[curr] = aux[minA];
                    minA++;
                }
                else if (((Comparable)aux[minB]).compareTo(aux[minA]) < 0) // this check is important for stability
                {
                    arr[curr] = aux[minB];
                    minB++;
                }
                else
                {
                    arr[curr] = aux[minA];
                    minA++;
                }
                curr++;
            }
        }
}
