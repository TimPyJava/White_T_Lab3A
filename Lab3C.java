/*
Class: CSE 1321L
Section: 5
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Timothy White
Lab#: 3C
*/

/*
IPO

Input- user input number of each coin (quarters, dimes, nickles, pennies)

Process- Total= (# of quarters * 25) = (# of dimes * 10) + (# of nickles * 5) + # of pennies
dollars = total / 100
cents = total % 100

Memory- store # of quarters, nickles, dimes, pennies, and Total amount

Output- display the total amount in jar separated into dollars and cents

*/
/*
CLASS Lab3C 
MAIN 
CREATE quarter
CREATE dime
CREATE nickle
CREATE penny
CREATE total
CREATE dollar
CREATE cent
PRINT "Enter the number of quarters: "
READ quarter
PRINT "Enter the number of dimes: "
READ dime
PRINT "Enter the number of nickles: "
READ nickle
PRINT "Enter the number of pennies: "
READ penny
total = (quarter * 25) + (dime * 10) + (nickle * 5) + penny
dollar = total / 100
cent = total % 100
PRINT "Your total is " + dollar + " dollars and " + cent + " cents."
END MAIN 
CLASS LAB3C
*/

//I recieved help from Andrew A from a tutoring session.

import java.util.Scanner;
class Lab3C {
  public static void main(String[] args) {
    int quarter;
    int nickle;
    int dime;
    int penny;
    int total;
    int dollar;
    int cent;

    Scanner sc = new Scanner(System.in);

    System.out.println(" ");

    System.out.print("Please enter the number of quarters: ");
    quarter = sc.nextInt();

    System.out.print("Please enter the number of dimes: ");
    dime = sc.nextInt();

    System.out.print("Please enter the number of nickles: ");
    nickle = sc.nextInt();

    System.out.print("Please enter the number of pennies: ");
    
    penny = sc.nextInt();

    total = (quarter * 25) + (dime * 10) + (nickle * 5) + penny;

    dollar = total / 100;
    cent = total % 100;

    System.out.println(" ");

    System.out.println("You entered...");
    System.out.println(quarter + " quarters");
    System.out.println(dime + " dimes");
    System.out.println(nickle + " nickles");
    System.out.println(penny + " pennies");
    System.out.println("Your total is " + dollar + " dollar(s) and " + cent + " cent(s).");
  }
}