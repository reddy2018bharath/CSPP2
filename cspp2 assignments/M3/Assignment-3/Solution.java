/**
 * { item_description }.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */

public class Solution {
	/**
	 * { function_description }.
	 *
	 * @param      args  The arguments
	 */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1,n2));
    }
    /**
     * { function_description }.
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     *
     * @return     { description_of_the_return_value }
     */
	public static int gcd(int n1,int n2) {
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
