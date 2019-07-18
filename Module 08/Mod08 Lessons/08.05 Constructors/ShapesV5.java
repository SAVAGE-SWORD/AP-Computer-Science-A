
/**
 * The purpose of this program is to demonstrate the use of a constructor
 * that takes parameters. Notice that there is no problem with two constructors
 * with the same name as long as their parameter lists are different. This is
 * referred to as overloading a constructor.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
public class ShapesV5
{
    //private instance variables
    private int mySide1, mySide2;

    //default constructor
    public ShapesV5()
    {
        
    }

    //constructor with two parameters
    public ShapesV5 (int s1, int s2)
    {
        mySide1 = s1;
        mySide2 = s2;
    }

    //calculate area of a triangle
    public double calcTriArea()
    {
        return mySide1 * mySide2 * 0.5;
    }

    //calculate the hypotenuse of a right triangle
    public double calcHypotenuse()
    {
        return Math.sqrt(Math.pow(mySide1, 2) + Math.pow(mySide2, 2));
    }

    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        int side1, side2, radius;
        double triArea, circArea, hypotenuse, circumference;

        //initialization of variables
        side1 = 10;
        side2 = 5;
        triArea = 0;
        hypotenuse = 0;

        //ShapesV5 shapes = new ShapesV5();           //uses default constructor
        ShapesV5 shapes = new ShapesV5(side1, side2); //uses constructor with 2 int parameters

        //call methods
        triArea = shapes.calcTriArea();
        hypotenuse = shapes.calcHypotenuse();

        //print results
        System.out.printf(" Triangle Area = %8.2f%n", triArea);
        System.out.printf(" Hypotenuse = %8.2f%n", hypotenuse);
    }
}
