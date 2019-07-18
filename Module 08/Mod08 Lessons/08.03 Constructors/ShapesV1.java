
/**
 * The purpose of this program is to calculate the hypotenuse
 * of a triangle and its area. All calculations are done within
 * the main method.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
public class ShapesV1
{
    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        int side1, side2;
        double triArea, hypotenuse;

        //initialization of variables
        side1 = 10;
        side2 = 5;
        triArea = 0;
        hypotenuse = 0;

        //calculations
        triArea = side1 * side2 * 0.5;
        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        //print results
        System.out.printf(" Triangle Area = %8.2f%n", triArea);
        System.out.printf(" Hypotenuse = %8.2f%n", hypotenuse);
    }//end main method
}//end class
