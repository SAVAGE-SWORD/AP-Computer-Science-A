/**
 * Displays the before-and-after reading homework for given classes and compares them
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
public abstract class HomeworkV4 implements ProcessingV4, Comparable<HomeworkV4>
{
    // instance variables
    private int pages;
    private String hw;

    //abstract method
    public abstract void getWork(int pages);

    public HomeworkV4()
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

    //new method from Comparable<T> interface - fixed!
    public int compareTo(HomeworkV4 hw)
    {
        int dif = this.pages - hw.getPages();
        if (dif == 0)
            return 0;
        else if (dif >= 0)
            return 1;
        else
            return -1;
    }
    
    //override toString method to print
    public String toString()
    {
        return getHw() + " - Read " + getPages() + " pages.";
    }
}
