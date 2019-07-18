
/**
 * Displays the average temperature and the annual precipitation for a city.
 *
 * Paul Chafetz
 * 11/24/2018
 */
import java.util.Scanner;
public class AnnualWeatherV2
{
    public static void main(String [] args)
    {  
        //declare all necessary classes
        Scanner in = new Scanner(System.in);

        //declare all variables
        String tempScale = "";
        String precScale = "";
        String[] months = {"Jan.","Feb.","Mar.","Apr.","May.","Jun.","Jul.","Aug.","Sep.","Oct.","Nov.","Dec."};
        String location = "Miami, Florida"; //comment out to test 2nd data set
        double[] tempF = {68.1,69.1,72.4,75.7,79.6,82.4,83.7,83.6,82.4,78.8,74.4,69.9}; //comment out to test 2nd data set
        double[] precIN = {1.9,2.1,2.6,3.4,5.5,8.5,5.8,8.6,8.4,6.2,3.4,2.2}; //comment out to test 2nd data set
        double[] tempC = new double[months.length];
        double[] precCM = new double[months.length];
        int n = 0;
        double temp = 0.0;
        double prec = 0.0;
        double sumTemp = 0;
        double sumPrec = 0;
        /* second set of data - comment out the three variables above marked with a comment
        String location = "Orlando, Florida";
        double[] tempF = {60.9,62.6,67.4,71.5,77.1,81.2,82.4,82.5,81.1,75.3,68.8,63.0};
        double[] precIN = {2.4,2.4,3.5,2.4,3.7,7.4,7.2,6.3,5.8,2.7,2.3,2.3};
        */
       
        //ask for temp and prec scales + error handlers
        System.out.println("\nHello, choose your preferred temperature scale: (F = Fahrenheit, C = Celsius)"); 

        while (!(tempScale.equalsIgnoreCase("F") || tempScale.equalsIgnoreCase("C"))) {
            tempScale = in.next();
            if (tempScale.equalsIgnoreCase("F"))
                System.out.println("You have chosen to measure in Fahrenheit.");
            else if (tempScale.equalsIgnoreCase("C"))
                System.out.println("You have chosen to measure in Celsius.");
            else {
                System.out.println("Sorry, that is not a choice. Please try again. (F/C)");
                tempScale = in.next();
            }
        }

        System.out.println("\nChoose your preferred precipitation scale: (IN = Inches, CM = Centimeters)");

        while (!(precScale.equalsIgnoreCase("IN") || precScale.equalsIgnoreCase("CM"))) {
            precScale = in.next();
            if (precScale.equalsIgnoreCase("IN"))
                System.out.println("You have chosen to measure in Inches.");
            else if (precScale.equalsIgnoreCase("CM"))
                System.out.println("You have chosen to measure in Centimeters.");
            else {
                System.out.println("Sorry, that is not a choice. Please try again. (IN/CM)");
                precScale = in.next();
            }
        }
                 
        //calculates sum of temp and prec arrays in fahrenheit
        for (n = 0; n < months.length; n++) {
            temp = tempF[n];
            prec = precIN[n];
            if (tempScale.equalsIgnoreCase("C")) {
                tempC[n] = ((tempF[n]-32)*(5.0/9));
                temp = tempC[n];
            }
            if (precScale.equalsIgnoreCase("CM")) {
                precCM[n] = (precIN[n] * 2.54);
                prec = precCM[n];
            }
            sumTemp += temp;
            sumPrec += prec;
        }
        
        //begin display
        System.out.println("\n");
        System.out.printf("%35s%n", "Weather Data");
        System.out.printf("%17sLocation: %s%n", "", location);
        System.out.printf("Month%10sTemperature(" + tempScale.toUpperCase() + ")%10sPrecipitation(" + precScale.toUpperCase() + ")%s%n", "", "","");

        //shows the table with correct units
        for (n = 0; n < months.length; n++)
        {
            if (tempScale.equalsIgnoreCase("F") && precScale.equalsIgnoreCase("IN")) 
                System.out.printf(months[n] + "%15s%4.1f%22s%4.1f%n", "", tempF[n], "", precIN[n]);
            else if (tempScale.equalsIgnoreCase("F") && precScale.equalsIgnoreCase("CM"))
                System.out.printf(months[n] + "%15s%4.1f%22s%4.1f%n", "", tempF[n], "", precCM[n]);
            else if (tempScale.equalsIgnoreCase("C") && precScale.equalsIgnoreCase("IN"))
                System.out.printf(months[n] + "%15s%4.1f%22s%4.1f%n", "", tempC[n], "", precIN[n]);
            else if (tempScale.equalsIgnoreCase("C") && precScale.equalsIgnoreCase("CM"))
                System.out.printf(months[n] + "%15s%4.1f%22s%4.1f%n", "", tempC[n], "", precCM[n]);
        }   

        //declares/defines average temp and shows ave temp and total prec
        double aveTemp = (sumTemp/(double)tempF.length);
        System.out.printf("%n%10sAverage: %4.1f%13sAnnual: %5.1f", "", aveTemp, "", sumPrec);
        System.out.println("\n\n\n(Certain values are subject to rounding and may differ from actual values)");      
       }
}