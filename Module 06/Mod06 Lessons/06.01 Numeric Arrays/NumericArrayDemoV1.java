
/**
 * This program demonstrates how to assign values to individual
 * positions in a numeric array.
 *
 * @author David J. Farber
 * @version 06/06/17
 */
import java.util.Scanner;
public class NumericArrayDemoV1
{
    public static void main(String [] args)
    {
        //int [ ] numList;
        //numList = new int[5];
        // OR
        int [] numList = new int[5];

        // Direct assign values to array within the source code
        numList[0] = 10;
        numList[1] = 9;
        numList[2] = 8;
        numList[3] = 7;
        numList[4] = 6;

        // Direct assignment during array initialization:
        //int [] numList = {10, 9, 8, 7, 6};

        for(int n = 0; n < numList.length; n++)
        {
            System.out.println("The numeric value in array index position "
                                  + n + " is: " + numList[n] + ".");
        }
        System.out.println();
        System.out.println("The length of the array is: " + numList.length);
    }
}
