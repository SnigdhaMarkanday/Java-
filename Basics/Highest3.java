import java.io.*;
public class Main
{
	public static void main(String[] z) throws IOException{
	   InputStreamReader a = new InputStreamReader(System.in);
	   BufferedReader b = new BufferedReader(a);
	   int n1,n2,n3;
	   System.out.println("Enter the number1");
	   n1 = Integer.parseInt(b.readLine());
	   System.out.println("Enter the number2");
	   n2 = Integer.parseInt(b.readLine());
	   System.out.println("Enter the number3");
	   n3 = Integer.parseInt(b.readLine());
	   if(n1>n2){
	       if(n1>n3){
	           System.out.println(n1+"is highest");
	       }
	       else{
	           System.out.println(n3+"is highest");
	       }
	   }
	   else{
	       if(n2>n3){
	           System.out.println(n2+"is highest");
	       }
	       else{
	           System.out.println(n3+"is highest");
	       }
	   }
	 }
}
