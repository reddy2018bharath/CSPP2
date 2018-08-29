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
 * @param      args  The arguments
 */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        final int d = 10;
        final int f = 7;
        int c = 0, k;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j > 0) {
            k = j % d;
            if (k == f) {
                c = c + 1;
            }
            j = j / d;
        }
       }
     System.out.println(c);
   }
  }

