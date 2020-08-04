package com.nado1.javainfo;

public class GetUserInfo extends GetInfo{
	
	@Override
	String getName() {
		return System.getProperty("user.name");
	}
	
	String getLanguage()
	{
		return System.getProperty("user.language");
	}

}
