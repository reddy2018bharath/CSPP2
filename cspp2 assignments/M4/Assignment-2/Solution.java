import java.util.*;
public class Solution {

	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc .nextInt();
		int[][] c = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j<b; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		int d = sc.nextInt();
		int e = sc .nextInt();
		int[][] f = new int[d][e];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j<b; j++) {
				f[i][j] = sc.nextInt();
			}
		}
		if (a !=d && b !=e) {
			System.out.println("not possible");
		}
		else {
			int[][] g = new int[a][b];
		int i = 0;
		int j = 0;
		for (i = 0; i < a; i++) {
			for (j = 0; j<b; j++) {
				 g[i][j]=c[i][j] + f[i][j];

			}
		}
		System.out.println(g[i][j]);
	}
   }
 }


