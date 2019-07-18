
 /**
 * This class BeadedJean is a BasicJean with beads designed in a pattern
 * and implements an equals method.
 *
 * @author Herman Hollerith
 * @version 06/15/17
 */

public class BeadedJean4 extends BasicJean4
{
    // instance variables
    private int numBeads;
    private String pattern;

    // Constructor for objects of class BeadedJean
    public BeadedJean4(int numPockets, int numBeads, int pantSize)
    {
        // initialize instance variables
        super(numPockets, pantSize);
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
        return "This pair of size " + getSize() + " Jeans uses " + numBeads + " beads in a "
                + pattern + " pattern.";
    }

    public boolean equals(BeadedJean4 obj)
    {
        if( !(obj instanceof BeadedJean4))
            return false;
            
        BeadedJean4 j = (BeadedJean4)obj;
        
        if((compareTo(obj) == 0) && (pattern.equals(obj.pattern)))
            return true;
        else
            return false;
    }
}