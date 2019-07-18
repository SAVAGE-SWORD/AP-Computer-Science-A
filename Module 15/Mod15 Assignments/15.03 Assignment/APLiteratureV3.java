/**
 * Course that extends HomeworkV3
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
public class APLiteratureV3 extends HomeworkV3
{
    public APLiteratureV3()
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
