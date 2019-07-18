/**
 * To test the Encryption and Decryption classes
 *
 * @author Paul Chafetz
 * @version 4/3/2019
 */
import java.util.Scanner;
public class CaesarTester
{
    //class variables
    public static final String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o","p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private static int shift;

    public static void main(String args[])
    {
        //create Scanner and instantiate variables
        Scanner in = new Scanner(System.in);
        int choice = 0;
        boolean quit = false;
        String[] cipher;
        String statement;

        //menu options to encrypt, decrypt, or quit
        while (quit == false) {
            System.out.println("Please select an option below.");
            System.out.println("\t1.Encrypt");
            System.out.println("\t2.Decrypt");
            System.out.println("\t3.Quit");
            choice = in.nextInt();
            while (choice < 1 || choice > 3) {
                System.out.println("Error. Invalid option. Please try again.");
                choice = in.nextInt();
            }

            //to encrypt, get the shift and apply it to the encryption method
            if (choice == 1) {
                System.out.println("Please input the shift for your encryption. [0-25]");
                shift = in.nextInt();
                while (shift < 0 || shift > 25) {
                System.out.println("Error. Invalid shift. Please try again.");
                shift = in.nextInt();
                }
                cipher = Encryption.getCipherAlphabet(shift);
                System.out.println("\nPlease enter a message to encrypt, omitting punctuation. [a-z]");
                statement = in.next() + in.nextLine();
                System.out.println("Encrypted message: " + Encryption.encrypter(cipher, statement) + "\n\n");
            }

            //to decrypt, get the shift and apply it to the decryption method
            if (choice == 2) {
                System.out.println("Please input the shift for your decryption. [0-25]");
                shift = in.nextInt();
                while (shift < 0 || shift > 25) {
                System.out.println("Error. Invalid shift. Please try again.");
                shift = in.nextInt();
                }
                cipher = Decryption.getCipherAlphabet(shift);
                System.out.println("\nPlease enter a message to decrypt, omitting punctuation. [a-z]");
                statement = in.next() + in.nextLine();
                System.out.println("Decrypted message: " + Decryption.decrypter(cipher, statement) + "\n\n");
            }

            //to quit, input the number 3
            if (choice == 3) {
                quit = true;
                System.out.println("\t\t\tThank you and goodbye!");
            }
        }
    }
}
