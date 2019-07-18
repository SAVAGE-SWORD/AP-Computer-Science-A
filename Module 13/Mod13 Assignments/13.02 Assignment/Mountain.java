
/**
 * Returns information about the mountains from Terrain
 *
 * @author Paul Chafetz
 * @version 3/17/2019
 */
public class Mountain extends Terrain
{
    private int myMountains;

    /**
     * Constructor for objects of class Mountain
     */
    public Mountain(int l, int w, int mountains)
    {
        // initialize instance variables
        super(l, w);
        myMountains = mountains;
    }

    /**
     * @return number of moutains
     */
    public int getMountains()
    {
        return myMountains;
    }
}
