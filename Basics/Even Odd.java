import java.io.*;
public class Main
{
	public static void main(String[] z) throws IOException{
	   InputStreamReader a = new InputStreamReader(System.in);
	   BufferedReader b = new BufferedReader(a);
	   int n;
	   System.out.println("Enter the number");
	   n = Integer.parseInt(b.readLine());
	   if(n%2==0){
	       System.out.println(n+"is an even number");
	   }
	   else{
	       System.out.println(n+"is an odd number");
	   }
	 }
}
