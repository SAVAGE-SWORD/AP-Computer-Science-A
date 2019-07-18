/**
 * This class instantiates the CO2FootprintV2 object with three 
 * private instance variables. It contains mutator methods to calculate and 
 * convert the number of gallons of gas used into tons and pounds units of 
 * CO2 produced. It contains getter methods for each private instance 
 * variable. Private instance variables include myGallonsUsed, myTonsCO2, and 
 * myPoundsCO2.
 *
 * @author Paul Chafetz
 * @version 1/6/2019
 */
public class CO2FootprintV2
{
    //declaration of private instance variables
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;
    //gallons used, tons of CO2 produced, pounds of CO2 produced

    /**
     * Constructor for CO2FootprintV1 objects
     * @param gallons number of gallons used
     * Precondition: gallons is a nonnegative value
     */
    CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
    }

    /**
     * Mutator method to calculate and convert the gallons used into 
     * the tons of CO2 (no params).
     * Precondition: 8.78E-3 tons of CO2 are emitted per gallon of gas.
     * Postcondition: The value of myTonsCO2 will always be less than 
     * myGallonsUsed.
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
     * Mutator method to convert the tons of CO2 into pounds(no params).
     * Precondition: There are 2205 pounds per metric ton.
     * Postcondition: The value of myPoundsCO2 will always be greater than 
     * myTonsC02.
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the value of the gallons used (no params).
     * @return the gallons used.
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
     * Getter method to return the value of the tons of CO2 produced (no params).
     * @return the tons of CO2 produced
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * Getter method to return the value of the pounds of CO2 produced (no params).
     * @return the pounds of CO2 produced
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}