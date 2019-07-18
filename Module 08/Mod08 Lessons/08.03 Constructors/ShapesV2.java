
/**
 * The purpose of this program is to calculate the hypotenuse
 * of a triangle and its area. All calculations are done within
 * static methods which are invoked from the main method.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
public class ShapesV2
{
    //calculate area of a triangle
    public static double calcTriArea(int s1, int s2)
    {
        return s1 * s2 * 0.5;
    }

    //calculate hypotenuse
    public static double calcHypotenuse(int s1, int s2)
    {
        return Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
    }

    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        int side1, side2, radius;
        double triArea, hypotenuse;

        //initialization of variables
        side1 = 10;
        side2 = 5;
        triArea = 0;
        hypotenuse = 0;

        //call methods
        triArea = calcTriArea(side1, side2);
        hypotenuse = calcHypotenuse(side1, side2);

        //print results
        System.out.printf(" Triangle Area = %8.2f%n", triArea);
        System.out.printf(" Hypotenuse = %8.2f%n", hypotenuse );
    }//end main method
}//end class
