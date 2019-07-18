
/**
 * Returns information about the forests from Terrain
 *
 * @author Paul Chafetz
 * @version 3/17/2019
 */
public class Forest extends Terrain
{
    private int myTrees;

    /**
     * Constructor for objects of class Forest
     */
    public Forest(int l, int w, int trees)
    {
        // initialize instance variables
        super(l, w);
        myTrees = trees;
    }

    /**
     * @return the number of trees
     */
    public int getTrees()
    {
        return myTrees;
    }
}
