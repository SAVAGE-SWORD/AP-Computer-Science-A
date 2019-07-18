
/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
public class Rectangle3
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle3(int l, int w)
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

    // String to display when object is printed.
    /*
    public String toString()
    {
        return "The rectangle's dimensions are " + length + " X " + width;
    }
    */
}
