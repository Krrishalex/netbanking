package com.inetbanking.testCases;

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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
	
	
	ReadConfig readConfig=new ReadConfig();
	
	public String basicURL=readConfig.getApplicationURL();
	
	public String username=readConfig.getUsername();
	public String password=readConfig.getPassword();
	public  static WebDriver driver;
	public static Logger log;
	
	//@Parameters("browser")
	@BeforeTest
	public void setup() {
		
		String browser=readConfig.getBrowserType();
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
			
			driver=new ChromeDriver();
			//driver.get(basicURL);
			
			 log=Logger.getLogger("ebanking");
			PropertyConfigurator.configure("log4j.properties");
		}
		
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	public void getScreenshot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"\\Screenshots\\"+testCaseName+".png";
		
		FileUtils.copyFile(src, new File(path));
	}
	

}
