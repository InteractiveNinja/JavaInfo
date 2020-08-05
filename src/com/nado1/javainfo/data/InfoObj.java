package com.nado1.javainfo.data;

import java.util.HashMap;

import com.nado1.javainfo.translation.TranslationManager;

public class InfoObj {

	private HashMap<String, String> dic = new HashMap<String, String>();
	private GetSystemInfo getSystemInfo;
	private GetUserInfo getUserInfo = new GetUserInfo();
	private GetJavaInfo getJavaInfo = new GetJavaInfo();
	private TranslationManager lang;

	public InfoObj() {

		putInDic("user.name", getUserInfo.getName());

		putInDic("user.language", getUserInfo.getLanguage());

		putInDic("user.country", getUserInfo.getCountry());

		lang = new TranslationManager(getInfo("user.language"));
		
		getSystemInfo = new GetSystemInfo(lang);

		putInDic("system.name", getSystemInfo.getName());

		putInDic("system.version", getSystemInfo.getVersion());

		putInDic("system.uptime", getSystemInfo.getUptime());

		putInDic("system.ram", getSystemInfo.getRam());
		
		putInDic("system.processor", getSystemInfo.getProcessor());
		
		putInDic("system.hostname", getSystemInfo.getHostname());
		
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
