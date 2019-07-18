/**
 * Subclass of Box that defines a Cube
 * @author Paul Chafetz
 * @version 3/31/2019
 */
public class Cube4 extends Box4
{
    //Constructor for objects of class Cube4
    public Cube4(int s)
    {
        // call superclass
        super(s, s, s);
    }

    // Override of toString for printing
    public String toString()
    {
        return "Cube: " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
