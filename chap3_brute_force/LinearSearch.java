package chap3_brute_force;

import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * AlGORITHM SequentialSearch (A[0 .. n ], K)
 * //Implements sequential search with a search key as a sentinel
 * //Input: An array A of n elements and a search key K
 * //Output: The index of the first element in A[O .. n -1) whose value is
 * // equal to K or -1 if no such element is found
 * 
 * for i <- 0 to n-1
 *   if A[i] == K
 *     return i
 * return -1
 */
public class LinearSearch {
    
    public static void main(String args[]){
        int n,key;
        Scanner s = new Scanner(System.in);
        System.out.println("How many elements?");
        n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        } 
        System.out.println("Enter key to be searched");
        key = s.nextInt();
        int position = linearSearch(a,key);
        if(position==-1){
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key found at a["+position+"]");
        }
                
    }
    
    /**
     * Implementation of linear search algorithm
     * 
     * @param a : array of elements
     * @param key : key to be searched
     * @return the index of the first element in a[0 .. n -1) whose value is
     * equal to key or -1 if no such element is found
     */
    public static int linearSearch(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
}
