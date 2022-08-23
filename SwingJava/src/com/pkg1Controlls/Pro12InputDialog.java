package com.pkg1Controlls;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pro12InputDialog {
	JFrame f;

	Pro12InputDialog(){  
	    f=new JFrame();   
	    String name=JOptionPane.showInputDialog(f,"Enter Name");      
	}

	public static void main(String[] args) {
		new Pro12InputDialog();
	}
}
