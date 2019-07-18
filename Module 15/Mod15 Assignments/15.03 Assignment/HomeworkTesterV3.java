/**
 * Tests HomeworkV3 class hierarchy
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
import java.util.*;
public class HomeworkTesterV3
{
    public static void main(String[] args)
    {
        List<HomeworkV3> courses = new ArrayList<HomeworkV3>();
        courses.add(new APLiteratureV3());
        courses.add(new CalculusBCV3());
        courses.add(new APMacroV3());
        courses.add(new CompSciV3());
        
        System.out.println("\n\tReading Homework\n");
        
        for (HomeworkV3 work : courses)
        {
            System.out.print("Before: ");
            work.getWork((int)(Math.random() * 20) + 10); //generates random pages to read between 10 and 20
            System.out.println(work);
            System.out.print("After: ");
            work.doHW();
            System.out.println(work + "\n");
        }   
    }
}
