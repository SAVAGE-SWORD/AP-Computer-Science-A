/**
 * Tests the Circle2 Class hierarchy, which displays information about circular shapes
 * @author Paul Chafetz
 * @version 3/17/2019
 */
import java.util.ArrayList;
public class CircleTester2
{
    public static void showCenter(Circle2 circ)
    {
        System.out.println("For the " + circ.getName() + ", the " + circ.getCenter() + ".\n");
    }

    //Simply returns a String of the class name as desired (without the "2")
    public static void main(String[] args)
    {
        //Creates an ArrayList and adds each Class instance to it
        ArrayList<Circle2> circles = new ArrayList<Circle2>();
        circles.add(new Circle2(5, -2, 3));
        circles.add(new Cylinder2(0, 1, 5, 10));
        circles.add(new Oval2(7, -3, 10, 2));
        circles.add(new OvalCylinder2(1, 5, 2, 9, 3));

        //runs the showCenter method on each Class Object in the ArrayList
        for (Circle2 circ : circles)
            showCenter(circ);  
    }
}
