
/**
 * Determine surface gravity for planets in solar system.
 *
 * Paul Chafetz
 * 12/16/2018
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
public class PlanetGravity
{
    //find the values of gravity 
    public static double[] findGravity(double[] mass, double[] diameterkm) {
        double gravConst = 6.67408E-11;
        double[] gravity = new double[8];
        for (int i = 0; i < gravity.length; i++)
            gravity[i] = ((gravConst * mass[i]) / Math.pow((diameterkm[i] * 1000) / 2, 2)); //r(m) = ((d(kg) * 1000) / 2)
        return gravity;
    }

    //print gravity results
    public static void print(String[] planets, double[] diameterkm, double[] mass, double[] gravities) {
        System.out.printf("%35s\n", "Planet Data");
        System.out.printf("%-12s%-18s%-14s%s\n\n", "Planet", "Diameter(km)", "Mass(kg)", "Gravity(m/s^2)");
        for (int i = 0; i < planets.length; i++)
            System.out.printf("%-12s%9.1f%17.2E%14.2f\n", planets[i], diameterkm[i], mass[i], gravities[i]);
    }

    //print raw gravity results from calculations to file
    public static void table(double[] gravities) throws IOException {
        PrintWriter outFile = new PrintWriter(new File("surfacegravity.txt"));
        for (int i = 0; i < gravities.length; i++)
            outFile.println(gravities[i]);
        outFile.close();
    }
    
    //main method
    public static void main(String[] args) throws IOException
    {
        //set all data to arrays
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] mass = {3.30E23, 4.869E24, 5.972E24, 6.4219E23, 1.900E27, 5.68E26, 8.683E25, 1.0247E26};
        double[] diameterkm = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532 };

        //call all methods
        double[] gravities = findGravity(mass, diameterkm);
        print(planets, diameterkm, mass, gravities);
        table(gravities);
    }
}
