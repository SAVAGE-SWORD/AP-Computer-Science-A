
 /**
 * This class demonstrates the merge sort algorithm.
 *
 * @author Margaret Hamilton
 * @version 06/17/17
 */

public class TestListing4
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

        mergeSort(houses, 0, houses.length-1);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by cost in ascending order >>>>\n");
        for(int i = 0; i < houses.length; i++)
            System.out.println(houses[i] );
    }
    
    public static void mergeSort(HouseListing[] a, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSort( a, low, mid );       // recursive call
        mergeSort( a, mid + 1, high);   // recursive call

        //Debugging Statements 
        //uncomment to print the listings after each pass through the sort
        //System.out.println("\nCurrent list");
        //for(HouseListing h : a)  
        //    if( h != null) System.out.printf("$%10.2f \n", h.getCost() );
                
        merge( a, low, mid, high);
    }
    
    public static void merge( HouseListing[] a, int low, int mid, int high )
    {
        HouseListing[] temp = new HouseListing[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = a[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else if( a[ i ].getCost() < a[ j ].getCost() )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else
            {
                temp[ n ] = a[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            a[ k ] = temp[ k - low ];
    } // end of merge
} // end of class