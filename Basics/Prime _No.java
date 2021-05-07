public class PrimeNo {

	public static void main(String[] args) {
		// Snigdha Markanday's Code
		int i,n1,c;
		System.out.println("Prime numbersfrom 1 to 1000 are:");
		for(n1=1;n1<=1000;n1++) { // outer loop to check numbers from 1 to 1000
			c=0;
			for(i = 2;i<=(n1/2);i++) { //inner loop 
				if(n1%i==0){
					c++;
					break;
				}
			}
			if(c==0 && n1!=1) {
				System.out.println(n1 + " ");
			}
		}	
	}
}
