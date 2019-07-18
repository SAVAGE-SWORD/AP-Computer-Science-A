/**
 * This is a class that tests the Deck class.
 *
 *  Paul Chafetz
 *  5/16/2019
 */

public class DeckTester
{
    /**
     * The main method in this class checks the Deck operations for consistency.
     * @param args is not usemyDeck.
     */
    public static void main(String[] args)
    {

        // String[] myRanks = {"Five", "Jack", "Three", "Queen", "King", "Four", "Ace", "Eight", "Ten", "Jack"};
        // String[] mySuits = {"Hearts", "Diamonds", "Spades", "Clubs", "Clubs", "Hearts", "Diamonds", "Diamonds", "Hearts", "Spades"};
        // int[] myPointValues = {5, 11, 3, 12, 13, 4, 1, 8, 10, 11};
        // Deck myDeck = new Deck(myRanks, mySuits, myPointValues);

        // System.out.println("**** Original Deck Methods ****");
        // System.out.println("  toString: \n" + myDeck.toString());
        // System.out.println("  isEmpty: " + myDeck.isEmpty());
        // System.out.println("  size: " + myDeck.size());
        // System.out.println();
        // System.out.println();

        // System.out.println("**** Deal a Card ****");
        // System.out.println("  deal: " + myDeck.deal());
        // System.out.println();
        // System.out.println();

        // System.out.println("**** Deck Methods After 1 Card Dealt ****");
        // System.out.println("  toString:\n" + myDeck.toString());
        // System.out.println("  isEmpty: " + myDeck.isEmpty());
        // System.out.println("  size: " + myDeck.size());
        // System.out.println();
        // System.out.println();

        // System.out.println("**** Deal Remaining 9 Cards ****");
        // System.out.println("  deal: " + myDeck.deal());
        // System.out.println("  deal: " + myDeck.deal());
        // System.out.println("  deal: " + myDeck.deal());
        // System.out.println("  deal: " + myDeck.deal());
        // System.out.println("  deal: " + myDeck.deal());
        // System.out.println("  deal: " + myDeck.deal());
        // System.out.println("  deal: " + myDeck.deal());
        // System.out.println("  deal: " + myDeck.deal());
        // System.out.println("  deal: " + myDeck.deal());
        // System.out.println();
        // System.out.println();

        // System.out.println("**** Deck Methods After All Cards Dealt ****");
        // System.out.println("  toString:\n" + myDeck.toString());
        // System.out.println("  isEmpty: " + myDeck.isEmpty());
        // System.out.println("  size: " + myDeck.size());
        // System.out.println();
        // System.out.println();

        // System.out.println("**** Deal a Card From Empty Deck ****");
        // System.out.println("  deal: " + myDeck.deal());
        // System.out.println();
        // System.out.println();

        System.out.println("\n**** 52 Card Deck shuffle Tests ****");
        String[] ranks52 = new String[52];
        String[] suits52 = new String[52];
        int[] pointValues52 = new int[52];
        //I'm lazy, so I invented this process to create a deck of cards
        //rather than add each one to an array multiple times
        for (int i = 0; i < ranks52.length; i++) {
            String rank = "", suit = "";
            if ((i + 1) %13 == 1)
                rank = "ace";
            else if ((i + 1) %13 == 11)  
                rank = "jack";    
            else if ((i + 1) %13 == 12)
                rank = "queen";
            else if ((i + 1) %13 == 0)
                rank = "king";
            else
                rank = Integer.toString((i + 1) % 13);
            if (i < 13) {
                suit = "hearts";
            }
            else if (i < 26) {
                suit = "diamonds";
            }
            else if (i < 39) { 
                suit = "clubs";
            }
            else {
                suit = "spades";
            }
            ranks52[i] = rank;
            suits52[i] = suit;
            pointValues52[i] = ((i + 1) % 13);
        }

        System.out.println("  The Starting Deck ");
        Deck deck = new Deck(ranks52, suits52, pointValues52);
        System.out.println(deck);

        System.out.println("  The Deck After Dealing a Card" );
        System.out.println(deck.deal());
        System.out.println(deck);
        
        System.out.println("  Shuffling the Deck ");
        deck.shuffle();
        System.out.println(deck);
    }
}
