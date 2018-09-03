import java.util.Scanner;
 class Student {
	String name_student;
	String roll_number;
	float d;
	float e;
	float f;

Student(String student_name, String roll_no, float a, float b, float c) {
	name_student = student_name;
	roll_number = roll_no;
	d = a;
	e = b;
	f = c;
}
  Double GPA() {
  	return (d+e+f)/3.0D;
  }

}
public class StudentDetails {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	String student_name = s.next();
	String roll_no = s.next();
	float a = s.nextFloat();
	float b = s.nextFloat();
	float c = s.nextFloat();
	Student m = new Student (student_name, roll_no, a, b, c);
	System.out.println(m.GPA());	
	}
	
}
