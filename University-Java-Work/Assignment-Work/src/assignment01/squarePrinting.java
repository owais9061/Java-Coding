package assignment01;
/**. Write a method named square that accepts an integer argument and returns the square of that argument, */
import java.util.Scanner;

public class squarePrinting {
    public static void main (String[]args){
        int number, square;
        System.out.println("SQUARE PRINTING METHOD");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        number = input.nextInt();
        square = number * number;
        System.out.println("Square of " +number+ " is : "+square);
    }
}
