
/**
 * This program demonstrates how read numeric values from a
 * text file and assign them to an array.
 *
 * @author David J. Farber
 * @version 06/06/17
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class NumericArrayDemoV3
{
    public static void main(String[ ] args) throws IOException
    {

        File fileName = new File("doubles.txt");
        Scanner inFile = new Scanner(fileName);

        //Determine how many values the file contains
        int numValues = 0;
        while (inFile.hasNextLine())
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();

        // Use the number of values to declare the array
        double [] numList = new double[numValues];
        inFile = new Scanner(fileName);               //reopen the file
        int index = 0;


        // Input: read from text file and assign values one at a time to the array
        while (inFile.hasNext())
        {
            numList[index] = inFile.nextDouble();
            index++;
        }
        inFile.close();


        // Output: traverse the array to display contents of array
        for(int n = 0; n < numList.length; n++)
        {
            System.out.println("The numeric value in index position "
                                  + n + " is: " + numList[n] + ".");
        }
        System.out.println();
        System.out.println("The length of the array is: " + numList.length);
    }
}
