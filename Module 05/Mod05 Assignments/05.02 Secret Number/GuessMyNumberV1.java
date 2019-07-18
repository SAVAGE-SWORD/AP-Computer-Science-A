
/**
 * Write a program that allows the user to guess a random integer
 * number chosen by the computer between a given range.
 *
 * @author (enter your name)
 * @version (enter today's date)
 */
import java.util.Scanner;
public class GuessMyNumberV1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Ask user for the range for the secret number.
        System.out.println("Let's play the Guess My Number game!");
        System.out.println();
        System.out.print("Enter the lower limit of your range: ");
        int lowerLimit = in.nextInt();

        System.out.print("Enter the upper limit of your range: ");
        int upperLimit = in.nextInt();
        System.out.println("\n");


        //Generate a secret number between the lower and upper bounds (inclusive of both)
        int secretNumber = (int)(Math.random() * (upperLimit - lowerLimit + 1) ) + lowerLimit;

        //Debug statement: While testing your program, add a print statement to display
        //the secret number. Then as you (the user) guess numbers, various scenarios can be tested.
        //Is the output correct on the first guess? Second guess? For a large range? small range?

        //System.out.println("For testing... the secret number is: ");
        System.out.println();

        System.out.println("Try to guess the secret number between "
        	                + lowerLimit + " and "
        	                + upperLimit +". ");
        System.out.print("Enter the first guess: ");

        int userGuess = in.nextLine();
        int numGuesses = 0;
        System.out.println("\n");

        // Check if the user's guess doesn't match the secret number, provide
        // feedback and request another guess.
        while( false )
        {
            //Since the guess doesn't match, determine if it is too low or too high.
            if (userGuess > secretNumber)
            {
                System.out.print("Guess number " + numGuesses + " is too LOW. ");
            }
            else if (userGuess < secretNumber)
            {
                System.out.print("Guess number " + numGuesses + " is too HIGH. ");
            }

	        //Ask for another number and increment number of guesses by 1.
            System.out.print("Enter another guess: ");
            userGuess = in.nextInt();


        }//end while

        // Print message congratulating the user.
        System.out.println("\n");
        System.out.println("Congratulations!");
        System.out.println("The secret number is: " + secretNumber);
        System.out.println("Number of guesses: " + numGuesses);
    }//end main
}//end class
