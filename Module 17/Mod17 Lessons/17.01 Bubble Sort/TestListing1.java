
 /**
 * This class demonstrates the bubble sort algorithm.
 *
 * @author Margaret Hamilton
 * @version 06/17/17
 */

public class TestListing1
{
    public static void main(String[] args)
    {
        HouseListing[] houses = new HouseListing[5];

        houses[0] = new HouseListing("1892 Ocean Blue",   "Kissimmee", "FL", "34647", 212000);
        houses[1] = new HouseListing("123 Any Street",    "St. Cloud", "FL", "34769", 79000);
        houses[2] = new HouseListing("456 Cherry Lane",   "St. Cloud", "FL", "34772", 110000);
        houses[3] = new HouseListing("339 Curry Ave",     "Kissimmee", "FL", "34647", 451000);
        houses[4] = new HouseListing("612 Orange Street", "Orlando",   "FL", "32196", 88000);

        System.out.println("    <<<< Before Sorting >>>> \n");
        for(int i = 0; i < houses.length; i++)
            System.out.println( houses[i] );

        bubbleSort(houses);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by cost in ascending order >>>>\n");
        for(int i = 0; i < houses.length; i++)
            System.out.println( houses[i] );
    }
    
    public static void bubbleSort(HouseListing[] a)
    {
        int out, in;
        HouseListing temp;

        for(out = a.length-1; out > 0; out--)  // outer loop (backward)
        {  
            for(in = 0; in < out; in++)        // inner loop (forward)
            {
                if( a[in].getCost() > a[in+1].getCost() )  
                {     // swap elements
                    temp = a[in + 1];
                    a[in + 1] = a[in];
                    a[in] = temp;
                }
            }
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + out);
            //for(HouseListing h : a)  System.out.printf("$%10.2f \n", h.getCost() );
        }
    }
}
