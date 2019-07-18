
/**
 * The TestInventory2 class demonstrations traversing an ArrayList.
 *
 * @author Jean E. Sammet
 * @version 06/16/17
*/
import java.util.*;
public class TestInventory2
{
    public static void main(String[] args)
    {
        List<InventoryItem> inventory = new ArrayList<InventoryItem>();
        
        // create inventory
        inventory.add( new InventoryItem("Towel", 200));
        inventory.add( new InventoryItem("Cleaning Cart", 30));        
        inventory.add( new InventoryItem("Toiletry Sets", 100));
        inventory.add( new InventoryItem("Coffee Set", 300));
        inventory.add( new InventoryItem("Pillows", 50));    
        
        System.out.println("        Inventory List        ");
        System.out.println("______________________________");
        printInventory(inventory);
        
        System.out.println();
        System.out.println();
        System.out.println("The item with the largest quantity is:");
        findLargest(inventory);
    }
    
    public static void printInventory(List<InventoryItem> itemList) 
    {
        for(InventoryItem item: itemList)
           System.out.println(item);
    }
    
    public static void findLargest(List<InventoryItem> itemList)
    {
        double max;
        int index;

        if (itemList.size() != 0)
        {
            max = itemList.get(0).getNumInStock();
            index = 0;

            for (int i = 1; i < itemList.size(); i++)
            {
                if (max < itemList.get(i).getNumInStock())
                {
                    max = itemList.get(i).getNumInStock();
                    index = i;
                }
            }
            System.out.println(itemList.get(index));
            return;
        }
        System.out.println("There are no items in stock.");
    }
}
