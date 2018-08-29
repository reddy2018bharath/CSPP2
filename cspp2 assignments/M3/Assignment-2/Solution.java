import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
/**
 * { function_description }
 *
 * @param      args  The arguments
 */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);      
        int n = s.nextInt();
        int d = 10;
        int c = 0, k;
        for (int i = 1; i <= n; i++) {
        	int j = i;
        	while (j > 0) {
        	k = j % 10;
        	if (k == 7 ) {
        		c = c + 1;
        	}
        	j = j / d;
        }
       }
     System.out.println(c);
   }
  }