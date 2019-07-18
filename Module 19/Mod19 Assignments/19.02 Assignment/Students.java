/**
 * Defines a student by name, assignment, and course grade from assignments
 *
 * @author Paul Chafetz
 * @version 5/23/2019
 */
import java.util.*;
public class Students
{
    // instance variables
    private String fName, lName, letter;
    private double[] grades;

    public Students(String fName, String lName, String letter, double[] grades)
    {
        this.fName = fName;
        //if there is no first name, throw an error
        if (fName.length() == 0) {
            throw new IllegalArgumentException("First name cannot be empty!");
        }
        this.lName = lName;
        //if there is no last name, throw an error
        if (lName.length() == 0) {
            throw new IllegalArgumentException("Last name cannot be empty!");
        }
        this.letter = "";
        this.grades = grades;
    }

    //I did this method a bit differently than the instructions because this 
    //solution is much easier (and faster)!
    public void calcLetter(double[] grades)
    {
        //if there are no scores, throw an error
        if (grades.length == 0)
            throw new IllegalArgumentException("Scores cannot be empty!");
        double total = 0, ave = 0;
        for (double g : grades)
            total += g;
        ave = total / grades.length;    
        if (ave >= 90.00)
            this.letter = "A";
        else if (ave >= 80.00)
            this.letter = "B";
        else if (ave >= 70.00)
            this.letter = "C";
        else if (ave >= 60.00)
            this.letter = "D";
        else
            this.letter = "F";
    }

    public String getFirst()
    {
        return fName;
    }

    public String getLast()
    {
        return lName;
    }

    public String getLetter()
    {
        return letter;
    }

    public double[] getGrades()
    {
        return grades;
    }

    @Override
    public String toString()
    //it took me a ****ing ridiculous amount of time to research how to format 
    //an array like this and I'm irritated from the process...
    {
        return String.format("%-9s%-9s%-3s%1s%-3s%1s%n", fName, lName, "-", letter, ":", Arrays.toString(grades).substring(1, Arrays.toString(grades).length() - 1));
    }
}
