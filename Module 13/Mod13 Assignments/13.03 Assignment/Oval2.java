/**
 * This class defines an Oval object by extending Circle.
 *
 * @author Paul Chafetz
 * @version 3/17/2019
 */
public class Oval2 extends Circle2
{
    // instance variables
    private int radius2;

    // Constructor for objects of class Oval
    public Oval2(int x, int y, int rad1, int rad2)
    {
        // call superclass
        super(x, y, rad1);

        // initialize instance variables
        radius2 = rad2;
    }
    
    //Simply returns a String of the class name as desired (without the "2")
    public String getName()
    {
        return "Oval";
    }
    
    public int getRadius2()
    {
        return radius2;
    }
}
