package com.nado1.javainfo;

public class GetSystemName extends GetInfo {
	
	
	@Override
	String getName() {

		return System.getProperty("os.name");
	}

	@Override
	String getInfo() {

		return System.getProperty("os.version");
	}
	
	
	
	

}
