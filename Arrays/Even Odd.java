import java.io.*;
public class Main
{
	public static void main(String[] z) throws IOException{
	   InputStreamReader a = new InputStreamReader(System.in);
	   BufferedReader b = new BufferedReader(a);
	   int n[] = new int[10];
	   int i,ce=0,co=0;
	   for(i=0;i<=9;i++){
	       System.out.println("Enter Element in Array ");
	       n[i] =Integer.parseInt(b.readLine());
	   }
	   for(i=0;i<=9;i++){
	       if(n[i]%2==0){
	           ce++;
	       }
	       else{
	           co++;
	       }
	   }
	   System.out.println("There are " +ce+ " even numbers in this array");
	   System.out.println("There are " +co+ " odd numbers in this array");

	 }
}
