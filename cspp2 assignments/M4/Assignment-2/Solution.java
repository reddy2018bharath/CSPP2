/**
 * { item_description }.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
/**
 * { item_description }.
 */
private Solution() {

}
/**
 * { function_description }
 *
 * @param      args  The arguments
 */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc .nextInt();
        int[][] c = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        int d = sc.nextInt();
        int e = sc .nextInt();
        int[][] f = new int[d][e];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < e; j++) {
                f[i][j] = sc.nextInt();
            }
        }
        if (a != d && b != e) {
            System.out.println("not possible"); 
            }
        else {
            int[][] g = new int[a][b];
            int i = 0;
            int j = 0;
            for (i = 0; i < a; i++) {
                for (j = 0; j < b; j++) {
                    g[i][j] = c[i][j] + f[i][j];

            }
        }
        for (i = 0; i < a; i++) {
                for (j = 0; j < b; j++) {
                    System.out.print(g[i][j]);
                    if (j != b - 1) {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }
   }
 }


