/**
 * This class defines a Cylinder object by extending a Circle.
 *
 * @author Paul Chafetz
 * @version 3/17/2019
 */
public class Cylinder2 extends Circle2
{
    // instance variables
    private int height;

    // Constructor for objects of class Cylinder
    public Cylinder2(int x, int y, int rad, int h)
    {
        // call superclass
        super(x, y, rad);

        // initialize instance variables
        height = h;
    }
    
    //Simply returns a String of the class name as desired (without the "2")
    public String getName()
    {
        return "Cylinder";
    }
    
    public int getHeight()
    {
        return height;
    }
}

