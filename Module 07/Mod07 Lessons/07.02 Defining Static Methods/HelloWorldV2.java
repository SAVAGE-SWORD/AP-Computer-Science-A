/**
 * This program demonstrates the top-down design with the
 * Hello World program.
 *
 * @author Grace Hopper
 * @version 06/07/17
 */
public class HelloWorldV2
{
    int test = 0;
    // print two lines of text
    public static void printTwoLines()
    {
        System.out.println("Hello, Virtual World!");
        System.out.println("It is a great day for programming.");
    }
    public static void test() {
        System.out.println("test test test");
        int test2 = 5;
        System.out.println("test2 is " + test2);
    }

    // main method
    public static void main(String[ ] args)
    {
        printTwoLines();
        test();
    }//end main
} //end class
