/** (Area and perimeter of a rectangle) Write a program that displays the area and perimeter of a 
rectangle with the width of 4.5 and height of 7.9 using the following formula: 
area = width * height  **/

package assignment01;

public class areaOfRectangle {
    public static void main (String[]args){
        double width=4.5, height=7.9, area;
        System.out.println("CALCULATE THE AREA OF RECTANGLE");
        System.out.println("Given Width is 4.5cm & Height is 7.9cm");
        area = width * height;
        System.out.println("Area of Rectangle is: " + area +" cm");
    }
}
