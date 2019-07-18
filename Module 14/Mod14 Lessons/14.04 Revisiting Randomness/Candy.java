/**
 * This class processes data related to M&M candies.
 *
 * @author Alan Turing
 * @version 06/14/17
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Candy
{
    private int [] candyColorCount = new int[6];
    private int totalCandies = 0;
    private double [] candyColorFreq = new double[6];
    private String [] candyColor = new String[6];

    public Candy()
    {
    }

    public void readFile() throws IOException
    {
        int color = 0;
        Scanner inFile = new Scanner(new File("MandMs.txt"));
        while(inFile.hasNext())
        {
            //color order = red, orange, yellow, green, blue, brown
            candyColorCount[0] += inFile.nextInt();
            candyColorCount[1] += inFile.nextInt();
            candyColorCount[2] += inFile.nextInt();
            candyColorCount[3] += inFile.nextInt();
            candyColorCount[4] += inFile.nextInt();
            candyColorCount[5] += inFile.nextInt();
        }
        inFile.close();

        // calculate the total number of candies
        for( int c : candyColorCount)
            totalCandies += c;
    }

    public void printTotals()
    {
    	System.out.println("  M & M Frequency Table");
    	System.out.println("Colors     Total   Percent");
    	System.out.println("--------------------------");
        for(int index = 0; index < candyColorCount.length; index++)
        {
            System.out.printf("%-10s %4d %9.2f \n", candyColor[index],
                                                    candyColorCount[index],
                                                    candyColorFreq[index]);
        }
    }

    //The candyColor method stores the colors of M&M's in an array
    //color order = red, orange, yellow, green, blue, brown
    public void candyColor()
    {
        String [] colors = {"red", "orange", "yellow", "green", "blue", "brown"};
        candyColor = colors;
    }

    // Calculate the percentages of each color
    // Note to students: Complete the calculation. Be mindful of integer division.
    public void colorFrequency()
    {
        for(int index = 0; index < candyColorCount.length; index++)
        {
            candyColorFreq[index] = candyColorCount[index]; // / (double)totalCandies * 100;
        }
    }
}