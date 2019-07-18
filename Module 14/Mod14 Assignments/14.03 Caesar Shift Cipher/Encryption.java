
/**
 * To create a cipher encryption and encrypt a message
 *
 * @author Paul Chafetz
 * @version 4/3/2019
 */
public class Encryption
{
    /**
     * Default constructor for objects of class Encryption
     */
    public Encryption()
    {
    }

    /**
     * Creates and prints the encoded cipher alphabet before and after shift
     */
    public static String[] getCipherAlphabet(int shift)
    {
        String[] cipherAlphabet = new String[26];
        //for each letter in the alphabet array, add the shift to its position
        //and set that to the cipher alphabet, making sure not to overflow past element 25 (z)
        for (int i = 0; i < cipherAlphabet.length; i++) {
            if (i + shift >= 0 && i + shift <= 25)
                cipherAlphabet[i] = CaesarTester.alphabet[i + shift];    
            else
                cipherAlphabet[i] = CaesarTester.alphabet[i + shift - 26];
        }

        //print the original and the shifted alphabets
        System.out.println("The original alphabet:");
        for (String l : CaesarTester.alphabet)
            System.out.print(l + " ");
        System.out.println("\n\nYour new encoded cipher:");
        for (String l : cipherAlphabet)
            System.out.print(l + " ");
        System.out.println();

        return cipherAlphabet;
    }

    /**
     * Applies encoded cipher alphabet above to each letter in the message to code
     */
    public static String encrypter(String[] ciphAlpha, String statement)
    {
        String code = "";
        //if there's a space, don't shift it and add a space to the code.
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == ' ')
                code += " ";
            //for each letter in the statement, when it is the same letter/index as in the alphabet array
            //add the same index but in the shifted alphabet
            else {
                for (int j = 0; j < ciphAlpha.length; j++) {
                    if (statement.substring(i, i + 1).equals(CaesarTester.alphabet[j]))
                        code += ciphAlpha[j];
                }
            }
        }

        return code;
    }
}
