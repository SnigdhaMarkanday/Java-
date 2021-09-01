import java.io.*;
class Sum{
	public static void main(String[]z)throws IOException{
			InputStreamReader a = new InputStreamReader(System.in);
			BufferedReader b = new BufferedReader (a);
			int n[][] = new int [3][4];
			int r,c;
			for(r=0;r<=2;r++){
				for(c=0;c<=3;c++){
					System.out.println("Enter Element ");
					n[r][c] = Integer.parseInt(b.readLine());
				}
			}
			for(r=0;r<=2;r++){
				for(c=0;c<=3;c++){
					System.out.print(n[r][c]+ "\t");
				}
				System.out.println();
			}
	}
}
