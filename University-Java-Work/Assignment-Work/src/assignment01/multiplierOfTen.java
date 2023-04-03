/**Write a method named times Ten. The method should Accept a double argument, and return a double 
value that is ten times the value of the argument. **/

package assignment01;
import java.lang.Math;

import java.util.Scanner;

public class multiplierOfTen {
    public static void main (String[]args){
        int  number;
        Scanner input = new Scanner(System.in);

        System.out.println("Multiplier of Ten Program");
        System.out.print("Enter Number: ");
        number = input.nextInt();
        System.out.println(Math.pow(number,10));
    }
}
