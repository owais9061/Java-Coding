//!  Implement the following equation in JAVA: 
//?  3x4sin(180x) + 4x3cos(90x) + x2sin(tan(45)) + 7x + 9cos(90x2). Where x may be user defined value..

package experiment02;

import java.lang.Math;

public class Equation {
    public static void main(String[] args) {
        double x = 1.5; // User-defined value of x
        double result = 3 * Math.pow(x, 4) * Math.sin(Math.toRadians(180 * x))
                      + 4 * Math.pow(x, 3) * Math.cos(Math.toRadians(90 * x))
                      + Math.pow(x, 2) * Math.sin(Math.tan(Math.toRadians(45)))+ 7 * x
                      + 9 * Math.cos(Math.toRadians(90 * Math.pow(x, 2)));
        System.out.println("Result: " + result);
    }
}

