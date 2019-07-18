/**
 * Tests HomeworkV4 class hierarchy
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
import java.util.*;
public class HomeworkTesterV4
{
    public static void main(String[] args)
    {
        List<HomeworkV4> courses = new ArrayList<HomeworkV4>();
        courses.add(new APLiteratureV4());
        courses.add(new CalculusBCV4());
        courses.add(new APMacroV4());
        courses.add(new CompSciV4());

        System.out.println("\n\tReading Homework\n");

        for (HomeworkV4 work : courses)
        {
            System.out.print("Before: ");
            work.getWork((int)(Math.random() * 10) + 10); //generates random pages to read between 10 and 20
            System.out.println(work);
            System.out.print("After: ");
            work.doHW();
            System.out.println(work + "\n");
        }

        System.out.println("\n\tComparing Homework\n");

        if (courses.get(0).compareTo(courses.get(1)) == 0)
            System.out.println("AP Literature has the same amount of homework as AP Calculus BC.");
        else if (courses.get(0).compareTo(courses.get(1)) < 0)
            System.out.println("AP Literature has less homework than AP Calculus BC.");
        else
            System.out.println("AP Literature has more homework than AP Calculus BC.");

        if (courses.get(1).compareTo(courses.get(2)) == 0)
            System.out.println("Calculus BC has the same amount of homework as AP Macroeconomics.");
        else if (courses.get(1).compareTo(courses.get(2)) < 0)
            System.out.println("Calculus BC has less homework than AP Macroeconomics.");
        else
            System.out.println("Calculus BC has more homework than AP Macroeconomics.");    
            
        if (courses.get(2).compareTo(courses.get(3)) == 0)
            System.out.println("AP Macroeconomics has the same amount of homework as AP Computer Science.");
        else if (courses.get(2).compareTo(courses.get(3)) < 0)
            System.out.println("AP Macroeconomics has less homework than AP Computer Science.");
        else
            System.out.println("AP Macroeconomics has more homework than AP Computer Science.");
            
        if (courses.get(3).compareTo(courses.get(0)) == 0)
            System.out.println("AP Computer Science has the same amount of homework as AP Literature.");
        else if (courses.get(3).compareTo(courses.get(0)) < 0)
            System.out.println("AP Computer Science has less homework than AP Literature.");
        else
            System.out.println("AP Computer Science has more homework than AP Literature.");    

    }
}
