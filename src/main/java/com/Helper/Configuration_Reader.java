package com.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;
	public Configuration_Reader() throws Throwable {
		
		File f = new File("E:\\Eclipse\\Selenium-Java\\ShoppinG_Project\\src\\main\\java\\com\\Properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		return browser;
		
	}
	public String getUrl() {
		
		String url = p.getProperty("getUrl");
		return url;

	}
	public String get_username() {
		
		String username = p.getProperty("get_username");
		return username;

	}
	public String get_password() {
		
		String password = p.getProperty("get_password");
		return password;
		
	}
	public String get_commends() {
		
		String comments = p.getProperty("get_commends");
		return comments;
	}
	public String get_size() {
		
		String input = p.getProperty("size");
		return input;
	}
}
