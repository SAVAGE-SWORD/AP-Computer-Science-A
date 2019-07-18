/**
 * @purpose This program calculates the amount of carbon dioxide produced in a 
 * year from waste by a household and compare how recycling can reduce the 
 * CO2 footprint.
 * @author Paul Chafetz
 * @version 1/6/2019
 */
public class CO2FromWaste
{
   private int myNumPeople;
   private boolean myPaper, myPlastic, myGlass, myCans;
   private double myEmissions, myReduction, myNetEmissions;

   /**
    * Constructor for objects of type CO2FromWaste
    * @param numPeople number of people in a household
    * @param paper whether or not paper is recycled
    * @param plastic whether or not plastic is recycled
    * @param glass whether or not glass is recycled
    * @param cans whether or not cans are recycled
    */
   CO2FromWaste(int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans)
   {
       myNumPeople = numPeople;
       myPaper = paper;
       myPlastic = plastic;
       myGlass = glass;
       myCans = cans;
       myEmissions = 0;
       myReduction = 0;
       myNetEmissions = 0;
   }

   /**
    * Mutator method to calculate the total emissions, without any recycling (no parameters)
    * Each person accounts for 1018 pounds of emissions, without recycling
    */
   public void calcGrossWasteEmission()
   {
       myEmissions = (1018 * myNumPeople);
   }

   /**
    * Mutator method to calculate the emission reduction from recycling (no parameters)
    * 184 pounds if paper, 25.6 if plastic, 46.6 if glass, and 165.8 if cans
    */
   public void calcWasteReduction()
   {
       if (myPaper)
            myReduction += (184.0 * myNumPeople);
       if (myPlastic)
            myReduction += (25.6 * myNumPeople);
       if (myGlass)
            myReduction += (46.6 * myNumPeople);
       if (myCans)
            myReduction += (165.8 * myNumPeople);
   }

   /**
    * Mutator method to calculate the net emissions (no parameters)
    */
   public void calcNetWasteReduction()
   {
       myNetEmissions = (myEmissions - myReduction);
   }

   /**
    * Getter method to return the number of people (no parameters)
    * @return the number of people in the household
    */
   public int getNumPeople()
   {
       return myNumPeople;
   }

   /**
    * Getter method to return paper's recycled status (true or false) (no parameters)
    * @return if the household recycles paper
    */
   public boolean getPaper()
   {
       return myPaper;
   }

   /**
    * Getter method to return glass's recycled status (true or false) (no parameters)
    * @return if the household recycles glass
    */
   public boolean getGlass()
   {
       return myGlass;
   }

   /**
    * Getter method to return plastic's recycled status (true or false) (no parameters)
    * @return if the household recycles plastic
    */
   public boolean getPlastic()
   {
       return myPlastic;
   }

   /**
    * Getter method to return cans' recycled status (true or false) (no parameters)
    * @return if the household recycles cans
    */
   public boolean getCans()
   {
       return myCans;
   }

   /**
    * Getter method to return the total emissions (no parameters)
    */
   public double getEmissions()
   {
       return myEmissions;
   }

   /**
    * Getter method to return the reduction amount (no parameters)
    */
   public double getReduction()
   {
       return myReduction;
   }

   /**
    * Getter method to return the net emissions (no parameters)
    */
   public double getNetEmissions()
   {
       return myNetEmissions;
   }
   
   /**
    * toString method to print object (no parameters)
    */
   public String toString()
   {
       return String.format("%4d%5s%2s%-8b%-4s%-7b%-3s%-7b%-3s%-7b", myNumPeople, "|", "", myPaper, "|", myPlastic, "|", myGlass, "|", myCans);
   }
}