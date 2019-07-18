
 /**
 * This class demonstrates the selection sort algorithm.
 *
 * @author Margaret Hamilton
 * @version 06/17/17
 */

public class TestListing3
{
    public static void main(String[] args)
    {
        HouseListing[] houses = new HouseListing[5];
        //HouseListing[] sorted = new HouseListing[5];

        houses[0] = new HouseListing("1892 Ocean Blue",   "Kissimmee", "FL", "34647", 212000);
        houses[1] = new HouseListing("123 Any Street",    "St. Cloud", "FL", "34769", 79000);
        houses[2] = new HouseListing("456 Cherry Lane",   "St. Cloud", "FL", "34772", 110000);
        houses[3] = new HouseListing("339 Curry Ave",     "Kissimmee", "FL", "34647", 451000);
        houses[4] = new HouseListing("612 Orange Street", "Orlando",   "FL", "32196", 88000);

        System.out.println("    <<<< Before Sorting >>>> \n");
        for(int i = 0; i < houses.length; i++)
            System.out.println( houses[i] );

        selectionSort(houses);

        System.out.println("\n   <<<< After Sorting >>>>");
        System.out.println("<<<< by cost in ascending order >>>>\n");
        for(int i = 0; i < houses.length; i++)
            System.out.println(houses[i] );
    }
    
    public static void selectionSort(HouseListing[] source)
    {
        int i;
        int k;
        int posMax;
        HouseListing temp;

        for ( i = source.length - 1 ; i > 0 ; i-- ) //i >= 0 less efficient
        {
            // find largest element in the i elements
            posMax = 0;
            for ( k = 1 ; k <= i ; k++ ) //k = 0 is less efficient
            {
                if ( source[ k ].getCost() > source[ posMax ].getCost() )
                    posMax = k;
            }
            // swap the item with the largest cost 
            // with the element in position i
            // now the item is in its proper location
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(HouseListing h : source)  
            //    if( h != null) System.out.printf("$%10.2f \n", h.getCost() );
        }
    }
} // end of class