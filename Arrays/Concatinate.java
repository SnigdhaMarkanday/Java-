import java.io.*;
public class Main
{
	public static void main(String[] z) throws IOException{
	   InputStreamReader a = new InputStreamReader(System.in);
	   BufferedReader b = new BufferedReader(a);
	   int A[] = new int[5];
	   int B[] = new int[5];
	   int C[] = new int[10];
	   int i,j,k;
	   for(i=0;i<=4;i++){
	       System.out.println("Enter Element of Array1 ");
	       A[i] =Integer.parseInt(b.readLine());
	       
	   }

	   for(j=0;j<=4;j++){
	       System.out.println("Enter Element of Array2 ");
	       B[j] =Integer.parseInt(b.readLine());
	       
	   }
	   for(i=0,k=0;i<=4;i++,k++){
	       C[k]=A[i];
	   }
	   for(j=0,k=5;k<=9;j++,k++){
	       C[k]=B[j];
	   }
	   for(k=0;k<=9;k++){
	       System.out.println("Elements in the new Array" +C[k]);
	   }
	 }
}
