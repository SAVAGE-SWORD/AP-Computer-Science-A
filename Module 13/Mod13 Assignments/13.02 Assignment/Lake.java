
/**
 * Returns information about the lakes from Ocean
 *
 * @author Paul Chafetz
 * @version 3/17/2019
 */
public class Lake extends Ocean
{
    private int myAnimals;

    /**
     * Constructor for objects of class Lake
     */
    public Lake(int l, int w, int animals)
    {
        // initialize instance variables
        super(l, w, animals);
        myAnimals = animals;
    }

    /**
     * @return the number of animals in/by the lake
     */
    public int getAnimals()
    {
        return myAnimals;
    }
}
