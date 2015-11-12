/*
 * Vitaliy Tsekhanskiy
 * CISC3150
 * 8/22/2015
 *
 * Write a program that prompts the user to enter the center coordinates and
 * radiuses of two circles. Determine whether they are separate from each
 * other, touching each other, overlapping each other, or completely within
 * one another. Test each case and show the output.
 */
 
import static java.lang.Math.pow;
import java.util.Scanner;
 
public class Question6 {
    public static void main(String[] args){
 
        double x, x2, y, y2, r=0, r2=0;
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Circle 1");
        System.out.println("===============================");
        System.out.print("First Coordinate: ");
                x = sc.nextDouble();
        System.out.print("Second Coordinate: ");
                y = sc.nextDouble();
        System.out.print("Radius: ");
                r = sc.nextDouble();
        System.out.println();
 
        System.out.println("Circle 2");
        System.out.println("===============================");
        System.out.print("First Coordinate: ");
                x2 = sc.nextDouble();
        System.out.print("Second Coordinate: ");
                y2 = sc.nextDouble();
        System.out.print("Radius: ");
                r2 = sc.nextDouble();
        System.out.println();
 
        //Distance Formula
        double distanceX = Math.pow((x-x2), 2);
        double distanceY = Math.pow((y-y2), 2);
        double distance = Math.sqrt(distanceX + distanceY);
 
        System.out.println("Your distance is: " + distance);
 
 
        if (distance == (r + r2))
            System.out.println("Touching Circles.");
        else if ((distance <= (r2 - r)) || (distance <= (r - r2)))
            System.out.println("Overlapping Venn Diagram Circles.");
        else if (distance > (r + r2))
            System.out.println("Separate, Mutually Exclusive Circles.");
        else if (distance < (r + r2))
            System.out.println("Overlapping Circles.");
        sc.close();
    }
 
}