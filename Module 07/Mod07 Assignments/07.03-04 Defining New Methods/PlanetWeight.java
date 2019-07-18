
/**
 * Determine weights for planets in solar system.
 *
 * Paul Chafetz
 * 12/16/2018
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class PlanetWeight
{
    //set the gravities from the file to an array
    public static double[] gravity() throws IOException {
        int i = 0;
        double[] gravities = new double[8];
        File fileName = new File("surfacegravity.txt");
        Scanner inFile = new Scanner(fileName);
        while (inFile.hasNext()) {
            gravities[i] = inFile.nextDouble();
            i++;
        }
        inFile.close();
        return gravities;
    }

    public static double[] calcWeight(double[] gravities, int weight) {
        double[] weightsAll = new double[8];
        for (int i = 0; i < weightsAll.length; i++)
            weightsAll[i] = (weight * gravities[i]) / gravities[2];
        return weightsAll;
    }
    
    //print weight results
    public static void print(String[] planets, double[] gravities, double[] weights) {
        System.out.printf("\n\n%30s\n", "Weight on Planets");
        System.out.printf("%-14s%-22s%s\n\n", "Planet", "Gravity(m/s^2)", "Weight (lbs)");
        for (int i = 0; i < planets.length; i++)
            System.out.printf("%-12s%11.2f%22.2f\n", planets[i], gravities[i], weights[i]);
    }

    //main method
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"}; 
        System.out.println("Hello, please enter your weight in pounds. (lbs)");
        int weight = in.nextInt();
        
        double[] gravities = gravity();
        double[] weights = calcWeight(gravities, weight);
        print(planets, gravities, weights);
    }
}
