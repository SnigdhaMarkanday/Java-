import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException{
	  int n1,n2,d;
	  InputStreamReader a = new InputStreamReader(System.in);
	  BufferedReader b = new BufferedReader(a);
	  System.out.println("Enter first Number ");
	  n1 = Integer.parseInt(b.readLine());
	  System.out.println("Enter Second Number");
	  n2 = Integer.parseInt(b.readLine());
	  if(n1>n2 && n2!=0){
	    d = n1/n2;
	    System.out.println(d);
	  }
	  else{
	      
	      System.out.println("Won't Divide");
	  }
	  
		
	}
}
