
 /**
 * This class tests the concreate BeadedJean class that
 * extents the abstract class BasicJean.
 *
 * The compareTo and equals methods will be demonstrated.
 *
 * @author Herman Hollerith
 * @version 06/15/17
 */

public class JeanTester4
{
    public static void main(String []args)
    {
        BeadedJean4 pair1 = new BeadedJean4(3, 10, 10);
        BeadedJean4 pair2 = new BeadedJean4(3, 30, 10);

        pair1.design();
        pair2.design();

        System.out.println("My Jeans:");
        System.out.println(pair1);
        System.out.println(pair2);

        System.out.println();
        System.out.println("How do the jeans compare?");
        if(pair1.compareTo( pair2) == 0 )
            System.out.println("They are the same size using compareTo().");
        else
            System.out.println("They are not the same size using compareTo().");
            
        System.out.println();
        System.out.println("Are the jeans equal?");
        if( pair1.equals(pair2) )
            System.out.println("They are the same using equals().");
        else
            System.out.println("They are not the same using equals().");
    }
}
