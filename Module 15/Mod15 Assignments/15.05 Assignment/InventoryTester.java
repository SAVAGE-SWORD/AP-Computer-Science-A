/**
 * Tests the Plane and Tool classes by organizing and displaying an inventory of products
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
import java.util.*;
public class InventoryTester
{
    //traverses all the products, gets the total amount and price of all elements in List
    public static void getInv(String name, List<Product> prod)
    {
        int totalQuantity = 0;
        double totalCost = 0;
        for (Product prods : prod)
        {
            if (prods.getName().equals(name))
            {
                totalQuantity++;
                totalCost += prods.getCost();
            }
        }
        //used printf to avoid the large costs printing in scientific notation (and to put commas)
        System.out.printf("%s%s%d%s%,.2f%n", name, ": ", totalQuantity, " at a total of $", totalCost);
    }

    public static void main(String[] args)
    {
        //adds multiple products to a List
        List<Product> prod = new ArrayList<Product>();
        prod.add(new Cargo("Boeing", 185400000.0));
        prod.add(new Cargo("Airbus", 250000000.0));
        prod.add(new Cargo("Airbus", 80000000.0));
        prod.add(new Cargo("Boeing", 352000000.0));
        prod.add(new Airliner("American Airlines", 180000000.0));
        prod.add(new Airliner("Alaska Airlines", 123500000.0));
        prod.add(new Airliner("American Airlines", 200000000.0));
        prod.add(new Tool("Hammer", 26.50));
        prod.add(new Tool("Screwdriver", 30.75));

        System.out.println("\n\tInventory of Products\n");

        //runs the getInv method for all products
        getInv("Boeing", prod);
        getInv("Airbus", prod);
        getInv("American Airlines", prod);
        getInv("Alaska Airlines", prod);
        getInv("Hammer", prod);
        getInv("Screwdriver", prod);

        System.out.println("\n\tComparing the Tools\n");

        //creates two specific tools and compares them
        Tool fl1 = new Tool("Forklift 1", 15000.0);
        Tool fl2 = new Tool("Forklift 2", 20000.0);
        System.out.printf("%s%s%,.2f%n", fl1.getName(), ": $", fl1.getCost());
        System.out.printf("%s%s%,.2f%n", fl2.getName(), ": $", fl2.getCost());
        if (fl1.compareTo(fl2) == 0)
            System.out.println("\nThe forklifts are the same price.");
        else if (fl1.compareTo(fl2) > 0)
            System.out.println("\nThe first forklift is more expensive than the second.");
        else
            System.out.println("\nThe first forklift is less expensive than the second.");
    }
}
