/**
 * Course that extends Homework
 *
 * @author Paul Chafetz
 * @version 4/15/2019
 */
public class CompSci extends Homework
{
    public CompSci()
    {
        super(); //call Homework constructor
    }

    //initializes getWork abstract method
    public void getWork(int pages)
    {
        setPages(pages);
        setHw("AP Computer Science");
    }
}
