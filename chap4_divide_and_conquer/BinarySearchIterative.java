package chap4_divide_and_conquer;

import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM BinarySearch(A[0..n-1], K)
 * //Implements nonrecursive binary search
 * //Input: An array A[0..n-1] sorted in ascending order and
 * //       a search key K
 * //Output: An index of the array's element that is equal to K
 * //        or -1 if there is no such element
 * 
 * l <- 0; r <- n-1
 * while l <= r do
 *  m <- (l + r)/2
 *  if K =A[m] return m
 *  else if K <A[m] r <- m-1
 *  else l <- m+1
 * return -1
 */

public class BinarySearchIterative {
    public static void main(String args[]){
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
        int position = binarySearchIterative(a,key);
        if(position==-1){
            System.out.println(key + " not found");
        }
        else{
            System.out.println(key + " found at " + (position+1));
        }
    }
    
    /**
     * Implementation of binary search (iterative version)
     * 
     * @param a : array
     * @param key : key to be searched
     * @return : position of the key (-1 if key is not present)
     */
    public static int binarySearchIterative(int a[],int key){
        int low = 0;
        int high = a.length-1;
        while(low<=high){
        int mid = (low+high)/2;
        if(a[mid]==key){
            return mid;
        }
        else if(key<a[mid]){
            high=mid-1;
        } else{
            low=mid+1;
        }
        }
        return -1;
        
    }
}
