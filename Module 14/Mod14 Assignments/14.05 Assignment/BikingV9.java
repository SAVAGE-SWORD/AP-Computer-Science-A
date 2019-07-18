
/**
 * Calculates the distances, times, and average speeds of multiple bike trips.
 *
 * @author: Paul Chafetz
 * @version: 4/9/2019
 */
public class BikingV9
{
    //private instances
    private double InitD, FinD, InitT, FinT, myDist, myTime, mySpeed, sum;
    
    //constructor for the private instance variables
    public BikingV9(double initD, double finD, double initT, double finT)
    {
        //used this to distinguish between the instance variables and the parameter variables
        this.InitD = initD;
        this.FinD = finD;
        this.InitT = initT;
        this.FinT = finT;
        myDist = 0;
        myTime = 0;
        mySpeed = 0;
    }

    //sets distance on trip
    public void setDist() {
        myDist = this.FinD - this.InitD;
    }
    
    //sets time on trip
    public void setTime() {
       myTime = this.FinT - this.InitT; 
    }
    
    //sets speed on trip
    public void setSpeed() {
       setDist();
       setTime();
       mySpeed = myDist / myTime;
    }
    
    //gets distance on trip
    public double getDist() {
        return myDist;
    }
    
    //gets time on trip
    public double getTime() {
        return myTime;
    }
    
    //gets speed on trip
    public double getSpeed() {
        return mySpeed;
    }
        
    //calculates minimum distance on trip
    public double calcMinD(double minD) {
        if (myDist < minD)
            minD = myDist;
        return minD;
    }
    
    //calculates maximum distance on trip
    public double calcMaxD(double maxD) {
        if (myDist > maxD)
            maxD = myDist;
        return maxD;
    }
    
    //calculates minimum time on trip
    public double calcMinT(double minT) {
        if (myTime < minT)
            minT = myTime;
        return minT;
    }
    
    //calculates maximum time on trip
    public double calcMaxT(double maxT) {
        if (myTime > maxT)
            maxT = myTime;
        return maxT;
    }
    
    //calculates minimum speed on trip
    public double calcMinS(double minS) {
        if (mySpeed < minS)
            minS = mySpeed;
        return minS;
    }
    
    //calculates maximum speed on trip
    public double calcMaxS(double maxS) {
        if (mySpeed > maxS)
            maxS = mySpeed;
        return maxS;
    }
    
    //calculates average distance on trips
    public double calcTotD(double sum) {
        sum += myDist;
        return sum;
    }
    
    //calculates average time on trips
    public double calcTotT(double sum) {
        sum += myTime;
        return sum;
    }
     
    //calculates average speed on trips
    public double calcTotS(double sum) {
        sum += mySpeed;
        return sum;
    }
    
    //returns String
    public String toString()
    {
        return String.format("%13.2f%15.2f%15.3f", getDist(), getTime(), getSpeed());
    }
       	
   }