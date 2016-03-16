package chap4_divide_and_conquer;

import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM Mergesort(A[0..n-1]) 
 * //Sorts array A[0..(n-1)] by recursive mergesort 
 * //Input: An array A[0..(n-1)] of orderable elements 
 * //Output: Array A[0..(n-1)] sorted in nondecreasing order
 *
 * if n > 1 
 *   copy A[0..(n/2)-1]to B[0..(n/2)-1] 
 *   copy A[(n/2)..n-1] to C[0..(n/2)-1] 
 *   Mergesort(B[0..(n/2) - 1]) 
 *   Mergesort(C[0..(n/2) -1]) 
 *   Merge(B,C, A)
 *
 */

/**
 * ALGORITHM Merge(B[0..(p-1)], C[0..(q-1)], A[0..(p+q-1)]) 
 * //Merges two sorted arrays into one sorted array 
 * //Input: Arrays B[0..(p-1)] and C[0..(q-1)] both sorted 
 * //Output: Sorted array A[0..(p+q-1)] of the elements of B and C
 *
 * i <- 0; j <- 0; k <- 0 
 * while i < p and j < q do 
 *   if B[i] <= C[j] 
 *     A[k] <- B[i]; 
 *     i <- i + 1 
 *   else 
 *     A[k] <- C[j]; 
 *     j <- j + 1 
 *   k <- k+1 
 * if i = p 
 *   copy C[j..(q-1)] to A[k..(p+q-1)] 
 * else 
 *   copy B[i..(p-1)] to A[k..(p+q-1)]
 */

public class MergeSort {
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
        a = mergeSort(a);

        System.out.println("Array after sort");
        printArray(a);
    }

    /**
     * Print array
     * @param a : array
     */
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * Implementation of mergeSort algorithm
     * 
     * @param a : array
     * @return sorted array
     */
    public static int[] mergeSort(int a[]) {
        int n = a.length;
        if (n <= 1) {
            return a;
        }
        int b[] = copy(a, 0, (n / 2) - 1);
        int c[] = copy(a, (n / 2), n - 1);
        b = mergeSort(b);
        c = mergeSort(c);
        return (merge(b, c));
    }

    /**
     * Implementation of merge algorithm
     * 
     * @param b : first array
     * @param c : second array
     * @return merged array of b and c
     */
    public static int[] merge(int b[], int c[]) {
        int i = 0, j = 0, k = 0;
        int p = b.length;
        int q = c.length;
        int a[] = new int[p + q];
        while (i < p && j < q) {
            if (b[i] < c[j]) {
                a[k] = b[i];
                i++;
            } else {
                a[k] = c[j];
                j++;
            }
            k++;
        }
        if (i == p) {
            while (j < q) {
                a[k++] = c[j++];
            }

        } else {
            while (i < p) {
                a[k++] = b[i++];
            }

        }
        return a;
    }

    /**
     * Copy array 
     * 
     * @param a : source array
     * @param start : start index
     * @param end : end index
     * @return array with elements from start index to end index copied from source array
     */
    public static int[] copy(int a[], int start, int end) {
        int res[] = new int[(end - start) + 1];
        int ri = 0;
        for (int i = start; i <= end; i++) {
            res[ri++] = a[i];
        }
        return res;
    }
}
