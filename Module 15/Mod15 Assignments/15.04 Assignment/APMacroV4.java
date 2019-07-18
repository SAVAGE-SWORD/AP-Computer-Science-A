/**
 * Course that extends HomeworkV4
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
public class APMacroV4 extends HomeworkV4
{
    public APMacroV4()
    {
        super();
    }

    //initializes getWork abstract method
    public void getWork(int pages)
    {
        setPages(pages);
        setHw("AP Macroeconomics");
    }
    
    //initializes doHW from interface
    public void doHW()
    {
        setPages(getPages() - 10);
    }
}
