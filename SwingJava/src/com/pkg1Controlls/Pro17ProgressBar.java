package com.pkg1Controlls;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Pro17ProgressBar extends JFrame{    
		JProgressBar jb;    
		int i=0,num=0;

		Pro17ProgressBar(){    
		jb=new JProgressBar(0,2000);    
		jb.setBounds(40,40,160,30);         
		jb.setValue(0);    
		jb.setStringPainted(true);    
		add(jb);    
		setSize(250,150);    
		setLayout(null);    
		}

	public void iterate() {
		while (i <= 2000) {
			jb.setValue(i);
			i = i + 20;
			try {
				Thread.sleep(150);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		Pro17ProgressBar m = new Pro17ProgressBar();
		m.setVisible(true);
		m.iterate();
	}
}
