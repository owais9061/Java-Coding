//!This program calculates the user's gross pay
package Basics;

import java.util.Scanner; //to be able to read from the keyboard

public class userGrossPay
{
 public static void main(String [] args)
 {

 //?create a Scanner object to read from the keyboard
 Scanner input = new Scanner(System.in);

 //?identifier declarations
 double hours;
 double rate;
 double pay;
 
 //?display prompts and get input
 System.out.print("How many hours did you work? ");
 hours = input.nextDouble();
 System.out.print("How much do you get paid per hour? ");
 rate = input.nextDouble();
 
 //?calculations
 if(hours <= 40)
 pay = hours * rate;
 else
 pay = (hours - 40) * (1.5 * rate) + 40 * rate;
 
 //?display results
 System.out.println("You earned $" + pay);
 }
}