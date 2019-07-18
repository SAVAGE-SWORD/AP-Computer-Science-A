
 /**
 * The TestInventory3 class demonstrations replacing
 * elements within an array.
 *
 * @author Jean E. Sammet
 * @version 06/16/17
 */

public class TestInventory3
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

        System.out.println("   Inventory List (before change) ");
        System.out.println("__________________________________");
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

    public static void printInventory(InventoryItem[] itemList)
    {
        for(int i = 0; i < itemList.length; i++)
           System.out.println(itemList[i]);
    }

    public static void changeItem(InventoryItem[] itemList, String find, String replace)
    {
       for(int index = 0; index < itemList.length; index++)
          if(itemList[index].getName().equals(find))
               itemList[index].setName(replace);
    }
}

