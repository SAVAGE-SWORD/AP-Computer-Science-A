/**
 * Implementation class for FibonacciTester.
 *
 * @author Paul Chafetz
 * @version 2/25/2019
 */
import java.util.Scanner;
public class Fibonacci
{
    /**
     * find the Fibonacci number based on user input
     *
     * @param n the desired number in the Fibonacci sequence
     * @return desired Fibonacci number
     */
    public int fibNum(int n) {
        if (n == 0 || n == 1 || n == 2) {
            //base cases are 0 and 1, but you must include 2 as a base case, or else (n - 2) < 0
            return 1;
        }
        else { //recursive call
            return fibNum(n - 1) + fibNum(n - 2);
        }
    }
}



