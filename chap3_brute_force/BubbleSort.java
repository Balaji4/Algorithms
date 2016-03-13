package chap3_brute_force;

import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM BubbleSort(A[0 .. n - 1])
 * //Sorts a given array by bubble sort
 * //Input: An array A[0 .. n - 1] of orderable elements
 * //Output: Array A[0 .. n- 1] sorted in ascending order
 * 
 * for i <- 0 to n - 2 do
 *   for j <- 0 to n - 2 - i do
 *     if A[j + 1] < A[j] swap A[j] and A[j + 1]
 */
public class BubbleSort {

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
        bubbleSort(a);
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
     * Implementation of Bubble Sort algorithm
     *
     * @param a : array of integers
     */
    public static void bubbleSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j + 1] < a[j]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
