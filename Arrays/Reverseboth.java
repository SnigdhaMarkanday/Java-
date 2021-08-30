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
	   for( i=0;i<=4;i++){
	       System.out.println("Enter Element in the array1 ");
	       A[i]=Integer.parseInt(b.readLine());
	   }
       for( j=0;j<=4;j++){
	       System.out.println("Enter Element in the array2 ");
	       B[j]=Integer.parseInt(b.readLine());
	   }
	   for( i=4,k=0;i>=0;i--,k++){
            C[k]= A[i];
       }
	   for( j=4,k=5;j>=0;j--,k++){
	      C[k]=B[j];
	      
	   }
	   for( i=4,k=0;i>=0;i--,k++){
            C[k]= A[i];
       }
       for(k=0;k<=9;k++){
        System.out.println(C[k]);
	 
       }
	   
	}
}
