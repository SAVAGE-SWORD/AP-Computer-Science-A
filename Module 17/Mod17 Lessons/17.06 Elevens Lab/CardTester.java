/**
 * This is a class that tests the Card class.
 *
 *  Paul Chafetz
 *  5/14/2019
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      Card fiveClubs = new Card("5", "clubs", 5);
      
      // Test card 2 and methods
      System.out.println("**** Tests Card 2: five of clubs ****");
      System.out.println("  rank: " + fiveClubs.rank());
      System.out.println("  suit: " + fiveClubs.suit());
      System.out.println("  pointValue: " + fiveClubs.pointValue());
      System.out.println("  toString: " + fiveClubs.toString());
      System.out.println();
      
      // Test card 3
      Card sevenSpades = new Card("7", "spades", 7);
      
      // Test card 2 and methods
      System.out.println("**** Tests Card 3: seven of spades ****");
      System.out.println("  rank: " + sevenSpades.rank());
      System.out.println("  suit: " + sevenSpades.suit());
      System.out.println("  pointValue: " + sevenSpades.pointValue());
      System.out.println("  toString: " + sevenSpades.toString());
      System.out.println();
      
      // Test matches() method
      System.out.println("**** Tests matches method ****");
      System.out.println("  ace of hearts matches ace of hearts?: " + aceHearts.matches(aceHearts));
      System.out.println("  seven of spades matches ace of hearts?: " + sevenSpades.matches(aceHearts));
      System.out.println("  five of clubs matches seven of spades?: " + fiveClubs.matches(sevenSpades));
   }
}
