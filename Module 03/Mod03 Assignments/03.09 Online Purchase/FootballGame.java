

/**
 * Purpose: To calculate payments for tickets to a football game and issue a receipt.
 *
 * Paul Chafetz
 * 10/9/2018
 */

import java.util.Scanner;

public class FootballGame
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //introduction and ask for name
        System.out.println("Hello and welcome to the online ticket purchase service!");
        System.out.println();
        System.out.println("First, please enter your full name. (First Last)");
        String firstName = in.next();
        String lastName = in.next();
        System.out.println("Thank you for using our service, " + firstName + " " +lastName + ".");
        
        //ask for date
        System.out.println();
        System.out.println("Please enter today's date. (mm/dd/yyyy)");
        String date = in.next();
        System.out.println();
        
        //name of item and quantity to purchase
        System.out.println("By continuing further, you agree to our privacy policy and consent to any charges made today.");
        System.out.println();
        System.out.println("You will be purchasing ticket(s) to a football game. We will need some information to process this transaction.");
        System.out.println();
        System.out.println("Seating is not reserved. All tickets are sold for $20.00, no refunds.");
        System.out.println();
        System.out.println("How many tickets will you be purchasing?");       
        String tickets = in.next();
        System.out.println();
        System.out.println("You are ordering " + tickets + " ticket(s) to the football game at $20.00 per ticket.");
        System.out.println();
        
        //debit card and PIN
        System.out.println("Please enter a working debit card number. (#####-###-####)");
        String card = in.next();
        System.out.println();
        System.out.println("Also, please enter your PIN. (####)");
        String pin = in.next();
        System.out.println();
        
        //calculate purchase
        double ticketPrice = 20.00;
        int ticketNo = Integer.parseInt(tickets);
        double cost = ticketPrice * ticketNo;
        int pinNo = Integer.parseInt(pin);        
        
        //receipt
        System.out.println("You will be paying $" + cost + " for these tickets.");
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("                         Receipt                         ");
        System.out.println();
        System.out.println("Date: " + date);
        System.out.println("Order number: " + lastName.substring(0,2) + firstName.substring(0,1) + (pinNo * 3));
        System.out.println();
        System.out.println(firstName.substring(0,1) + ". " + lastName);
        System.out.println("Account: #####-###-" + card.substring(10,14));
        System.out.println("Tickets purchased: " + ticketNo);
        System.out.println("Ticket Price: " + "$" + ticketPrice);
        System.out.println();
        System.out.println("$" + cost + " will be debited to your account.");
        System.out.println();
        System.out.println("Please sign here to finalize this purchase: ");
        String signature = in.next();
        System.out.println();
        System.out.println("Thank you for your purchase. We hope you enjoy your time!");
        System.out.println("---------------------------------------------------------");
    }
}
