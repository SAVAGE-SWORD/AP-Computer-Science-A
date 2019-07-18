
/**
 * The purpose of this program is to calculate the hypotenuse
 * of a triangle and its area. All calculations are done within
 * methods. An object is instantiated and all methods are invoked
 * on the object.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
public class ShapesV4
{
    //default constructor
    public ShapesV4()
    {
    }

    //calculate area of a rectangle
    public double calcAreaRectangle(int w, int l)
    {
        return w * l;
    }

    //calculate the perimeter of a rectangle
    public int calcRectPerimeter(int w, int l)
    {
        return 2 * w + 2 * l;
    }

    //calculate the circumference of a circle
    public double calcCircumference(int r)
    {
        return 2 * Math.PI * r;
    }

    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        int length, width, radius;
        double rectArea, rectPer, circumference;

        //initialization of variables
        length = 5;
        width = 10;
        radius = 3;
        rectArea = 0;
        rectPer = 0;
        circumference = 0;
        
        ShapesV4 shapes = new ShapesV4();

        //call methods
        rectArea = shapes.calcAreaRectangle(width, length);
        rectPer = shapes.calcRectPerimeter(width, length);
        circumference = shapes.calcCircumference(radius);

        //print results
        System.out.printf("The Rectangle Area = %8.2f%n", rectArea);
        System.out.printf("The Rectangle Perimeter = %8.2f%n", rectPer);
        System.out.printf("The Circle Circumference = %8.2f%n", circumference);
    }//end main method
}//end class
