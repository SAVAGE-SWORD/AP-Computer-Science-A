/**
 * This class defines a bank account and its basic functions.
 *
 * @author Marvin Minsky
 * @version 06/19/17
 */

public class Account
{
    private final double RATE = 0.035;  // interest rate of 3.5%

    private int acctNumber;
    private double balance;
    private String name;

    /**
     *  Sets up the account by defining its owner, account number,
     *  and initial balance.
     */
    public Account(String owner, int account, double initial)
    {
        name = owner;
        acctNumber = account;
        if(initial < 0)
            throw new RuntimeException("Initial Balance can't be less than zero");
        else
            balance = initial;
    }

    /**
     *  Validates the transaction, then deposits the specified amount
     *  into the account. Returns the new balance.
     */
    public double deposit(double amount)
    {
        String msg;

        if(amount < 0)  // deposit value is negative
        {
            msg = "Error: Deposit amount is invalid. "
                   + acctNumber + "  " + String.format("$%.2f", amount);
            throw new IllegalArgumentException(msg);
        }
        else
            balance += amount;

        return balance;
    }

    /**
     *  Validates the transaction, then withdraws the specified amount
     *  from the account. Returns the new balance.
     */
    public double withdraw(double amount, double fee)
    {
        String msg;
        amount += fee;

        if(amount < 0)  // withdraw value is negative
        {
            msg = "Error: Withdraw amount is invalid."
                   + " Account: " + acctNumber
                   + " Requested: " + String.format("$%.2f", amount);
            throw new IllegalArgumentException(msg);
        }
        else if(amount > balance)  // withdraw value exceeds balance
        {
            msg = "Error: Insufficient funds."
                   + " Account: " + acctNumber
                   + " Requested: " + String.format("$%.2f", amount)
                   + " Available: " + String.format("$%.2f", amount);
            throw new RuntimeException(msg);
        }
        else
            balance -= amount;
            
        return balance;
    }

    /**
     *  Adds interest to the account and returns the new balance.
     */
    public double addInterest()
    {
        balance += (balance * RATE);
        return balance;
    }

    /**
     *  Returns the current balance of the account.
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     *  Returns the account number.
     */
    public long getAccountNumber()
    {
        return acctNumber;
    }

    public String toString()
    {
        return String.format("%-10d %-20s $%.2f", acctNumber, name, balance);
    }
}
