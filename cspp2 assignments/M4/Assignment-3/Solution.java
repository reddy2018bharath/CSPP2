/**
 * { item_description }.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution
{/*
	Do not modify this main function.
	*/
	private Solution() {

	}
/**
 * { function_description }
 *
 * @param      args  The arguments.
 */
	public static void main(final String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++){
			String s = sc.next();
			String res = binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
		static String binaryToDecimal(String a) {
			Long d = Long.parseLong(a);
			double r = 0;
			double digit = 0;
			int c = a.length();
			for (int i = 0; i < c; i++) {
				if (a.charAt(i) == '1' || a.charAt(i) == '0') {
					double f = 0;
			digit = d % 10;
			d = d / 10;
			f = digit * (Math.pow(2,i));
			r = r + f;

				}
			}
			
			int g = (int)r;
			return String.valueOf(g);
		}
	}

