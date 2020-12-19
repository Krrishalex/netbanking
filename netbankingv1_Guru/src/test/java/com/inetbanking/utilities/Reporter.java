package com.inetbanking.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporter extends TestListenerAdapter {
	
	public WebDriver driver;
	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setExtent() {
		htmlReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/myreport.html");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Functional Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Hostname", "LocaHost");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Tester", "Krishna");
		extent.setSystemInfo("Broweser", "Chrome");
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	

}
