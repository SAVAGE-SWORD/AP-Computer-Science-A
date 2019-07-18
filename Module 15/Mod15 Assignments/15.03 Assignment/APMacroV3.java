/**
 * Course that extends HomeworkV3
 *
 * @author Paul Chafetz
 * @version 4/21/2019
 */
public class APMacroV3 extends HomeworkV3
{
    public APMacroV3()
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
