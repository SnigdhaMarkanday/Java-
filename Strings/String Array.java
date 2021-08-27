import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
	    InputStreamReader a = new InputStreamReader(System.in);
	    BufferedReader b = new BufferedReader(a);
	    int m;
	     String n[] = new String [10000];
	     int size=0,i,j;
	     boolean k=true;
	     while(k){
	         
	     
	            System.out.print("Menu\n1.Create \n2.Display\n3.Swap\n4.Reverse List of Names\n5.To Upper Case\n6.To LowerCase \n7.Title\n8.Toggle Case\n9.Reverse Names\n10.Sort List\n11.Sort Names\n12.Search Names\n13.Replace Locally\n14.Replace Globally \n15.Replace String\n16.Join and Create\n17.display new String\n18.Split in new string array \n19.Pallindrome\n20.Display new String Array\n21.Exit\nEnter choice = ");
	            m = Integer.parseInt(b.readLine());
	            switch(m){
	              case 1: 
	                System.out.print("How mane Names u wana scan = ");
	                size=Integer.parseInt(b.readLine());
	                for(i = 0;i<size;i++){
	                    System.out.print("Enter Element = ");
	                    n[i] = b.readLine();
	                }
	                break;
	              case 2: 
	                
	                for(i = 0;i<size;i++){
	                    System.out.println(n[i]);
	                }
	                  
	                //Display 
	                break;
        	       case 3:
        	           //Swap
        	           break;
        	       case 4:
        	           //Reverse
        	           break;
        	       case 5:
        	           //change to upper case 
        	           break;
        	       case 6:
        	           //change to lower case
        	           break;
        	       case 7:
        	           //Title case
        	           break;
        	       case 8:
        	           //Toogle case 
        	           break;
        	       case 9:
        	           //Reverse Names
        	           break;
        	       case 10:
        	           //Sort List
        	           break;
        	       case 11:
        	           //Sort Names
        	           break;
        	       case 12:
        	           //Search Names
        	           break;
        	       case 13:
        	           //Replace Locally 
        	            break;
        	       case 14:
        	           //Replace Globally 
        	           break;
        	       case 15:
        	           //Replace String
        	           break;
        	       case 16:
        	           //Join and Create
        	           break;
        	       case 17:
        	           //Display new string array 
        	           break;
        	       case 18:
        	           //Split in new String array
        	           break;
        	       case 19:
        	           //Pallindrome
        	           break;
        	       case 20:
        	           //Display new String array
        	           break;
        	       case 21:
        	           k=false;
        	           break;
	            }
	        }
		
	    }
}


  
