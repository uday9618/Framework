package com.amazon.productSearch;

import com.amazon.pages.AmazonHomePage;
import com.amazon.utility.SeleniumLibs;

public class SearchFlowClass extends SeleniumLibs {

	AmazonHomePage amazonHomePage;
	
	
	public SearchFlowClass() {
	amazonHomePage = new AmazonHomePage();
	}
	
	
	public void IPhoneXRSearch() {
		
		enterText(amazonHomePage.getSearchBox(), "iPhone XR (64GB) - Yellow");
		click(amazonHomePage.getSearchButton());
	
	}
	
}
