/**
 * This program demonstrates overloading methods and
 * creating separate classes in different files.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
public class OverloadedMethodsV2
{
    //default constructor
    public OverloadedMethodsV2()
    {
    }

    //first rectangle area method takes two ints
    public int calcRectArea(int s1, int s2)
    {
        return s1 * s2;
    }

    //second rectangle area method takes two doubles
    public double calcRectArea(double s1, double s2)
    {
        return s1 * s2;
    }

    //third rectangle area method takes one int
    public int calcRectArea(int s1)
    {
        return (int)Math.pow(s1,2);
    }
}