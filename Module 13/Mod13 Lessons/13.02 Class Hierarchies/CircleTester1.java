
 /**
 * This class tests the Circle class hierarchy.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class CircleTester1
{
    public static void main(String []args)
    {

        Circle1 one =  new Circle1(2, 4, 6);
        Cylinder1 two = new Cylinder1 (10, 15, 3, 4);
        Oval1 three =  new Oval1(25, 10, 4, 7);
        OvalCylinder1 four =  new OvalCylinder1(40, 10, 3, 7, 10);

        // Circle
        System.out.println("For Circle one: ");
        System.out.println(" radius is " + one.getRadius()
        	                  + " and " + one.getCenter());
        System.out.println();

        // Cylinder
        System.out.println("For Cylinder two: ");
        System.out.println(" radius is " + two.getRadius() + ", "
        	                  + two.getCenter()
        	                  + ", and height is " + two.getHeight());
        System.out.println();

        // Oval
        System.out.println("For Oval three: ");
        System.out.println(" radius 1 is " + three.getRadius()
        	                  + ", radius 2 is " + three.getRadius2()
        	                  + ", and " + three.getCenter());
        System.out.println();

        // Oval Cylinder
        System.out.println("For OvalCylinder four: ");
        System.out.println(" radius 1 is " + four.getRadius()
        	                  + ", radius 2 is "  + four.getRadius2()
        	                  + ", " + four.getCenter()
                              + ", and height is " + four.getHeight());
        System.out.println();
    }
}
