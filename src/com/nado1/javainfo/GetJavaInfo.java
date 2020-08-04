package com.nado1.javainfo;

public class GetJavaInfo extends GetInfo {

	@Override
	String getName() {
		return System.getProperty("java.runtime.name");
	}

	@Override
	String getInfo() {
		return System.getProperty("java.vm.vendor");
	}

	
	/* Hier eine kleine Message 
	 * 
	 */
	@Override
	String getVersion() {

		return System.getProperty("java.runtime.version");
	}

}
