package Recursion;


import java.util.ArrayList;

/**
 * You want to find the prime factors of a number N.
 */
public class Exercise4 {
    public static String findFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        return findFactors(n, 2, factors);
    }

    private static String findFactors(int n, int factor, ArrayList<Integer> factors) {
        if (n == 1) {
            return null;
        } else if (n % factor == 0) {
            factors.add(factor);
            findFactors(n / factor, factor, factors);
        } else {
            findFactors(n, factor + 1, factors);
        }
        return factors.toString();
    }
}
