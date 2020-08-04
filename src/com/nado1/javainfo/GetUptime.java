package com.nado1.javainfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

public class GetUptime {

	private boolean isWindows = false;

	public GetUptime() {
		if (System.getProperty("os.name").contains("Win")) {
			isWindows = true;
		} else {
			isWindows = false;
		}
	}

	String getUptime() {
		String s = "";
		StringBuilder line = new StringBuilder();
		try {
			Process pr = Runtime.getRuntime().exec("wmic path Win32_OperatingSystem get LastBootUpTime");
			BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			while ((s = in.readLine()) != null) {
				line.append(s);
			}
			//Jahr Monat Tag entfernen aus dem String
			line.delete(0, 35);
			//Milisekunden aus dem String entfernen
			line.delete(6, 30);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line.toString();
	}
}
