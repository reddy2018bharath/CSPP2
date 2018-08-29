import java.util.Scanner;
public class SumOfNNumbers {
	public static void main(String[] args) {
		int sum = 0;
		int i=0;
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        while (i<=a) {
        	sum = sum +i;
        	i = i + 1;
        }
        System.out.println(sum);


	}
}