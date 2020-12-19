package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.inetbanking.pageObjects.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	public void loginTest() {
		//Logger log=Logger.getLogger(LoginTest.class);
		driver.get(basicURL);
		log.info("URL is opened");
		driver.manage().window().maximize();
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		log.info("Username enetered");
		lp.setPassword(password);
		log.info("Password enetered");
		lp.clickSubmit();
		log.info("submit button clicked");
		/*if(driver.getTitle().equals(" Guru99 Bank Manager HomePage ")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}*/
		
	}
	
}
