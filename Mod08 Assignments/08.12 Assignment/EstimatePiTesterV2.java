/**
 * To test the EstimatePi class.
 *
 * @author Paul Chafetz
 * @version 1/7/2019
 */
import java.util.Scanner;
import java.util.ArrayList;
public class EstimatePiTesterV2
{
    public static void main(String[] args)
    {
        //declare variables
        int dart = 0, totHits = 0, totDarts = 0;
        double totalPi = 0, aveHits = 0, aveDarts = 0, avePi = 0;
        
        //create ArrayList for objects
        ArrayList<EstimatePiV2> dartboard = new ArrayList<EstimatePiV2>(); 

        //ask for darts per trial and number of trials
        Scanner in = new Scanner(System.in);
        System.out.println("How many darts should be thrown per object? Recommendation: Less than 3,500,000");
        System.out.println("Note: An unique object is being created for each dart count you choose.");
        for (int i = 0; i < 10; i++) {
            dart = in.nextInt();
            dartboard.add(new EstimatePiV2(dart)); //adds new object to ArrayList based on input
            if (i < 9)
                System.out.println("Please choose " + (9 - i) + " more dart counts.");
        }
        System.out.println("\n\nHow many trials do you want in the simulation? Recommendation: Less than 15-20");
        int trials = in.nextInt();        
        System.out.println("\n\nThank you!\n\n");

        EstimatePiV2 record; //create new record object

        //print results
        System.out.printf("%46s%n%n", "Estimations of Pi");
        System.out.printf("%15s%11s%10s%11s%18s%n", "Object #", "Trial", "Hits", "Darts", "Estimated Pi");
        for (int i = 0; i < dartboard.size(); i++) {
            for (int j = 0; j < trials; j++) {
                record = dartboard.get(i);
                record.setHits();
                record.setTotalHits();
                record.setTotalDarts();
                record.setEstPi();
                record.setTotalPi();
                totHits += record.getTotalHits();   
                totDarts += record.getTotalDarts();
                totalPi += record.getTotalPi();
                System.out.printf("%11d%13d%s", i+1, j+1, record); //toString() method
            }
            System.out.println("       ----------------------------------------------------------");
        }
        //calculate averages and print results
        aveHits = (double)totHits / (dartboard.size() * trials);
        aveDarts = (double)totDarts / (dartboard.size() * trials);
        avePi = (double)totalPi / (dartboard.size() * trials);
        System.out.printf("%13s%23d%11d%16.5f%n", "Total", totHits, totDarts, totalPi);
        System.out.printf("%14s%22.2f%11.2f%16.5f%n", "Average", aveHits, aveDarts, avePi);
    }
}

