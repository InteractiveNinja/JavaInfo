package com.nado1.javainfo.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.nado1.javainfo.translation.TranslationManager;

public class WaitingGUI extends JFrame{
	
	private TranslationManager lang;
	
	private JLabel waitText = new JLabel();
	
	public WaitingGUI(TranslationManager lang) {

		this.lang = lang;
		
		setLayout(null);
		setTitle(this.lang.getText("wait"));
		setSize(400,100);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		elemente();
	}
	
	private void elemente() {
		waitText.setText(lang.getText("wait2"));
		waitText.setBounds(0, 0, 400, 30);
		waitText.setHorizontalAlignment(JLabel.CENTER);
		add(waitText);
		
		
		
	}

}
