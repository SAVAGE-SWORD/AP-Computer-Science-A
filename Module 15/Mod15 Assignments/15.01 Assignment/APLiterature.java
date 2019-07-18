/**
 * Course that extends Homework
 *
 * @author Paul Chafetz
 * @version 4/15/2019
 */
public class APLiterature extends Homework
{
    public APLiterature()
    {
        super(); //call Homework constructor
    }

    //initializes getWork abstract method
    public void getWork(int pages)
    {
        setPages(pages);
        setHw("AP Literature");
    }
}
