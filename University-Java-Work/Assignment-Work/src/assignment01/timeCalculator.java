/*8Write a program that asks the user to enter a number of seconds. 

• There are  60 seconds in a minute. If the number of seconds entered by the user is greater 
than or equal to 60, the program should display the number of minutes in that many seconds. 

• There are 3,600 seconds in an hour. If the number of seconds entered by the user is greater 
than or equal to 3,600, the program should display the number of hours in that many seconds. 

• There are 86,400 seconds in a day. If the number of seconds entered by the user is greater 
than or equal to 86,400, the program should display the number of clays in that many seconds.

 */

package assignment01;
import java.util.Scanner;
public class timeCalculator {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        double seconds, time;
        System.out.println("TIME CALCULATOR");
        System.out.println("----------------");
        System.out.println("");
        System.out.print("Enter Number of Seconds: ");
        seconds = input.nextInt();
        if (seconds>=60 || seconds<=3600){
            time=seconds/60;
            System.out.println("Number of Minutes are: "+time);
        }
        else if (seconds>=3600 || seconds<=86400){
            time=seconds/3600;
            System.out.println("Number of Hour/Hours is: "+time);
        }
        else if (seconds>=86400){
            time=seconds/86400;
            System.out.println("Number of Day/Days are: "+time);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
