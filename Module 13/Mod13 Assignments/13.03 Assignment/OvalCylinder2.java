/**
 * This class defines an Oval Cylinder object that extends an Oval.
 *
 * @author Paul Chafetz
 * @version 3/17/2019
 */
public class OvalCylinder2 extends Oval2
{
    // instance variables
    private int height;

    // Constructor for objects of class OvalCylinder
    public OvalCylinder2(int x, int y, int rad1, int rad2, int h)
    {
        // call superclass
        super(x, y, rad1, rad2);

        // initialize instance variables
        height = h;
    }
    
    //Simply returns a String of the class name as desired (without the "2")
    public String getName()
    {
        return "Oval Cylinder";
    }
    
    public int getHeight()
    {
        return height;
    }
}