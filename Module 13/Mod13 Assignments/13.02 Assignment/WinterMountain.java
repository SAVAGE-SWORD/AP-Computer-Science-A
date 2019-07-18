
/**
 * Returns information about the winter mountains from Mountain
 *
 * @author Paul Chafetz
 * @version 3/17/2019
 */
public class WinterMountain extends Mountain
{
    private double myTemp;

    /**
     * Constructor for objects of class WinterMountain
     */
    public WinterMountain(int l, int w, int mountains, double temp)
    {
        // initialize instance variables
        super(l, w, mountains);
        myTemp = temp;
    }

    /**
     * @return the temperature in the mountains
     */
    public double getTemp()
    {
        return myTemp;
    }
}
