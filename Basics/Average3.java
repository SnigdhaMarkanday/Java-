import java.io.*;
public class Main
{
	public static void main(String[] z)throws IOException{
		int n1,n2,n3,t,avg;
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(a);
		System.out.println("Enter first number");
		n1 = Integer.parseInt(b.readLine());
		System.out.println("Enter Second number");
		n2 = Integer.parseInt(b.readLine());
		System.out.println("Enter Third number");
		n3 = Integer.parseInt(b.readLine());
		t = n1+n2+n3;
		avg = t/3;
		System.out.println("Average is" +avg);
        
		
	}
}
