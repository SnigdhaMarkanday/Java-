import java.io.*;
public class Main
{
	public static void main(String[] z)throws IOException{
		InputStreamReader a = new InputStreamReader (System.in);
		BufferedReader b = new BufferedReader(a);
		int n1;
        System.out.println("Enter the number");
        n1 = Integer.parseInt(b.readLine());
        for (int i=1 ;i<=10;i++){
            int z1;
            z1 = n1*i;
            System.out.println(n1+"x"+i+"="+z1);
        }
		
	}
}
