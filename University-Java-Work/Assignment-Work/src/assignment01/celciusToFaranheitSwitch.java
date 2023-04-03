/**Conversion between Celsius and Fahrenheit Write a class that contain the following two method:
Public static double Celsius  to Fahrenheit (double Celsius) 
Public static double Fahrenheit to Celsius  to (double Fahrenheit) 
The formula for the conversion is:
Fahrenheit=(9.0/5)*celsius+32
Celsius=(5.0/9)*( Fahrenheit-32) **/

//!USING SWITCH

package assignment01;
import java.util.Scanner;

public class celciusToFaranheitSwitch{
    public static void main (String[]args){
        double celcius, faranheit;
        int selection;
        System.out.println("SIMPLE CELCIUS TO FARANHEIT CALCULATOR");
        System.out.println("WHAT DO YOU WANT TO DO?");
        System.out.println("1- Celcius to Faranheit\n2- Faraheit to Celcius");
        System.out.print("Input the selection number: ");
        Scanner input = new Scanner(System.in);
        selection = input.nextInt();
        switch(selection){
            case 1:
            System.out.print("Enter Temperature in Celcius: ");
            celcius = input.nextInt();
            faranheit = (9.0/5)* celcius +32;
            System.out.println(celcius + "*c Temperature in Faranheit is: " + faranheit +"F");
            break;
            case 2:
            System.out.print("Enter Temperature in Faranheit: ");
            faranheit = input.nextInt();
            celcius = (5.0/9)*( faranheit-32);
            System.out.println(faranheit + "*F Temperature in Ceclius is: " + faranheit +"C");
            break;
            default:
            System.out.println("Error the Selection donot exists");
        }
        
    }
}