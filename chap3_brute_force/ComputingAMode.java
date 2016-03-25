package chap3_brute_force;

import chap6_transform_and_conquer.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM ComputeModeByBruteForce(A[0..n-l]
 * //Computes the mode of an array by calculating frequency of elements
 * //Input: An array A[0..n-1] of orderable elements
 * //Output: The array's mode
 *
 * //loop though all elements to find each element's frequency
 * i <- 0
 * modefrequency <- 0
 * while i <= n - 1 do
 *   if frequencyTable has a[i]
 *     frequencyTable[a[i]] <- frequencyTable[a[i]] +1
 *   else 
 *    frequencyTable[a[i]] <- 1
 *    
 * //loop though all elements to find an element with highest frequency
 * i <- 0 
 * while i <= n - 1 do
 *   if frequencyTable[a[i]] > modeFrequency 
 *    modeFrequency <- frequencyTable[a[i]] 
 *    modeValue <- a[i]
 * 
 * return modevalue
 */

public class ComputingAMode {

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
        
      int modeValue = computeModeBYBruteForce(a);
      System.out.println("Mode value: " + modeValue);
        
    }

  

    /**
     * Implementation of computeMode algorithm by brute force 
     *
     * @param a : array
     * @return mode value
     */
    public static int computeModeBYBruteForce(int a[]) {
        Arrays.sort(a);
        int n = a.length;
        int modeValue = a[0];    
        int modeFrequency = 0;
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int i=0;i<n;i++){
            if(frequency.containsKey(a[i])){
                frequency.put(a[i],frequency.get(a[i])+1);
            } else{
                frequency.put(a[i],1);
            }
        }
        for(int i=0;i<n;i++){
            if(frequency.get(a[i])>modeFrequency){
                modeFrequency = frequency.get(a[i]);
                modeValue = a[i];
            }
        }
        
        return modeValue;
    }
}
