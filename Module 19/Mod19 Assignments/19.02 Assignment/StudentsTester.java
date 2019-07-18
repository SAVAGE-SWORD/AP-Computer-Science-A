/**
 * Tests Students class by calculating course grades based on assignments
 *
 * @author Paul Chafetz
 * @version 5/23/2019
 */
import java.util.*;
public class StudentsTester
{
    public static void main(String[] args)
    {
        List<Students> stud = new ArrayList<Students>();
        
        //you cannot directly declare an array within an Object declaration,
        //so I use these double arrays instead, one for each student
        double[] stud1 = {90.00, 85.00, 92.00, 87.00, 98.00};
        double[] stud2 = {100.00, 75.00, 50.00};
        double[] stud3 = {80.00, 75.00, 90.00, 95.00};
        double[] stud4 = {80.00, 72.00, 78.00, 82.00, 78.00};
        double[] stud5 = {50.00, 72.00};

        //correct Students objects (no exceptions)
        stud.add(new Students("Bobby", "Walters", "", stud1));
        stud.add(new Students("Jessica", "Rails", "", stud2));
        stud.add(new Students("Ben", "Dover", "", stud3));
        stud.add(new Students("Lee", "Haines", "", stud4));
        stud.add(new Students("Fred", "Flint", "", stud5));

        //incorrect Students objects (throws exceptions)
        //stud.add(new Students("", "nofirstname", "", stud1));
        //stud.add(new Students("nolastname", "", "", stud1));
        //double[] emptyScore = {}; //uncomment this and the next line together
        //stud.add(new Students("first", "last", "", emptyScore));

        System.out.printf("%n%6s%8s%11s%16s%n","First", "Last", "Letter", "Scores");
        for (Students s : stud) {
            s.calcLetter(s.getGrades());
            System.out.print(s);
        }
    }
}
