/**
 * Course that extends HomeworkV4
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
public class APLiteratureV4 extends HomeworkV4
{
    public APLiteratureV4()
    {
        super();
    }

    //initializes getWork abstract method
    public void getWork(int pages)
    {
        setPages(pages);
        setHw("AP Literature");
    }
    
    //initializes doHW from interface
    public void doHW()
    {
        setPages(getPages() - 6);
    }
}
