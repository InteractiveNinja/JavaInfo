package com.nado1.javainfo.data;

public class GetJavaInfo extends AbstractInfoObj {

	@Override
	String getName() {
		return System.getProperty("java.runtime.name");
	}

	String getInfo() {
		return System.getProperty("java.vm.vendor");
	}
	
	String getVersion() {
		return System.getProperty("java.runtime.version");
	}


}
