import java.util.Scanner;
public class Average {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of array: ");
		float sum = 0;
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();
			sum += a[i];
		}
		double d = sum/n;
		System.out.println(d);

	}
}