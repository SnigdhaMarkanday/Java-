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
        	           int nr1,nr2;
        	           System.out.println("Enter the string numbers want to Swap");
        	           nr1=Integer.parseInt(b.readLine());
        	           nr2 =Integer.parseInt(b.readLine());
        	           if(nr1<0||nr2>size||nr2<0||nr1>size){
        	               System.out.println("It doesnot support");
        	           }
        	           else{
        	              String t;
        	              t=n[nr1];
        	              n[nr1]=n[nr2];
        	              n[nr2]=t;
        	              
        	              
        	           }
                    
        	           break;
        	       case 4:
        	           //Reverse
        	           for(i=0,j=size-1;i!=j;i++,j--){
        	               String t;
        	               t=n[i];
        	               n[i]=n[j];
        	               n[j]=t;
        	           
        	               
        	           }
        	           break;
        	       case 5:
        	           //change to upper case 
        	           for(i=0;i<size;i++){
        	               n[i]=n[i].toUpperCase();
        	               
        	           }
        	           break;
        	       case 6:
        	           //change to lower case
        	           for(i=0;i<size;i++){
        	               n[i]=n[i].toLowerCase();
        	               
        	           }
        	           break;
        	       case 7:
        	           
        	           //Title case
        	           for(j=0;j<size;j++){
        	               
        	           
            	           String y=n[j];
            	           byte bt[]=y.getBytes();
            	           i=0;
            	           if(bt[i]>=97 && bt[i]<=122){
            	               bt[i]-=32;
            	           }
            	           for(i=1;i<bt.length;i++){
            	               if(bt[i]==32){
            	                   i++;
            	                   if(bt[i]>=97 && bt[i]<=122){
            	                         bt[i]-=32;
            	                     }
            	               }
            	               else{
            	                   if(bt[i]>=65 && bt[i]<=90){
            	                         bt[i]+=32;
            	                     }
            	               }
            	           }
            	           n[j]=new String(bt);
        	           }
            	           break;
        	       case 8:
        	           //Toogle case
        	           for(j=0;j<size;j++){
            	           String to = n[j];
            	           byte bt1[] = to.getBytes();
            	           for(i=0;i<bt1.length;i++){
            	                if(bt1[i]>=97 && bt1[i]<=122){
            	                    bt1[i]-=32;
            	                }
            	                else{
            	                    if(bt1[i]>=65 && bt1[i]<=90){
            	                        bt1[i]+=32;
            	                    }
            	                }
            	           }
        	               n[j]=new String(bt1);
        	           }
        	           break;
        	       case 9:
        	           //Reverse Names
        	           for(j=0;j<size;j++){
        	               int k1;
            	           String rev =n[j];
            	           byte bt2[] =rev.getBytes();
            	            for(i=bt2.length-1,k1=0;k1!=i;i--,k1++){
            	                byte byte1;
            	                byte1 = bt2[k1];
            	                bt2[k1] = bt2[i];
            	                bt2[i] = byte1;
            	            }
            	            n[j]= new String(bt2);     
            	       }
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
        	           System.out.println("Enter the alphabet you want to replace");
        	           String ra = b.readLine();
        	       
        	           System.out.println("Enter the alphabet that would be seen after replacement");
        	           String ra1 = b.readLine();
        	           
        	           for(i=0;i<size;i++){
        	               n[i]=n[i].replace(ra,ra1);
        	                   
        	               
        	           }
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



  
