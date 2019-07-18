
/**
 * Calculates the TDEE of a person based on conditions of gender and activity in tandem.
 *
 * Paul Chafetz
 * 10/19/2018
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
     
    //introduction and get basic information
    System.out.println("Hello and welcome to the Total Daily Energy Expenditure calculator.\n");
    System.out.println("What is your name?");
    String name = in.nextLine();
    System.out.println();
    System.out.println("Thank you, " + name + ".\n");
    System.out.println("Please enter your BMR (Basal Metabolic Rate).");
    String bMR = in.next();
    System.out.println();
    System.out.println("Now, please enter your gender (M/F).");
    String gender = in.next();
    System.out.println("\n");
     
    //gender boolean
    boolean isMale = true;
    if (gender.equalsIgnoreCase("F"))
         isMale = false;
    else if (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F"))
        System.out.println("Please restart the program and choose \"M\" or \"F\" for your gender.");
    
    //activity level menu
    System.out.println("Please select the Activity Level that best describes you.\n");
    System.out.println("(A) Resting (Sleeping, Reclining)");
    System.out.println("(B) Sedentary (Minimal Movement)");
    System.out.println("(C) Light (Sitting, Minor Activity)");
    System.out.println("(D) Moderate (Light Manual Labor)");
    System.out.println("(E) Very Active (Hard Manual Labor)");
    System.out.println("(F) Extremely Active (Heavy Manual Labor)\n");
    String activity = in.next();
    
    //logic for activity level/factor
    double aF = 0;
    if (isMale==true) {
        if (activity.equalsIgnoreCase("A"))
        aF = 1.0;
        else if (activity.equalsIgnoreCase("B"))
        aF = 1.3;
        else if (activity.equalsIgnoreCase("C"))
        aF = 1.6;
        else if (activity.equalsIgnoreCase("D"))
        aF = 1.7;
        else if (activity.equalsIgnoreCase("E"))
        aF = 2.1;
        else if (activity.equalsIgnoreCase("F"))
        aF = 2.4;
        else {
        System.out.println("Please restart the program and choose one of the choices above (A-F).");
        activity = "Error!";
        }
    }   
    else if (isMale==false) {
        if (activity.equalsIgnoreCase("A"))
        aF = 1.0;
        else if (activity.equalsIgnoreCase("B"))
        aF = 1.3;
        else if (activity.equalsIgnoreCase("C"))
        aF = 1.5;
        else if (activity.equalsIgnoreCase("D"))
        aF = 1.6;
        else if (activity.equalsIgnoreCase("E"))
        aF = 1.9;
        else if (activity.equalsIgnoreCase("F"))
        aF = 2.2;
        else {
        System.out.println("Please restart the program and choose one of the choices above (A-F).");  
        activity = "Error!";
        } 
    }
    
    //tdee
    double bMRate = Double.parseDouble(bMR);
    double tdee = bMRate * aF;
    
    //results
    System.out.println("You chose Activity Level: " + activity.toUpperCase() + "\n");
    System.out.println("Name: " + name + "                  Gender: " + gender.toUpperCase() + "\n");
    System.out.println("BMR: " + bMR + " calories           Activity Factor: " + aF + "\n");
    System.out.println("TDEE: " + tdee + " calories.");
    }
}

