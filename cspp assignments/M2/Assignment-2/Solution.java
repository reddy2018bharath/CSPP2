import java.util.Scanner;
    /**
    *Do not modify this main function.
    */
public class Solution {
    /**
    *Do not modify this main function.
    */
    protected Solution() { }
    /**
    *Need to write the rootsOfQuadraticEquation function and print the output.
    *@param args is an argument
     */
    public static void main(final String[]  args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /**
    *Need to write the rootsOfQuadraticEquation.
    *@param a is an argument
    *@param b is an argument
    *@param c is an argument
    */

    public static void rootsOfQuadraticEquation(final int a,
     final int b, final int c) {
        final int x = 4;
        double r1 = (-b + Math.sqrt((b * b) - (x * a * c))) / (2 * a);
        double r2 = (-b - Math.sqrt((b * b) - (x * a * c))) / (2 * a);
        System.out.println(r1 + " " + r2);
    }
}

