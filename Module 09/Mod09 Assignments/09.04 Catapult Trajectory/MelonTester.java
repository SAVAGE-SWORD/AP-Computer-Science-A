
/**
 * To test the Melon class. I used this assignment to experiment with a 
 * minimalist style of coding, using as few methods as reasonable and necessary.
 *
 * @author Paul Chafetz
 * @version 1/20/2019
 */
public class MelonTester
{
    public static void main(String[] args)
    {
        //declare variables
        int[] speeds = {50, 60, 70, 80, 90};
        int[] angles = {25, 35, 45, 55, 65, 75};

        //create the object for the Melon class
        Melon melons = new Melon(speeds, angles);
        
        //have one method that runs the entire program!
        melons.calcAndPrintTable();
    }
}