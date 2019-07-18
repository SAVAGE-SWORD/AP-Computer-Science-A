
/**
 * Purpose: To perform calculations and assign variables in Java to solve mathematical expressions.
 *
 * @author Paul Chafetz
 * @version 9/29/2018
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        int intA = 25;
        int intB = 9;
        // Addition
        System.out.println("Addition");
        System.out.println(intA + " + " + intB + " = " + (intA + intB)); 
        System.out.println("43.21 + 3.14 = " + (43.21 + 3.14));
        System.out.println();
        
        int intC = 11;
        int intD = 9;
        int intE = 25;
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(intC + " - " + intD + " - " + intE + " = " + (intC - intD - intE));
        System.out.println( "3.14 - 10.0 = " + (3.14 - 10.0));
        System.out.println();
        
        int intF = 25;
        int intG = 9;
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(intF + " * " + intG + " = " + (intF * intG)); 
        System.out.println("3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(intG + "/" + intF + " = " + (intG / intF));
        System.out.println( "43.21 / 10.0 = " + (43.21 / 10.0));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( intC + " % " + intD + " = " + (intC % intD));
        System.out.println( "10.0 % 3.14 = " + (10.0 % 3.14));
        System.out.println();
        
        int intH = 12;
        int intI = 5;
        int intJ = 37;
        int intK = 18;
        int intL = 22;
        int intM = 2;
        int intN = 31;
        int intO = 28;
        int intP = 9;
        // 2.03 Additional int Equations
        System.out.println("Additional Integer Equations");
        System.out.println(intH + " + " + intI + " - " + intJ + " = " + (intH + intI - intJ));
        System.out.println(intK + " - " + intL + " * " + intM + " = " + (intK - intL * intM));
        System.out.println(intN + " / " + intO + " % " + intP + " = " + (intN / intO % intP));
        System.out.println();
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class