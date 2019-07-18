
/**
 * Displays information about hurricanes from a file and then categorizes and calculates values accordingly.
 *
 * Paul Chafetz
 * 11/25/2018
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
public class HurricaneSelector
{
    public static void main(String [] args) throws IOException
    {  
        //declare all necessary classes
        Scanner in = new Scanner(System.in);
        Scanner inFile = new Scanner(new File("HurricaneData.txt"));
        PrintWriter outFile = new PrintWriter(new File("statistics.txt"));

        //declare all variables
        int initial = 0;
        int end = 0;
        int year = 0;
        int pressure = 0;
        int speedkn = 0; //1 kn = 1.1507794 mph
        int category = 0;
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;
        int totPressure = 0;
        int sumCat = 0;
        int sumSpeed = 0;
        int sumPressure = 0;
        int catMin = Integer.MAX_VALUE;
        int catMax = Integer.MIN_VALUE;
        double speedMin = Integer.MAX_VALUE;
        double speedMax = Integer.MIN_VALUE;
        double pressureMin = Integer.MAX_VALUE;
        double pressureMax = Integer.MIN_VALUE;
        double aveCat = 0;
        double aveSpeed = 0;
        double avePressure = 0;
        double speedmph = 0;
        String month = "";
        String name = "";
        String all = "";
        int[] years = new int[156];
        int[] pressures = new int[156];
        int[] categories = new int[156];
        double[] speedsmph = new double[156];
        String[] months = new String[156];
        String[] names = new String[156];

        //store each group of data to its respective array
        while (inFile.hasNext()) {
            for (int i = 0; i < years.length; i++) {
                year = inFile.nextInt();
                years[i] = year;
                month = inFile.next();
                months[i] = month;
                pressure = inFile.nextInt();
                pressures[i] = pressure;
                speedkn = inFile.nextInt(); //no need to store speedkn into array
                speedmph = speedkn * 1.15077944802354; //just convert kn to mph
                speedsmph[i] = speedmph; //now store the mph as a double array
                name = inFile.next();
                names[i] = name;
            }
        }
        inFile.close();

        //intro + ask for the date range + error handler
        System.out.println("Hello, this program will display data for hurricanes in a certain year range.\n");
        System.out.println("Please select an initial date. (1995-2015)");
        initial = in.nextInt();
        while (initial < 1995 || initial > 2015) {
            System.out.println("Sorry, that is not a valid date. Please try again.");
            initial = in.nextInt();
        }
        System.out.println("\nNow please select an end date. (" + initial + "-2015)");
        end = in.nextInt();
        while ((end < 1995 || end > 2015) || initial > end) {
            System.out.println("Sorry, that is not a valid date. Please try again.");
            end = in.nextInt();
        }
        System.out.println("Therefore, the date range you have chosen is from " + initial + " to " + end + ".\n\n");

        //determine categories based on wind speeds and assign to categories array
        for (int i = 0; i < years.length; i++) {
            if (years[i] >= initial && years[i] <= end)  {
                if (speedsmph[i] >= 74 && speedsmph[i] <= 95) {
                    category = 1;
                    sumCat += category;
                    cat1++;
                }
                else if (speedsmph[i] >= 96 && speedsmph[i] <= 110) {
                    category = 2;
                    sumCat += category;
                    cat2++;
                }
                else if (speedsmph[i] >= 111 && speedsmph[i] <= 129) {
                    category = 3;
                    sumCat += category;
                    cat3++;
                }
                else if (speedsmph[i] >= 130 && speedsmph[i] <= 156) {
                    category = 4;
                    sumCat += category;
                    cat4++;
                }
                else if (speedsmph[i] >= 157) {
                    category = 5;
                    sumCat += category;
                    cat5++;
                }
                else
                    System.out.println("Sorry, that wind speed does not classify as a hurricane.");
                categories[i] = category;
                sumSpeed += speedsmph[i];
            }
        }

        //calculate average category, wind speed, and pressure
        for (int i = 0; i < years.length; i++) {
            if (years[i] >= initial && years[i] <= end)  {
                sumPressure += pressures[i];
                totPressure++;
            }
        }
        aveCat = ((double)sumCat / (cat1 + cat2 + cat3 + cat4 + cat5));
        aveSpeed = ((double)sumSpeed / (cat1 + cat2 + cat3 + cat4 + cat5));
        avePressure = ((double)sumPressure / totPressure);

        //min and max
        for (int i = 0; i < years.length; i++)
            if (years[i] >= initial && years[i] <= end)  {
                if(categories[i] < catMin)
                    catMin = categories[i];
                if(categories[i] > catMax)
                    catMax = categories[i];
                if(speedsmph[i] < speedMin)
                    speedMin = speedsmph[i];
                if(speedsmph[i] > speedMax)
                    speedMax = speedsmph[i];
                if(pressures[i] < pressureMin)
                    pressureMin = pressures[i];
                if(pressures[i] > pressureMax)
                    pressureMax = pressures[i];    
            }

        //display table (finally!)
        System.out.printf("%22sHurricanes from " + initial + " - " + end, "");
        System.out.printf("%n%nYear%6sHurricane%6sCategory%6sPressure (mb)%6sWind Speed (mph)%n","","","","");

        for (int i = 0; i < years.length; i++) {
            if (years[i] >= initial && years[i] <= end)
                System.out.printf("%n%d%6s%-10s%6s%3d%6s%11d%6s%16.2f", years[i], "", names[i], "", categories[i], "", pressures[i], "", speedsmph[i]);
        }

        //show averages, mins, and maxes, and total categories
        System.out.printf("%n%nAverage: %14s%8.1f%8s%9.1f%6s%14.2f", "", aveCat, "", avePressure, "", aveSpeed);
        System.out.printf("%nMinimum: %14s%6d%8s%11.1f%6s%14.2f", "", catMin, "", pressureMin, "", speedMin);
        System.out.printf("%nMaximum: %14s%6d%8s%11.1f%6s%14.2f", "", catMax, "", pressureMax, "", speedMax); 
        System.out.println("\n\nCategory Counts:");
        System.out.println("  Category 1: " + cat1);
        System.out.println("  Category 2: " + cat2);
        System.out.println("  Category 3: " + cat3);
        System.out.println("  Category 4: " + cat4);
        System.out.println("  Category 5: " + cat5);

        //write data to outFile
        //since character spacing is not the same in notepad, data will not be neat.. :(
        System.out.println("\n\n\tWould you like to write your hurricane data to statistics.txt? (Y/N)");
        all = in.next();
        System.out.println("\n\t\t    Data is being written to statistics.txt");
        outFile.printf("%22sHurricanes from " + initial + " - " + end, "");
        outFile.printf("%n%nAverage: %14s%8.1f%8s%9.1f%6s%14.2f", "", aveCat, "", avePressure, "", aveSpeed);
        outFile.printf("%nMinimum: %14s%6d%8s%11.1f%6s%14.2f", "", catMin, "", pressureMin, "", speedMin);
        outFile.printf("%nMaximum: %13s%6d%8s%11.1f%6s%14.2f%n", "", catMax, "", pressureMax, "", speedMax); 
        outFile.println("\nCategory Counts:");
        outFile.println("  Category 1: " + cat1);
        outFile.println("  Category 2: " + cat2);
        outFile.println("  Category 3: " + cat3);
        outFile.println("  Category 4: " + cat4);
        outFile.println("  Category 5: " + cat5);
        outFile.println("\n\n\n");
        if (all.equalsIgnoreCase("Y")) {
            for (int i = 0; i < years.length; i++) {
                if (years[i] >= initial && years[i] <= end)
                    outFile.printf("%n%d%6s%-10s%6s%3d%6s%11d%6s%16.2f", years[i], "", names[i], "", categories[i], "", pressures[i], "", speedsmph[i]);
            }
        }
        System.out.println("\t\t\t\t  Thank you!");
        outFile.close();
        
        /*
        //debug: shows all values of each array
        for (int i : years)
        System.out.println(i);
        String test = in.next();
        for (String i : months)
        System.out.println(i);
        test = in.next();    
        for (int i : pressures)
        System.out.println(i);
        test = in.next();    
        for (double i : speedsmph)
        System.out.println(i);
        test = in.next();
        for (int i : categories)
        System.out.println(i);
        test = in.next();
        for (String i : names)
        System.out.println(i);
        */
    }
}