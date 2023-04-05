/**Write a program that has variables to hold three test scores. The program should ask the user 
 * to enter three test scores and then assign the values entered to the variables. The program 
 * should display the average of the test stores and the letter grade that is assigned for the 
 * test score average. */

package assignmentLab01;

import java.util.Scanner;
 
public class testScores {
    public static void main (String[]args){
        
        //Holding 3 variables
        double marks1, marks2, marks3, average;
        char grade;

        System.out.println("WELCOME TO STUDENT MARKS AVERAGE PROGRAM");
        System.out.println("------------------------------------------");
        //ASKING FOR MARKS
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks of Subject 1:");
        marks1 = input.nextInt();
        System.out.print("Enter Marks of Subject 2:");
        marks2 = input.nextInt();
        System.out.print("Enter Marks of Subject 3:");
        marks3 = input.nextInt();
        average = (marks1+marks2+marks3)/3;
        //GRADING
        if(average>50 && average<60){
            System.out.println("Grade of Student is D");
        }
        else if(average>60 && average<70){
            System.out.println("Grade of Student is C");
        }
        else if(average>70 && average<80){
            System.out.println("Grade of Student is B");
        }
        else if(average>80 && average<90){
            System.out.println("Grade of Student is A");
        }
        else {
            System.out.println("You're Failed");
        }
    }
 }