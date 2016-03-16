package chap4_divide_and_conquer;

import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM BinarySearch(A[0..n-1], K, low, high) 
 * //Implements recursive binary search 
 * //Input: An array A[0..n-1] sorted in ascending order, a search key K, 
 * //       lower index 'low' (initial value = 0), 
 * //       higher index 'high' (initial value = array length-1)
 * //Output: An index of the array's element that is equal to K 
 * // or -1 if there is no such element
 *
 * if low <= high
 *   mid <- (low+high)/2
 *   if a[mid] = key
 *     return mid
 *   else if key < a[mid] 
 *     return binarySearchRecursive(a,key,low,mid-1); 
 *   else return binarySearchRecursive(a,key,mid+1,high); 
 * return -1;
 */

public class BinarySearchRecursive {

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
        System.out.println("Enter key to be searched");
        int key = s.nextInt();
        int position = binarySearchRecursive(a, key, 0, a.length - 1);
        if (position == -1) {
            System.out.println(key + " not found");
        } else {
            System.out.println(key + " found at " + (position + 1));
        }
    }

    /**
     * Implementation of binary search (recursive version)
     *
     * @param a : array
     * @param key : key to be searched
     * @return : position of the key (-1 if key is not present)
     */
    public static int binarySearchRecursive(int a[], int key, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (key < a[mid]) {
                return binarySearchRecursive(a, key, low, mid - 1);
            } else {
                return binarySearchRecursive(a, key, mid + 1, high);
            }
        }
        return -1;

    }
}
