package chap5_decrease_and_conquer;

import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM InsertionSort(A[0..n - 1]) 
 * //Sorts a given array by insertion sort 
 * //lnput: An array A[0..n- 1] of n orderable elements 
 * //Output: Array A[0..n - 1] sorted in nondecreasing order 
 * 
 * for i <- 1 to n - 1 do 
 *   v <- A[i] 
 *   j <- i-1 
 *   while j >= 0 and A[j] > v do 
 *     A[j + 1] <- A[j] 
 *     j <- j-1
 *   A[j+1] <- v
 */

public class InsertionSort {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many elements?");
        int n = s.nextInt();
        if (n <= 0) {
            System.out.println("Bad value for n");
            System.exit(0);
        }
        int a[] = new int[n];
        System.out.println("Enter " + n + " element(s)");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Array before sort");
        printArray(a);
        insertionSort(a);

        System.out.println("Array after sort");
        printArray(a);
    }

    /**
     * Print array
     *
     * @param a : array
     */
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * Implementation of insertion sort algorithm
     *
     * @param a : array
     * @return sorted array
     */
    public static void insertionSort(int a[]) {
        int v, j = 0;
        int n = a.length;
        for (int i = 1; i <= n - 1; i++) {
            v = a[i];
            j = i - 1;
            while ((j >= 0) && (a[j] > v)) {

                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = v;
        }
    }
}
