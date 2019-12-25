package com.amazon.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserFactory {
	
	public static WebDriver driver;
	public static Actions actions;

	public static WebDriver getDriver() {
		return driver;
	}
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL)
	{
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox")){
			
		}
		else if(browserName.equals("IE")) {
			
		}
		else {
			System.out.println("we do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	
	}
	public static void quitBroser(WebDriver driver) {
		driver.quit();

}
}