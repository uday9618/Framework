package com.amazon.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazon.pages.AmazonHomePage;
import com.amazon.utility.BrowserFactory;

public class AmazonHomePageTest {
	WebDriver driver;
	
	@Test
	public void searchIphone() {
		BrowserFactory.startApplication(driver, "chrome","https://www.amazon.in");
		PageFactory.initElements(driver, AmazonHomePage.class);
	
	}

}
