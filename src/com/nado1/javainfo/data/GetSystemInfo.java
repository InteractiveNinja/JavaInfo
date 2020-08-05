package com.nado1.javainfo.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;

public class GetSystemInfo extends AbstractInfoObj {
	private boolean isWindows = false;

	public GetSystemInfo() {
		if (System.getProperty("os.name").contains("Win")) {
			isWindows = true;
		} else {
			isWindows = false;
		}
	}

	@Override
	String getName() {

		return System.getProperty("os.name");
	}

	String getVersion() {

		return System.getProperty("os.version");
	}

	String getUptime() {
		if (isWindows) {
			String readerString = "";
			String time = "";
			try {
				Process pr = Runtime.getRuntime().exec("systeminfo");
				BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
				while ((readerString = in.readLine()) != null) {
					if (readerString.contains("Systemstartzeit")) {
						time = stringFormatting(readerString);
						
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return time;
		} else {
			return null;
		}

	}
	
	private String stringFormatting(String readerString) {
		
		String time = "";
		time = readerString;
		time = time.substring(20);
		time = time.trim();
//		time = time.substring(11);
//		time = time.trim();
//		Calendar c = Calendar.getInstance();
//		DecimalFormat mFormat= new DecimalFormat("00");
//		
//		time = c.get(Calendar.YEAR) + "-" + mFormat.format(c.get(Calendar.MONTH)) + "-" + mFormat.format(c.get(Calendar.DAY_OF_MONTH)) + "T" + time + ".00Z";
//		Duration d = Duration.between(Instant.parse(time), Instant.now());
		return time;
		
	}

}
