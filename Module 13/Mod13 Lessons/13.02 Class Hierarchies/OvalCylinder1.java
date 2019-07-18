
 /**
 * This class defines an Oval Cylinder object that extends an Oval.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class OvalCylinder1 extends Oval1
{
    // instance variables
    private int height;

    // Constructor for objects of class OvalCylinder
    public OvalCylinder1(int x, int y, int rad1, int rad2, int h)
    {
        // call superclass
        super(x, y, rad1, rad2);

        // initialize instance variables
        height = h;
    }

    public int getHeight()
    {
        return height;
    }
}
