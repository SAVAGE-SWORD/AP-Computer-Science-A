
 /**
 * This class demonstrates the insertion sort algorithm.
 *
 * @author Margaret Hamilton
 * @version 06/17/17
 */

public class TestListing2
{
    public static void main(String[] args)
    {
        HouseListing[] houses = new HouseListing[5];
        HouseListing[] sorted = new HouseListing[5];

        houses[0] = new HouseListing("1892 Ocean Blue",   "Kissimmee", "FL", "34647", 212000);
        houses[1] = new HouseListing("123 Any Street",    "St. Cloud", "FL", "34769", 79000);
        houses[2] = new HouseListing("456 Cherry Lane",   "St. Cloud", "FL", "34772", 110000);
        houses[3] = new HouseListing("339 Curry Ave",     "Kissimmee", "FL", "34647", 451000);
        houses[4] = new HouseListing("612 Orange Street", "Orlando",   "FL", "32196", 88000);

        System.out.println("    <<<< Before Sorting >>>> \n");
        for(int i = 0; i < houses.length; i++)
            System.out.println( houses[i] );

        insertionCost1(houses, sorted);
        
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by cost in ascending order - passing two arrays >>>>\n");
        for(int i = 0; i < sorted.length; i++)
            System.out.println(sorted[i] );
            
        houses = insertionCost2(houses);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by cost in ascending order - returning an array >>>>\n");
        for(int i = 0; i < houses.length; i++)
            System.out.println(houses[i] );
            
        houses = insertionCity(houses);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by city in ascending order >>>>\n");
        for(int i = 0; i < houses.length; i++)
            System.out.println(houses[i] );    
    }
    
    public static void insertionCost1(HouseListing[] source, HouseListing[] dest)
    {
        for( int i = 0 ; i < source.length ; i++ )
        {
            HouseListing next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getCost() > dest[k-1].getCost() )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(HouseListing h : dest)  
            //    if( h != null) System.out.printf("$%10.2f \n", h.getCost() );
        } // end of for
    }
    
    public static HouseListing[] insertionCost2(HouseListing[] source)
    {
        HouseListing[] dest = new HouseListing[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            HouseListing next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getCost() > dest[k-1].getCost() )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(HouseListing h : dest)  
            //    if( h != null) System.out.printf("$%10.2f \n", h.getCost() );
        } // end of for
        return dest;
    }
    
    public static HouseListing[] insertionCity(HouseListing[] source)
    {
        HouseListing[] dest = new HouseListing[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            HouseListing next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getCity().compareTo( dest[k-1].getCity() ) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(HouseListing h : dest)  
            //    if( h != null) System.out.printf("%-15s \n", h.getCity() );
        } // end of for
        return dest;
    }
} // end of class
