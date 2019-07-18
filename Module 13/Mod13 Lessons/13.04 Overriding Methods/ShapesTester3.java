
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
import java.util.*;
public class ShapesTester3
{
    public static void main(String []args)
    {
        Rectangle3 one = new Rectangle3(5, 20);
        Rectangle3 two = new Box3(4, 10, 5);

        //Print all shapes
        ArrayList<Rectangle3> shapes = new ArrayList<Rectangle3>();

        shapes.add( one );
        shapes.add( two );

        for(Rectangle3 rect: shapes)
        {
            System.out.println(rect);
            showEffectBoth(rect);
            System.out.println();
        }
    }

    public static void showEffectBoth(Rectangle3 r)
    {
        System.out.println(r);
    }

}
