
/**
 * To create a cipher decryption and decrypt a message
 *
 * @author Paul Chafetz
 * @version 4/3/2019
 */
public class Decryption
{
    /**
     * Default constructor for objects of class Decryption
     */
    public Decryption()
    {
    }
    
    //Note: This class is almost the same as Encryption, however...
    //instead of adding the shift to the letters' positions, I subtracted them
    /**
     * Creates and prints the decoded cipher alphabet before and after shift
     */
    public static String[] getCipherAlphabet(int shift)
    {
        String[] cipherAlphabet = new String[26];
        for (int i = 0; i < cipherAlphabet.length; i++) {
            if (i - shift >= 0 && i - shift <= 25)
                cipherAlphabet[i] = CaesarTester.alphabet[i - shift];    
            else
                cipherAlphabet[i] = CaesarTester.alphabet[i - shift + 26];
        }

        //print the original and the shifted alphabets
        System.out.println("The original alphabet:");
        for (String l : CaesarTester.alphabet)
            System.out.print(l + " ");
        System.out.println("\n\nYour new decoded cipher:");
        for (String l : cipherAlphabet)
            System.out.print(l + " ");
        System.out.println();

        return cipherAlphabet;
    }

    /**
     * Applies decoded cipher alphabet above to each letter in the message to code
     */
    public static String decrypter(String[] ciphAlpha, String statement)
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
