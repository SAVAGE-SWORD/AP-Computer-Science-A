/**
 * Course that extends HomeworkV3
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
public class CalculusBCV3 extends HomeworkV3
{
    public CalculusBCV3()
    {
        super();
    }

    //initializes getWork abstract method
    public void getWork(int pages)
    {
        setPages(pages);
        setHw("Calculus BC");
    }
    
    //initializes doHW from interface
    public void doHW()
    {
        setPages(getPages() - 1);
    }
}
