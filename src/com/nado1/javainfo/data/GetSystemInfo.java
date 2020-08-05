package com.nado1.javainfo.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.nado1.javainfo.translation.TranslationManager;

public class GetSystemInfo extends AbstractInfoObj {

	private TranslationManager lang;

	private boolean isWindows = false;
	private String uptime = "";
	private String ram = "";
	private String processor = "";
	private String osName;
	private String hostname;

	public GetSystemInfo(TranslationManager lang) {
		this.lang = lang;
		if (System.getProperty("os.name").contains("Win")) {
			isWindows = true;
		} else {
			isWindows = false;
		}
		getData();
	}

	@Override
	String getName() {

		return osName;
	}

	String getVersion() {

		return System.getProperty("os.version");
	}

	String getRam() {

		return ram;
	}

	String getProcessor() {

		return processor;
	}

	String getUptime() {
		return uptime;

	}
	
	String getHostname() {
		return hostname;
	}

	private void getData() {

		if (isWindows) {
			String readerString = "";
			try {
				Process pr = Runtime.getRuntime().exec("systeminfo");
				BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
				while ((readerString = in.readLine()) != null) {
					if (readerString.contains(lang.getText("data.uptime"))) {
						uptime = readerString.substring(30).trim();

					}
					if (readerString.contains(lang.getText("data.ram"))) {
						ram = readerString.substring(30).trim();

					}
					if (readerString.contains(lang.getText("data.osname"))) {
						osName = readerString.substring(30).trim();

					}
					
					if (readerString.contains(lang.getText("data.hostname"))) {
						hostname = readerString.substring(30).trim();

					}
					
					if (readerString.contains(lang.getText("data.processor"))) {
						while ((readerString = in.readLine()).contains("[")) {
							if(processor.equals("")) {
								processor = readerString.trim().substring(6);
							} else {
								processor = processor + "\n" + readerString.trim().substring(6);
							}
							
						}

					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {

		}

	}

//	private String stringFormatting(String readerString) {
//
//		String time = "";
//		time = readerString;
//		time = time.substring(30);
//		time = time.trim();
//		return time;
//
//	}

}
