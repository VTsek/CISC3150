/*
 * Vitaliy Tsekhanskiy
 * Homework2, Question2
 * CISC 3150
 *
 *
 * Write a program that displays a calendar on the screen. It asks the user
 * the year, what day the first of January fell on, then displays every month
 * from January to December. Make sure to get the leap years right.
 */
 
import java.util.*;
 
public class Calendar {
 
 
    public final static int monthDays[] = {31, 28, 31, 30, 31, 30,
                                                                                   31, 31, 30, 31, 30, 31 }; // Static number of days per month
 
    public static void printHeader(String month, int year){
 
            System.out.println("\n" + month + " " + year);
 
            System.out.println("=================================");
 
            System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
 
    }
 
    public static String monthToString(int num) {
        String[] months = {"January", "February", "March",
                          "April", "May", "June", "July",
                           "August", "September", "October",
                           "November", "December"};
        return months[num];
 
    }
 
       
    public static int leapYearCalc(int year) {
        if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ) { //Leap Yr Formula: https://www.codecademy.com/forum_questions/4faafc469961aa0003000a1c
           return 29;
        } else {
           return 28;
        }
    }
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter year: ");
 
        int yr = input.nextInt();
 
 
 
        System.out.print("\nEnter a number between 0 to 6 for the first day, Sunday being 0, Monday being 1: ");
 
        int day = input.nextInt();
               
 
        for(int i = 0; i < 12; i++) {
 
        String numToMonth = null;
       
        int numOfDays;
 
        numToMonth = monthToString(i);
 
        if (!(i == 1)) {
           numOfDays = monthDays[i];
        }
        else {
           numOfDays = leapYearCalc(yr);
        }
       
        printHeader(numToMonth, yr);
       
                for (int spaces=1; spaces<=day; spaces++)
                {System.out.print("     ");}
               
                for (int j=1; j<=numOfDays ; j++)
                                {  
                          if (day%7==0 && day!=0)
                                System.out.println();
                                                        System.out.printf("%2d   ", j);
                                                        day+=1;
                                }
           
                        day%=7;    
            System.out.print("\n\n");
        }
 input.close();
    }
}