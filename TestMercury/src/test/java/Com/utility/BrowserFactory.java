package Com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL)
	{
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\uday\\workspace\\FrameworkPractice\\Drivers\\chromedriver.exe");
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
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void quitBroser(WebDriver driver) {
		driver.quit();
		
	}

}
