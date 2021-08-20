import java.io.*;
class Demo{
		public static void main(String []z)throws IOException{
			int n;
			InputStreamReader a = new InputStreamReader(System.in);
			BufferedReader b = new BufferedReader(a);
			System.out.println("Enter Number");
			n = Integer.parseInt(b.readLine());
			if(n>0){
				System.out.println("Number is positive");
			}
			else{
				if(n==0){
					System.out.println("Number is zero");
				}
				else{
				System.out.println("Number is Negative");
			}
			}
}
}
