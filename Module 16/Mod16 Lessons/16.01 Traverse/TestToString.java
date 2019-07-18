 /**
 * This class demonstrates the toString method.
 *
 * @author Jean E. Sammet
 * @version 06/16/17
 */

class ComputerLanguage
{
    private String language;
    private double version;

    ComputerLanguage(String language, double version)
    {
        this.language = language;
        this.version = version;
    }

    public String toString()
    {
        return String.format("%-12s %5.2f", this.language, this.version);
    }
}

public class TestToString
{
    public static void main(String[] args)
    {
        ComputerLanguage example1 = new ComputerLanguage("Java", 8.0);
        ComputerLanguage example2 = new ComputerLanguage("Python", 3.1);
        
        System.out.println(" Computer Programming ");
        System.out.println("----------------------");
        System.out.println("Language     Version");

        System.out.println(example1); //uses toString() method
        System.out.println(example2); //uses toString() method
    }
}
