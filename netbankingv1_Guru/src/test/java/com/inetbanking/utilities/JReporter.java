package com.inetbanking.utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.inetbanking.testCases.BaseClass;

public class JReporter extends BaseClass implements ITestListener {
	
	ExtentTest test;
	ExtentReports extent=TestReport.getReportPage();

	public void onFinish(ITestContext arg0) {
		extent.flush();
		
	}

	public void onStart(ITestContext arg0) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	public void onTestFailure(ITestResult result) {
		
		test.fail(result.getThrowable());
		
		String testCaseNme=result.getMethod().getMethodName();
		
		
		try {
			getScreenshot(testCaseNme,driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		
		
	}

	public void onTestStart(ITestResult result) {
		
		 test=extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult arg0) {
		
		test.log(Status.PASS, "Test passed");
	}

}
