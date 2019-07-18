/**
 * Tests the Primes class.
 *
 * @author Paul Chafetz
 * @version 4/9/2019
 */
import java.util.Scanner;
public class PrimesTester
{
    public static void main(String args[])
    {
        //declares Scanner object
        Scanner in = new Scanner(System.in);
        
        //asks for lower and upper limits and adds error checkers
        System.out.println("Please enter a lower limit. (2+)");
        int lower = in.nextInt();
        while (lower < 2) {
            System.out.println("Error. Your lower limit must be larger than 1. Please try again.");
            lower = in.nextInt();
        }
        System.out.println("Please enter an upper limit. (" + lower + "+)");
        int upper = in.nextInt();
        while (lower > upper) {
            System.out.println("Error. Your upper limit must be at least larger than your lower limit. Try again.");
            upper = in.nextInt();
        }
        
        System.out.println("Would you like to see your results in a table format? (Y/N)");
        String table = in.next();
        
        //creates a Primes object using the lower and upper limits and runs the correct method
        Primes p = new Primes(lower, upper);
        if (table.equalsIgnoreCase("n"))
            p.getPrimes();
        else
            p.getPrimesTable();
    }
}
