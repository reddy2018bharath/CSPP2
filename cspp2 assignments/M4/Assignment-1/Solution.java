/**
 * { item_description }.
 */
import java.util.*;
public class Solution {
/**
 * { function_description }.
 */
private Solution () {

}
 /**
 * @param      args  The arguments
 */

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] > k) {
				k = a[i];
			}
		
		}
		System.out.println(k);

		

	}
}
