/**
 * To test the CO2FootprintV2 class.
 * 
 * The object, CO2FootprintV2, is created to hold a private instance variable, 
 * gallonsOfGas
 *
 */
public class CO2FootprintV2Tester
{
    public static void main(String[] args)
    {
        double gallonsOfGas = 2410; //declare variable
        
        //invoke constructor with parameter gallonsOfGas
        CO2FootprintV2 footprint = new CO2FootprintV2(gallonsOfGas);
        
        //call methods
        footprint.calcTonsCO2();
        footprint.convertTonsToPounds();
        
        //print results in a table format
        System.out.println("           CO2 Emissions");
        System.out.println("  Gallons   Pounds      Tons");
        System.out.println("  of Gas   from Gas   from Gas");
        System.out.println("  ****************************");
        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(),
                                                      footprint.getPoundsCO2(),
                                                      footprint.getTonsCO2());

        System.out.println();
    }
}