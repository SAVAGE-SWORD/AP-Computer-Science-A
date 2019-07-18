
/**
 * Calculates the (x,y) coordinates of a circle given the radius.
 *
 * Paul Chafetz
 * 12/3/2018
 */

import java.util.Scanner;

public class CirclePoints
{
    public static void main(String[ ] args)
    {
        //declare all Objects
        Scanner in = new Scanner(System.in);

        //declare all variables
        double radius = 0;
        double x = 1;
        double y = 1;
        double incrementer = 0.1;
        double limiter = 0;

        System.out.println("Hello, this program will compute the coordinates of a circle given the radius.");
        System.out.println("\nPlease input the radius of the circle you desire.");
        radius = in.nextDouble();
        System.out.println("\nPlease choose the rate of increment: 0.1, 0.01, or 0.001");
        System.out.println("0.1 is the default incrementer value.");
        incrementer = in.nextDouble();
        System.out.println("\n");

        //limiter/incrementer logic
        if (incrementer == 0.1)
            limiter = 21;
        else if (incrementer == 0.01)
            limiter = 201;
        else if (incrementer == 0.001)
            limiter = 2001;
        else {
            limiter = 21;
            incrementer = 0.1;
            System.out.println("That is not a valid choice. Using default values.\n");
        }
        
        //output + math
        System.out.println("Points on a circle for radius: " + radius + "\n");
        System.out.printf("%2s%2s%8s%2s%8s%2s%8s%2s", "", "x1", "", "y1", "", "x2", "", "y2");
        System.out.println();

        //y=sqrt(r^2-x^2)
        for (int i = 0; i < limiter; i++) {
            y = Math.sqrt((Math.pow(radius,2) - Math.pow(x,2)));
            System.out.printf("%5.2f%5s%5.2f%5s%5.2f%5s%5.2f\n", x, "", y, "", x, "", -y);
            x -= incrementer;
        }
        System.out.println("\t      *Radii less than or equal to 1 may create NaN values!*\n");
        System.out.println("\n\t\tThank you for using Paul's Coordinate Calculator!");
    }
}