import java.util.Scanner;
public class  factorial
{
	public static void main(final String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(fact(a));
	}

		public static int fact(int a)
		{
		if (a==1)
		{
			return 1;
		}
		else
		{
			return a*fact(a-1);
		}
	}
}
	