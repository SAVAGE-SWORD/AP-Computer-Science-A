  
/**
 * Use Monte Carlo sampling to estimate the average number of animals observed in a given environment.
 *
 * Paul Chafetz
 * 11/11/2018
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class AnimalPopulation
{
    public static void main (String [ ] args) throws IOException
    {
     //declare all Classes and Objects
     DecimalFormat num = new DecimalFormat("###,###.##");
     Scanner in = new Scanner(System.in);
     Random rand = new Random();
     File fileName = new File("rawdata.txt");
     Scanner inFile = new Scanner(fileName);
     PrintWriter outFile = new PrintWriter(new File("rawdata.txt"));
     
     //declare all variables
     int trialAnim = 0;
     int totAnimals = 0;
     int random = 0; 
     int anim = 0;
     int totAnim = 0;
     int bJ = 0;
     
     //introduction
     System.out.println("Hello and thank you for using the Blue Jay Simulator!\n");
     System.out.println("This will calculate the average number of animals spotted before a Blue Jay.\n\n");
     System.out.println("Firstly, how many trials do you want to simulate? (Greater than 1000)");
     
     //test if more than 1000 trials
     int trial = in.nextInt();
     while (trial < 1000) {
     System.out.println("Please enter a value greater than 1000.");
     trial = in.nextInt();
     }
     
     System.out.println("\n\nThank you. You have selected " + trial + " trials to test.");
     System.out.println("\n\nSimulating trials and computing results.");
     
     //seeing a Blue Jay in the simulation is 1/10 animals and the Blue Jay will be animal #10
     
     //the outer loop performs the inner loop and prints the result of it
     //the inner loop repeats random numbers until it hits 10
     for (int count = 0; count < trial; count++)
      {
         for (random = 0; !(random == 10); random = rand.nextInt(11)) {
             trialAnim++;
             //outFile.print("Animal: " + random); debug
             //outFile.println("\tCount: " + trialAnim); debug
         }
       outFile.println(trialAnim);
       totAnimals += trialAnim;
       trialAnim = 0;
      }
        
     outFile.close();
     
     System.out.println("\n\t\tSimulation successful.");
     System.out.println("To view the individual trials, please see rawdata.txt.");
     
     //the rawdata.txt only reports the total animals (not including the blue jay)
     //for each trial, thus trial = bJ, but I did it this way anyway
     //this assignment forces me to make the code "reread" the output file it created
     //through the existing code anyway
     while (inFile.hasNext()) {
         anim = inFile.nextInt();
         totAnim += anim;
         bJ++;
        }    
     
     inFile.close();
     
     double average = (totAnim / (double)bJ);
     
     //print final results
     System.out.println("\n\n\t\t\tResults");
     System.out.println("\nThere were " + trial + " trials.");
     System.out.println("\nThere were " + totAnim + " total animals spotted.");
     System.out.println("\nThere were " + bJ +  " Blue Jays were spotted.");
     System.out.println("\nThe average number of animals viewed before a Blue Jay was: " + num.format(average) + ".");
     
    }
}
