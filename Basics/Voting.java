import java.io.*;
public class Main
{
	public static void main(String[] z) throws IOException{
	   InputStreamReader a = new InputStreamReader(System.in);
	   BufferedReader b = new BufferedReader(a);
	   int e;
	   System.out.println("Enter your age for voting elibility check");
	   e = Integer.parseInt(b.readLine());
	   if(e>=18){
	    System.out.println("Eligible for Voting");
	   }
	   else{
	       System.out.println("Not Eligible for Voting");
	   }
	}
	
}
