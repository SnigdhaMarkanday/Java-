import java.io.*;
class Demo{
		public static void main(String []z)throws IOException{
			InputStreamReader a = new InputStreamReader(System.in);
			BufferedReader b = new BufferedReader(a);
			int x,y,s;
			System.out.print("Enter first number");
			x = Integer.parseInt(b.readLine());
			System.out.print("Enter second number");
			y = Integer.parseInt(b.readLine());
			s = x+y;
			System.out.println("Sum is " +s);

	}
}
