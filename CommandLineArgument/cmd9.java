public class Main
{
	public static void main(String[] z) {
	    int n1,z1;
	    n1 =Integer.parseInt(z[0]);
	    if(n1%7==0){
	        int d1,d2,g,l;
	        z1=n1/7;
	        d1=z1-1;
	        d2=z1+1;
	        g = d2*7;
	        l = d1*7;
	        System.out.println("Greatest number that is divisible by 7 is"+g);
	        System.out.println("Lowest number that is divisible by 7 is"+l);
	        
	    }
	    else{
	        if(n1%7!=0){
	            int d2,g,l;
	            z1=n1/7;
	            d2=z1+1;
	            l = z1*7;
	            g = d2*7;
	            System.out.println("Lowest Number that is divisible by 7 is "+l);
	            System.out.println("Greatest Number that is divisible by 7 is "+g);
	            
	        }
	    }
	}
}
