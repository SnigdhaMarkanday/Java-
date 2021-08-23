class Demo6{
	public static void main(String []args){
	int a,b,s; //local variable and local variable are uninitialized by default so they should be initialized before use
	a = 100;
	b = 200;
	s = a + b;
	System.out.println("s");
	System.out.println(s);
	System.out.println("Sum is " +s);
	System.out.println("Sum of "+a+ " And " +b+ "is" +s);
	System.out.println(s+ "is the sum of " +a+ " And " +b);
	System.out.println(a+ "+" +b+ "=" +s);

	}
}
