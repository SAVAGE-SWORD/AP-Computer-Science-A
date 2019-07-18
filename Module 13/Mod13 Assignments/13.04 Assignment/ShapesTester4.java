/**
 * Tests the Rectangle4 class hierarchy.
 * @author Paul Chafetz
 * @version 3/31/2019
 */
import java.util.*;
public class ShapesTester4
{
    //prints an Object from Rectangle
    public static void showEffectBoth(Rectangle4 a)
    {
        System.out.println(a);
    }

    //prints two Objects from Rectangle and tests for equality
    public static void showEffectBoth(Rectangle4 a, Rectangle4 b)
    {
        if (a.equals(b))
            System.out.println(a + " is the same as " + b + "\n");
        else
            System.out.println(a + " is not the same as " + b + "\n");
    }
    
    public static void main(String []args)
    {
        Rectangle4 rect1 = new Rectangle4(7, 10);
        Rectangle4 rect2 = new Rectangle4(5, 6);
        Rectangle4 square = new Square4(3);
        Rectangle4 para = new Parallelogram4(5, 6);
        Rectangle4 box1 = new Box4(4, 10, 5);
        Rectangle4 box2 = new Box4(5, 5, 5);
        Rectangle4 cube = new Cube4(5);
        
        //Add all shapes to ArrayList
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();
        shapes.add(rect1);
        shapes.add(rect2);
        shapes.add(square);
        shapes.add(para);
        shapes.add(box1);
        shapes.add(box2);
        shapes.add(cube);
        
        //Print all shapes and their dimensions
        System.out.println("All shapes:" + "\n");
        for(Rectangle4 obj: shapes)
        {
            showEffectBoth(obj);
        }
        
        //Compare certain shapes for equality
        System.out.println("\n\nTest for equality of shapes:" + "\n");
        showEffectBoth(box1, cube);
        showEffectBoth(box2, cube);
        showEffectBoth(rect1, square);
        showEffectBoth(rect2, para);
        //note: a parallelogram is a rectangle with a uniform slant
        //when compared, they may have the same dimensions but not the same
        //degree of slant, which is not factored in this code
    }    
}
