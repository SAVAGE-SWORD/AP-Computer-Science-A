
/**
 * Purpose: To perform calculations and assign variables in Java to solve mathematical expressions.
 *
 * @author Paul Chafetz
 * @version 9/29/2018
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        int intA = 25;
        int intB = 9;
        double dubA = 43.21;
        double dubB = 3.14;
        // Addition
        System.out.println("Addition");
        System.out.println(intA + " + " + intB + " = " + (intA + intB)); 
        System.out.println(dubA + " + " + dubB + " = " + (dubA + dubB));
        System.out.println();
        
        int intC = 11;
        int intD = 9;
        int intE = 25;
        double dubC = 10.0;
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(intC + " - " + intD + " - " + intE + " = " + (intC - intD - intE));
        System.out.println(dubB + " - " + dubC + " = " + (dubB - dubC));
        System.out.println();
        
        int intF = 25;
        int intG = 9;
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(intF + " * " + intG + " = " + (intF * intG)); 
        System.out.println(dubB + " * " + dubC + " * " + dubC + " = " + (dubB * dubC * dubC));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(intG + "/" + intF + " = " + (intG / intF));
        System.out.println(dubA + "/" + dubC + " = " + (dubA / dubC));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( intC + " % " + intD + " = " + (intC % intD));
        System.out.println( dubC + " % " + dubB + " = " + (dubC % dubB));
        System.out.println();
        
        int intH = 12;
        int intI = 5;
        double dubD = 37.6783;
        int intJ = 18;
        int intK = 22;
        double dubE = 2.5;
        int intL = 31;
        int intM = 28;
        double dubF = 9.2055;
        // 2.03 and 2.04 Additional Equations
        System.out.println("Additional Integer and Double Equations");
        System.out.println(intH + " + " + intI + " - " + dubD + " = " + (intH + intI - dubD));
        System.out.println(intJ + " - " + intK + " * " + dubE + " = " + (intJ - intK * dubE));
        System.out.println(intL + " / " + intM + " % " + dubF + " = " + (intL / intM % dubF));
        System.out.println();
        
    } // end of main method
} // end of class