public class Main
{
	public static void main(String[] z) {
	    int n1,n2;
	    n1 =Integer.parseInt(z[0]);
	    n2 = Integer.parseInt(z[1]);
	    if(n1>n2){
	        System.out.println(n1+"is Greatest");
	    }
	    else{
	        if(n1==n2){
	            System.out.println(n1+"and "+n2+ "are equal");
	        }
	        else{
	        System.out.println(n2+"is Greatest");
	        }
	    }
	}
}
