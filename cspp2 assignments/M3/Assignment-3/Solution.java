
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1,n2));
    }
    /*
	Need to write the gcd function and print the output.
	*/
	public static int gcd(int n1,int n2) {
		int r = 1;
		while (r > 0) {
			r = n1 % n2;
			n1 = n2;
			n2 = r;
			if (r == 0) {
				return n2;
			}

		}
		return 1;
	}
}
