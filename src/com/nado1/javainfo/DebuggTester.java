package com.nado1.javainfo;

import java.util.Enumeration;

public class DebuggTester {

	public static void main(String[] args) {
//		System.out.println(new GetUserInfo().getName());
		
//		GetPropityNames();
		
		System.out.println(new GetUptime().getUptime());
		

	}

	private static void GetPropityNames() {
		Enumeration props = System.getProperties().propertyNames();
		while (props.hasMoreElements()) {
			String prop = props.nextElement().toString(); 
			String s = prop + " | " + System.getProperty(prop);
			System.out.println(s);
		}
	}

}
