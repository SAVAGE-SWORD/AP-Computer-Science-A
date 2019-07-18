
/**
 * Calculate approximations of pi using using a dartboard simulation
 *
 * Paul Chafetz
 * 12/28/2018
 */
import java.util.Scanner;
public class EstimatePi
{
    public static int hitsInCircle(double x, double y, int darts) {
        int hits = 0;
        //find a random value of x and y for each dart thrown
        //see how many hits there within the circular dartboard
        for (int i = 0; i < darts; i++) {
            x = (2 * Math.random() - 1);
            y = (2 * Math.random() - 1);
            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) //radius is always 1 in this assignment
                hits++;  
        }
        return hits;
    }

    public static double findPi(double totHits, int darts) {
        //pi = 4 * h / n where h = totHits aka hits and n = darts
        return (4 * (totHits / darts));
    }

    public static void findAvePi(double totalPi, int trials) {
        double avePi = 0;
        avePi = totalPi / trials;
        System.out.printf("Average pi for all trials: %1.6f", avePi);
    }

    public static void main(String[] args)
    {
        //declare variables
        double x = (2 * Math.random() - 1); //generates value between -1 and 1 (coords in unit circle)
        double y = (2 * Math.random() - 1); //generates value between -1 and 1 (coords in unit circle)
        double totalPi = 0;

        //ask for darts per trial and trials
        Scanner in = new Scanner(System.in);
        System.out.println("How many darts should be thrown per trial?");
        int darts = in.nextInt();
        System.out.println("\n\nHow many trials do you want in the simulation?");
        int trials = in.nextInt();
        System.out.println("\n\nThank you!\n\n");

        //do the main tasks!
        for (int i = 1; i <= trials; i++) {
            int totHits = hitsInCircle(x, y, darts); //use method to find totHits in each trial
            double estPi = findPi(totHits, darts); //use method with the value of previous method to find pi for each trial
            System.out.printf("Trial " + i + ": pi = %1.6f\n", estPi);
            totalPi += estPi;
        }
        findAvePi(totalPi, trials); //use method to calculate average pi and print it
    }
}
