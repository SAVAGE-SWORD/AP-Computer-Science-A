/**
 * Tests the Student class to manage/modify a gradebook of students
 *
 * @author Paul Chafetz
 * @version 5/4/2019
 */
import java.util.*;
public class StudentTester
{
    //prints the gradebook
    public static void printGB(List<Student> gb)
    {
        System.out.printf("%-12s%8s%8s%8s%8s%8s%n", "Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        for (Student student : gb)
            System.out.println(student);
    }

    //replaces student name
    public static void replaceName(List<Student> gb, String orig, String newName)
    {
        for (int i = 0; i < gb.size(); i++) {
            if (gb.get(i).getName().equals(orig)) {
                gb.get(i).setName(newName);
                break;
            }
        }
    }

    //replaces quiz score
    public static void replaceQuiz(List<Student> gb, String orig, int num, int score)
    {
        for (int i = 0; i < gb.size(); i++) {
            if (gb.get(i).getName().equals(orig)) {
                gb.get(i).setQuiz(num, score);
                break;
            }
        }
    }

    //replaces name and quiz
    public static void replaceStudent(List<Student> gb, String orig, String newName, int q1, int q2, int q3, int q4, int q5)
    {
        for (int i = 0; i < gb.size(); i++) {
            if (gb.get(i).getName().equals(orig)) {
                gb.get(i).setName(newName);
                gb.get(i).setQuiz(1, q1);
                gb.get(i).setQuiz(2, q2);
                gb.get(i).setQuiz(3, q3);
                gb.get(i).setQuiz(4, q4);
                gb.get(i).setQuiz(5, q5);
                break;
            }
        }
    }

    //inserts new student before another
    public static void insertStudent(List<Student> gb, String orig, String newName, int q1, int q2, int q3, int q4, int q5)
    {
        for (int i = 0; i < gb.size(); i++) {
            if (gb.get(i).getName().equals(orig)) {
                gb.add(i, new Student(newName, q1, q2, q3, q4, q5));
                break;    
            }
        }
    }

    //deletes new student by name
    public static void deleteStudent(List<Student> gb, String orig)
    {
        for (int i = 0; i < gb.size(); i++) {
            if (gb.get(i).getName().equals(orig)) {
                gb.remove(i);
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        //gradebook ArrayList with 5 starting students
        List<Student> gb = new ArrayList<Student>();
        gb.add(new Student("Paul Chafetz", 99, 90, 95, 92, 97));
        gb.add(new Student("Kevin Cam", 90, 91, 94, 88, 86));
        gb.add(new Student("Niv Landau", 85, 89, 82, 83, 79));
        gb.add(new Student("Ryan Berg", 71, 75, 62, 68, 70));
        gb.add(new Student("Hani Hassan", 75, 68, 76, 73, 82));

        //shows original gradebook before changes
        System.out.println("\nOriginal Gradebook:\n");
        printGB(gb);

        //shows replacing a name
        System.out.println("\nReplacing Niv Landau with David Block:\n");
        replaceName(gb, "Niv Landau", "David Block");
        printGB(gb);

        //shows replacing a quiz
        System.out.println("\nReplacing Ryan Berg's 2nd quiz with a 79:\n");
        replaceQuiz(gb, "Ryan Berg", 2, 79);
        printGB(gb);

        //shows replacing a student
        System.out.println("\nReplacing Hani Hassan with Joao Alvarez and his grades:\n");
        replaceStudent(gb, "Hani Hassan", "Joao Alvarez", 60, 52, 62, 40, 58);
        printGB(gb);

        //shows inserting a new student
        System.out.println("\nInserting Gang Chen before Kevin Cam:\n");
        insertStudent(gb, "Kevin Cam", "Gang Chen", 80, 82, 84, 78, 75);
        printGB(gb);

        System.out.println("\nDeleting Ryan Berg:\n");
        deleteStudent(gb, "Ryan Berg");
        printGB(gb);
    }
}
