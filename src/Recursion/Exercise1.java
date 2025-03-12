package Recursion;


/**
 * Find a method that allow you to define the power of a number. The data are A and B, and what is to calculate
 * a raised to the power of b.
 */
public class Exercise1 {
    public int raiseANumber(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return a * raiseANumber(a, b - 1);
        }
    }
}
