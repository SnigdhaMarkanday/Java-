import java.io.*;
class Sum{
	public static void main(String[]z)throws IOException{
			InputStreamReader a = new InputStreamReader(System.in);
			BufferedReader b = new BufferedReader (a);
			int m;
			boolean k;
			int n[][] = new int [3][3];
			int t[][] = new int [3][3];
			int r,c;
				
			k = true;
			while(k){
				System.out.println("1. Create a 2-D Array \n 2. Display 2-D Array \n 3. Transpose \n 4. Row Sum \n 5. Column Sum \n 6. Left Diagonal Sum \n 7. Right Diagonal Sum \n 8. Inner Sum \n 9. Outer Sum \n 10. Mirror \n 11. Row Sort \n 12. Column Sort \n 13. Complete Sort \n 14. Search \n 15. Create Second 2-D-Array 3 by 3 \n 16. Display Second 2-d Array \n s17. Sum\n 18. Display 3rd Two D array\n 19.Multiply the arrays\n 20. Display fourth 2-D array\n 21.Exit");
				System.out.println("Enter ur choice");
				m = Integer.parseInt(b.readLine());
					switch(m){
						case 1:
							for(r=0;r<=2;r++){
								for(c=0;c<=2;c++){
										System.out.println("Enter Element ");
										n[r][c] = Integer.parseInt(b.readLine());
								}
							}
						break;
						case 2:
							for(r=0;r<=2;r++){
								for(c=0;c<=2;c++){
									System.out.print(n[r][c]+ "\t");
								}
								System.out.println();
							}
							break;
						case 3:
							for(r=0;r<=2;r++){
								for(c=0;c<=2;c++){
									t[r][c] = n[c][r];
								}
							}
							for(r=0;r<=2;r++){
								for(c=0;c<=2;c++){
									System.out.print(t[r][c]+ "\t");
								}
								System.out.println();
							}
							break;
						case 4:
							
						case 21:
						  k = false;
						  break;


				}
			}
	}
}
