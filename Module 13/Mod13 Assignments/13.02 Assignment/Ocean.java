
/**
 * Returns information about the oceans from Terrain
 *
 * @author Paul Chafetz
 * @version 3/17/2019
 */
public class Ocean extends Terrain
{
    private int myFish;

    /**
     * Constructor for objects of class Ocean
     */
    public Ocean(int l, int w, int fish)
    {
        // initialize instance variables
        super(l, w);
        myFish = fish;
    }

    /**
     * @return the number of fish
     */
    public int getFish()
    {
        return myFish;
    }
}
