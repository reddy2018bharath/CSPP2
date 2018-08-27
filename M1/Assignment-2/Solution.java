import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int height = scan.nextInt();
		areaOfTriangle(base, height);
	}
	/*
	Print the output
	of area of triangle.
	*/
	static void areaOfTriangle(int base,int height){
		float area = (base*height)/2;
		System.out.println(area);
	
}
}