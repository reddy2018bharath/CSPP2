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
 *
 * @param      args  The arguments.
 */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
        }
/**
 * { function_description }.
 *
 * @param      s     { parameter_description }.
 *
 * @return     { description_of_the_return_value }.
 */
    public static String reverseString(final String s) {
        String k = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            k += s.charAt(i);
        }
        return k;
    }
}
