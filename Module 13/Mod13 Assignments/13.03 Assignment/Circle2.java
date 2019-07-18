/**
 * This class defines a Circle object.
 *
 * @author Paul Chafetz
 * @version 3/17/2019
 */
public class Circle2
{
    // instance variables
    private int x;
    private int y;
    private int radius;

    // Constructor for objects of class Circle
    public Circle2(int p_x, int p_y, int r)
    {
        // initialize instance variables
        x = p_x;
        y = p_y;
        radius = r;
    }

    public int getRadius()
    {
        return radius;
    }
    
    //Simply returns a String of the class name as desired (without the "2")
    public String getName()
    {
        return "Circle";
    }
    
    // Concatenates a String to show the center x, y point of the circle
    public String getCenter()
    {
         return "center is at (" + x + ", " + y + ")";
    }
}