/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
public class Box3 extends Rectangle3
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box3(int l, int w, int h)
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

    // String to display when object is printed.
    /*
    public String toString()
    {
        return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }
    */
}
