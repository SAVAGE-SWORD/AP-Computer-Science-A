/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author (enter your name)
 * @version (enter today's date)
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "  My favorite food is ice cream.  ";

        System.out.println("sample.trim() = " + sample.trim());
        System.out.println("sample.length() = " + sample.length());
        System.out.println("sample.indexOf(\"food\") = " + sample.indexOf("food"));
        System.out.println("sample.indexOf(\"is\", 4) = " + sample.indexOf("is", 4));
        System.out.println("sample.substring(5, 10) = " + sample.substring(5, 10));
        System.out.println("sample.substring(14) = " + sample.substring(14));
        System.out.println("sample.compareTo(\"  My favorite food is chocolate.  \") = " + sample.compareTo("  My favorite food is chocolate.  "));
        System.out.println("sample.charAt(5) = " + sample.charAt(5));

    }

}
