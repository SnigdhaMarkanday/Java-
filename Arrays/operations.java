import java.io.*;
public class Main
{
	public static void main(String[] z) throws IOException{
	   InputStreamReader a = new InputStreamReader(System.in);
	   BufferedReader b = new BufferedReader(a);
	   int A[] = new int[5];
	   
	   int i,j,k;
	   for( i=0;i<=4;i++){
	       System.out.println("Enter Element in the array ");
	       A[i]=Integer.parseInt(b.readLine());
	   }
       int max =A[0];
       for(i=1;i<=4;i++){
           if(A[i]>max){
               max = A[i];
           }
       }
       int min = A[0];
       for(i=0;i<=4;i++){
           if(A[i]<min){
               min = A[i];
           }
       }
       int s=0,avg,md;
       for(i=0;i<=4;i++){
           s=s+A[i];
       }
       avg = s/5;
       md = max-min;
       System.out.println("Maximun in this array is" +max);
       System.out.println("Minimum in this array is" +min);
       System.out.println("Average is " +avg);
       System.out.println("Maximum Difference is" +md);
       
	}
}
