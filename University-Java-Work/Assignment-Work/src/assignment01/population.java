/**Write a program that will predict the size of a population of organisms.  The program should ask 
 * for the starting number of organisms, their average daily population increase (as a percentage), 
 * and the number of days they will multiply. For example, a population might begin with two organisms, 
 * have an average daily increase of 50 percent, and will be allowed to multiply for seven days. 
 * The program should use a loop to display the size of the population for each day. 
Input Validation: Do not accept a number less than 2 for the starting size of the population.
Do not accept a negative number for average daily population increase. Do not adept a number
less than I for the number of days they will multiply.*/

package assignment01;

import java.util.Scanner;

public class population {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Get starting population size
int startingPopulation;
do {
System.out.print("Enter the starting number of organisms (must be 2 or greater): ");
startingPopulation = scanner.nextInt();
} while (startingPopulation < 2);

// Get average daily population increase as a percentage
double dailyIncreasePercentage;
do {
System.out.print("Enter the average daily population increase as a percentage (must be non-negative): ");
dailyIncreasePercentage = scanner.nextDouble();
} while (dailyIncreasePercentage < 0);

// Get number of days to multiply
int numDaysToMultiply;
do {
System.out.print("Enter the number of days they will multiply (must be 1 or greater): ");
numDaysToMultiply = scanner.nextInt();
} while (numDaysToMultiply < 1);

// Calculate and display population for each day
double population = startingPopulation;
for (int i = 1; i <= numDaysToMultiply; i++) {
System.out.printf("Day %d: %.0f%n", i, population);
population += ((dailyIncreasePercentage / 100) * population);
}
}
}
