package com.nado1.javainfo.gui;

import javax.swing.JFrame;

import com.nado1.javainfo.translation.TranslationManager;

public class WaitingGUI extends JFrame{
	
	private TranslationManager lang;
	
	
	public WaitingGUI(TranslationManager lang) {

		this.lang = lang;
		
		setLayout(null);
		setTitle(this.lang.getText("wait"));
		setSize(400,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
