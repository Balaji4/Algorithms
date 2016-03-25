package chap6_transform_and_conquer;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM PresortElementUniqueness(A[0..n-1])
 * //Solves the element uniqueness problem by sorting the array first
 * //Input: An array A[0..n-1] of orderable elements
 * //Output: Returns "true" if A has no equal elements, "false" otherwise
 *
 * sort the array A
 * for i <- 0 to n - 2 do
 *   if A[i] = A [i + 1] return false
 * return true
 */

public class ElementUniquenessByPresorting {

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
        
        if(isUnique(a)){
            System.out.println("Array has unique elements");
        } else{
            System.out.println("Array does not have unique elements");
        }
    }

  

    /**
     * Implementation of pre sort element uniqueness algorithm
     *
     * @param a : array
     * @return true if array has unique elements, false otherwise
     */
    public static boolean isUnique(int a[]) {
        Arrays.sort(a);
        int n = a.length;
        for (int i = 0; i <n - 1; i++) {
           if(a[i]==a[i+1]){
               return false;
           }
        }
        return true;
    }
}
