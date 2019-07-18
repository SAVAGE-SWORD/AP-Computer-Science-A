
/**
 * This class tests the FadedJean class.
 *
 * @author Herman Hollerith
 * @version 06/15/17
 */

import java.util.*;
public class TestFadedJean3
{
    public static void main(String []args)
    {          
        List<FadedJean3> jeanList = new ArrayList<FadedJean3>();

        jeanList.add( new FadedJean3(0, "knees"));
        jeanList.get(0).design();

        jeanList.add( new FadedJean3(4, "pant legs"));
        jeanList.get(1).design();

        for (FadedJean3 j: jeanList)
        {
            System.out.println(j);
            System.out.println();
        }
    }
}