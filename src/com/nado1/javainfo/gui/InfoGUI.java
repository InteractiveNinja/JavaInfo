package com.nado1.javainfo.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.nado1.javainfo.data.InfoObj;
import com.nado1.javainfo.starter.Starter;
import com.nado1.javainfo.translation.TranslationManager;
import java.awt.Font;
import javax.swing.JTextField;

public class InfoGUI extends JFrame {

	private TranslationManager lang;
	private InfoObj info = Starter.info;

	private JTextField tfUserName;
	private JTextField tfUserLanguage;
	private JTextField tfUserCountry;
	private JTextField tfJavaVersion;
	private JTextField tfJavaVendor;
	private JTextField tfJavaName;
	private JTextField tfSystemName;
	private JTextField tfSystemVersion;
	private JTextField tfSystemUptime;

	public InfoGUI(TranslationManager lang) {

		this.lang = lang;

		elemente();
	}

	private void elemente() {

		getContentPane().setLayout(null);

		JLabel userInfoTitle = new JLabel(lang.getText("user.title"));
		userInfoTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		userInfoTitle.setBounds(10, 11, 169, 26);
		getContentPane().add(userInfoTitle);

		JLabel javaInfoTitle = new JLabel(lang.getText("java.title"));
		javaInfoTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		javaInfoTitle.setBounds(10, 155, 169, 26);
		getContentPane().add(javaInfoTitle);

		JLabel lblSystemInformationen = new JLabel(lang.getText("system.title"));
		lblSystemInformationen.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSystemInformationen.setBounds(10, 316, 169, 26);
		getContentPane().add(lblSystemInformationen);

		JLabel userName = new JLabel(lang.getText("user.name"));
		userName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		userName.setBounds(10, 48, 113, 26);
		getContentPane().add(userName);

		tfUserName = new JTextField(info.getInfo("user.name"));
		tfUserName.setEditable(false);
		tfUserName.setBounds(202, 48, 254, 26);
		getContentPane().add(tfUserName);
		tfUserName.setColumns(10);

		tfUserLanguage = new JTextField(info.getInfo("user.language"));
		tfUserLanguage.setEditable(false);
		tfUserLanguage.setColumns(10);
		tfUserLanguage.setBounds(202, 85, 254, 26);
		getContentPane().add(tfUserLanguage);

		JLabel userLanguage = new JLabel(lang.getText("user.language"));
		userLanguage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		userLanguage.setBounds(10, 85, 113, 26);
		getContentPane().add(userLanguage);

		JLabel userCountry = new JLabel(lang.getText("user.country"));
		userCountry.setFont(new Font("Tahoma", Font.PLAIN, 12));
		userCountry.setBounds(10, 122, 113, 26);
		getContentPane().add(userCountry);

		tfUserCountry = new JTextField(info.getInfo("user.country"));
		tfUserCountry.setEditable(false);
		tfUserCountry.setColumns(10);
		tfUserCountry.setBounds(202, 122, 254, 26);
		getContentPane().add(tfUserCountry);
		
		JLabel javaName = new JLabel(lang.getText("java.name"));
		javaName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		javaName.setBounds(10, 205, 113, 26);
		getContentPane().add(javaName);
		
		tfJavaVersion = new JTextField(info.getInfo("java.version"));
		tfJavaVersion.setEditable(false);
		tfJavaVersion.setColumns(10);
		tfJavaVersion.setBounds(202, 279, 254, 26);
		getContentPane().add(tfJavaVersion);
		
		JLabel javaVendor = new JLabel(lang.getText("java.vendor"));
		javaVendor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		javaVendor.setBounds(10, 242, 113, 26);
		getContentPane().add(javaVendor);
		
		JLabel javaVersion = new JLabel(lang.getText("java.version"));
		javaVersion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		javaVersion.setBounds(10, 279, 113, 26);
		getContentPane().add(javaVersion);
		
		tfJavaVendor = new JTextField(info.getInfo("java.vendor"));
		tfJavaVendor.setEditable(false);
		tfJavaVendor.setColumns(10);
		tfJavaVendor.setBounds(202, 242, 254, 26);
		getContentPane().add(tfJavaVendor);
		
		tfJavaName = new JTextField(info.getInfo("java.name"));
		tfJavaName.setEditable(false);
		tfJavaName.setColumns(10);
		tfJavaName.setBounds(202, 205, 254, 26);
		getContentPane().add(tfJavaName);
		
		JLabel systemName = new JLabel(lang.getText("system.name"));
		systemName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		systemName.setBounds(10, 363, 113, 26);
		getContentPane().add(systemName);
		
		JLabel systemVersion = new JLabel(lang.getText("system.version"));
		systemVersion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		systemVersion.setBounds(10, 400, 113, 26);
		getContentPane().add(systemVersion);
		
		JLabel systemUptime = new JLabel(lang.getText("system.uptime"));
		systemUptime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		systemUptime.setBounds(10, 437, 113, 26);
		getContentPane().add(systemUptime);
		
		tfSystemName = new JTextField(info.getInfo("system.name"));
		tfSystemName.setEditable(false);
		tfSystemName.setColumns(10);
		tfSystemName.setBounds(202, 363, 254, 26);
		getContentPane().add(tfSystemName);
		
		tfSystemVersion = new JTextField(info.getInfo("system.version"));
		tfSystemVersion.setEditable(false);
		tfSystemVersion.setColumns(10);
		tfSystemVersion.setBounds(202, 400, 254, 26);
		getContentPane().add(tfSystemVersion);
		
		tfSystemUptime = new JTextField(info.getInfo("system.uptime"));
		tfSystemUptime.setEditable(false);
		tfSystemUptime.setColumns(10);
		tfSystemUptime.setBounds(202, 437, 254, 26);
		getContentPane().add(tfSystemUptime);
		setTitle(this.lang.getText("main"));
		setSize(500, 700);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}