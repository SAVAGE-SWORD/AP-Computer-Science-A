/**
 * @purpose To test CO2FromWaste class. An ArrayList with 6 objects is created and the 
 * methods are called. The results are then printed in a table.
 * @author Paul Chafetz
 * @version 1/6/2019
 */
import java.util.ArrayList;
public class CO2FromWasteTester
{
   public static void main(String[] args)
   {
       //creates ArrayList and has 6 households objects within it
       ArrayList<CO2FromWaste> households = new ArrayList<CO2FromWaste>();
       households.add(new CO2FromWaste(3, false, false, false, false));
       households.add(new CO2FromWaste(4, true, true, true, true));
       households.add(new CO2FromWaste(2, true, true, false, false));
       households.add(new CO2FromWaste(1, false, false, true, true));
       households.add(new CO2FromWaste(3, true, true, true, false));
       households.add(new CO2FromWaste(5, true, false, true, false));
       
       //calls methods for each object in households
       for (CO2FromWaste data : households)
       {
           data.calcGrossWasteEmission();
           data.calcWasteReduction();
           data.calcNetWasteReduction();
       }
       
       CO2FromWaste dataRecord; //creates a new dataRecord object
       
       //print results in table format
       System.out.println("----------------------------------------------------------------------------------------------------");
       System.out.println("|       |        |       Household Waste Recycled          |             Pounds of CO2             |");
       System.out.println("|       |        |          |          |         |         |   Total    |             |     Net    |");
       System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");
       for(int index = 0; index < households.size(); index ++)
       {
           dataRecord = households.get(index);
           System.out.printf("%-4s%s%4s%s%s%9.1f%4s%9.1f%5s%9.1f%4s%n", "|", index, "|", households.get(index), "|", dataRecord.getEmissions(), "|", dataRecord.getReduction(), "|", dataRecord.getNetEmissions(), "|");
       }
       System.out.println("----------------------------------------------------------------------------------------------------");
   }
}

