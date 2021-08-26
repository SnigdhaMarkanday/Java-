import java.io.*;
public class Main
{
	public static void main(String[] z)throws IOException{
		InputStreamReader a = new InputStreamReader (System.in);
		BufferedReader b = new BufferedReader(a);
		int n1,n2,p;
		System.out.println("Enter First Number");
		n1 = Integer.parseInt(b.readLine());
		System.out.println("Enter Second Number");
		n2 = Integer.parseInt(b.readLine());
		p = n1*n2;
		System.out.println("Product is" +p);
		
		
	}
}
