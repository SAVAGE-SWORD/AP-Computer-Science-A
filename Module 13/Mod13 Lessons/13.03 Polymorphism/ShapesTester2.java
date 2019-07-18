
/**
 * This class demonstrates polymorphism with
 * object declarations and the static method
 * to print values.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
public class ShapesTester2
{
    public static void polyMorph(Rectangle2 r)
    {
        System.out.println("For " + r.getName() + ": ");
        System.out.println("    length is " + r.getLength());
        System.out.println("    width is " + r.getWidth());
    }

    public static void main (String []args)
    {
        Rectangle2 one = new Rectangle2(2, 4);
        Rectangle2 two = new Box2(4,10,4);

        polyMorph(one);
        System.out.println();

        polyMorph(two);
        //System.out.println("    height is " + two.getHeight());
        System.out.println("    height is " + ((Box2)two).getHeight() );
    }
}
