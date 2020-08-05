package com.nado1.javainfo.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
						time = readerString;
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

}
