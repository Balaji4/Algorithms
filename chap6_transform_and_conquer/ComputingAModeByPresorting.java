package chap6_transform_and_conquer;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM PresortMode(A[0..n-l]
 * //Computes the mode of an array by sorting it first
 * //Input: An array A[0..n-1] of orderable elements
 * //Output: The array's mode
 * sort the array A
 * i <- 0
 * modefrequency <- 0
 * while i <= n - 1 do
 *   //current run begins at position i
 *   //highest frequency seen so far
 *   runlength <- 1; runvalue <- A[i]
 *   while i+runlength <= n- 1 and A[i+runlength] = runvalue
 *     runlength <- runlength + 1
 *     if runlength > modefrequency
 *       modefrequency <- runlength; modevalue <- runvalue
 *   i <- i + runlength
 * return modevalue
 */

public class ComputingAModeByPresorting {

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
        
      int modeValue = computeMode(a);
      System.out.println("Mode value: " + modeValue);
        
    }

  

    /**
     * Implementation of pre sort mode value algorithm
     *
     * @param a : array
     * @return mode value
     */
    public static int computeMode(int a[]) {
        Arrays.sort(a);
        int n = a.length;
        int runLength,runValue;
        int modeValue = a[0];    
        int i=0;
        int modeFrequency = 0;
        while(i<=n-1){
            runLength = 0;
            runValue = a[i];
            while( (i+runLength)<=(n-1) && (a[i+runLength]==runValue) ){
                runLength++;
            }
            if(runLength > modeFrequency){
                modeFrequency = runLength;
                modeValue = runValue;
            }
            i = i+ runLength;
        }
        return modeValue;
    }
}
