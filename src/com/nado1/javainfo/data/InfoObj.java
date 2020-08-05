package com.nado1.javainfo.data;

import java.util.HashMap;

public class InfoObj {

	private HashMap<String, String> dic = new HashMap<String, String>();
	private GetSystemInfo getSystemName = new GetSystemInfo();
	private GetUserInfo getUserInfo = new GetUserInfo();
	private GetJavaInfo getJavaInfo = new GetJavaInfo();
	public InfoObj() {

		putInDic("user.name", getUserInfo.getName());

		putInDic("user.language", getUserInfo.getLanguage());

		putInDic("user.country", getUserInfo.getCountry());

		putInDic("system.name", getSystemName.getName());

		putInDic("system.version", getSystemName.getVersion());

		putInDic("system.uptime", getSystemName.getUptime());

		putInDic("java.name", getJavaInfo.getName());
		
		putInDic("java.vendor", getJavaInfo.getInfo());
		
		putInDic("java.version", getJavaInfo.getVersion());
		
		
	}
	
	private void putInDic(String key, String value) {
		dic.put(key, value);
		
	}
	
	public String getInfo(String key) {
		return dic.get(key);
	}
	
}
