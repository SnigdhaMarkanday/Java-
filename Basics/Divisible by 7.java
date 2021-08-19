class Demo{
	public static void main(String []z){
		int n1,d1,l,g,d2;
		n1=Integer.parseInt(z[0]);
		if(n1%7==0){
			d1=n1/7;
			l = (d1-1)*7;
			g = (d1+1)*7;
			System.out.println("Lesser one =" +l);
			System.out.println("Greater one =" +g);
		}
		else{
			if(n1%7!=0){
			d1=n1/7;
			l = (d1)*7;
			g = (d1+1)*7;
			System.out.println("Lesser one =" +l);
			System.out.println("Greater one =" +g);
		

			}
		}

	}
}
