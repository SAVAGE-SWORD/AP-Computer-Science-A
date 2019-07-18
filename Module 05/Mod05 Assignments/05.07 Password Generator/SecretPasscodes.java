
/**
 * Generates user-controlled random passwords from the ASCII character table.
 *
 * Paul Chafetz
 * 11/17/2018
 */
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
public class SecretPasscodes
{
    public static void main (String [ ] args) throws IOException
    {
        //declare all Classes and Objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        PrintWriter outFile = new PrintWriter(new File("passwords.txt"));
        File filename = new File("passwords.txt");
        Scanner inFile = new Scanner(filename);

        //declare all variables
        int numPass = 0; //number of passwords
        int passCt = 0; //incrementer for numPass
        int choice = 0; //selection choice
        int length = 0; //password length
        int count = 0; //incrementer for length
        int flip = 0; //alternating char sets
        int random = 0; //char values
        int changer = 0; //symbols since they are separated in ASCII table
        int fileCt = 1;
        String display = ""; //to show passwords or not
        String filePass = ""; //password from inFile
        String password = ""; //final password

        //this assignment would be much easier if I could use charAt from a String of characters..

        //introduction and options
        System.out.println("\n\n                              Password Generator Menu");
        System.out.println("*********************************************************************************\n");
        System.out.println("Please select one of the options below (1-5).");
        System.out.println("(1) Lowercase Letters");
        System.out.println("(2) Lowercase and Uppercase Letters");
        System.out.println("(3) Lowercase, Uppercase, and Numbers");
        System.out.println("(4) Lowercase, Uppercase, Numbers, and Symbols");
        System.out.println("(5) Exit Password Generator\n");
        System.out.println("*********************************************************************************\n");

        //check choice number + error handler
        choice = in.nextInt();
        System.out.println("You have chosen option: " + choice);

        //exit if choice 5 is selected + error handler 
        while ((choice > 5) || (choice < 1)) {
            System.out.println("Sorry, that is not a valid choice code! Please try again.");
            choice = in.nextInt();
        }
        if (choice == 5) {
            System.out.println("Exiting Password Generator. Have a nice day!");
            return;
        }

        //ask for password length + error handler
        System.out.println("\nHow long do you want your passwords to be? Must be six (6) or greater characters.");
        length = in.nextInt();
        while (length < 6) {
            System.out.println("Sorry! Please pick a longer password length!");
            length = in.nextInt();
        }
        System.out.println("You have chosen a password length of " + length + " characters.");

        //ask for number of passwords to make
        System.out.println("\nLastly, how many passwords would you like?");
        numPass = in.nextInt();
        System.out.println("You have chosen to create " + numPass + " passwords.");

        //normally I'd use charAt values to look at a random index value... :(

        for (passCt = 0; passCt < numPass; passCt++) {    
            //lowercase
            if (choice == 1) {
                for (count = 0; count < length; count++) {
                    random = (rand.nextInt(26) + 97);
                    password += (char)random;
                }
            }  
            //lowercase and uppercase
            if (choice == 2) {
                for (count = 0; count < length; count++){
                    flip = rand.nextInt(2); //choose between 0 and 1
                    if (flip == 0) {
                        random = (rand.nextInt(26) + 97);
                        password += (char)random;
                    }
                    else if (flip == 1) {
                        random = (rand.nextInt(26) + 65);
                        password += (char)random;
                    }
                }
            }
            //lowercase, uppercase, and numbers
            if (choice == 3) {
                for (count = 0; count < length; count++) {
                    flip = rand.nextInt(3); //choose between 0, 1, and 2
                    if (flip == 0) {
                        random = (rand.nextInt(26) + 97);
                        password += (char)random;
                    }
                    else if (flip == 1) {
                        random = (rand.nextInt(26) + 65);
                        password += (char)random;
                    }
                    else if (flip == 2) {
                        random = (rand.nextInt(10) + 48);
                        password += (char)random;
                    }
                }
            }
            //lowercase, uppercase, numbers, and symbols   
            if (choice == 4) {
                for (count = 0; count < length; count++) {
                    flip = rand.nextInt(4); //choose between 0, 1, 2, and 3
                    if (flip == 0) {
                        random = (rand.nextInt(26) + 97);
                        password += (char)random;
                    }
                    else if (flip == 1) {
                        random = (rand.nextInt(26) + 65);
                        password += (char)random;
                    }
                    else if (flip == 2) {
                        random = (rand.nextInt(10) + 48);
                        password += (char)random;
                    }
                    else if (flip == 3) {
                        changer = rand.nextInt(3); //since the symbols in ASCII are split, this variable chooses where to take from
                        if (changer == 0) {
                            random = (rand.nextInt(8) + 58);
                            password += (char)random;
                        }
                        else if (changer == 1) {
                            random = (rand.nextInt(6) + 91);
                            password += (char)random;
                        }
                        else if (changer == 2) {
                            random = (rand.nextInt(4) + 123);
                            password += (char)random;
                        }  
                    }
                }
            }
            outFile.println(password);
            password = "";
        }
        //write passwords to file and offer to display others
        System.out.println("\nYour password(s) will be written to passwords.txt\n");

        outFile.close();
        System.out.println("\n\n                Thank you for using Paul's Password Generator!");

        System.out.println("\n\nWould you like to display your passwords here? (Y/N)");
        display = in.next();
        if (display.equalsIgnoreCase("Y"))
            while (inFile.hasNext()) {
                filePass = inFile.next(); 
                System.out.println(fileCt + "\t" + filePass);
                fileCt++;
            }

        System.out.println("\nThank you and have a nice day!");
        inFile.close();       
    }
}
