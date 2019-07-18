
 /**
 * This class defines a House Listing object by 
 * its address and cost.
 *
 * @author Margaret Hamilton
 * @version 06/17/17
 */
public class HouseListing
{
    // instance variables
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private double cost;

    // Constructor for objects of class HouseListing
    public HouseListing(String address, String city, String state, String zipCode, double cost)
    {
        // initialize instance variables
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.cost = cost;
    }
    
    public String toString()
    {
        String listing = address + "  " + city + ", " + state + " " + zipCode
                         + "\n  Cost: " + String.format("$%,10.2f", cost) + "\n";
        return listing; 
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public String getState()
    {
        return state;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    public String getZip()
    {
        return zipCode;
    }
    
    public void setZip(String zipCode)
    {
        this.zipCode = zipCode;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public void setCost(double cost)
    {
        this.cost = cost;
    }
}
