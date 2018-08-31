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
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            String res = binaryToDecimal(s);
            System.out.println(res);
        }
    }
        static String binaryToDecimal(String a) {
            int total = 0, value = 0;
            int c = a.length();
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '1' || a.charAt(i) == '0') {
              value = Character.getNumericValue(a.charAt(i));
              total += value * Math.pow(2, c - 1);
              c--;
          }
            }
            return String.valueOf(total);
        }
    }

