/**
 * Calculate approximations of pi using using a dartboard simulation.
 * There are mutator method and getter methods for each private instance variable.
 *
 * @author Paul Chafetz
 * @version 1/7/2019
 */
public class EstimatePiV2
{
    private int myHits, myDarts,totalHits, totalDarts;
    private double myX, myY, estPi, totalPi;
    
    /**
     * Constructor for EstimatePi. Only darts is needed in the object and formal parameter list.
     * @param myDarts darts thrown at dartboard in a trial
     * @param myHits hits in dartboard out of darts thrown
     * @param estPi estimated pi using mHits and myDarts
     * @param totalHits total hits among all trials
     * @param totalDarts total darts among all trials
     * @param totalPi total pi among all trials
     * @param myX random x coordinate
     * @param myY random x coordinate
     */
    public EstimatePiV2(int darts)
    {
        myDarts = darts; 
        //the only parameter needed in the object is how many darts are thrown
        //everything else is either random or is calculated from the methods
        myHits = 0;
        estPi = 0;
        totalHits = 0;
        totalDarts = 0;
        totalPi = 0;
        myX = (2 * Math.random() - 1);
        myY = (2 * Math.random() - 1);
    }
    
    /**
     * Mutator method that creates random x and y values (no params).
     * Postcondition: myX and myY will be a random value between -1 and 1
     */
    public void setRandom() {
        myX = (2 * Math.random() - 1);
        myY = (2 * Math.random() - 1); 
        //There is no getMyX or getMyY method, as they only need to be set, not gotten
    }
    
    /**
     * Mutator method to calculate the number of darts that hit the dartboard (no params).
     * Postcondition: myHits will always be less than myDarts.
     */
    public void setHits() {
        myHits = 0;
        for (int i = 0; i < myDarts; i++) {
            setRandom();
            if (Math.pow(myX, 2) + Math.pow(myY, 2) <= 1) { //radius is always 1
                myHits++;
            }
        }
    }
    
    /**
     * Mutator method to estimate pi using the formula pi = 4 * hits / darts (no params).
     * Postcondition: The estimated pi should be close to the actual value 
     * of pi, 3.14159... depending on value of myDarts and trials.
     */
    public void setEstPi() {
        estPi = 4 * myHits / (double)myDarts;
    }
    
    /**
     * Mutator method to set the total hits (no params).
     * Postcondition: totalHits should reflect all trials and objects
     */
    public void setTotalHits() {
        totalHits = 0;
        totalHits += myHits;
    }
    
    /**
     * Mutator method to set the total darts (no params).
     * Postcondition: totalDarts should reflect all trials and objects.
     */
    public void setTotalDarts() {
        totalDarts = 0;
        totalDarts += myDarts;
    }
    
    /**
     * Mutator method to set the total pi (no params).
     * Postcondition: totalPi should reflect all trials and objects.
     */
    public void setTotalPi() {
        totalPi = 0;
        totalPi += estPi;
    }
    
    /**
     * Getter method to get myHits (no params).
     */
    public int getMyHits() {
        return myHits;
    }
    
    /**
     * Getter method to get myDarts (no params).
     */
    public int getMyDarts() {
        return myDarts;
    }
    
    /**
     * Getter method to get estPi (no params).
     */
    public double getEstPi() {
        return estPi;
    }
    
    /**
     * Getter method to get totalHits (no params). 
     */
    public int getTotalHits() {
        return totalHits;
    }
    
    /**
     * Getter method to get totalDarts (no params).
     */
    public int getTotalDarts() {
        return totalDarts;
    }
    
    /**
     * Getter method to get TotalPi (no params).
     */
    public double getTotalPi() {
        return totalPi;
    }
    
    /**
     * toString method to print object (no params).
     */
    public String toString() {
        return String.format("%12d%11d%16.5f%n", getMyHits(), getMyDarts(), getEstPi());
    }
}
