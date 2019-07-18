/**
 * Course that extends Homework
 *
 * @author Paul Chafetz
 * @version 4/15/2019
 */
public class CalculusBC extends Homework
{
    public CalculusBC()
    {
        super(); //call Homework constructor
    }

    //initializes getWork abstract method
    public void getWork(int pages)
    {
        setPages(pages);
        setHw("Calculus BC");
    }
}
