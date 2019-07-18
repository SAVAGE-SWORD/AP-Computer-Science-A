/**
 * Abstract class that sets the name and cost from Product
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
public abstract class Plane implements Product
{
    // instance variables
    private String name;
    private double cost;

    //constructor for Plane
    public Plane(String name, double cost)
    {
        this.name = name;
        this.cost = cost;
    }

    //getter and setter methods for name
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    //getter and setter methods for cost
    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public double getCost()
    {
        return cost;
    }

    //abstract method to fly the plane
    public abstract void fly();
}
