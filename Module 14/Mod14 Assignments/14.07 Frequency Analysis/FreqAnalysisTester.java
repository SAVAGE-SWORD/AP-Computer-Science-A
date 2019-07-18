/**
 * Tests the FreqAnalysis class
 *
 * @author Paul Chafetz
 * @version 4/15/2019
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class FreqAnalysisTester
{
    public static void main(String[] args) throws IOException
    {
        //ask for filename and and set up the File objects
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the exact name of the file you want to read (filename.txt)");
        String inputFile = in.nextLine();
        String outputFile = inputFile.substring(0, inputFile.indexOf(".txt")) + "Freq.txt";
        File inFile = new File(inputFile);
        File outFile = new File(outputFile);
        
        //create FreqAnalysis and run the methods on that object
        FreqAnalysis fa = new FreqAnalysis(inFile, outFile);
        fa.readFile();
        fa.printTable();
        fa.writeFile();
    }
}
