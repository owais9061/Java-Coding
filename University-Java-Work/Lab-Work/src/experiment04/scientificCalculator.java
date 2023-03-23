package experiment04;

public class scientificCalculator {
    int square = 2;
    int cube = 3;

    public scientificCalculator() {
        System.out.println("Inside Default Constructor");
    }

    public scientificCalculator(int x) {
        System.out.println("Inside Parameterized Constructor");
    }

    public int calculateSquare(int x) {
        return x * x;
    }

    public int calculateCube(int x) {
        return x * x * x;
    }

    public int calculateFactorial(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public void generateTable(int x) {
        System.out.println("Table of " + x + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
    }

    public static void main(String[] args) {
        scientificCalculator calculator1 = new scientificCalculator();
        System.out.println("Square of 5: " + calculator1.calculateSquare(5));
        System.out.println("Cube of 5: " + calculator1.calculateCube(5));
        System.out.println("Factorial of 5: " + calculator1.calculateFactorial(5));
        calculator1.generateTable(5);

        scientificCalculator calculator2 = new scientificCalculator(10);
        System.out.println("Square of 3: " + calculator2.calculateSquare(3));
        System.out.println("Cube of 3: " + calculator2.calculateCube(3));
        System.out.println("Factorial of 3: " + calculator2.calculateFactorial(3));
        calculator2.generateTable(3);
    }
}
