/**
 * Displays the before-and-after reading homework for given classes
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
public abstract class HomeworkV3 implements Processing
{
    // instance variables
    private int pages;
    private String hw;

    //abstract method
    public abstract void getWork(int pages);

    public HomeworkV3()
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
        return getHw() + " - Read " + getPages() + " pages.";
    }
}
