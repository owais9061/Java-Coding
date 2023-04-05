/**The distance a vehicle travels can be calculated as fallout: 
Distance = Speed * Time 
For example, if a train travels 60 miles-per-hour for three hours, the distance [raveled is 120 miles. 
Write a program that asks for the speed of a vehicle (in miles-per-hour) and the number of hours 
it has traveled. It should use a loop to display the distance a vehicle has traveled for each hour 
of a time period specified by the user. For example, if a vehicle is traveling at 40 mph far 
a three-hour time period, it should display a report similar to the one chat follows: 
Hour                  Distance Traveled 
1 			 90
2 		             100	
3                                   150 
Input Validation: Do not accept a negative number for speed and do not accept any value les than 1 for time traveled.
 */

package assignmentLab01;
import java.util.Scanner;

public class distanceTravelled {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double speed, distance;
        int time;

        while (true) {
            System.out.print("Enter the speed of the vehicle in mph: ");
            speed = input.nextDouble();
            if (speed < 0) {
                System.out.println("Speed cannot be negative. Please try again.");
                continue;
            }
            System.out.print("Enter the number of hours the vehicle has traveled: ");
            time = input.nextInt();
            if (time < 1) {
                System.out.println("Time cannot be less than 1 hour. Please try again.");
                continue;
            }
            break;
        }

        System.out.println("Hour   Distance Traveled");
        for (int hour = 1; hour <= time; hour++) {
            distance = speed * hour;
            System.out.print(hour+"\t"+distance+"\n");
        }
    }
}
