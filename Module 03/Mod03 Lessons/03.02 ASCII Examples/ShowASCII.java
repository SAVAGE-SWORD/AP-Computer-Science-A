
/**
 * This program prints the ASCII characters that correspond to ASCII values, and
 * prints the ASCII values that correspond to specific ASCII characters.
 * 
 * Notice that (int) is used to cast a character literal to its corresponding ASCII value, and
 * that (char) is used to cast an ASCII value to its corresponding character literal.
 * 
 * @Ada Lovelace       (replace with your name)
 * @version 06/03/17   (replace with today's date)
 */
public class ShowASCII
{
    public static void main(String[ ] args)
    {   
        char letterA = 'A';
        char aDash = '-';
        char blankSpace = ' '; //there is a blank space between the quotes
        char eighthDigit = '8';
        System.out.println(letterA);
        System.out.println(aDash);
        System.out.println(blankSpace);
        System.out.println(eighthDigit);
        
        // cast a character literal to its integer ASCII value
        System.out.println("The ASCII code for " + 'A' + " is " + (int)'A');
        System.out.println("The ASCII code for " + '9' + " is " + (int)'9');
        System.out.println();
        
        // cast an integer ASCII value to its corresponding character literal
        System.out.println("93 is the ASCII code for " + (char)93);
        System.out.println("173 is the ASCII code for " + (char)173);
        System.out.println();
        
        // concatenate characters to form a message
        System.out.println("My message: " + (char)72 + (char)105 + (char)33);
        
    }//end of main method
}//end of class
