import java.util.Scanner;
public class Greet {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String name;
	System.out.println("Enter your name");
	name = s.next();
	System.out.println("Hello " +name+ " Have a good day");
	}
}
