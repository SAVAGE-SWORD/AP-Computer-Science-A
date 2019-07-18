
 /**
 * The TestInventory4 class demonstrations replacing
 * elements within an ArrayList.
 *
 * @author Jean E. Sammet
 * @version 06/16/17
 */
import java.util.*;
public class TestInventory4
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

        System.out.println("   Inventory List (before change) ");
        System.out.println("______________________________");
        System.out.println();
        printInventory(inventory);
        System.out.println();
        System.out.println();

        changeItem(inventory, "Coffee Set", "Beverage Gift Set");
        System.out.println("<< Replacing Coffee Set with Beverage Gift Set >>");
        System.out.println();
        System.out.println("    Inventory List (after change)        ");
        System.out.println("____________________________________");
        printInventory(inventory);
    }

    public static void printInventory(List<InventoryItem> itemList) 
    {
        for(InventoryItem item: itemList)
           System.out.println(item);
    }
    
    public static void changeItem(List<InventoryItem> itemList, String find, String replace)
    {
       for(int index = 0; index < itemList.size(); index++)
          if(itemList.get(index).getName().equals(find))
               itemList.get(index).setName(replace);
    }
}
