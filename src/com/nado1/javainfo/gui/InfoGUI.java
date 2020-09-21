package com.nado1.javainfo.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.nado1.javainfo.data.InfoObj;
import com.nado1.javainfo.starter.Starter;
import com.nado1.javainfo.translation.TranslationManager;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class InfoGUI extends JFrame implements ActionListener{

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
	private JTextField twSystemRam;
	private JTextPane tfSystemProcessor;
	private JTextField tfSystemHostname;
	private JTextField tfSystemModel;

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
		tfUserName.setBounds(202, 48, 309, 26);
		getContentPane().add(tfUserName);
		tfUserName.setColumns(10);

		tfUserLanguage = new JTextField(info.getInfo("user.language"));
		tfUserLanguage.setEditable(false);
		tfUserLanguage.setColumns(10);
		tfUserLanguage.setBounds(202, 85, 309, 26);
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
		tfUserCountry.setBounds(202, 122, 309, 26);
		getContentPane().add(tfUserCountry);
		
		JLabel javaName = new JLabel(lang.getText("java.name"));
		javaName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		javaName.setBounds(10, 205, 113, 26);
		getContentPane().add(javaName);
		
		tfJavaVersion = new JTextField(info.getInfo("java.version"));
		tfJavaVersion.setEditable(false);
		tfJavaVersion.setColumns(10);
		tfJavaVersion.setBounds(202, 279, 309, 26);
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
		tfJavaVendor.setBounds(202, 242, 309, 26);
		getContentPane().add(tfJavaVendor);
		
		tfJavaName = new JTextField(info.getInfo("java.name"));
		tfJavaName.setEditable(false);
		tfJavaName.setColumns(10);
		tfJavaName.setBounds(202, 205, 309, 26);
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
		systemUptime.setBounds(10, 513, 113, 26);
		getContentPane().add(systemUptime);
		
		tfSystemName = new JTextField(info.getInfo("system.name"));
		tfSystemName.setEditable(false);
		tfSystemName.setColumns(10);
		tfSystemName.setBounds(202, 363, 309, 26);
		getContentPane().add(tfSystemName);
		
		tfSystemVersion = new JTextField(info.getInfo("system.version"));
		tfSystemVersion.setEditable(false);
		tfSystemVersion.setColumns(10);
		tfSystemVersion.setBounds(202, 400, 309, 26);
		getContentPane().add(tfSystemVersion);
		
		tfSystemUptime = new JTextField(info.getInfo("system.uptime"));
		tfSystemUptime.setEditable(false);
		tfSystemUptime.setColumns(10);
		tfSystemUptime.setBounds(202, 513, 309, 26);
		getContentPane().add(tfSystemUptime);
		
		JLabel systemRam = new JLabel(lang.getText("system.ram"));
		systemRam.setFont(new Font("Tahoma", Font.PLAIN, 12));
		systemRam.setBounds(10, 553, 113, 26);
		getContentPane().add(systemRam);
		
		twSystemRam = new JTextField(info.getInfo("system.ram"));
		twSystemRam.setEditable(false);
		twSystemRam.setColumns(10);
		twSystemRam.setBounds(202, 553, 309, 26);
		getContentPane().add(twSystemRam);
		
		JLabel systemProcessor = new JLabel(lang.getText("system.processor"));
		systemProcessor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		systemProcessor.setBounds(10, 592, 113, 26);
		getContentPane().add(systemProcessor);
		
		tfSystemProcessor = new JTextPane();
		tfSystemProcessor.setBackground(SystemColor.menu);
		tfSystemProcessor.setText(info.getInfo("system.processor"));
		tfSystemProcessor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tfSystemProcessor.setEditable(false);
		tfSystemProcessor.setBounds(202, 598, 309, 106);
		getContentPane().add(tfSystemProcessor);
		
		JLabel systemHostname = new JLabel(lang.getText("system.hostname"));
		systemHostname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		systemHostname.setBounds(10, 480, 113, 26);
		getContentPane().add(systemHostname);
		
		tfSystemHostname = new JTextField(info.getInfo("system.hostname"));
		tfSystemHostname.setEditable(false);
		tfSystemHostname.setColumns(10);
		tfSystemHostname.setBounds(202, 480, 309, 26);
		getContentPane().add(tfSystemHostname);
		
		JLabel systemModel = new JLabel(lang.getText("system.model"));
		systemModel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		systemModel.setBounds(10, 437, 113, 26);
		getContentPane().add(systemModel);
		
		tfSystemModel = new JTextField(info.getInfo("system.model"));
		tfSystemModel.setEditable(false);
		tfSystemModel.setColumns(10);
		tfSystemModel.setBounds(202, 437, 309, 26);
		getContentPane().add(tfSystemModel);
		
		JButton mailButton = new JButton(lang.getText("export.data"));
		mailButton.setBounds(134, 711, 234, 39);
		mailButton.addActionListener(this);
		getContentPane().add(mailButton);
		setTitle(this.lang.getText("main"));
		setSize(550, 800);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(info.exportInfos()) {
			JOptionPane.showMessageDialog(null, "Datei wurde erfolgreich auf den Desktop exportiert");
		} else {
			JOptionPane.showMessageDialog(null, "Datei konnte nicht erstellt werden");
		}
	}
}
