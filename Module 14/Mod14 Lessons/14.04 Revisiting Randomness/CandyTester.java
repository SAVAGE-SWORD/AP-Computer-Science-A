/**
 * This program tabulates the color frequencies
 * in bags of M&M's candies.
 *
 * @author Alan Turing
 * @version 06/14/17
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CandyTester
{
    public static void main(String [] args) throws IOException
    {
        Candy candy = new Candy();

        // The candyColor method assigns color names to an array
        candy.candyColor();

        // Read raw data from text file and find totals for each color
        candy.readFile();

        // The colorFrequency method to calculate the percentage of each color.
        // Note to students: Complete the calculation for this method.
        candy.colorFrequency();

        // Display the data table showing colors, totals, and percentages
        candy.printTotals();
    }
}
