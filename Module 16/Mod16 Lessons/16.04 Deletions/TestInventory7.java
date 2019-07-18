
 /**
 * The TestInventory7 class demonstrations deleting 
 * elements from an array.
 *
 * @author Jean E. Sammet
 * @version 06/16/17
*/

public class TestInventory7
{
    public static void main(String[] args)
    {
        InventoryItem[] inventory = new InventoryItem[5];

        // create inventory
        inventory[0] = new InventoryItem("Towel", 200);
        inventory[1] = new InventoryItem("Cleaning Cart", 30);
        inventory[2] = new InventoryItem("Toiletry Sets", 100);
        inventory[3] = new InventoryItem("Coffee Set", 300);
        inventory[4] = new InventoryItem("Pillows", 50);

        System.out.println("   Inventory List (before deletions) ");
        System.out.println("_____________________________________");
        printInventory(inventory);
        System.out.println();
        System.out.println();
        
        deleteByLoc(inventory, 2);
        System.out.println("<< Delete item at index 2 >>");
        System.out.println();
        System.out.println("    Inventory List (after deletion)        ");
        System.out.println("____________________________________");
        printInventory(inventory);
        System.out.println();
        System.out.println();
        
        deleteByName(inventory, "Towel");
        System.out.println("<< Delete Towel item >>");
        System.out.println();
        System.out.println("    Inventory List (after deletion)        ");
        System.out.println("____________________________________");
        printInventory(inventory);
    }

    public static void printInventory(InventoryItem[] itemList)
    {
        for(int i = 0; i < itemList.length; i++)
             if(itemList[i] != null)
                 System.out.println(itemList[i]);
    }

    public static void changeItem(InventoryItem[] itemList, String find, String replace)
    {
        for(int index = 0; index < itemList.length; index++)
            if((itemList[index] != null) && (itemList[index].getName().equals(find)))
                itemList[index].setName(replace);
    }

    public static void insertItem1(InventoryItem[] itemList, int location, String addN, int addS)
    {
        //move items down in the array - last item is lost
        for(int index = itemList.length - 1; index > location; index--)
            itemList[index] = itemList[index-1];
        itemList[location] = new InventoryItem(addN, addS);
    }

    public static void insertItem2(InventoryItem[] itemList, String find, String addN, int addS)
    {
        int location = 0;

        // find location of item you want to insert before
        for(int index = 0; index < itemList.length; index++)
        {
            if((itemList[index] != null) && (itemList[index].getName().equals(find)))
            {
                location = index;
                break;
            }
            else if(itemList[index] == null)
            {
                location = index;
                break;
            }
        }

        //move items down in the array - last item is lost
        for(int index = itemList.length - 1; index > location; index--)
            itemList[index] = itemList[index-1];

        itemList[location] = new InventoryItem(addN, addS);
    }

    public static void deleteByLoc(InventoryItem[] itemList, int location)
    {
        if ((location > 0) && (location < itemList.length))
        {
            //move items up in the array -
            for(int index = location; index < itemList.length -1; index++)
                itemList[index] = itemList[index + 1];

            itemList[itemList.length-1] = null;
        }
    }

    public static void deleteByName(InventoryItem[] itemList, String find)
    {
        int location = 0;
        int index;

        // find location of item you want to delete
        for(index = 0; index < itemList.length; index++)
            if((itemList[index] != null) && (itemList[index].getName().equals(find)))
            {
                location = index;
                break;
            }
            else if(itemList[index] == null)
            {
                location = -1;
                break;
            }

        if ((index != itemList.length) && (location >= 0))
        { 
            //move items up in the array
            for(index = location; index < itemList.length -1; index++)
                itemList[index] = itemList[index + 1];

            itemList[itemList.length-1] = null;
        }
    }
}

