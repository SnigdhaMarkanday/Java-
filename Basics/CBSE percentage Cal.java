import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int s1,s2,s3,s4,s5;
	int max;
	System.out.println("Enter marks in Subject 1");
	s1 = s.nextInt();
	System.out.println("Enter marks in Subject 2");
	s2= s.nextInt();
	System.out.println("Enter marks in Subject 3");
	s3 = s.nextInt();
	System.out.println("Enter marks in Subject 4");
	s4 = s.nextInt();
	System.out.println("Enter marks in Subject 5");
	s5 = s.nextInt();
	System.out.println("Enter Out of marks");
	max = s.nextInt();
	int t;
	t= (s1+s2+s3+s4+s5);
	float p;
	p=(t/(5*max))*100;
	System.out.println("Percentage = " +p);
	}

}
