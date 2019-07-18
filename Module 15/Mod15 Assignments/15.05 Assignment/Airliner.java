/**
 * Class for airliner planes (passenger planes) that extends Plane.
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
public class Airliner extends Plane
{
    public Airliner(String name, double cost)
    {
        super(name, cost);
    }

    //defines the fly() abstract method
    public void fly()
    {
        System.out.println("Flying passenger plane to airport.");
    }
}
