/**
 * Defines a contact with different parameters to be sorted and searched for.
 *
 * @author Paul Chafetz
 * @version 5/16/2019
 */
public class Contact
{
    // instance variables 
    private String name, relation, birthday, number, email;

    public Contact(String name, String relation, String birthday, String number, String email)
    {
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.number = number;
        this.email = email;
    }

    public String getName()
    {
        return name;
    }
    
    public String getRelation()
    {
        return relation;
    }
    
    public String getBirthday()
    {
        return birthday;
    }
    
    public String getNumber()
    {
        return number;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    @Override
    public String toString()
    {
        return String.format("%-17s%-11s%-10s%-15s%-1s", name, relation, birthday, number, email);
    }
}
