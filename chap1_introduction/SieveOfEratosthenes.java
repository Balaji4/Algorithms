package chap1_introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * ALGORITHM Sieve(n) 
 * //Implements the sieve of Eratosthenes 
 * //Input: An integer n >= 2 
 * //Output: Array L of all prime numbers less than or equal to n 
 * 
 * for p <- 2 to n do A[p ] <- p 
 * for p <- 2 to floor(sqrt(n)) do //see note before pseudocode
 *   if A[p] != 0 // p hasn't been eliminated on previous passes 
 *     j <- p*p 
 *     while j < = n do 
 *       A[j] <- 0 //mark element as eliminated 
 *       j <- j+p 
 * //copy the remaining elements of A to array L of the primes 
 * i <- 0 
 * for p <- 2 to n do
 *   if A[p] != 0 
 *     L[i] <- A[p]
 *     i <- i+1 
 * return L
 */
public class SieveOfEratosthenes {

    public static void main(String sd[]) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter limit ");
        n = s.nextInt();
        if (n < 0) {
            System.out.println("Invalid args");
            System.exit(0);
        }
        List<Integer> primes = Sieve(n);
        System.out.println("Prime numbers till " + n);
        System.out.println(primes);
    }

    /**
     * Implementation of Sieve of Eratosthenes algorithm
     *
     * @param n
     * @return list of primes numbers till n
     */
    public static List<Integer> Sieve(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        int numList[] = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            numList[i] = i;
        }
        for (int p = 2; p <= (int) Math.sqrt(n); p++) {
            if (numList[p] != 0) {
                int j = p * p;
                while (j <= n) {
                    numList[j] = 0;
                    j += p;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (numList[i] != 0) {
                primes.add(numList[i]);
            }
        }


        return primes;
    }
}
