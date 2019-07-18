
/**
 * This class tests the JeanJacket class that 
 *  implements the JeanEffects interface.
 *
 * @author Herman Hollerith
 * @version 06/15/17
 */

import java.util.*;

public class TestJacket3
{
    public static void main(String []args)
    {   
        List<JeanJacket3> jacketList = new ArrayList<JeanJacket3>();

        jacketList.add( new JeanJacket3(10));
        jacketList.get(0).design();
        jacketList.get(0).fadeJeans("moderately worn");
        jacketList.get(0).addHoles("back");

        jacketList.add( new JeanJacket3(20));
        jacketList.get(1).design();
        jacketList.get(1).fadeJeans("hipster");
        jacketList.get(1).addHoles("elbows");

        jacketList.add( new JeanJacket3(30));
        jacketList.get(2).design();
        jacketList.get(2).fadeJeans("none");
        jacketList.get(2).addHoles("shoulders");    

        for(JeanJacket3 j: jacketList)
        {
            System.out.println(j);
            System.out.println();
        }
    }
}
