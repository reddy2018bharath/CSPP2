/**
 * { item_description }.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */

public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_description }.
     * @param      args  The arguments
     */

    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1, n2));
    }
    /**
     * { function_description }.
     *
     * @param      m1    The m1
     * @param      m2    The m2
     *
     * @return     { description_of_the_return_value }
     */
    public static int gcd(final int m1, final int m2) {
        int n1 = m1;
        int n2 = m2;
        int r = 1;
        while (r > 0) {
            r = n1 % n2;
            if (r == 0) {
                return n2;
            }
            n1 = n2;
            n2 = r;
        }
        return 1;
    }
}

