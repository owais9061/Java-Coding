/**Conversion between Celsius and Fahrenheit Write a class that contain the following two method:
Public static double Celsius  to Fahrenheit (double Celsius) 
Public static double Fahrenheit to Celsius  to (double Fahrenheit) 
The formula for the conversion is:
Fahrenheit=(9.0/5)*celsius+32
Celsius=(5.0/9)*( Fahrenheit-32) **/

package assignment01;
import java.util.Scanner;

public class celciusToFaranheit{
    public static void main (String[]args){
        double celcius, faranheit;
        System.out.println("SIMPLE CELCIUS TO FARANHEIT CALCULATOR");
        Scanner input = new Scanner(System.in);
        System.out.println("Input Temperature in Celcius: ");
        celcius = input.nextInt();
        faranheit = (9.0/5)* celcius +32;
        System.out.println(celcius + "* Celcius Temperature in Faranheit is: " + faranheit);
    }
}