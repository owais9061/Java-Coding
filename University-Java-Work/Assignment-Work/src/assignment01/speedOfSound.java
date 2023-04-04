/**The following table shows the approximate speed of sound in air, water, and steel: 
Medium Speed  2,100 feet per second. 
Air Water 3,900 feet per second. 
Steel 14,400 feet per second. 
Write a program that asks the user to enter "air", "water", or "steel", and the distance that 
a sound wave will travel in the medium. The program should then display the amount of time it will take. 
You can calculate the amount of time it takes sound to travel in air with the following formula: 
Time = Distance* 1,100; 
You can calculate the amount of time it takes sound to travel in water with the following formula: 
Time = Distance/ 14,900;
You can calculate the amount of time it takes sound to travel in steel with the following formula: 
Time - Distance/ 16,400;
 */

package assignment01;
import java.util.Scanner;
public class speedOfSound {
    public static void main (String[]args){
        double air, water, speed, time, distance;
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("TIME TAKEN BY SPEED OF SOUND IN AIR, WATER & STEEL");
        System.out.println("Choose from the Following:");
        System.out.println("1- Air\t 2- Water\t 3- Steel");
        System.out.println("");
        System.out.print("Enter yout Choice: ");
        choice = input.nextInt();
        
        //We are using IF instead of Switch
        if(choice==1){
            System.out.println("TIME TAKEN BY SOUND WAVE IN AIR");
            System.out.print("ENTER THE DISTANCE TRAVELLED:  ");
            distance = input.nextInt();
            time = distance/2100;
            System.out.println("The Time taken by Sound Wave in Air to travel "+distance+" meters, is "+time+" Hours");
        }
        else if(choice==2){
            System.out.println("TIME TAKEN BY SOUND WAVE IN WATER");
            System.out.print("ENTER THE DISTANCE TRAVELLED:  ");
            distance = input.nextInt();
            time = distance/3900;
            System.out.println("The Time taken by Sound Wave in Water to travel "+distance+" meters, is "+time);
        }
        else if(choice==3){
            System.out.println("TIME TAKEN BY SOUND WAVE IN STEEL");
            System.out.print("ENTER THE DISTANCE TRAVELLED:  ");
            distance = input.nextInt();
            time = distance/14400;
            System.out.println("The Time taken by Sound Wave in Steel to travel "+distance+" meters, is "+time);
        }
        else {
            System.out.println("Invalid Selection");
        }
    }

}
