/*
Class: CSE 1321L
Section: 5
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Timothy White
Lab#: 3A
*/

/*
IPO

Input- User input amount of money owed and APR

Process- monthly payment = amount owed * APR / 12; monthly percentage rate = APR / 12

Memory- variables for amount owed, APR, monthly percentage rate, and minimum monthly payment

Output- Amount owed: (Amount)
        APR: (Amount)
        Monthly rate: (amount)
        Min payment: (amount)
*/
/*
Pseudocode
CLASS LAB3A 
MAIN 
CREATE amtOwed
CREATE apr 
CREATE monthRate
CREATE minPay
PRINT "Enter amount owed: "
READ amtOwed
PRINT "Enter APR: "
READ apr
minPay = amtOwed * APR / 12
monthRate = APR / 12
PRINT "Amount owed: "+ amtOwed
PRINT "APR: " + apr
PRINT "Monthly percentage rate: " + monthRate
PRINT "Minimum payment: " + minPay
END MAIN 
END LAB3A
*/
// I recieved help during tutoring by Preston Brinkley.
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Integer amtOwed;
    float apr;
    float monthRate;
    float minPay;
    System.out.print("Enter amount owed: $");
    amtOwed = sc.nextInt();

    System.out.print("Enter APR in a decimal number: ");
    apr = sc.nextFloat();

    monthRate = apr / 12; 
    minPay = amtOwed * (apr / 12 / 100); 

    System.out.println(" ");
    System.out.println("Amount owed: " + amtOwed);
    System.out.println("APR: " + apr);
    System.out.println("Monthly percentage rate: " + monthRate);
    System.out.println("Minimum payment: " + "$" + minPay);
  }
}