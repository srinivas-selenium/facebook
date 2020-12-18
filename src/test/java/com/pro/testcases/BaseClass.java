package com.pro.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.pro.utiltes.ReadConfig;

public class BaseClass {
	
	ReadConfig config=new ReadConfig();
	
	
public String baseURL=config.getApplicationURL();
	public String username=config.getUsername();
	public String password=config.getPassword();
	
	public static Logger logger;
	
	//public Sring chromepath=./Drivers\\chromedriver.exe
public static WebDriver driver;


@BeforeClass
public void setUp() {
	/*if(br.equals("chrome"))
	{*/
	System.setProperty("webdriver.chrome.driver", config.getChromePath());
	driver= new ChromeDriver();
	/*}
	else if(br.equals("ie")) {
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver= new ChromeDriver();
	}*/
	logger=Logger.getLogger("facebook");
	PropertyConfigurator.configure("Log4j.properties");
	
}

@AfterClass
public void tearDowm() {
	driver.quit();
}

public void captureScreen(WebDriver driver, String tname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
}
}
