
 /**
 * This class tests the concreate BeadedJean class that 
 * extents the abstract class BasicJean.
 *
 * @author Herman Hollerith
 * @version 06/15/17
 */

public class JeanTester1
{
    public static void main(String []args)
    {
        BeadedJean1 pair1 = new BeadedJean1(3, 20);

        pair1.design();
        System.out.println(pair1);
    }
}
