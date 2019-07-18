
/**
 * Find the trajectories of a melon launched at different speeds and angles.
 * I used this assignment to experiment with a minimalist style of coding, 
 * using as few methods as reasonable and necessary.
 * @author Paul Chafetz
 * @version 1/20/2019
 */
public class Melon
{
    private int[] mySpeeds, myAngles;

    /**
     * Constructor for Melon. It uses 2 parameters for the speed (mph) and angle (deg)
     * @param array of speeds (mph)
     * @param array of angles (deg)
     */
    public Melon(int[] speeds, int[] angles)
    {
        mySpeeds = speeds;
        myAngles = angles;
    }        

    /**
     * Calculates and gets trajectory/range for a melon with the formula R = speed^2 * sin(2 * angle) / g
     * @param speedMPH individual speed in mph
     * @param angleDeg individual angle in degrees
     * @return trajectory/range in meters
     * Note: 9.80665 is the true average value of acceleration due to gravity on Earth
     */
    public double calcTraj(int speedMPH, int angleDeg) 
    {
        double speedMS = speedMPH * 0.44704; //m/s = 0.44704 mph
        double angleRad = Math.toRadians(angleDeg);
        double range = Math.pow(speedMS, 2) * Math.sin(2 * angleRad) / 9.80665; 
        return range;
    } 
    
    /**
     * Assigns ranges (above) to a 2D array and prints it in a table format
     * @param dist a 2D array for each range calculated from the speeds and angles
     */
    public void calcAndPrintTable() {
        double dist[][] = new double[mySpeeds.length][myAngles.length];
        
        //uses the calcTraj method to set each range combination of speed and angle to the array
        for (int i = 0; i < mySpeeds.length; i++) {
            for (int j = 0; j < myAngles.length; j++)
                dist[i][j] = calcTraj(mySpeeds[i], myAngles[j]);
        }
        
        //prints results in table format
        System.out.printf("%n%55s", "Distance of a Projectile (m)");
        System.out.printf("%n%13s", "MPH");
        for (int angle : myAngles)
            System.out.printf("%10s", angle + "°");
        System.out.println("\n");
        for (int i = 0; i < mySpeeds.length; i++) {
            System.out.printf("%12d%1s", mySpeeds[i], "");
            for (int j = 0; j < myAngles.length; j++)
                System.out.printf("%10.2f", dist[i][j]);
            System.out.println();    
        }
    }
}