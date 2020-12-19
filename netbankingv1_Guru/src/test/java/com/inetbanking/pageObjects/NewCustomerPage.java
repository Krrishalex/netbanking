package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCustomerPage {
	
	WebDriver driver;

	public NewCustomerPage(WebDriver driver) {
		
		this.driver = driver;
	}
	By newCustomerURL=By.cssSelector("a[href*='addcustomer']");
	By customerName=By.xpath("//td/input[@name='name']");

	public WebElement getNewCustomerURL() {
		return driver.findElement(newCustomerURL);
	}
	public WebElement getCustomerName() {
		return driver.findElement(customerName);
	}
	
	
	

}
