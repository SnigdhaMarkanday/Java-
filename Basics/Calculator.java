import java.io.*;
public class Main
{
	public static void main(String[] z)throws IOException{
		InputStreamReader a = new InputStreamReader (System.in);
		BufferedReader b = new BufferedReader(a);
		int n1,n2,s,p,d,q,r;
		System.out.println("Enter First Number");
		n1 = Integer.parseInt(b.readLine());
		System.out.println("Enter Second Number");
		n2 = Integer.parseInt(b.readLine());
		s = n1+n2;
		System.out.println("Sum is" +s); //Sum
		p = n1*n2; //multiply
		System.out.println("Product is" +p);
		if((n1>n2) ){ //Subtract
		    d = n1-n2;
		    System.out.println("Difference is" +d);
		}
		else{
		   d = n2-n1; 
		   System.out.println("Difference is" +d);
		}
		if((n1>n2) && (n2!= 0) ){ //Division
		    q = n1/n2;
		    System.out.println("Quotient is" +q);
		}
		else{
		   q = n2/n1; 
		   System.out.println("Quotient is" +q);
		}
        r = n1%n2;//mod
        System.out.println("Remainder is" +r);
		
		
		
	}
}
