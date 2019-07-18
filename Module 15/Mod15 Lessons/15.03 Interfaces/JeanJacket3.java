
/**
 * This class defines a JeanJacket by implementing 
 *  the JeanEffect interface.
 *
 * @author Herman Hollerith
 * @version 06/15/17
 */

public class JeanJacket3 implements JeanEffects3
{
    // instance variables
    private int numBeads;
    private String pattern;
    private String holeLocation;
    private String fadeLevel;

    // Constructor for objects of class JeanJacket
    public JeanJacket3(int numBeads)
    {
        // initialize instance variables
        this.numBeads = numBeads;
        this.pattern = "none";
        this.holeLocation = "none";
        this.fadeLevel = "none";

    }

    public void design()
    {
        if (numBeads == 10)
            pattern = "circle";
        else if (numBeads == 20)
            pattern = "heart";
        else if (numBeads == 30)
            pattern = "spiral";
        else
            pattern = "random";
    }

    public void fadeJeans(String level)
    {
        fadeLevel = level;
    }

    public void addHoles(String loc)
    {
        holeLocation = loc;
    }

    public int getNumBeads()
    {
        return numBeads;
    }

    public String getPattern()
    {
        return pattern;
    }

    public String toString()
    {
        String out = "This jacket has " + numBeads + " beads in a " + pattern + " with "
            + "\na fade level of " + fadeLevel + " and holes in the " + holeLocation + ".";
        return out;
    }
}
