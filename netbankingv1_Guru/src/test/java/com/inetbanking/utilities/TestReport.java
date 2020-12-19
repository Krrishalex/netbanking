package com.inetbanking.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestReport {
	
	static ExtentReports extent;

	public static ExtentReports getReportPage() {
		String path=System.getProperty("user.dir")+"\\reports\\report.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setReportName("Web Automation Rsesults");
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Krishna");
		
		return extent;
		
		
		}
	
}
