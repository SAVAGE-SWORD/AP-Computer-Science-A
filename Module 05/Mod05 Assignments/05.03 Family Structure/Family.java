
/**
 * Calculates the probability of family composition from text files.
 *
 * Paul Chafetz
 * 11/4/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat; //rubric wants to 1-2 decimal places D:  !
public class Family
{
    public static void main(String[] args) throws IOException
    {
        //I'm supposed to format the decimal, but that was never taught in the lessons so far!
        DecimalFormat num = new DecimalFormat("###,###.##"); 
                
        //Scan in the file
        String token = "";
        File fileName = new File("maleFemaleInFamily.txt");
        Scanner inFile = new Scanner(fileName);
        
        //declare all the variables to be used
        int bB = 0;
        int bG = 0;
        int gB = 0;
        int gG = 0;
        int count = 0;
        int error = 0;
        
        //while loop to count the number of each possible family group
        while(inFile.hasNext())
        {
            token = inFile.next( );
            if (token.equals("BB")) {
                bB++;
                count++;
                }
            else if (token.equals("BG")) {
                bG++;
                count++;
                }
            else if (token.equals("GB")) {
                gB++;
                count++;
                }
            else if (token.equals("GG")) {
                gG++;
                count++;
                }
            else { //error handler, I hope
                error++;
                System.out.println("Error handler: Error at No. " + (count+1) + ". This has happened: " + error + " times so far!");
            }
        }       
        
        //adds BG and GB, since they're the same thing
        int totBG = bG + gB;
        //I'll use decimal formatting for everything now, since I went and researched it on my own.
        System.out.println("\n\nThe total sampling size was " + num.format(count) + " families.");
        System.out.println("There were " + num.format(bB) + " families with two boys.");
        System.out.println("There were " + num.format(gG) + " families with two girls.");
        System.out.println("There were " + num.format(totBG) + " families with one boy and one girl.");
        
        inFile.close();
        
        double bBPercent = (bB / (double)count) * 100;
        double gGPercent = (gG / (double)count) * 100;
        double totBGPercent = (totBG / (double)count) * 100;
                
        System.out.println("\n\nThe probability of a family with two boys: " + num.format(bBPercent) + "%");
        System.out.println("The probability of a family with two girls: " + num.format(gGPercent) + "%");
        System.out.println("The probability of a family with one boy and one girl: " + num.format(totBGPercent) + "%");
    }
}