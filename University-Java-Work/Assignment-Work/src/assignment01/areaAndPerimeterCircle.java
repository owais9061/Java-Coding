/** (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle 
that has a radius of 5.5 using the following formula: 
perimeter = 2 * radius * 3.14
area = radius * radius * 3 .14
**/

package assignment01;

public class areaAndPerimeterCircle {
    public static void main (String[]args){
        double radius=5.5;
        double perimeter, area;
        System.out.println("AREA AND PERIMETER OF CIRCLE");
        perimeter = 2 * radius * 3.14;
        area = radius * radius * 3.14;
        System.out.println("Area of Circle is: " + area);
        System.out.println("Perimeter of Circle is: " + perimeter);
    }
}
