/**
 * Tests Tools class with all sorting algorithms.
 *
 * @author Paul Chafetz
 * @version 5/12/2019
 */
public class TestTools
{
    //prints tools array
    public static void print(Tools[] tools)
    {
        System.out.printf("%7s%11s%13s%13s%n", "Name", "ID", "Price", "Quantity");
        for (Tools tool : tools)
            System.out.println(tool);
    }

    //uses selection sort for names of tools
    public static void selectionSortName(Tools[] tools, int sortOrder)
    {
        if (sortOrder == 1) {
            int max;
            Tools temp;
            for (int i = tools.length - 1; i > 0; i--) {
                max = 0;
                for (int k = 1; k <= i; k++) {
                    if (tools[k].getName().compareTo(tools[max].getName()) > 0)
                        max = k;
                }
                temp = tools[i];
                tools[i] = tools[max];
                tools[max] = temp;
            }
        }
        else if (sortOrder == 2) {
            int max;
            Tools temp;
            for (int i = tools.length - 1; i > 0; i--) {
                max = 0;
                for (int k = 1; k <= i; k++) {
                    if (tools[k].getName().compareTo(tools[max].getName()) < 0)
                        max = k;
                }
                temp = tools[i];
                tools[i] = tools[max];
                tools[max] = temp;
            }
        }
    }

    //uses insertion sort of product numbers (IDs)
    public static Tools[] insertionSortProd(Tools[] tools, int sortOrder)
    {
        Tools[] sorted = new Tools[tools.length];
        if (sortOrder == 1) {
            for (int i = 0; i < tools.length; i++) {
                int index = 0, k = i;
                while (k > 0 && index == 0) {
                    if (tools[i].getProd().compareTo(sorted[k - 1].getProd()) > 0)
                        index = k;
                    else
                        sorted[k] = sorted[k - 1];
                    k--;    
                }
                sorted[index] = tools[i];
            }
            return sorted;
        }
        else if (sortOrder == 2) {
            for (int i = 0; i < tools.length; i++) {
                int index = 0, k = i;
                while (k > 0 && index == 0) {
                    if (tools[i].getProd().compareTo(sorted[k - 1].getProd()) < 0)
                        index = k;
                    else
                        sorted[k] = sorted[k - 1];
                    k--;    
                }
                sorted[index] = tools[i];
            }
            return sorted;
        }
        else
            return sorted;
    }

    //part of merge sort that merges subarrays
    public static void mergeSortPrice(Tools[] tools, int low, int mid, int high)
    {
        Tools[] temp = new Tools[high - low + 1];
        int i = low, index = 0, j = mid + 1;

        while (i <= mid || j <= high)
        {
            if (i > mid) {
                temp[index] = tools[j];
                j++;
            }
            else if (j > high) {
                temp[index] = tools[i];
                i++;
            }
            else if (tools[i].getPrice() < tools[j].getPrice()) {
                temp[index] = tools[i];
                i++;
            }
            else {
                temp[index] = tools[j];
                j++;
            }
            index++;
        }
        for (int k = low; k <= high; k++)
            tools[k] = temp[k - low];
    }

    //uses merge sort to sort prices of tools
    public static void sortPrice(Tools[] tools, int low, int high)
    {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        sortPrice(tools, low, mid);
        sortPrice(tools, mid + 1, high);
        mergeSortPrice(tools, low, mid, high);
    }

    //uses selection sort to sort quantities of tools
    //please note that the instructions do not mention sorting by quantity but the rubric does!
    public static void selectionSortQuant(Tools[] tools, int sortOrder)
    {
        if (sortOrder == 1) {
            int max;
            Tools temp;
            for (int i = tools.length - 1; i > 0; i--) {
                max = 0;
                for (int k = 1; k <= i; k++) {
                    if (tools[k].getQuant() > tools[max].getQuant())
                        max = k;
                }
                temp = tools[i];
                tools[i] = tools[max];
                tools[max] = temp;
            }
        }
        else if (sortOrder == 2) {
            int max;
            Tools temp;
            for (int i = tools.length - 1; i > 0; i--) {
                max = 0;
                for (int k = 1; k <= i; k++) {
                    if (tools[k].getQuant() < tools[max].getQuant())
                        max = k;
                }
                temp = tools[i];
                tools[i] = tools[max];
                tools[max] = temp;
            }
        }
    }

    public static void main(String[] args)
    {
        Tools[] tools = {  
                new Tools("Hammer", "1052", 12.50, 80), 
                new Tools("Screwdriver", "1202", 15.50, 165),
                new Tools("Wrench", "4651", 10.99, 90), 
                new Tools("Drill", "6437", 65.00, 20), 
                new Tools("Saw", "9410", 47.99, 20), 
                new Tools("Ladder", "0124", 155.00, 30),
                new Tools("Machete", "7741", 25.50, 45), 
                new Tools("Pliers", "8522", 15.00, 130),
                new Tools("Chainsaw", "0223", 199.99, 15), 
                new Tools("Shovel", "3641", 25.75, 75)};
        Tools[] sorted = new Tools[tools.length];       

        //if it's too much, you can comment out the sections below :D

        System.out.println("\nOriginal Inventory\n");
        print(tools);

        System.out.println("\nAscending Name Selection Sort\n");
        selectionSortName(tools, 1);
        print(tools);

        System.out.println("\nDescending Name Selection Sort\n");
        selectionSortName(tools, 2);
        print(tools);

        System.out.println("\nAscending Product Number Insertion Sort\n");
        sorted = insertionSortProd(tools, 1);
        print(sorted);

        System.out.println("\nDescending Product Number Insertion Sort\n");
        sorted = insertionSortProd(tools, 2);
        print(sorted);

        System.out.println("\nAscending Price Merge Sort\n");
        sortPrice(tools, 0, tools.length - 1);
        print(tools);

        System.out.println("\nAscending Quantity Selection Sort\n");
        selectionSortQuant(tools, 1);
        print(tools);

        System.out.println("\nDescending Quantity Selection Sort\n");
        selectionSortQuant(tools, 2);
        print(tools);
    }
}
