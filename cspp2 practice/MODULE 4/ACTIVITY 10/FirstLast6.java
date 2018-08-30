import java.util.Scanner;
public class FirstLast6 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of array: ");
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
			if (a[0]==6 || a[n-1]==6) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		

	}

}