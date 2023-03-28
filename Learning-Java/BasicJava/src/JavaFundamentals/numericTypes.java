package JavaFundamentals;

//?TASK #2 Add import statement here to use the Scanner class
import java.util.Scanner;
//TASK #2 (Alternate) Add import statment to use JOptionPane class
public class numericTypes
{
public static void main (String [] args)
{

    //?TASK #2 Create a Scanner object here (not used for alternate)
Scanner keyboard = new Scanner(System.in);

//!identifier declarations
final int NUMBER = 2 ; // number of scores
final int SCORE1 = 100; // first test score
final int SCORE2 = 95; // second test score
final int BOILING_IN_F = 212; // freezing temperature
int fToC; // temperature in Celsius
double average; // arithmetic average
String output; // line of output to print out

//?TASK #3 declare variables used here
//?TASK #4 declare variables used here
//? Find an arithmetic average
average = SCORE1 + SCORE2 / NUMBER;
output = SCORE1 + " and " + SCORE2 + " have an average of "
+ average;
System.out.println(output);
// Convert Fahrenheit temperatures to Celsius
fToC = 5/9 * (BOILING_IN_F - 32);  {
    
}

output = BOILING_IN_F + " in Fahrenheit is " + fToC
 + " in Celsius.";
 System.out.println(output);
 System.out.println(); // to leave a blank line
 
 // !ADD LINES FOR TASK #2 HERE
 
 // ?prompt the user for first name
 System.out.println("Enter the user's First Name: ");
 String firstName = keyboard.nextLine();
 
 // read the user's first name
 //? prompt the user for last name
 System.out.println("Enter the user's Last Name: ");
 String lastName = keyboard.nextLine();
 // read the user's last name

 //? concatenate the user's first and last names
System.out.println(firstName + "" + lastName);
 
 //? print out the user's full name
 System.out.println(); // to leave a blank line

 
 //! ADD LINES FOR TASK #3 HERE
 // get the first character from the user's first name
 
 //? print out the user's first initial
 System.out.println(firstName.charAt(0));


 // ?convert the user's full name to all capital letters
 //? print out the user's full name in all capital letters

 System.out.println(firstName.toUpperCase());

 //? and number of characters in it
 System.out.println(firstName.length());

 //! ADD LINES FOR TASK #4 HERE
 
 // prompt the user for a diameter of a sphere
 // read the diameter
 System.out.println("RADIUS & VOLUME CALCULATION");
 System.out.println("Enter the DIAMETER of Circle:");
 double diameter = keyboard.nextInt();
 
 //? calculate the radius
 double radius = diameter/2;

 //? calculate the volume
 double volume = 4/3 * (3.142)*(radius*radius*radius);
 // print out the volume
 System.out.println("The Volume of Sphere at " + radius + " radius is: " + volume);
 }
} 