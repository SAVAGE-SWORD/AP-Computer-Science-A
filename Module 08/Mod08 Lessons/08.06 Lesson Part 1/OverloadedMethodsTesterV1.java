
/**
 * This program demonstrates overloading methods.
 * All source code is contained in one file, but there are two classes.
 * Notice that when there are two classes in the same file, only the
 * one containing the main() method is public.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
class OverloadedMethodsV1
{
    //default constructor
    public OverloadedMethodsV1()
    {
    }

    //first rectangle area method with two int parameters
    public int calcRectArea(int s1, int s2)
    {
        return s1 * s2;
    }

    //second rectangle area method with two double parameters
    public double calcRectArea(double s1, double s2)
    {
        return s1 * s2;
    }

    //third rectangle area method with a single int parameter
    public int calcRectArea(int s1)
    {
        return (int)Math.pow(s1,2);
    }
}

public class OverloadedMethodsTesterV1
{
    public static void main(String[] args)
    {
        OverloadedMethodsV1 overload = new OverloadedMethodsV1();

        System.out.println("Two doubles passed: " + overload.calcRectArea(4.75, 15.5));
        System.out.println("One int passed: " + overload.calcRectArea(9));
        System.out.println("Two ints passed: " + overload.calcRectArea(4, 15));
    }
}
