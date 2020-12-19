package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	public Properties prop;
	public ReadConfig() {
		File file=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is.."+e.getMessage());
		}
	}
	
	public String getApplicationURL() {
		String url=prop.getProperty("basicURL");
		return url;
		
	}
	
	public String getUsername() {
		String username=prop.getProperty("username");
		
		return username;
	}
	
	
	public String getPassword() {
		String password=prop.getProperty("password");
		return password;
	}
	
	public String getChromePath() {
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getBrowserType() {
		String browsertype=prop.getProperty("browsertype");
		return browsertype;
	}
	
	/*public static void main(String[] args) {
		ReadConfig rc=new ReadConfig();
		System.out.println(rc.getApplicationURL());
	}
*/
}
