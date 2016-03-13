/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chap1_introduction;

import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM: Consecutive integer checking algorithm for computing gcd(m, n)
 * Step 1: Assign the value of min{m, n} to t. 
 * Step 2: Divide m by t. If the remainder of this division is 0, 
 * go to Step 3; otherwise, go to Step 4. 
 * Step 3: Divide n by t. If the remainder of this division is 0, 
 * return the value of t as the answer and stop; otherwise, proceed to Step 4. 
 * Step 4 Decrease the value of t by 1. Go to Step 2.
 *
 */
public class GCDMethod2 {

    public static void main(String sd[]) {
        Scanner s = new Scanner(System.in);
        int m, n;
        System.out.println("Enter two non negative numbers (both shouldn't be zero) ");

        m = s.nextInt();
        n = s.nextInt();
        if (m <= 0 && n <= 0) {
            System.out.println("Invalid args");
            System.exit(0);
        }
        int gcd = gcdMethod2(m, n);
        System.out.println("GCD = " + gcd);
    }

    /**
     * Find GCD of two numbers by consecutive integer checking algorithm
     *
     * @param m
     * @param n
     * @return
     */
    public static int gcdMethod2(int m, int n) {
        int min = m < n ? m : n;
        while (min != 0) {
            if (m % min == 0 && n % min == 0) {
                return min;
            }
            min--;
        }
        return 1;
    }
}
