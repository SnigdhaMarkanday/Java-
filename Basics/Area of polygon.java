public class Main
{
	public static void main(String[] args) throws IOException {
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(a);
		double ar,n,l;
		System.out.println("Enter number of sides of a polygon");
		n =Double.parseDouble(b.readLine());
		System.out.println("Enter length of sides of a polygon");
		l =Double.parseDouble(b.readLine());
	    ar =(n*l*l)/(4*Math.tan(Math.PI/n)) ;
		System.out.println("Area of hexagon is "+ar);
		
	}
}
