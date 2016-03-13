package chap1_introduction;

import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM Euclid(m, n)
 * //Computes gcd(m, n) by Euclid's algorithm
 * //Input: Two nonnegative, not -both-zero integers m and n 
 * //Output: Greatest common divisor of m and n 
 *  
 * while n != 0 do 
 *   r <- m mod n 
 *   m <- n 
 *   n <- r 
 * return m
 *
 */
public class EuclidsAlgo {

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
        int gcd = euclids(m, n);
        System.out.println("GCD = " + gcd);
    }

    /**
     * Find GCD of two numbers by Euclid's algorithm
     *
     * @param m
     * @param n
     * @return
     */
    public static int euclids(int m, int n) {
        int r;
        while (n != 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}
