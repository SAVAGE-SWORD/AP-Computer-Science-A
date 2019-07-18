/**
 * Class for cargo planes that extends Plane.
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
public class Cargo extends Plane
{
    public Cargo(String name, double cost)
    {
        super(name, cost);
    }

    //defines the fly() abstract method
    public void fly()
    {
        System.out.println("Flying cargo plane to warehouse depot.");
    }
}
