/**
 * Does a frequency analysis of all the letters in a given text.
 *
 * @author Paul Chafetz
 * @version 4/15/2019
 */
//Five score years ago, a great American, in whose symbolic shadow we stand, signed the Emancipation Proclamation.
//92 characters no spaces, no punctuation
//12a,1b,5c,3d,10e,1f,3g,3h,8i,0j,0k,2l,4m,7n,8o,2p,0q,5r,7s,5t,0u,1v,3w,0x,2y,0z
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class FreqAnalysis
{
    // instance variables
    private File inFile;
    private File outFile;
    private int total;
    private int[] counts;
    private double[] freq;
    private final String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q","r", "s", "t", "u", "v", "w", "x", "y", "z" };

    //all I need as parameters is the file to read and the file to write to
    public FreqAnalysis(File inFile, File outFile)
    {
        this.inFile = inFile;
        this.outFile = outFile;
        this.counts = new int[26]; //size of alphabet
        this.freq = new double[26];
    }

    //counts all uppercase and lowercase letters in a word
    public void countChars(String word)
    {
        for (int i = 0; i < word.length(); i++) {
            //check for lowercase and uppercase letters using ASCII table
            //subtract by 97 since counts[0] is for 'a' but 'a' is 97
            if (word.charAt(i) >= 97 && word.charAt(i) <= 122) {
                counts[word.charAt(i) - 97]++;   
                total++;
            }
            //subtract by 65 since counts[0] is for 'A' but 'A' is 65
            else if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                counts[word.charAt(i) - 65]++;
                total++;
            }
        }
    }

    //takes each word in the inFile and counts the number of letter characters
    public void readFile() throws IOException
    {
        String str = "";
        Scanner in = new Scanner(this.inFile);
        while (in.hasNext()) {
            str = in.next();
            countChars(str);
        }
        for (int i = 0; i < alphabet.length; i++)
            freq[i] = counts[i] / (double)total;
        in.close();
    }

    //prints results in table
    public void printTable()
    {
        System.out.printf("\n%12s%11s%14s%n", "Letter", "Counts", "Frequency");
        for (int i = 0; i < alphabet.length; i++)
            System.out.printf("%9s%12d%15.4f%n", alphabet[i], counts[i], freq[i]);
    }

    //writes the printed results in a table to a file
    public void writeFile() throws IOException
    {
        PrintWriter out = new PrintWriter(outFile);
        out.printf("\n%12s%11s%14s%n", "Letter", "Counts", "Frequency");
        for (int i = 0; i < alphabet.length; i++)
            out.printf("%9s%12d%15.4f%n", alphabet[i], counts[i], freq[i]);
        out.close();
    }
}
