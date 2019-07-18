
/**
 * This class contains the main method and creates an object of the Shapes class.
 * The value of the base and height are passed to the private instance variables
 * when the shapes object is constructed.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
public class AccelerationTester
{
    public static void main(String[] args)
    {
        int base = 4;
        int height = 8;
        Shapes shapes = new Shapes(base, height);

        System.out.printf("Distance Traveled = %5.2f feet %n", shapes.calcTriArea());
        double acceleration = height / base;
        System.out.printf("Acceleration = %3.1f feet per second squared %n", acceleration);
    }
}
