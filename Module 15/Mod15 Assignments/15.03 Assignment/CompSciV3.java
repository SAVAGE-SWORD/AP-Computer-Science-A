/**
 * Course that extends HomeworkV3
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
public class CompSciV3 extends HomeworkV3
{
    public CompSciV3()
    {
        super();
    }

    //initializes getWork abstract method
    public void getWork(int pages)
    {
        setPages(pages);
        setHw("AP Computer Science");
    }
    
    //initializes doHW from interface
    public void doHW()
    {
        setPages(getPages() - 3);
    }
}
