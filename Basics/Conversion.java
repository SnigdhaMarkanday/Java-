import java.util.Scanner;
public class Conv {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	double km;
	double miles;
	System.out.println("Enter the value in km");
	km = s.nextInt();
	miles =(km*(0.621));
	System.out.println("Miles = " +miles);
	}
}
