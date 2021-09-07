import java.io.*;
class Sum{
	public static void main(String[]z)throws IOException{
			InputStreamReader a = new InputStreamReader(System.in);
			BufferedReader b = new BufferedReader (a);
			int m;
			boolean k;
			int n[][] = new int [3][3];
			int t[][] = new int [3][3];
			int n1[][] = new int [3][3];
			int a1[][] = new int [3][3];
			int m1[][] = new int [3][3];
			int sr,sc,ld,rd,is,os,c1,r1;
			int r,c;
				
			k = true;
			while(k){
				System.out.println("1. Create a 2-D Array \n 2. Display 2-D Array \n 3. Transpose \n 4. Row Sum \n 5. Column Sum \n 6. Left Diagonal Sum \n 7. Right Diagonal Sum \n 8. Inner Sum \n 9. Outer Sum \n 10. Mirror \n 11. Row Sort \n 12. Column Sort \n 13. Complete Sort \n 14. Search \n 15. Create Second 2-D-Array 3 by 3 \n 16. Display Second 2-d Array \n s17. Sum\n 18. Display 3rd Two D array\n 19.Multiply the arrays\n 20. Display fourth 2-D array\n 21.Exit");
				System.out.println("Enter ur choice");
				m = Integer.parseInt(b.readLine());
					switch(m){
						case 1:
						//creating 2D Array
							for(r=0;r<=2;r++){
								for(c=0;c<=2;c++){
										System.out.println("Enter Element ");
										n[r][c] = Integer.parseInt(b.readLine());
								}
							}
						break;
						case 2:
						//Display 2D Array
							for(r=0;r<=2;r++){
								for(c=0;c<=2;c++){
									System.out.print(n[r][c]+ "\t");
								}
								System.out.println();
							}
							break;
						case 3:
						//Transpose
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
						//Row Sum
							for(r=0;r<=2;r++){
								sr=0;
								for(c=0;c<=2;c++){
									sr = sr+n[r][c];

								}
								System.out.println(sr); 
							}
							break;
						case 5:
							//Column Sum
							for(c=0;c<=2;c++){
								sc =0;
								for(r=0;r<=2;r++){
									sc = sc+n[r][c];


								}
								System.out.println(sc); 

							}
							break;

						case 6:
						//Left Diagonal Sum
						ld = 0;
						for(r=0;r<=2;r++){
							for(c=0;c<=2;c++){
								if(r==c){
									ld = ld+n[r][c];
									
								}
							

							}
						}
						System.out.println(ld);

						break;
						case 7:
							//Right Diagonal Sum
						rd = 0;
						for(r=0;r<=2;r++){
							for(c=2;c>=0;c--){
								if(r+c==2){
									rd = rd+n[r][c];
								}
									
							

							}
						}
						System.out.println(rd);
						break;
						case 8:
						//Inner Sum
						is=0;
						for(r=0;r<=2;r++){
							for(c=0;c<=2;c++){
								if((r+c)%2!=0){
									is = is+n[r][c];

								}
							}
						}
						System.out.println(is);
						break;
						case 9:
						//Outer Sum
						os = 0;

						for(r=0;r<=2;r++){
							for(c=0;c<=2;c++){
								if(r%2==0){
									if(c%2==0){
										os=os+n[r][c];
									}
								}
							}
						}
						System.out.println(os);
						break;
						case 10:
						//Mirror
						for(r=0;r<=2;r++){
							for(c=0;c<=2;c++){
								int temp;
								temp = n[r][2];
								n[r][2] = n[r][0];
								n[r][0] = temp;
							}
						}
						for(r=0;r<=2;r++){
							for(c=0;c<=2;c++){
								System.out.print(n[r][c]+"\t");
							}
							System.out.println();
						}
						break;
						case 11:
						//Row Sort 
						for(r=0;r<=2;r++){
							for(c=0;c<=2;c++){
								for(c1=c+1;c1<=2;c1++){
									if(n[r][c]>n[r][c1]){
										int temp;
										temp=n[r][c1];
										n[r][c1]=n[r][c];
										n[r][c]=temp;
									}

								}

							}
						}
						for(r=0;r<=2;r++){
							for(c=0;c<3;c++){
								System.out.print(n[r][c]+"\t");
							}
							System.out.println();
						}
						break;
						case 12:
						//Column Sort 
						for(r=0;r<=2;r++){
							for(c=r+1;c<=2;c++){
						
									if(n[c][r]>n[r][c]){
										int temp;
										temp = n[r][c];
										n[r][c] = n[c][r];
										n[c][r]= temp;
									}
								

							}
						}
						for(r=0;r<=2;r++){
							for(c=0;c<3;c++){
								System.out.print(n[r][c]+"\t");
							}
							System.out.println();
						}
						break;
						case 13:
						//
						case 15:
						//creating 2nd 2D Array
							for(r=0;r<=2;r++){
								for(c=0;c<=2;c++){
										System.out.println("Enter Element ");
										n1[r][c] = Integer.parseInt(b.readLine());
								}
							}
						break;
						case 16:
						//Displaying 2nd 2D Array
						for(r=0;r<=2;r++){
								for(c=0;c<=2;c++){
									System.out.print(n1[r][c]+ "\t");
								}
								System.out.println();
							}
							break;
						case 17:
						//Addition
						for(r=0;r<=2;r++){
							for(c=0;c<=2;c++){
								a1[r][c]= n[r][c]+n1[r][c];
							}
						}
						break;
						case 18: 
						//Displaying adiition matrix
						for(r=0;r<=2;r++){
								for(c=0;c<=2;c++){
									System.out.print(a1[r][c]+ "\t");
								}
								System.out.println();
							}
						break;
						case 19:
						//Multiplication
						for(r=0;r<=2;r++){
							for(c=0;c<=2;c++){
								int km1;
								m1[r][c]=0;
								for(km1=0;km1<=2;km1++){
									m1[r][c] +=n[r][km1]*n1[km1][c];
								}

							}
						}
						break;
						case 20:
						//Displaying Multiplication matrix
						for(r=0;r<=2;r++){
								for(c=0;c<=2;c++){
									System.out.print(m1[r][c]+ "\t");
								}
								System.out.println();
							}
						break;


						case 21:
						  k = false;
						  break;


				}
			}
	}
}
