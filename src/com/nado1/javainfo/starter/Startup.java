package com.nado1.javainfo.starter;

import com.nado1.javainfo.gui.InfoGUI;
import com.nado1.javainfo.gui.WaitingGUI;
import com.nado1.javainfo.translation.TranslationManager;

public class Startup {
	private TranslationManager lang;

	public Startup(String args[], TranslationManager lang) {
		this.lang = lang;
		if((args.length <= 0)) {
			normalStart();
		} else {
			for (int i = 0; i < args.length; i++) {
				checkFlags(args[i]);

			}
		}
		

	}

	private void checkFlags(String s) {
		if (s.contentEquals("--fast") | s.contentEquals("-f")) {
			fastStart();
		} 
	}

	private void normalStart() {
		new WaitingGUI(lang);
	}

	private void fastStart() {

		new InfoGUI(lang);
	}

}
