
/**
 * Calculates the distances, times, and average speeds of multiple bike trips.
 *
 * @author: Paul Chafetz
 * @version: 4/9/2019
 */
public class BikingV9Tester
{
    public static void main(String[] args)
    {
        //initialize and declare variables
        //time is based on 24-hour clock (7 is 7 AM and 14 is 7 PM)
        double totD = 0, totT = 0, totS = 0, maxD = Integer.MIN_VALUE, minD = Integer.MAX_VALUE, maxT = Integer.MIN_VALUE, minT = Integer.MAX_VALUE, maxS = Integer.MIN_VALUE, minS = Integer.MAX_VALUE;
        double initialMiles1 = 10.23, finalMiles1 = 64.86, startTime1 = 6.25, endTime1 = 12.00;
        double initialMiles2 = 64.86, finalMiles2 = 151.30, startTime2 = 6.50, endTime2 = 14.75;
        double initialMiles3 = 151.30, finalMiles3 = 258.86, startTime3 = 7.75, endTime3 = 17.50;
        double initialMiles4 = 258.86, finalMiles4 = 358.22, startTime4 = 6.00, endTime4 = 14.50;
        double initialMiles5 = 358.22, finalMiles5 = 462.60, startTime5 = 10.75, endTime5 = 20.25;
        
        //construct class Objects
        //the "theme" is taking different bicycle trips on a bike traveling excursion where each day is a new trip, leaving off where you stopped previously
        BikingV9[] bikes = {new BikingV9(initialMiles1, finalMiles1, startTime1, endTime1), new BikingV9(initialMiles2, finalMiles2, startTime2, endTime2), new BikingV9(initialMiles3, finalMiles3, startTime3, endTime3), new BikingV9(initialMiles4, finalMiles4, startTime4, endTime4), new BikingV9(initialMiles5, finalMiles5, startTime5, endTime5)};
       
        //print results
        System.out.printf("%n%50s%n", "Bike Trip Statistics");
        System.out.printf("%14sTrip #%5sDistance(mi)%5sTime(hrs)%5sSpeed(mph)%n%n", "", "", "", "");
        
        for (int i = 0; i < bikes.length; i++) {
            bikes[i].setDist();
            bikes[i].setTime();
            bikes[i].setSpeed();
            minD = bikes[i].calcMinD(minD);
            minT = bikes[i].calcMinT(minT);
            minS = bikes[i].calcMinS(minS);
            maxD = bikes[i].calcMaxD(maxD);
            maxT = bikes[i].calcMaxT(maxT);
            maxS = bikes[i].calcMaxS(maxS);
            totD = bikes[i].calcTotD(totD);
            totT = bikes[i].calcTotT(totT);
            totS = bikes[i].calcTotS(totS);
            System.out.printf("%17s%3d" + bikes[i] +"%n", "Trip", i+1 ); //toString() method prints Object
        }
        
        System.out.printf("%n%20s%13.2f%15.2f%15.3f%n", "Minimum", minD, minT, minS);
        System.out.printf("%20s%13.2f%15.2f%15.3f%n", "Maximum", maxD, maxT, maxS);
        System.out.printf("%20s%13.2f%15.2f%15.3f%n", "Average", totD / 5, totT / 5, totS / 5);
        
    }
}
   