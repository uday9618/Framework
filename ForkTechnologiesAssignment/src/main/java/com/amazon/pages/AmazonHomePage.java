package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.BrowserFactory;

public class AmazonHomePage {

	
	 @FindBy(xpath="//div[@class='nav-search-field ']")
     WebElement searchBox;
     
     @FindBy(xpath="//input[@value='Go']")
     WebElement searchButton;
	
	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public AmazonHomePage () {
		PageFactory.initElements(BrowserFactory.getDriver(), this);
	}
   
}
 