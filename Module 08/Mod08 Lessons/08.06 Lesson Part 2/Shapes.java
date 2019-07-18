
/**
 * The Shapes class calculates the area and the
 * hypotenuse of a triangle.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
public class Shapes
{
    private int myBase;
    private int myHeight;

    public Shapes(int b, int h)
    {
        myBase = b;
        myHeight = h;
    }

    public double calcTriArea()
    {
        return myBase * myHeight * 0.5;
    }

    public double calcHypotenuse()
    {
        return Math.sqrt(Math.pow(myBase, 2) + Math.pow(myHeight, 2));
    }
}//end Shapes