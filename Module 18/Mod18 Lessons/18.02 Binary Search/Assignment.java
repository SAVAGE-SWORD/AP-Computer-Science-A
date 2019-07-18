
/**
 * This class defines a work Assignment based on time, 
 * location, and employee assigned.
 *
 * @author John Henry Thompson
 * @version 06/18/17 
 */

public class Assignment
{
    // instance variables
    private String time;
    private String location;
    private String person;

    /**
     * Constructor for objects of class Assignment
     */
    public Assignment(String t, String l, String p)
    {
        // initialize instance variables
        time = t;
        location = l;
        person = p;
    }
    
    public void setTime(String t)
    {
        time = t;
    }
   
    public String getTime()
    {
        return time;
    }
   
    public void setLocation(String l)
    {
        location = l;
    }
    
    public String getLocation()
    {
        return location;
    }
   
    public void setPerson(String p)
    {
        person = p;
    }
    
    public String getPerson()
    {
        return person;
    }
   
    public String toString()
    {
        return String.format("%-25s %-15s %-15s", time, location, person);
    }
}
