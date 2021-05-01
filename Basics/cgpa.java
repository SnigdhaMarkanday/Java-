import java.util.Scanner;
public class Cgpa {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int s1,s2,s3,t,cgpa;
	System.out.println("Grade of S1");
	s1= s.nextInt();
	System.out.println("Grade of S2");
	s2= s.nextInt();
	System.out.println("Grade of S3");
	s3= s.nextInt();
	t = (s1+s2+s3);
	cgpa = t/3;
	System.out.println("CGPA: " +cgpa);
	}
}
