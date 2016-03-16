package chap4_divide_and_conquer;

import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM Quicksort(A[l..r]) 
 * //Sorts a subarray by quicksort 
 * //Input: A subarray A[l..r] of A[0..n-1], defined by its left and right indices 
 * //      l and r
 * //Output: Subarray A[l..r] sorted in nondecreasing order 
 * 
 * if l < r 
 *   s <- Partition(A[l..r]) //s is a split position 
 *   Quicksort(A[l..s-1])
 *   Quicksort(A[s+l..r])
 * 
*/

/**
 * ALGORITHM Partition(A[l..r]) 
 * //Partitions a subarray by using its first element as a pivot 
 * //Input: A subarray A[l..r] of A[0..n - 1], defined by its left and right 
 * //       indices l and r (l < r) 
 * //Output: A partition of A[l..r], with the split position returned as
 *          this function's value 
 * 
 * p <- A[l] 
 * i <- l; j <- r + 1 
 * repeat 
 *   repeat i <- i + 1 until A[i] >= p 
 *   repeat j <- j - 1 until A[j] <=p 
 *   swap(A[i], A[j]) 
 * until i >= j 
 * swap(A[i], A[j]) //undo last swap when i >= j 
 * swap(A[l], A[j]) 
 * return j
 */

public class QuickSort {

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
        
        quickSort(a, 0, a.length - 1);

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
     * Implementation of quickSort algorithm
     *
     * @param a : array
     */
    public static void quickSort(int a[], int l, int r) {

        if (l < r) {
            int s = partition(a, l, r);
            quickSort(a, l, s - 1);
            quickSort(a, s + 1, r);
        }
    }

    /**
     * Implementation of partition algorithm of quickSort
     * 
     * @param a : array
     * @param left : lower limit of array
     * @param right : lower limit of array
     * @return pivot index
     */
    public static int partition(int a[], int left, int right) {
        int pivot = a[left];
        int i = left;
        int j = right + 1;
        int temp;

        do {
            do {
                i++;
            } while (i <= right && a[i] < pivot);
            do {
                j--;
            } while (a[j] > pivot);
            if (i <= right) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }
        } while (i < j);
        //just to make sure i is within the upper limit
        if (i <= right) {
            ////undo last swap when i >= j
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }

        temp = a[j];
        a[j] = a[left];
        a[left] = temp;
        return j;
    }
}
