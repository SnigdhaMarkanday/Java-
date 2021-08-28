import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(a);
		double ar,s;
		System.out.println("Enter number");
		s =Double.parseDouble(b.readLine());
	    ar = (6*s*s)/(4*Math.tan(Math.PI/6));
		System.out.println("Area of hexagon is "+ar);
		
	}
}
