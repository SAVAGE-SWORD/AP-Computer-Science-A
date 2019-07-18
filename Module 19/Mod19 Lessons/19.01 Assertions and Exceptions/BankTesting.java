
/**
 * This class demonstrates various banking functions for an account
 * and the errors thrown when improper transactions are attempted.
 *
 * @author Marvin Minsky
 * @version 06/19/17
 */

public class BankTesting
{
    public static void main(String[] args)
    {
        // create bank accounts
        Account acct1 = new Account("Ted Murphy", 72354, 102.56);
        Account acct2 = new Account("Jane Smith", 69713, 40.00);
        Account acct3 = new Account("Edward Garcia", 93757, 759.32);

        // test the deposit method
        acct1.deposit(25.85);
        
        // attempt to deposit a negative amount
        // acct1.deposit(-11.00);    // attempt to deposit a negative amount

        // test the withdraw method
        acct2.deposit(500.00);
        System.out.println("Balance after deposit: " + acct2);
        acct2.withdraw(430.75, 1.50);
        System.out.println("Balance after first withdrawal: " + acct2);
        
        // attempt to withdraw negative amount
        //acct2.withdraw(-9514.13, 1.50);
        //System.out.println("Balance after second withdrawal: " + acct2);

        // attempt to withdraw amount greater than balance
        // acct3.withdraw(800.00, 0.0);  // exceeds balance
        
        // test the addInterest method
        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
}
