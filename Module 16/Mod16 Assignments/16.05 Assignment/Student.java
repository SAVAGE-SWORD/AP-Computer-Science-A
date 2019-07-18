/**
 * Defines a student and 5 quiz grades for a gradebook system
 *
 * @author Paul Chafetz
 * @version 5/4/2019
 */
public class Student
{
    // instance variables
    private String name;
    private int quiz1, quiz2, quiz3, quiz4, quiz5;

    //Constructor for Student
    public Student(String name, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5)
    {
        this.name = name;
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.quiz4 = quiz4;
        this.quiz5 = quiz5;
    }

    //gets the quizzes based on the quiz number
    public int getQuiz(int num)
    {
        if (num == 1)
            return this.quiz1;
        else if (num == 2)
            return this.quiz2;
        else if (num == 3)
            return this.quiz3;
        else if (num == 4)
            return this.quiz4;
        else if (num == 5)
            return this.quiz5;
        else
            return -1;
    }
    
    //sets the quizzes based on the quiz number and score
    public void setQuiz(int num, int score)
    {
        if (num == 1)
            this.quiz1 = score;
        else if (num == 2)
            this.quiz2 = score;
        else if (num == 3)
            this.quiz3 = score;
        else if (num == 4)
            this.quiz4 = score;
        else if (num == 5)
            this.quiz5 = score;
    }
    
    //gets student name
    public String getName()
    {
        return this.name;
    }
    
    //sets student name
    public void setName(String name)
    {
         this.name = name;
    }
    
    //toString method to print Student objects
    public String toString()
    {
        return String.format("%-12s%8d%8d%8d%8d%8d", this.name, this.quiz1, this.quiz2, this.quiz3, this.quiz4, this.quiz5);
    }
}
