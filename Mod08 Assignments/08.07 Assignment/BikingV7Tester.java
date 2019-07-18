
/**
 * Calculates the distances, times, and average speeds of multiple bike trips.
 *
 * Paul Chafetz
 * 1/5/2019
 */
public class BikingV7Tester
{
    public static void main(String[] args)
    {
        //initialize and declare variables
        //time is based on 24-hour clock (7 is 7 AM and 14 is 7 PM)
        int trip1 = 1, trip2 = 2, trip3 = 3;
        double initialMiles1 = 10.23, finalMiles1 = 64.86, startTime1 = 6.25, endTime1 = 12.00;
        double initialMiles2 = 64.86, finalMiles2 = 151.30, startTime2 = 6.50, endTime2 = 14.75;
        double initialMiles3 = 151.30, finalMiles3 = 258.86, startTime3 = 7.75, endTime3 = 17.50;
                
        //construct class Objects
        //the "theme" is taking different bicycle trips on a bike traveling excursion
        //each day is a new trip, leaving off where you stopped previously
        BikingV7 bike1 = new BikingV7(trip1, initialMiles1, finalMiles1, startTime1, endTime1);
        BikingV7 bike2 = new BikingV7(trip2, initialMiles2, finalMiles2, startTime2, endTime2);
        BikingV7 bike3 = new BikingV7(trip3, initialMiles3, finalMiles3, startTime3, endTime3);  
        
        //print results
        System.out.printf("%n%50s%n", "Bike Trip Statistics");
        System.out.printf("%14sTrip #%5sDistance(mi)%5sTime(hrs)%5sSpeed(mph)%n%n", "", "", "", "");
        System.out.printf("%14sTrip%2s%13.2f%15.2f%15.3f%n", "", bike1.calc(trip1), bike1.calc(), bike1.calcTime(), bike1.calcSpeed());
        System.out.printf("%14sTrip%2s%13.2f%15.2f%15.3f%n", "", bike2.calc(trip2), bike2.calc(), bike2.calcTime(), bike2.calcSpeed());
        System.out.printf("%14sTrip%2s%13.2f%15.2f%15.3f%n", "", bike3.calc(trip3), bike3.calc(), bike3.calcTime(), bike3.calcSpeed());
        }
    }