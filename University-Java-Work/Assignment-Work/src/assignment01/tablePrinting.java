/**(Print a table) Write a simple java program that displays the following table. 
 * Cast floating point numbers into integers.
a                b                pow(a,b)
1                2                1
2                3                8
3                4                81
4                5                1024
5                6                15625 */
package assignment01;

public class tablePrinting {
    public static void main(String[] args) {
        System.out.println("a    b    pow(a, b)");
        System.out.println("--------------------");
        for (int a = 1; a <= 5; a++) {
            int b = a + 1;
            int result = (int) Math.pow(a, b);
            // System.out.printf("%-5d%-5d%-10d\n", a, b, result);
            //OR
            System.out.println(a+"\t"+b+"\t"+result+"\n");
        }
    }
}
