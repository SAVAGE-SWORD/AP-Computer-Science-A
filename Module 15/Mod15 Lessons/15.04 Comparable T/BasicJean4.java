
/**
 * This class is an abstract class defining a
 * a basic pair of jeans and defines a
 * compareTo method based on pant size.
 *
 * @author Herman Hollerith
 * @version 06/15/17
 */

public abstract class BasicJean4 implements Comparable<BasicJean4>
{
    // instance variables
    private int numPockets;
    private int pantSize;

    // Constructor for the abstract class BasicJean
    public BasicJean4(int numPockets, int pantSize)
    {
        // initialize instance variables
        this.numPockets = numPockets;
        this.pantSize = pantSize;
    }

    public abstract void design();

    public int compareTo(BasicJean4 obj)
    {
        if(pantSize < obj.pantSize)
            return -1;
        else if(pantSize == obj.pantSize)
            return 0;
        else
            return 1;
    }

    public int getNumPockets()
    {
        return numPockets;
    }

    public void setNumPockets(int n)
    { 
        numPockets = n;
    }

    public int getSize()
    {
        return pantSize;
    }
}
