package Recursion;

/**
 * Write a recursion process that allow you to decide if a natural number N is prime number or not.
 */
public class Exercise2 {
    public boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        } else {
            return checkPrime(number, number - 1);
        }
    }

    private boolean checkPrime(int number, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return checkPrime(number, divisor - 1);
    }
}
