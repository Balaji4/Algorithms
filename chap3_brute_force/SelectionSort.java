/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chap3_brute_force;

import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */
/**
 * ALGORITHM SelectionSort(A[0 .. n -1]) 
 * //Sorts a given array by selection sort
 * //Input: An array A[0 .. n - 1] of orderable elements 
 * //Output: Array A[0 .. n - 1] sorted in ascending order 
 * 
 * for i <- 0 to n - 2 do 
 *   min <- i 
 *   for j <- i+l to n-l do 
 *    if A[j] < A[min] min <- j 
 *   swap A[i] and A[min]
 *
 */
public class SelectionSort {

    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("How many elements?");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Array before sort:");
        printArray(a);
        selectionSort(a);
        System.out.println("Array after sort:");
        printArray(a);
    }

    /**
     * Print all elements of array
     *
     * @param a: array
     */
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * Implementation of Selection Sort algorithm
     *
     * @param a : array of integers
     */
    public static void selectionSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;

        }
    }
}
