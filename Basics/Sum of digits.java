import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(a);
		int n,r,s=0;
		System.out.println("Enter number");
		n =Integer.parseInt(b.readLine());
		while(n>0){
		    r = n%10; //123 r=3 r=2 r=1
		    s=s+r;   // s=0+3=3 s=3+2=5 s=5+1=6
		    n=n/10; //n=12 n= 1
		    
		    
		}
		System.out.println("Sum of the digits is "+s);
		
	}
}
