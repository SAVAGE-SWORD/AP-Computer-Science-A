/**
 * Displays the reading homework for given classes
 *
 * @author Paul Chafetz
 * @version 4/15/2019
 */
public abstract class Homework
{
    // instance variables
    private int pages;
    private String hw;

    //abstract method
    public abstract void getWork(int pages);

    public Homework()
    {
        this.pages = 0;
        this.hw = "none";
    }

    //getter and setter method for pages
    public int getPages()
    {
        return pages;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    //getter and setter method for the homework type
    public String getHw()
    {
        return hw;
    }

    public void setHw(String hw)
    {
        this.hw = hw;
    }

    //override toString method to print
    public String toString()
    {
        return getHw() + ": Read " + getPages() + " pages.";
    }
}
