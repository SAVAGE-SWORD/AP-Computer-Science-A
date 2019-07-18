
/**
 * This program converts feet to inches and illustrates the use of a while
 * loop terminated by a user's response (N or n).
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
import java.util.Scanner;
public class ConvertFeetToInches
{
    public static void main(String[] args)
    {
        // Declare and initialize variables
        String feetStr = "";
        double feet = 0;
        double inches = 0;

        Scanner in = new Scanner(System.in);

        String convertAnother = "Y";

        //notice the use of negating the equalsIgnoreCase() method
        //to terminate the loop
        while(!convertAnother.equalsIgnoreCase("N"))
        {
            System.out.print("Enter Feet: ");
            feetStr = in.nextLine();     //What happens if a user enters an int, a double, or a String?
            feet = Double.parseDouble(feetStr);  

            inches = 12 * feet;
            System.out.println("Inches: " + inches);
            System.out.println();
            System.out.print("Convert another measurement (Y or N): ");
            convertAnother = in.nextLine();   //What happens if you enter a letter other than Y or N?
        }//end while

        System.out.println("Thank you!");
    }
}


