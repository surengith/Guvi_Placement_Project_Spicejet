package com.utils.org;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperty {

	public static Properties prop;

	public ConfigProperty() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Surendhar\\eclipse-workspace\\SpiceJet_Flight_Booking_System\\src\\main\\java\\com\\utils\\org\\config.properties");
		prop = new Properties();
		prop.load(fis);
	}

	public static String getBrowser() {
		String browser = prop.getProperty("browser");
		return browser;
	}

	public static String getUrl() {
		String url = prop.getProperty("url");
		return url;
	}

}
