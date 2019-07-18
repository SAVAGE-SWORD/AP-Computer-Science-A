/**
 * Tests Homework class hierarchy
 *
 * @author Paul Chafetz
 * @version 4/15/2019
 */
import java.util.ArrayList;
public class HomeworkTester
{
    public static void main(String[] args)
    {
        ArrayList<Homework> courses = new ArrayList<Homework>();
        courses.add(new APLiterature());
        courses.add(new CalculusBC());
        courses.add(new APMacro());
        courses.add(new CompSci());
        
        System.out.println("\n\tReading Homework\n");
        
        //I could use setPages to set each course with a corresponding number
        //of pages to read, but instead I'll opt for a random number generator
        
        for (Homework work : courses)
        {
            work.getWork((int)(Math.random() * 15) + 1); //generates random pages to read between 1 and 15
            System.out.println(work);
        }   
    }
}
