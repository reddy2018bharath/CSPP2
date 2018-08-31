
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
	Do not modify this main function.
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		for(int i=0;i<=n;i++){
			String s=sc.nextLine();
			int res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
		public static int binaryToDecimal(String a) {
			int d = Integer.parseInt(a);
			double r = 0;
			double digit = 0;
			int c = a.length();
			for (int i = 0; i < c; i++) {
				if (a.charAt(i)=='1' || a.charAt(i)=='0') {
					double f = 0;
			digit = d % 10;
			d = d / 10;
			f = digit *(Math.pow(2,i));
			r = r + f;

				}
			}
			
			int g = (int)r;
			return g;
		}
	}

