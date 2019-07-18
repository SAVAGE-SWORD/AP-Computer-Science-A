/**
 * Subclass of Rectangle that defines a Box
 * @author Paul Chafetz
 * @version 3/31/2019
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // Override of toString for printing
    public String toString()
    {
        return "Box: " + getLength() + " X " + getWidth() + " X " + height;
    }

    // Override for equals for comparing Objects
    public boolean equals(Object o)
    {
        if (!(o instanceof Box4))
            return false;
        Box4 b = (Box4)o;
        return getLength() == b.getLength() && getWidth() == b.getWidth() && getHeight() == b.getHeight();
    }
}
