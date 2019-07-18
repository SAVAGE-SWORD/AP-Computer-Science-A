
/**
 * Calculates the distance and average speed of a bike ride.
 *
 * Paul Chafetz
 * 1/3/2019
 */
public class BikingV3
{
    //default constructor
    public BikingV3() {
    }

    //calculates the distance of the trip
    public double calcDistance(double init, double fin) {
        return fin - init;
    }

    //calculates the time of the trip
    public double calcTime(double init, double fin) {
        return fin - init;
    }

    //calculates the average speed of the trip
    public double calcSpeed(double dist, double time) {
        return dist / time;
    }

    //prints output
    public void print(double dist, double time, double spd) {
        System.out.printf("%n%50s%n%n", "Bike Trip Statistics");
        System.out.printf("%25sThe trip covered %5.2f miles.%n", "", dist);
        System.out.printf("%27sThe trip took %4.2f hours.%n", "", time);
        System.out.printf("%12sYour average speed on the trip was %5.3f miles per hour.", "", spd);
    }

    //main method
    public static void main(String[] args)
    {
        //construct class Object
        BikingV3 bike = new BikingV3();

        //initialize and declare variables
        double initialMiles = 10.23, finalMiles = 72.71, distance = 0, speed = 0, duration = 0, startTime = 7.5, endTime = 12.75; //based on 24-hour clock

        //call methods
        distance = bike.calcDistance(initialMiles, finalMiles);
        duration = bike.calcTime(startTime, endTime);
        speed = bike.calcSpeed(distance, duration);
        bike.print(distance, duration, speed);
    }
}
