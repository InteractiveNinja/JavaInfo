package com.nado1.javainfo.translation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

public class TranslationManager {

	private String language;
	private JSONObject obj;

	public TranslationManager(String language) {
		this.language = language;
		readJson();

	}

	private void readJson() {
		String json = null;
		StringBuilder jsontext = new StringBuilder();
		try {
			InputStream in = getClass().getClassLoader().getResourceAsStream("com/nado1/javainfo/translation/translation.json");
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			while ((json = reader.readLine()) != null) {
				jsontext.append(json);
			}
		} catch (IOException e) {
			new IOException("Übersetzungsdatei wurde nicht gefunden oder konnte nicht gelesen werden");
		}

		try {
			obj = new JSONObject(jsontext.toString());
		} catch (Exception e) {
			new Exception("Ein Fehler in der JSON Übersetzungsdatei ist aufgetretten");
		}
		
	}

	public String getText(String key) {

		return obj.getJSONObject(language).getString(key);

	}

}
