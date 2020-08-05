package com.nado1.javainfo.translation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.*;

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
			InputStream in = getClass().getClassLoader().getResourceAsStream("translation.json");
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			while ((json = reader.readLine()) != null) {
				jsontext.append(json);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		obj = new JSONObject(jsontext.toString());
	}

	public String getText(String key) {

		return obj.getJSONObject(language).getString(key);

	}

}