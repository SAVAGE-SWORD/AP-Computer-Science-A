
/**
 * Purpose: To calculate a user's BMI and display the conditional results. 
 *
 * Paul Chafetz
 * 10/13/2018
 */

import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //get name
        System.out.println("Hello! What is your name? (First Last)");
        String name = in.nextLine();
        System.out.println("Thank you, " + name + ".");
        System.out.println();
        
        //get weight (imperial (lb))
        System.out.println("Please enter your current weight in pounds.");
        String weightImp = in.next();
        System.out.println("Understood. You weigh " + weightImp + " pounds.");
        System.out.println();
        
        //get height (ft in)
        System.out.println("Please enter your height with a space between the feet and inches. (E.G. 5 11)");
        String heightFeet = in.next();
        String heightInch = in.next();
        System.out.println("You are " + heightFeet + " feet " + heightInch + " inches tall.");
        System.out.println();
        
        //parse data
        double weightLb = Double.parseDouble(weightImp);
        int heightFt = Integer.parseInt(heightFeet);
        int heightIn = Integer.parseInt(heightInch);
        
        //convert to metric and calculate BMI
        double weightKg = weightLb * 0.45359237; // kg = 0.453*lb
        int heightImp = heightIn + heightFt * 12; // in = 12*ft
        double heightM = heightImp / 39.37007874; // m = 39.37/in
        double bMI = weightKg / (heightM * heightM);
        
        //conditions of BMI
        String weightStatus = "";
        if (bMI < 18.5)
            weightStatus = "Underweight";
        else if (bMI <= 24.9)
            weightStatus = "Normal or Healthy Weight";
        else if (bMI <= 29.9)
            weightStatus = "Overweight";
        else
            weightStatus = "Obese";
            
        //display data
        System.out.println("\n");
        System.out.println("                  Body Mass Index Calculator");
        System.out.println("                 ----------------------------\n");
        System.out.println("The formula for BMI is your weight divided by your height squared.");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Height in meters: " + heightM + " meters.");
        System.out.println("Weight in kilograms: " + weightKg + " kilograms.");
        System.out.println("BMI: " + bMI);
        System.out.println("Category: " + weightStatus);
        System.out.println("\n");
        //rating score
        System.out.println("Thank you for using Paul's BMI Calculator!");
        System.out.println("On a scale of 1-5, how did you enjoy this program?");
        String score = in.next();
        int rating = Integer.parseInt(score);
        if (rating > 5)
            System.out.println("Wow! You liked it so much that you overscored it!");
        else if (rating == 5) {
            System.out.println("Thank you for your nice review!");
            System.out.println("You must have really enjoyed this to give it a 5!");
            }
        else if (rating == 4)
            System.out.println("That's still a very nice score! Thank you for liking this program!");
        else if (rating == 3)
            System.out.println("Thank you for your answer. An average score is stil appreciated here!");
        else if (rating == 2) {
            System.out.println("This means that there was something you really disliked with this.");
            System.out.println("Please let Paul know why you rated this as a 2.");
            }
        else if (rating == 1) {
            System.out.println("Thanks for the honest review.");
            System.out.println("If this is how you truly feel, please let Paul know how he can improve.");
            }    
        else {
            System.out.println("Less than a 1? Now you're trying to make me sad.");
            System.out.println("If that's how you feel, I'll work to make it better (I hope...)");
            }
        }
}
