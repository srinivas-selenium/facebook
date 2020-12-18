package com.pro.utiltes;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties proty;
	
	public ReadConfig()
	{
		File src = new File("./Configurationfiles/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			proty = new Properties();
			proty.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getChromePath()
	{
	String chromepath=proty.getProperty("chromepath");
	return chromepath;
	}
	
	public String getApplicationURL()
	{
		String url=proty.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
	String username=proty.getProperty("username");
	return username;
	}
	
	public String getPassword()
	{
	String password=proty.getProperty("password");
	return password;
	}
	
	
}
