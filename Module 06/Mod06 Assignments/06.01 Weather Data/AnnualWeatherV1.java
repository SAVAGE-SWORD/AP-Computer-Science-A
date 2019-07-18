
/**
 * displays the average temperature and the annual precipitation for a city.
 *
 * Paul Chafetz
 * 11/23/2018
 */
public class AnnualWeatherV1
{
    public static void main(String [] args)
    {   
        //declare all variables
        String location =  "Miami, Florida";
        String[] months = {"Jan.","Feb.","Mar.","Apr.","May","Jun.","Jul.","Aug.","Sep.","Oct.","Nov.","Dec."};
        double[] miamiTemp = {68.1,69.1,72.4,75.7,79.6,82.4,83.7,83.6,82.4,78.8,74.4,69.9};
        double[] miamiPrec = {1.9,2.1,2.6,3.4,5.5,8.5,5.8,8.6,8.4,6.2,3.4,2.2};
        int n = 0;
        double sumTemp = 0;
        double sumPrec = 0;
        
        //calculates sum of temp and prec arrays
        for (n = 0; n < months.length; n++)
            {
                double temp = miamiTemp[n];
                sumTemp += temp;
            }
        for (n = 0; n < months.length; n++)
            {
                double prec = miamiPrec[n];
                sumPrec += prec;
            }
        
        //begin display
        System.out.println();
        System.out.println("                    Weather Data");
        System.out.println("               Location: "+ location);
        System.out.println("\nMonth\t         Temperature(F)\t     Precipitation(in.)\n");
        
        //shows the table
        for (n = 0; n < months.length; n++)
            {
                System.out.println(months[n] + "\t         " + miamiTemp[n] + "\t             " + miamiPrec[n]);
            }
        
        //declares/defines average temp and shows ave temp and total prec
        double aveTemp = (sumTemp/(double)miamiTemp.length);        
        System.out.println("\nAverage Temperature: " + aveTemp + " degress Fahrenheit");
        System.out.println("Annual Precipitation: " + sumPrec + " inches");
    }
}