/**
 * This program demonstrates overloading methods.
 * Notice that the program has been divided into two different classes
 * each in a different file.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
public class OverloadedMethodsTesterV2
{
    public static void main(String[] args)
    {
        OverloadedMethodsV2 overload = new OverloadedMethodsV2();

        System.out.println("Testing Overloaded Methods");
        System.out.println("Two doubles passed: " + overload.calcRectArea(4.75, 15.5));
        System.out.println("One int passed: " + overload.calcRectArea(9));
        System.out.println("Two ints passed: " + overload.calcRectArea(4, 15));
    }
}
