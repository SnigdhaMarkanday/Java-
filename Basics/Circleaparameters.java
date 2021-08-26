import java.io.*;
public class Main
{
	public static void main(String[] z)throws IOException{
		double r,ar,pr;
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(a);
		System.out.println("Enter the radiius of Circle");
		r = Double.parsedouble(b.readLine());
		ar = 3.14*r*r;
		pr = 2*3.14*r;
		System.out.println("Area of Circle is" +ar);
		System.out.println("Perimeter of circle is" +pr);
        
		
	}
}
