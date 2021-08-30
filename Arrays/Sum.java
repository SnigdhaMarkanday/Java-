import java.io.*;
public class Main
{
	public static void main(String[] z) throws IOException{
	   InputStreamReader a = new InputStreamReader(System.in);
	   BufferedReader b = new BufferedReader(a);
	   int n[] = new int[5];
	   int i;
	   for(i=0;i<=4;i++){
	       System.out.println("Enter Element");
	       n[i] =Integer.parseInt(b.readLine());
	       
	   }
	   for(i=0;i<=4;i++){
	       System.out.println(n[i]);
	   }
	   int s=0;
	   for(i=0;i<=4;i++){
	       s=s+n[i];
	   }
	   System.out.println("Sum is" +s);
	   
	 }
}
