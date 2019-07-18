
/**
 * This class contains the main method and creates an object of the Shapes class.
 * The value of the base and height are passed to the private instance variables
 * when the shapes object is constructed.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
public class TriangleStatsTester
{
    public static void main(String[] args)
    {
        int base = 3;
        int height = 4;
        Shapes shapes = new Shapes(base, height);

        //invoking the area method within the print statement
        System.out.printf("Area = %4.1f %n", shapes.calcTriArea());

        //invoking the method to calculate the hypotenuse and assign the returned value to a variable
        double hypotenuse = shapes.calcHypotenuse();
        System.out.printf("Hypotenuse = %4.1f%n", hypotenuse);
    }
}
