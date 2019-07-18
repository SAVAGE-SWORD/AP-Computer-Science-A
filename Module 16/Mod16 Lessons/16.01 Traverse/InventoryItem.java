
 /**
 * This class defines an InventoryItem object.
 *
 * @author Jean E. Sammet
 * @version 06/16/17
 */

public class InventoryItem
{
    // instance variables
    private int inStock;
    private String name;

    // Constructor for objects of class InventoryItem
    public InventoryItem(String name, int inStock)
    {
        // initialize instance variables
        this.name = name;
        this.inStock = inStock;
    }
    
    public int getNumInStock()
    {
        return inStock;
    }
    
    public void setStock(int num)
    {
        inStock = num;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        return name + ": " + inStock + " in stock";
    }
}
