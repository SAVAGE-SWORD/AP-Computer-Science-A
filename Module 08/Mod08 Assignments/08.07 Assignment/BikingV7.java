
/**
 * Calculates the distances, times, and average speeds of multiple bike trips.
 *
 * Paul Chafetz
 * 1/5/2019
 */
public class BikingV7
{
    //private instances
    private int myTrip = 0;
    private double myInitD = 0, myFinD = 0, myInitT = 0, myFinT = 0;

    //constructor for the private instance variables
    public BikingV7(int trip, double initD, double finD, double initT, double finT)
    {
        myTrip = trip;
        myInitD = initD;
        myFinD = finD;
        myInitT = initT;
        myFinT = finT;
    }
    
    //displays trip number
    public int calc(int myTrip) { //include parameter for overloading to work
        return myTrip;
    }
    
    //calculates the distance of the trip
    public double calc() {
        return myFinD - myInitD;
    }

    //calculates the time of the trip
    public double calcTime() {
        return myFinT - myInitT;
    }

    //calculates the average speed of the trip
    public double calcSpeed() {
        return (myFinD - myInitD) / (myFinT - myInitT);
    }
}
