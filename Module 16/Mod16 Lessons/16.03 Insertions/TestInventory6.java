
 /**
 * The TestInventory6 class demonstrations inserting 
 * elements into an ArrayList.
 *
 * @author Jean E. Sammet
 * @version 06/16/17
 */
import java.util.*;
public class TestInventory6
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
        
        System.out.println("   Inventory List (before insert) ");
        System.out.println("___________________________________");
        printInventory(inventory);
        System.out.println();
        System.out.println();
        insertItem1(inventory, 2, "Relaxation Kit", 1000);
        System.out.println("<< At index 2, inserting Relaxation Kit, qty 1000 >>");
        System.out.println();
        System.out.println("    Inventory List (after insert)        ");
        System.out.println("____________________________________");
        printInventory(inventory);
        System.out.println();
        System.out.println();
        insertItem2(inventory, "Towel", "Hair Dryer", 500);
        System.out.println("<< Before Towel, inserting Hair Dryer, qty 500 >>");
        System.out.println();
        System.out.println("    Inventory List (after insert)        ");
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
    
    public static void insertItem1(List<InventoryItem> itemList, int location, String addN, int addS)
    {
        // insert item into ArrayList
        itemList.add(location, new InventoryItem(addN, addS));
    }

    public static void insertItem2(List<InventoryItem> itemList, String find, String addN, int addS)
    {
        int location = 0;

        // find location of item you want to insert before
        for(int index = 0; index < itemList.size(); index++)
            if(itemList.get(index).getName().equals(find))
                location = index;

        // insert item into ArrayList
        itemList.add(location, new InventoryItem(addN, addS));
    }
}
