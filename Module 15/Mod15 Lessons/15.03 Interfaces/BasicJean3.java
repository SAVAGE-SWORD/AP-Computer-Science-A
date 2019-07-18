
/**
 * This class is an abstract class defining a 
 * a basic pair of jeans
 *
 * @author Herman Hollerith
 * @version 06/15/17
 */

public abstract class BasicJean3
{
    // instance variables
    private int numPockets;

    // Constructor for the abstract class BasicJean
    public BasicJean3(int numPockets)
    {
        // initialize instance variables
        this.numPockets = numPockets;
    }

    public abstract void design();

    public int getNumPockets()
    {
        return numPockets;
    }

    public void setNumPockets(int numPockets)
    {
        this.numPockets = numPockets;
    }
}
