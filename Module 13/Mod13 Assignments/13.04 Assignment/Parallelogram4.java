/**
 * Subclass of Rectangle that defines a Parallelogram
 * @author Paul Chafetz
 * @version 3/31/2019
 */
public class Parallelogram4 extends Rectangle4
{
    // Constructor for objects of class Parallelogram4
    public Parallelogram4(int l, int w)
    {
        // initialize instance variables
        super(l, w);
    }

    // Override of toString for printing
    public String toString()
    {
        return "Parallelogram: " + getLength() + " X " + getWidth();
    }
}
