
/**
 * The purpose of this program is to grade a True-False test.
 *
 * @author Grace Hopper
 * @version 06/07/17
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class TrueFalseTest
{
    // Read in test data from text file.
    public static String [] readTestData()throws IOException
    {
        int index = 0;
        String [] answers = new String[11];

        File fileName = new File("TestData1.txt");
        Scanner inFile = new Scanner(fileName);
        while (inFile.hasNext())
        {
            answers[index] = inFile.next( );
            index++;
        }
        inFile.close();
        return answers;
    }

    // Grade the test and count the number correct.
    public static int gradeTest(String[] test, String[] key)
    {
        int correct = 0;

        for(int n = 1; n < test.length; n++)
        {
            if(test[n].equals(key[n]))
                correct++;
        }
        return correct;
    }

    // Calculate the percent correct.
    public static double calcPercent(int n)
    {
        return (n/10.0) * 100;
    }

    // Print the results.
    public static void printResults(String studentId, double pct)
    {
        System.out.printf("Student Number: %s   Grade: %4.1f%n", studentId, pct);
    }

    // The main method.
    public static void main(String[] args) throws IOException
    {
        String[] testAnswers = new String[11];
        String[] answerKey = {"name", "T", "F", "T", "F", "T", "F", "T", "F", "T", "T"};

        testAnswers = readTestData();
        int numCorrect = gradeTest(testAnswers, answerKey);
        double percent = calcPercent(numCorrect);
        printResults(testAnswers[0], percent);
    }
}

