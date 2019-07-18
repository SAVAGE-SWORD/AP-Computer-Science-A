
/**
 * The purpose of this program is to demonstrate the use of several 
 * methods of the String class.
 * 
 * @author Ada Lovelace
 * @version 06/03/17
 */
public class StringPractice
{
    public static void main(String[ ] args)
    {
        //determine the length of the String object called oldString
        String oldString = "To be, or not to be: that is the question.";
        System.out.println("Old string: " + oldString);
        System.out.println();

        int stringLength = oldString.length();
        System.out.println("Number of characters: " + stringLength);
        System.out.println();

        //find the location of characters within the String object
        int indexOfComma = oldString.indexOf(",");
        System.out.println("Index of the comma: " + indexOfComma);
        int indexOfNot = oldString.indexOf("NOT");
        System.out.println("Index of NOT: " + indexOfNot);
        System.out.println();

        //split the String object and reassemble in reverse
        int halfwayPoint = stringLength / 2;
        String firstHalf = oldString.substring(0, halfwayPoint);
        String secondHalf = oldString.substring(halfwayPoint);
        String splitString = secondHalf + " - " + firstHalf;
        System.out.println("Split string: " + splitString);
        System.out.println();

        //replace characters within the String object
        String replaceChars = oldString.replace("to", "2");
        replaceChars = replaceChars.replace("be", "b");
        System.out.println("Replacement characters: " + replaceChars);
        System.out.println();

        //remove all the vowels from the String object.
        String newString1 = oldString.replaceAll("[aeiou]", "");
        System.out.println("New string: " + newString1);
        System.out.println();

        //move first word to the end of the string object
        int positionOfSpace = oldString.indexOf(' ');
        String substring1 = oldString.substring(0, positionOfSpace);
        String substring2 = oldString.substring(positionOfSpace + 1);
        String newString2 = substring2 + " " + substring1;
        System.out.println("New substring: " + newString2);
        System.out.println();
    }//end of main method
}//end of class
