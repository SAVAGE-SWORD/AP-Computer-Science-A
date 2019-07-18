
 /**
 * This class BeadedJean is a BasicJean with beads designed in a pattern.
 *
 * @author Herman Hollerith
 * @version 06/15/17
 */

public class BeadedJean1 extends BasicJean1
{
    // instance variables
    private int numBeads;
    private String pattern;

    /**
     * Constructor for objects of class BeadedJean
     */
    public BeadedJean1(int numPockets, int numBeads)
    {
        // initialize instance variables
        super(numPockets);
        this.numBeads = numBeads;
        this.pattern = "none";
    }

    public void design()
    {
        if(numBeads <= 10)
            pattern = "circle";
        else if(numBeads <= 20)
            pattern = "heart";
        else if(numBeads <= 30)
            pattern = "spiral";
        else 
            pattern = "random";
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
        return "This pair of Jeans uses " + numBeads + " beads in a " 
                + pattern + " pattern.";
    }
}

