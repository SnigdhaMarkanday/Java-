import java.io.*;
import javax.swing.*;
class Demo{
		public static void main(String []z)throws IOException{
			JOptionPane.showMessageDialog(null,"Welcome is swing","Emul",0);// for showing dialogue box on screen
			String n = "Snigdha";
			JOptionPane.showMessageDialog(null,"Welcome"+n ,"Emulation",0);
			JOptionPane.showMessageDialog(null,n,"Emulation",2);
			String nm;
			nm=JOptionPane.showInputDialog(null,"Enter your Name"," ",0);
			JOptionPane.showMessageDialog(null,n,"Emulation",2);
			int x,y,yy;
			x = Integer.parseInt(JOptionPane.showInputDialog(null,"number 1" ,"Emulation",0));
			y = Integer.parseInt(JOptionPane.showInputDialog(null,"number 2" ,"Emulation",0));
			int s = x+y;
			JOptionPane.showMessageDialog(null,"Ans is "+s,"emulation",0);
			yy = JOptionPane.showConfirmDialog(null,"Do u wanna quit","Emulation",0);
			if(yy==0){
				System.exit(0);
			}
			else{
				JOptionPane.showMessageDialog(null,"welcome Again","Emul",0);
			}




	}
}
