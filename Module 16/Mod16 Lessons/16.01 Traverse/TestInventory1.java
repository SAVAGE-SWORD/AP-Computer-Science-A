
 /**
 * The TestInventory1 class demonstrations traversing an array.
 *
 * @author Jean E. Sammet
 * @version 06/16/17
 */

public class TestInventory1
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

        System.out.println("        Inventory List        ");
        System.out.println("______________________________");
        printInventory(inventory);
        
        System.out.println();
        System.out.println();
        System.out.println("The item with the largest quantity is:");
        findLargest(inventory);
    }

    public static void printInventory(InventoryItem[] itemList)
    {
        for(int i = 0; i < itemList.length; i++)
           System.out.println(itemList[i]);
    }
    
    public static void findLargest(InventoryItem [] itemList)
    {
        double max;
        int index;

        if (itemList.length != 0)
        {
            max = itemList[0].getNumInStock();
            index = 0;

            for (int i = 1; i < itemList.length; i++)
            {
                if (max < itemList[i].getNumInStock())
                {
                    max = itemList[i].getNumInStock();
                    index = i;
                }
            }
            System.out.println(itemList[index]);
            return;
        }
        System.out.println("There are no items in stock.");
    }
}

