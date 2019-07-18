/**
 * Displays all prime numbers within a given range.
 *
 * @author Paul Chafetz
 * @version 4/9/2019
 */
public class Primes
{
    //instance variables
    private int lower = 0;
    private int upper = 0;

    //constructor (variables use "this")
    public Primes(int lower, int upper)
    {
        this.lower = lower;
        this.upper = upper;
    }

    //Note: I know about the Sieve of Eratosthenes, but I wanted to code this my own way

    //I check for the sqrt of j because factors of a number work in both directions
    //and there is no point in going past that threshold (double counting)
    //E.g. Factors of 10 after loop = 1 x 10, 2 x 5, 5 x 2, and 10 x 1
    //Anything past the sqrt of 10 would repeat the test for if it is prime twice
    public boolean isPrimeNum(int j)
    {
        //the program will not accept anything less than 2, so no need to error-check here
        for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0)
                return false;
        }
        return true;
    }

    //Gets all the primes for the numbers in the range based on user input in a table format
    public void getPrimesTable()
    {
        int numP = 0;
        int newRow = 0;
        System.out.println("Prime numbers from " + this.lower + " to " + this.upper + ":\n");
        for (int j = this.lower; j <= this.upper; j++) {
            if (isPrimeNum(j)) {
                System.out.printf("%6d", j);
                numP++;
                newRow++;
                if (newRow > 11) {
                    System.out.println();
                    newRow = 0;
                }
            } 
        }
        System.out.println("\n\nTotal count of prime numbers in given range: " + numP);
    }

    //Note: This is the same thing as getPrimesTable, but does not display the
    //results in a table format, hence the term
    public void getPrimes()
    {
        int numP = 0;
        System.out.println("Prime numbers from " + this.lower + " to " + this.upper + ":\n");
        for (int j = this.lower; j <= this.upper; j++) {
            if (isPrimeNum(j)) {
                System.out.println(j);
                numP++;
            }
        }
        System.out.println("\nTotal count of prime numbers in given range: " + numP);
    }
}
