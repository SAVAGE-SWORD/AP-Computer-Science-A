
/**
 * This program demonstrates how to find the sum of values
 * in a numeric array. Also, how to determine the
 * minimum and maximum values within the array.
 *
 * @author David J. Farber
 * @version 06/06/17
 */
import java.util.Scanner;
public class NumericArrayDemoV4
{
    public static void main(String [] args)
    {
        int [] intValues = {5, 6, -12, 73, 4, -25, 15, 8, 0, -2};
        int sum = 0;


        // Find the sum of the array elements
        for(int n = 0; n < intValues.length; n++)
        {
            System.out.print(sum + "\t+ \t" + intValues[n] + "\t is  ");

            sum += intValues[n];
            System.out.println(sum);
        }
        System.out.println();
        System.out.println("The total sum is: " + sum);

        // Find the min and max values in an array
        int min = intValues[0];
        int max = intValues[0];

        for(int n = 0; n < intValues.length; n++)
        {

            if( intValues[n] < min  )
            	min = intValues[n];
            if(intValues[n] > max)
            	max = intValues[n];
        }
        System.out.println();
        System.out.println("The min value is: " + min);
        System.out.println("The max value is: " + max);
    }
}
