package com.nado1.javainfo.starter;
import com.nado1.javainfo.data.InfoObj;
import com.nado1.javainfo.gui.WaitingGUI;
import com.nado1.javainfo.translation.TranslationManager;
public class Starter {
	
	public static InfoObj info = new InfoObj();
	public static TranslationManager lang;
	public static void main(String[] args) {
		
		lang = new TranslationManager(info.getInfo("user.language"));
		
		new WaitingGUI(lang);
		
	}

}
