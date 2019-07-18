
/**
 * The purpose of this program is to count the number of
 * tickets sold and the amount of money received.
 * 
 * @author Meg Abyte 
 * @version 06/02/17
 */
public class AdmissionV1
{
    public static void main(String[ ] args)
    {
        //local variables       
        int counter = 0;            //total tickets sold
        double ticketPrice = 0.0;   //cost of student ticket
        double totalSales = 0.0;    //total sales
               
        //calculate total ticket sales at the game
        ticketPrice = 5.50;         //ticket price
        counter++;
        totalSales += ticketPrice;
        System.out.print(" Number of tickets = " + counter);
        System.out.println("   Total Sales: $" + totalSales);   
        
        //calculate total ticket sales at the game
        ticketPrice = 5.50;         //ticket price
        counter++;
        totalSales += ticketPrice;
        System.out.print(" Number of tickets = " + counter);
        System.out.println("   Total Sales: $" + totalSales);   
        
        //calculate total ticket sales at the game
        ticketPrice = 5.50;         //ticket price
        counter++;
        totalSales += ticketPrice;
        System.out.print(" Number of tickets = " + counter);
        System.out.println("   Total Sales: $" + totalSales);
    }//end of main method
}//end of class
