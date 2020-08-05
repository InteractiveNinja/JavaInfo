package com.nado1.javainfo.data;

public class GetUserInfo extends AbstractInfoObj {

	@Override
	String getName() {
		return System.getProperty("user.name");
	}

	String getLanguage() {
		return System.getProperty("user.language");
	}

	
	String getCountry() {
		return System.getProperty("user.country");
	}


}
