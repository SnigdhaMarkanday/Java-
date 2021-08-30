import java.io.*;
public class Main
{
	public static void main(String[] z) throws IOException{
	   InputStreamReader a = new InputStreamReader(System.in);
	   BufferedReader b = new BufferedReader(a);
	   int n;
	   System.out.println("Enter the number you want to check greater than 5 ");
	   n = Integer.parseInt(b.readLine());
	   if(n>5){
	       System.out.println(n+"is greater than 5");
	       
	   }
	   else{
	       if(n==5){
	           System.out.println(n+"is equal to 5");
	       }
	       else{
	           System.out.println(n+"is less than 5");
	       }
	   }
	            
	        
	 }
	
}
