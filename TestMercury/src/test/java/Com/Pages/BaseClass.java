package Com.Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Com.utility.BrowserFactory;
import Com.utility.ConfigDataProvider;
import Com.utility.ExcelDataProvider;
import Com.utility.Helper;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public  ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setupsuite() {
		
		Reporter.log("Setting up reports and Test is getting ready", true);
		
		 excel=new ExcelDataProvider();
		 config=new ConfigDataProvider();
		 ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"./Reports/Mercurry_"+Helper.getCurrentDateTime()+".html"));
		 report=new ExtentReports();
		 report.attachReporter(extent);
		 
		 Reporter.log("Setting Don - Test can be Started", true);
	}
	@BeforeClass
	public void setup() {
		 Reporter.log("Trying to start Browser and Getting Application ready", true);
		driver=BrowserFactory.startApplication(driver, "Chrome",config.getURL());
		
		Reporter.log("Browser and Application is up and running", true);
	}
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBroser(driver);
		
	}
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws IOException {
		
		Reporter.log("Test is about to end", true);
		
		if(result.getStatus()==ITestResult.FAILURE){
		logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());
	}
		else if(result.getStatus()==ITestResult.SUCCESS){ 
        logger.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());
			
		}
	report.flush();
	
	Reporter.log("Test completed >>>Reports Generated", true);
	}
	}
	

