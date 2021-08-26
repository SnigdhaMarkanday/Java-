import java.io.*;
public class Main
{
	public static void main(String[] z)throws IOException{
		double h,w,ar,pr;
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(a);
		System.out.println("Enter Height");
		h = Double.parseDouble(b.readLine());
		System.out.println("Enter Width");
		w = Double.parseDouble(b.readLine());
		ar = h*w;
		pr = 2*(h+w);
		System.out.println("Area of Rectangle is "+ar);
		System.out.println("Perimeter of Rectangle is "+pr);
		
        
		
	}
}
