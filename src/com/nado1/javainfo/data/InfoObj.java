package com.nado1.javainfo.data;

import java.util.HashMap;

import com.nado1.javainfo.translation.TranslationManager;

public class InfoObj {

	private HashMap<String, String> dic = new HashMap<String, String>();
	private GetSystemInfo getSystemName;
	private GetUserInfo getUserInfo = new GetUserInfo();
	private GetJavaInfo getJavaInfo = new GetJavaInfo();
	private TranslationManager lang;

	public InfoObj() {

		putInDic("user.name", getUserInfo.getName());

		putInDic("user.language", getUserInfo.getLanguage());

		putInDic("user.country", getUserInfo.getCountry());

		lang = new TranslationManager(getInfo("user.language"));
		
		getSystemName = new GetSystemInfo(lang);

		putInDic("system.name", getSystemName.getName());

		putInDic("system.version", getSystemName.getVersion());

		putInDic("system.uptime", getSystemName.getUptime());

		putInDic("system.ram", getSystemName.getRam());
		
		putInDic("system.processor", getSystemName.getProcessor());
		
		System.out.println(getSystemName.getProcessor());
		
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
	
	public TranslationManager getLanguage() {
		return lang;
	}

}
