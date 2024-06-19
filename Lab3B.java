/*
Class: CSE 1321L
Section: 5
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Timothy White
Lab#: 3B
*/
/*
IPO

Input- user input the amount of hours and the grade for all of their courses

Process- take the sum of the hours and quality points; GPA = quality pts total / total hours

Memory- all variables are Floats; hrs1, hrs2, hrs3, hrs4 for each course hours; grade1, grade2, grade3, grade4 for each grade in course; hrsTotal for total hours; qualityTotal for total quality points

Output- display each course hours and grade quality points, the total hours, the total quality points, and the GPA

*/

/*
Pseudocode
CLASS Lab3B
MAIN 
CREATE hrs1
CREATE hrs2
CREATE hrs3
CREATE hrs4
CREATE grade1
CREATE grade2
CREATE grade3
CREATE grade4
CREATE hrsTotal
CREATE qualityTotal
create gpa
PRINT " Grade to QP
       A = 4 quality points
       B = 3 quality points
       C = 2 quality points
       D = 1 quality point
       F = 0 quality points"
PRINT "Course 1 hours: " 
READ hrs1
PRINT "Quality points for course: "
READ grade1
PRINT "Course 2 hrs: "
READ hrs2
PRINT "Quality points for course: "
READ grade2
PRINT "Course 3 hrs: "
READ hrs3
PRINT "Quality points for course: "
READ grade3
PRINT "Course 4 hours: ";
READ hrs4
PRINT "Quality points for course: "
READ grade4;
hrsTotal = hrs1+hrs2+hrs3+hrs4
qualityTotal= (hrs1 * grade1) +(hrs2 * grade2) + (hrs3 * grade3) + (hrs4 * grade4)
gpa = qualityTotal / hrsTotal
PRINT "Total hours is: " + hrsTotal
PRINT "Total quality points is: " + qualityTotal
PRINT "Your GPA is: " + gpa
END MAIN 
END LAB3B
*/

import java.util.Scanner;
class Lab3B { 
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    double hrs1;
    double grade1;
    double hrs2;
    double grade2;
    double hrs3;
    double grade3;
    double hrs4;
    double grade4;
    double hrsTotal;
    double qualityTotal;
    double gpa;

    System.out.println("Grade to QP\nA = 4 quality points\nB = 3 quality points\nC = 2 quality points\nD = 1 quality point\nF = 0 quality points");
    
    System.out.println(" ");

    System.out.print("Course 1 Hours: ");
    hrs1 = sc.nextDouble();

    System.out.print("Grade for course 1: ");
    grade1 = sc.nextDouble();

    System.out.print("Course 2 Hours: ");
    hrs2 = sc.nextDouble();

    System.out.print("Grade for course 2: ");
    grade2 = sc.nextDouble();

    System.out.print("Course 3 Hours: ");
    hrs3 = sc.nextDouble();

    System.out.print("Grade for course 3: ");
    grade3 = sc.nextDouble();

    System.out.print("Course 4 hours: ");
    hrs4 = sc.nextDouble();

    System.out.print("Grade for course 4: ");
    grade4 = sc.nextDouble();

    hrsTotal = hrs1 + hrs2 + hrs3 + hrs4; 

    qualityTotal = (hrs1 * grade1) + (hrs2 * grade2) + (hrs3 * grade3) + (hrs4 * grade4);

    gpa = qualityTotal / hrsTotal;

    System.out.println(" ");

    System.out.println("Total hours: " + (int)hrsTotal);

    System.out.println("Total quality points is: " + (int)qualityTotal);

    System.out.println("Your GPA for this semester is: " + gpa);
  }
} 