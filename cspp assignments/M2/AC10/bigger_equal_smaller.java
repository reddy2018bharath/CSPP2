import java.util.Scanner;
public class  bigger_equal_smaller
{
	public static void main(final String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if (a>b)
		{
			System.out.println("Bigger");
		}
		else if (a==b)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Smaller");
		}

	}
}