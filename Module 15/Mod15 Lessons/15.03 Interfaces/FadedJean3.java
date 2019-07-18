
/**
 * This class defines a FadedJean object that
 * extends a basic pair of jeans and
 * implements the JeanEffects interface.
 *
 * @author Herman Hollerith
 * @version 06/15/17
 */

public class FadedJean3 extends BasicJean3 implements JeanEffects3
{
    // instance variables
    private String fadeLocation;

    // Constructor for objects of class FadedJean
    public FadedJean3(int numPocket, String loc)
    {
        // initialize instance variables
        super(numPocket);
        fadeLocation = loc;
    }

    public void design()
    {
        fadeJeans(fadeLocation);
    }

    public void fadeJeans(String loc)
    {
        fadeLocation = loc;
    }

    public void addHoles(String loc)
    {
        // do nothing
    }

    public String toString()
    {
        return "This pair of jeans has " + getNumPockets() + " pockets" 
        + "\n and has faded " + fadeLocation + ".";
    }
}