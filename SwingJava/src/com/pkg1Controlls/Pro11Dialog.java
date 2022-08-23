package com.pkg1Controlls;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pro11Dialog {

	JFrame f;  
	Pro11Dialog(){  
	    f=new JFrame();  
	    JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");  
	}  
	public static void main(String[] args) {  
	    new Pro11Dialog();  
	}  
}
