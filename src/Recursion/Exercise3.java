package Recursion;

/**
 * Write a recursion process that allow you to calculate the number of digits in a positive number N.
 */
public class Exercise3 {
    public int countDigits(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + countDigits(n / 10);
        }
    }
}
