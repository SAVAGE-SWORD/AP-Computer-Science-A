/**
 * Subclass of Rectangle that defines a Square
 * @author Paul Chafetz
 * @version 3/31/2019
 */
public class Square4 extends Rectangle4
{
    // Constructor for objects of class Square4
    public Square4(int s)
    {
        // call superclass
        super(s, s);
    }

    // Override of toString for printing
    public String toString()
    {
        return "Square: " + getLength() + " X " + getWidth();
    }
}
