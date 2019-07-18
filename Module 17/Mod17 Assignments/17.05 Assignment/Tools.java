/**
 * To use different sorting algorithms to sort an inventory of tools
 *
 * @author Paul Chafetz
 * @version 5/12/2019
 */
public class Tools
{
    // instance variables
    private String name, prod; //treat prod as a String to keep formatting
    private double price;
    private int quant;

    public Tools(String name, String prod, double price, int quant)
    {
        this.name = name;
        this.prod = prod;
        this.price = price;
        this.quant = quant;
    }

    public String getName()
    {
        return name;
    }

    public String getProd()
    {
        return prod;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuant()
    {
        return quant;
    }

    public String toString()
    {
        return String.format("%-12s%7s%7s%6.2f%9d", name, prod, "$", price, quant);
    }
}
