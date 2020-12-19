package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.NewCustomerPage;

public class AddNewCustomerTest extends BaseClass {
	@Test
	public void addCustomerTest() {
		//driver.get(basicURL);
		LoginTest lt=new LoginTest();
		lt.loginTest();
		NewCustomerPage ncp=new NewCustomerPage(driver);
		ncp.getNewCustomerURL().click();
		ncp.getCustomerName().sendKeys("Krishna");
		
		
	}

}
