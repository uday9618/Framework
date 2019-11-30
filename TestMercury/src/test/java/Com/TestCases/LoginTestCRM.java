package Com.TestCases;



import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import Com.Pages.BaseClass;
import Com.Pages.LoginPage;

public class LoginTestCRM extends BaseClass {
	
	@Test
	public void loginApp() {  
		logger=report.createTest("Login to Mercurry");
		
		
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting Application");
		
		loginpage.loginToCRM(excel.getStringData("Login", 0,0),excel.getStringData("Login", 0,1));
		logger.pass("Login Success");
		
	} 

	
	

}
