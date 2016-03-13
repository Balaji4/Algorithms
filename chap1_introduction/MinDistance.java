package chap1_introduction;

import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM MinDistance(A[0 .. n - 1])
 * //Input: Array A[0 .. n- 1] of numbers
 * //Output: Minimum distance between two of its elements
 * 
 * dmin <- INFINITY
 * for i <- 0 to n-1 do
 *   for j <- 0 to n-1 do
 *     if i != j and |A[i]- A[j]| < dmin
 *       dmin <- |A[i]- A[j]|
 * return dmin
 */
public class MinDistance {

    public static void main(String sd[]) {
        Scanner s = new Scanner(System.in);
        int n, a[];
        System.out.println("Enter array size ");
        n = s.nextInt();
        if (n < 2) {
            System.out.println("Invalid args");
            System.exit(0);
        }
        a = new int[n];
        System.out.println("Enter array values ");
        for (int j = 0; j < a.length; j++) {
            a[j] = s.nextInt();
        }

        int min[] = minDistance(a);
        System.out.println("Min distance = " + min[0] + " found between values " + min[1] + " and " + min[2]);
    }
    /**
     * Min distance between two array elements
     *
     * @param a : array of elements
     * @return min distance
     */
    public static int[] minDistance(int a[]) {
        int min[] = new int[3];
        min[0] = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    if (Math.abs(a[i] - a[j]) < min[0]) {
                        min[0] = Math.abs(a[i] - a[j]);
                        min[1] = a[i];
                        min[2] = a[j];
                    }
                }
            }
        }
        return min;
    }
}
