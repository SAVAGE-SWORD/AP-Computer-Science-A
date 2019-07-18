/**
 * Purpose: The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * Paul Chafetz
 * 10/5/2018
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars

        double audSpent = 2542.50;            // Australian Dollars spent
        double audExchangeRate = 1.42;     // 1 US dollar = 1.42 AUD
        double dollarsSpentInAustralia = audSpent / audExchangeRate;      // US dollars spent in Australia
        double dollarsAfterAustralia = startingUsDollars - dollarsSpentInAustralia;        // US dollars remaining after Australia
        
        
        double yuanSpent = 13808.70;
        double yuanExchangeRate = 6.87;
        double dollarsSpentInChina = yuanSpent / yuanExchangeRate;
        double dollarsAfterChina = dollarsAfterAustralia - dollarsSpentInChina;
        
        double rupeeSpent = 96291.00;
        double rupeeExchangeRate = 74.07;
        double dollarsSpentInIndia = rupeeSpent / rupeeExchangeRate;
        double dollarsAfterIndia = dollarsAfterChina - dollarsSpentInIndia;
               
        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        System.out.println();
        System.out.println("Starting US dollars: " + startingUsDollars);
        System.out.println();
        System.out.println("Australia: ");
        System.out.println("  Australian dollars spent:         $" + audSpent);
        System.out.println("  US dollars equivalent:            $" + dollarsSpentInAustralia);
        System.out.println("  US dollars remaining:             $" + dollarsAfterAustralia);
        System.out.println();
        
        System.out.println();
        System.out.println("China: ");
        System.out.println("  Chinese Yuan spent:               ¥" + yuanSpent);
        System.out.println("  US dollars equivalent:            $" + dollarsSpentInChina);
        System.out.println("  US dollars remaining:             $" + dollarsAfterChina);
        System.out.println();

        System.out.println();
        System.out.println("India: ");
        System.out.println("  Indian Rupees spent:              ₹" + rupeeSpent);
        System.out.println("  US dollars equivalent:            $" + dollarsSpentInIndia);
        System.out.println("  US dollars remaining:             $" + dollarsAfterIndia);
        System.out.println();

        System.out.println("==========================================================");
        System.out.println("Remaining US dollars: ");
        System.out.println("$" + dollarsAfterIndia);
        System.out.println();
        System.out.println();
        
        
        
        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 40;                         //cost per item of first souvenir
        int budget1 = 300;                          //budget for first item
        int totalItems1 = budget1 / costItem1;        //how many items can be purchased
        int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left
        
        System.out.println();
        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 54.55;                       //cost per item of second souvenir
        int budget2 = 425;                              //budget for second item
        int totalItems2 = budget2 / (int)costItem2;    //how many items can be purchased
        double fundsRemaining2 = budget2 % costItem2;   //how much of the budget is left
        
        System.out.println();
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

