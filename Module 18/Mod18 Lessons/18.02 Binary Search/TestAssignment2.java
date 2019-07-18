
/**
 * This class demonstrates the binary search with an array of objects.
 *
 * @author John Henry Thompson
 * @version 06/18/17
 */

public class TestAssignment2
{
    public static void main(String[] args)
    {
        int test;
        Assignment[] roster = new Assignment[10];
        
        roster[0] = new Assignment("4:00 PM - 12:00 AM", "Safe Mart",   "Mary Ellen");
        roster[1] = new Assignment("12:00 AM - 8:00 AM", "Safe Mart",   "DJ Turtle");
        roster[2] = new Assignment("8:00 AM - 4:00 PM",  "Wally World", "Sue Manny");
        roster[3] = new Assignment("4:00 PM - 12:00 AM", "Wally World", "Julia Torte");
        roster[4] = new Assignment("12:00 AM - 8:00 AM", "Wally World", "Angela Ayres");
        roster[5] = new Assignment("4:00 PM - 12:00 AM", "Stay Inn",    "Larry Vibe");
        roster[6] = new Assignment("12:00 AM - 8:00 AM", "Stay Inn",    "Emily Rose");
        roster[7] = new Assignment("8:00 AM - 4:00 PM",  "Castle Land", "Aron Tropic");
        roster[8] = new Assignment("4:00 PM - 12:00 AM", "Castle Land", "Kyle Haney");
        roster[9] = new Assignment("8:00 AM - 4:00 PM",  "Castle Land", "Nina Rose");

        printRoster(roster);
        
        System.out.println("\n\nSearching for Nina Rose: ");
        insertionPerson(roster);  
        //printRoster(roster);       // debug statement to check roster is sorted
        
        test = binarySearchPerson(roster, "Nina Rose");
        if(test != -1)
            System.out.println("Found: " + roster[test]);
        else
            System.out.println("Not found. " );
            
        System.out.println("\n\nSearching for Mickey Mouse: ");
        test = binarySearchPerson(roster, "Mickey Mouse");
        if(test != -1)
            System.out.println("Found: " + roster[test]);
        else
            System.out.println("Not found. " );
            
        System.out.println("\n\nSearching for Castle Land: ");
        selectionLocation(roster);
        //printRoster(roster);       // debug statement to check roster is sorted
        binarySearchLoc(roster, "Castle Land");
        
        System.out.println("\n\nSearching for Magic Island: ");
        binarySearchLoc(roster, "Magic Island");
    }
    
    public static void printRoster(Assignment[] r)
    {
        System.out.println("Time                      Location        Person");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
        System.out.println("end");
    }
    
    
    
    public static int binarySearchPerson(Assignment[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( r[probe].getPerson().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (r[low].getPerson().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }
    
    public static void binarySearchLoc(Assignment[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(r[probe].getLocation().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( r[probe].getLocation().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (r[low].getLocation().compareTo(toFind) == 0 ))
        {
            linearPrintLoc(r, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
    
    // Prints all elements before and after the found element 
    // that match the search criteria for location.
    public static void linearPrintLoc(Assignment[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getLocation().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getLocation().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }
    
    // Insertion sort: sort array in ascending order based on person's name
    public static void insertionPerson(Assignment[] source)
    {
        Assignment[] dest = new Assignment[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Assignment next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getPerson().compareTo(dest[k-1].getPerson()) > 0 )
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
            // System.out.println("\nPass # " + i);
            // for(Assignment a : dest)  
            //    if( a != null) System.out.printf("%-10s \n", a.getPerson() );
        } // end of for
        
        for(int i = 0; i < dest.length; i++)
            source[i] = dest[i];
    }
    
    // Selection sort: sort array in ascending order based on the location
    public static void selectionLocation(Assignment[] source)
    {
        int i;
        int k;
        int posMax;
        Assignment temp;

        for( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(source[k].getLocation().compareTo(source[posMax].getLocation()) > 0 )
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
            // System.out.println("\nPass # " + i);
            //for(Assignment a : source)  
            //    if( a != null) System.out.printf("%-20s \n", a.getLocation() );
        }
    }
}
