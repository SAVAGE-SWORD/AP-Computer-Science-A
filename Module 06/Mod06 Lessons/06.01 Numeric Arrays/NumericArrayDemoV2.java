
/**
 * This program demonstrates how to assign values to individual
 * positions in a numeric array by reading user input.
 *
 * @author David J. Farber
 * @version 06/06/17
 */
import java.util.Scanner;
public class NumericArrayDemoV2
{
    public static void main(String [] args)
    {
    	double [] numList = new double[5];
        Scanner in = new Scanner(System.in);

        // Input: assign user input to each index within the array
        for(int n = 0; n < numList.length; n++)
        {
            System.out.print("Enter the value for number " + (n + 1) + ": ");
            numList[n] = in.nextDouble();
        }
        System.out.println("\n\n");


        // Output: traverse the array to display contents of array
        System.out.println("The array of numbers is: ");
        for(int n = 0; n < numList.length; n++)
        {
            System.out.println("The numeric value in array index position "
                                  + n + " is: " + numList[n] + ".");
        }
        System.out.println();
        System.out.println("The length of the array is: " + numList.length);
    }
}
