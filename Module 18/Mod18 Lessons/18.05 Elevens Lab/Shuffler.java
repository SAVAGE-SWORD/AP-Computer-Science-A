/**
 * This class provides a convenient way to test shuffling methods.
 *
 *
 *  Paul Chafetz
 *  5/16/2019
 */
public class Shuffler
{

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure. Change this value to your code.
     */
    private static final int SHUFFLE_COUNT = 5;

    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args)
    {
        System.out.println("Results of " + SHUFFLE_COUNT +
            " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++)
        {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++)
            {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
            " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++)
        {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++)
            {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values)
    {
        int[] a = new int[values.length / 2];
        int[] b = new int[values.length - values.length / 2];
        for (int i = 0; i < values.length / 2; i++)
            a[i] = values[i];
        for (int i = 0; i < values.length - values.length / 2; i++)
            b[i] = values[i + values.length / 2];
        for (int i = 0; i < values.length / 2; i++) {
            values[2 * i] = b[i];
            values[2 * i + 1] = a[i];
        }
        if (values.length % 2 != 0)
            values[values.length - 1] = b[values.length - values.length / 2];
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values)
    {
        for (int k = values.length - 1; k >= 0; k--) {
            int random = (int)((k + 1) * Math.random());
            int tempValue = values[random];
            values[random] = values[k];
            values[k] = tempValue;
        }
    }
}
