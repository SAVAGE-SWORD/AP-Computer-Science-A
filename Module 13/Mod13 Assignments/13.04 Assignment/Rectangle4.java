/**
 * Superclass that defines a Rectangle and its methods
 * @author Paul Chafetz
 * @version 3/31/2019
 */
public class Rectangle4
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    // Override of toString for printing
    public String toString()
    {
        return "Rectangle: " + length + " X " + width;
    }

    // Override for equals for comparing Objects
    public boolean equals(Object o)
    {
        if (!(o instanceof Rectangle4))
            return false;
        Rectangle4 r = (Rectangle4)o;
        return getLength() == r.getLength() && getWidth() == r.getWidth();
    }
}
