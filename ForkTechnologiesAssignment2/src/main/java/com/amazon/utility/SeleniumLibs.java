package com.amazon.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumLibs {

	
	
	
	public void click(WebElement element) {

		try {
			BrowserFactory.actions.moveToElement(element).click().build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public WebElement findElement(By locatorname, int timeout) {

		WebDriverWait wait = new WebDriverWait(BrowserFactory.getDriver(), timeout);
		// return wait.until(getElement(locatorname));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locatorname));
	}
	
	
	public void enterText(WebElement element, String text) {

		
		try {
			
			
			element.clear();
			element.sendKeys(text);
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

}
