
 /**
 * The TestInventory5 class demonstrations inserting 
 * elements into an array.
 *
 * @author Jean E. Sammet
 * @version 06/16/17
 */

public class TestInventory5
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
            if(itemList[index].getName().equals(find))
                location = index;

        //move items down in the array - last item is lost
        for(int index = itemList.length - 1; index > location; index--)
            itemList[index] = itemList[index-1];

        itemList[location] = new InventoryItem(addN, addS);
    }
}

