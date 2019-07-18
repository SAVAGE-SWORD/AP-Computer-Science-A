
/**
 * Purpose: To calculate average test scores based on grades and total points.
 *
 * Paul Chafetz
 * 10/1/2018
 */
import java.util.Scanner;
public class GradesV3
{
    public static void main(String[ ] args)
    { 
    //local variables
    int numTests = 0;      //counts number of tests
    int testGrade = 0;     //individual test grade
    int totalPoints = 0;   //total points for all tests
    double average = 0.0;  //average grade   
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Hello! What is your name?");
    String name = in.nextLine();
    System.out.println();
    System.out.println("Nice! I really like your name, " + name + ".");
    System.out.println();
    System.out.println("What subject are you computing these score for?");
    String subject = in.nextLine();
    System.out.println("I see. Good luck with " + subject + ". I hope you have some good scores to show for it!");
    System.out.println();
    System.out.println("By the way, who is your favorite person?");
    String favPerson = in.next();
    System.out.println();
    System.out.println("Your favorite person is " + favPerson + "? Well, mine is Paul Chafetz!");
    System.out.println();
    System.out.println("Well, it's a pleasure to meet you, " + name + ".");
    System.out.println();
    
    //test 1
    System.out.println();
    System.out.println("This program will keep track of your scores and their averages.");
    System.out.println();
    System.out.println("Please enter your first grade as a whole number between 0 and 100.");
    
    testGrade = in.nextInt();
    numTests++;
    totalPoints += testGrade;
    average = totalPoints / (double)numTests;
    
    System.out.print("Test # " + numTests + "  ");
    System.out.print("Test Grade: " + testGrade + "  ");
    System.out.print("Total Points: " + totalPoints + "  ");
    System.out.println("Average Score: " + average);
    System.out.println();
    
    //test 2
    System.out.println("Please enter your next grade.");
    
    testGrade = in.nextInt();
    numTests++;
    totalPoints += testGrade;
    average = totalPoints / (double)numTests;
    
    System.out.print("Test # " + numTests + "  ");
    System.out.print("Test Grade: " + testGrade + "  ");
    System.out.print("Total Points: " + totalPoints + "  ");
    System.out.println("Average Score: " + average);
    System.out.println();
    
    //test 3
    System.out.println("Please enter your next grade.");
    
    testGrade = in.nextInt();
    numTests++;
    totalPoints += testGrade;
    average = totalPoints / (double)numTests;
    
    System.out.print("Test # " + numTests + "  ");
    System.out.print("Test Grade: " + testGrade + "  ");
    System.out.print("Total Points: " + totalPoints + "  ");
    System.out.println("Average Score: " + average);
    System.out.println();
    
    //test 4
    System.out.println("Please enter your next grade.");
    
    testGrade = in.nextInt();
    numTests++;
    totalPoints += testGrade;
    average = totalPoints / (double)numTests;
    
    System.out.print("Test # " + numTests + "  ");
    System.out.print("Test Grade: " + testGrade + "  ");
    System.out.print("Total Points: " + totalPoints + "  ");
    System.out.println("Average Score: " + average);
    System.out.println();
    
    //test 5
    System.out.println("Please enter your last grade.");
    
    testGrade = in.nextInt();
    numTests++;
    totalPoints += testGrade;
    average = totalPoints / (double)numTests;
    
    System.out.print("Test # " + numTests + "  ");
    System.out.print("Test Grade: " + testGrade + "  ");
    System.out.print("Total Points: " + totalPoints + "  ");
    System.out.println("Average Score: " + average);
    System.out.println();
    
    System.out.println("For now, I only compute up to 5 individual test scores. Sorry about that! Have a nice day!");
    }    
}
