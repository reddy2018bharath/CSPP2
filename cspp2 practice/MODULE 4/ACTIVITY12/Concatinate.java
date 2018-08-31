import java.util.Scanner;
public class Concatinate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String c = "Hello" + " " + a + "!";
		System.out.println(c);
		
	}
}