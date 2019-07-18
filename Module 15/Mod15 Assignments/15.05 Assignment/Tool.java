/**
 * Class that sets the name and cost from Product and has a compareTo method
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
public class Tool implements Product, Comparable<Tool>
{
    // instance variables
    private String name;
    private double cost;

    //constructor for Tool
    public Tool(String name, double cost) {
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

    //compareTo method to compare the costs of the tools
    public int compareTo(Tool obj)
    {
        if (this.cost - obj.getCost() == 0)
            return 0;
        else if (this.cost - obj.getCost() > 0)
            return 1;
        else
            return -1;
    }
}
