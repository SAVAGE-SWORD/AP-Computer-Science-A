/**
 * Calculates Fibonacci numbers according to user input.
 *
 * @author Paul Chafetz
 * @version 2/25/2019
 */
import java.util.Scanner;
public class FibonacciTester
{
    public static void main(String args[]) {
        //declare Objects and variables
        Scanner in = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();
        String quit = "";
        int n = 0;
        int fibVal = 0;

        //run main body of code
        while (!quit.equalsIgnoreCase("q")) { //program will run until the user types in "q" or "Q"
            System.out.println("Enter the nth Fibonacci number you would like. (0 - 46)");
            n = in.nextInt();
            if (n < 0 || n > 46) {
                //We're keeping Anything greater than 46 overflows a double (http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html)
                System.out.println("Error! The value must be between 0 and 46.");
            }
            else {
                fibVal = fib.fibNum(n);
                System.out.println("The Fibonacci Number for n = " + n + " is " + fibVal);
            }
            System.out.println("Enter anything to continue, or enter \"q\" or \"Q\" to quit the program.");
            quit = in.next();
        }
    }
}